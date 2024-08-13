package multipleuser.usingmultithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoServer extends Thread{
    Socket socket;
    public ReverseEchoServer(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            String msg ;
            StringBuilder sb ;
            do{
                msg=br.readLine();

                sb = new StringBuilder(msg);
//                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            }
            while(!msg.equals("dne"));
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            Socket socket;
            ReverseEchoServer server;
            int count = 1;
            do{
                socket = ss.accept();
                System.out.println("Client " + count++ + " connected!");
                 server = new ReverseEchoServer(socket);
                 server.start();
            }
            while (true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}