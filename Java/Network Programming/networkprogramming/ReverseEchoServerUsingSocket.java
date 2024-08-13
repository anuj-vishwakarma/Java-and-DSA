package networkprogramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ReverseEchoServerUsingSocket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            Socket stk = ss.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg ;
            StringBuilder sb ;
            do{
                msg=br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            }
            while(!msg.equals("dne"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
