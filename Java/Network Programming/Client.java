import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Client{
	public static void main (String [] args){
		try{
			Socket skt = new Socket("localhost", 2000);
		
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
		
			String message;
			do{

				// First two lines are reading the input from keyboard, and we're printing it for the 
				//sake of certainty that message is being successfully read. 

				message = keyboard.readLine();
				ps.println(message);
						
				message = br.readLine(); // receiving data from server
				System.out.println(message); // printing the received data

			}while(!message.equals("end"));

			skt.close();
			br.close();
			ps.close();

		}
		catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		}


	}
}