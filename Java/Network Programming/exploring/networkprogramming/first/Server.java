package exploring.networkprogramming.first;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server{
	static int sum(Object...x){
        int sum = 0;
//		for(int i = 0; i<x.length; i++){
//			sum += Integer.parseInt(x[i]+"");
//		}
		for(Object elem : x){
			sum += Integer.parseInt(elem+"");
		}
        return sum;
	}
	public static void main(String [] args){
		try{
			ServerSocket ss = new ServerSocket(2222);
			Socket skt = ss.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());

			String message, sum;

			do{
				{
					message = br.readLine();
					String str = message.toLowerCase();
					switch(str){
						case "hello":
							ps.println("From Server: Hi, there!");
							break;
						case "hi":
							ps.println("From Server: Hi, there!");
							break;
						case "what's up?":
							ps.println("From Server: I'm fine how'bout you?");
							break;
						case "find sum":
							ps.println("Sure, here's the syntax to find sum: sum(integer, integer,....);");
							sum = br.readLine();
							List <Integer> list = new ArrayList<>();
							if (sum.matches("sum\\([\\d,]+\\)")) {
								Pattern pattern = Pattern.compile("\\d+");
								Matcher matcher = pattern.matcher(sum);

								while (matcher.find()) {
									list.add(Integer.parseInt(matcher.group()));
								}
								ps.print("From Server: The sum of ");
								ps.print(list);
								ps.println(" is " + sum(list.toArray()));
							}
							break;

						default:
							ps.println("Sorry, I'm not able to understand");
							break;
					}

				}

			}
			while(!message.equals("end"));
			ss.close();
			skt.close();
			ps.close();
			br.close();

		}
		catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		}
	}
}