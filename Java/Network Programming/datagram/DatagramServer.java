package datagram;
import java.net.*;
import java.util.Scanner;

public class DatagramServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2000);
        Scanner input = new Scanner(System.in);
        String msg;
        do
        {
            byte[] b = new byte[1024];// random size taken
            DatagramPacket dp = new DatagramPacket(b, 1024);
            ds.receive(dp);
            msg = new String(dp.getData()).trim();
            System.out.println("From Client: " + msg);

            msg = input.nextLine();

            StringBuilder sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);
            ds.send(dp);
        }while (!msg.equals("end"));
        ds.close();
    }
}
