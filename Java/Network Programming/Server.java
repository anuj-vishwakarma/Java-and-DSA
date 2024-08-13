import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Server{
	public static void main(String []args){
		try{
			ServerSocket ss = new ServerSocket(2000);
			Socket skt = ss.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
//			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			String message;
			do{
				message = br.readLine();
				ps.println("From Server: " + message);

//				message = keyboard.readLine();
//
//				ps.println(message);

			}while(!message.equals("end"));

			br.close();
			ss.close();
			skt.close();
			ps.close();

		}catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		}
	}
}