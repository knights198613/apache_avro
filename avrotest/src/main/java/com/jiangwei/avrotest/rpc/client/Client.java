package com.jiangwei.avrotest.rpc.client;

import com.jiangwei.avrotest.utils.ProtocolUtils;
import org.apache.avro.Protocol;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.HttpTransceiver;
import org.apache.avro.ipc.Transceiver;
import org.apache.avro.ipc.generic.GenericRequestor;

import java.net.URL;

/**
 * Created by weijiang
 * Date: 2016/12/29
 * Desc: avro rpc client
 */
public class Client {
    /**host to connect**/
    private String host;
    /**port to connect specific**/
    private int port;
    /**Protocol used by client**/
    private Protocol protocol;

    private int size;
    /**the count of request**/
    private int count;


    public Client(String host, int port, Protocol protocol, int size, int count) {
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.size = size;
        this.count = count;
    }


    public long sendMessage() throws Exception{
        GenericRecord requestData = new GenericData.Record(protocol.getType("message"));
        requestData.put("name", "weijiang");
        requestData.put("type", 1);
        requestData.put("price", 23.16);
        requestData.put("content", "this is weijiang send message hello world!");

        GenericRecord request = new GenericData.Record(protocol.getMessages().get("sendMessage").getRequest());
        request.put("message", requestData);

        Transceiver transceiver = new HttpTransceiver(new URL("http://"+host+":"+port));

        GenericRequestor requestor = new GenericRequestor(protocol, transceiver);
        long start = System.currentTimeMillis();
        while (count > 0) {
            requestor.request("sendMessage", request);
            count--;
        }

        long end = System.currentTimeMillis();
        return (end-start);
    }


    public void run() {
        long res = 0;

        try {
            res = sendMessage();
            System.out.println("请求完成后的时间开销为："+res);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Client client = new Client("10.1.66.39", 9877, ProtocolUtils.loadProtocol(), 10, 8);
        client.run();
    }
}
