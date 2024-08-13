package networkprogramming;
import java.net.*;
import java.io.*;
public class ReverseEchoClientUsingSocket {
    public static void main(String[] args) {
        try {
            Socket stk = new Socket("localhost", 2000);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg ;
            StringBuilder sb ;
            do{
                msg=keyboard.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From Server: " + msg);
            }
            while(!msg.equals("dne"));

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}

