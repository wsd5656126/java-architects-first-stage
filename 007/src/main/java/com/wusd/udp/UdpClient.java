package com.wusd.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("udp客户端发数据");
        //不指定端口
        DatagramSocket ds = new DatagramSocket();
        String str = "吴盛东爱李洁";
        byte[] bf = str.getBytes();
        //报文
        DatagramPacket dp = new DatagramPacket(bf, bf.length,
                InetAddress.getByName("127.0.0.1"), 8080);
        //发报文
        ds.send(dp);
        ds.close();
    }
}
