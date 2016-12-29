package com.jiangwei.avrotest.rpc.sever;

import com.jiangwei.avrotest.utils.ProtocolUtils;
import org.apache.avro.Protocol;
import org.apache.avro.ipc.HttpServer;
import org.apache.avro.ipc.generic.GenericResponder;

import java.io.IOException;

/**
 * Created by weijiang
 * Date: 2016/12/29
 * Desc: avro rpc  server
 */
public class Server extends GenericResponder {
    /**rpc used protocol**/
    private Protocol protocol;
    /**rpc server port**/
    private int port;

    public Server(Protocol protocol, int port) {
        super(protocol);
        this.protocol = protocol;
        this.port = port;
    }


    @Override
    public Object respond(Protocol.Message message, Object request) throws Exception {
        return null;
    }

    public void run() {
        try {
            HttpServer server = new HttpServer(this, this.port);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Server server = new Server(ProtocolUtils.loadProtocol(), 9877);
        server.run();
    }



}
