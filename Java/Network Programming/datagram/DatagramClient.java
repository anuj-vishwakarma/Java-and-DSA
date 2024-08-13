package datagram;

import java.net.*;
import java.util.Scanner;

public class DatagramClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        Scanner input = new Scanner(System.in);
        String msg ;
        do
        {
            msg = input.nextLine();
            DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);

            ds.send(dp);

            byte[] b = new byte[1024];// random size taken
            dp = new DatagramPacket(b, 1024);
            ds.receive(dp);

            msg = new String(dp.getData()).trim();
            System.out.println("From Server: " + msg);
        }while(!msg.equals("end"));

        ds.close();
    }
}
