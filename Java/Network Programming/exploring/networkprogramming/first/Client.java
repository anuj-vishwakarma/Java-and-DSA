package exploring.networkprogramming.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;

public class Client{
	public static void main (String [] args){
		try{
			Socket skt = new Socket("localhost", 2222);

			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
			
			String message;
			do{
				System.out.print("From Client: ");
				message = keyboard.readLine();
				ps.println(message);

				message = br.readLine();
				if(message.equals("find sum"))
					message= br.readLine();
				else
					System.out.println(message);
				
				
			}while(!message.equals("end"));
			skt.close();
			keyboard.close();
			ps.close();
			br.close();
		}catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		}
				
	}
}