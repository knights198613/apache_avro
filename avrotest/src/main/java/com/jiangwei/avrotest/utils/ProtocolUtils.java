package com.jiangwei.avrotest.utils;

import org.apache.avro.Protocol;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by weijiang
 * Date: 2016/12/29
 * Desc: avro rpc 协议加载工具
 */
public class ProtocolUtils {

    public static Protocol loadProtocol() {
        Protocol protocol = null;
        URL url = ProtocolUtils.class.getClassLoader().getResource("avro_schema/message.avpr");
        try {
            protocol = Protocol.parse(new File(url.toURI()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return protocol;
    }
}
