package com.jiangwei.avrotest.bootstrap;

import com.jiangwei.avrotest.beans.User;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

/**
 * Created by weijiang
 * Date: 2016/12/28
 * Desc: avro序列化对象
 */
public class AvroSerializeObject {

    public static void main(String[] args) {
        AvroSerializeObject avroSerializeObject = new AvroSerializeObject();
        //avroSerializeObject.serializeUser();
        //avroSerializeObject.deserializeUser();
        //avroSerializeObject.serializeWithoutGenerationCode();
        avroSerializeObject.deserializeWithoutGenerationCode();
    }

    /**
     * 序列化对象到磁盘
     */
    public void serializeUser() {
        User user1 = new User();
        user1.setId(1);
        user1.setUserName("weijiang");
        user1.setFavoriteNumber(1);

        User user2 = new User(2, "chikaiming", 7, "red");

        User user3 = User.newBuilder()
                .setUserName("zhanghui")
                .setId(3)
                .setFavoriteColor("black")
                .setFavoriteNumber(null)
                .build();

        DatumWriter<User> datumWriter = new SpecificDatumWriter<>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<>(datumWriter);
        try {
            dataFileWriter.create(user1.getSchema(), new File("user.avro"));
            dataFileWriter.append(user1);
            dataFileWriter.append(user2);
            dataFileWriter.append(user3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dataFileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /***
     * 从磁盘反序列化对象
     */
    public void deserializeUser() {
        DatumReader<User> datumReader = new SpecificDatumReader<>(User.class);
        try {
            DataFileReader<User> dataFileReader = new DataFileReader<User>(new File("user.avro"), datumReader);
            User user = null;
            while(dataFileReader.hasNext()) {
                user = dataFileReader.next();
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

    }

    /**
     * avro 序列化不需要生成类代码
     */
    public void serializeWithoutGenerationCode() {
        try {
            Schema schema = new Schema
                    .Parser()
                    .parse(new File("D:\\jdev\\intellij_workspace\\apache_avro\\avrotest\\src\\main\\resource\\avro_schema\\user.avsc"));
            GenericRecord user1 = new GenericData.Record(schema);
            user1.put("userName", "John");
            user1.put("id", 4);
            user1.put("favoriteNumber", 512);

            GenericRecord user2 = new GenericData.Record(schema);
            user2.put("id", 5);
            user2.put("userName", "Taloyr");
            user1.put("favoriteColor", "blue");

            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
            DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
            dataFileWriter.create(schema, new File("users.avro"));
            dataFileWriter.append(user1);
            dataFileWriter.append(user2);
            dataFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 反序列化不需要生成类代码
     */
    public void deserializeWithoutGenerationCode() {
        try {
            Schema schema = new Schema
                    .Parser()
                    .parse(new File("D:\\jdev\\intellij_workspace\\apache_avro\\avrotest\\src\\main\\resource\\avro_schema\\user.avsc"));
            DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(schema);
            DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(new File("users.avro"), datumReader);
            GenericRecord user = null;
            while(dataFileReader.hasNext()) {
                user = dataFileReader.next(user);
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
