package practice.question1;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        
		//Reading directory name 
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the path of directory to create");
		String pathOfDirectory = input.nextLine();
		
		// Crated File object 
		File directory = new File (pathOfDirectory);
		
		// Checking if File already exists
		if(directory.exists()) 
			System.out.println("Directory already exists");
		else 
			System.out.println("Creating directory...");
		
		// Creating the directory
		if(directory.mkdir())
			try{
				System.out.println("Succesfully created the directory " + directory.getCanonicalPath());
			}
			catch (IOException e){
				System.out.println(e.getLocalizedMessage());
			}
		else 
			System.out.println("Error, failed to create directory");
		
		//Creating a file inside the newly created Directory.
		System.out.println("Enter the name of file to create");
		String nameOfFile= input.nextLine();
		
		
		try{
			nameOfFile = directory.getCanonicalPath() + File.separator + nameOfFile;
		}
		catch (IOException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		File file = new File(nameOfFile);
		
		if(file.exists())
			System.out.println("File already exists...");
		else 
			System.out.println("Creating the file...");
		
		try{
			if(file.createNewFile())
				System.out.println("Created new file " + file.getCanonicalPath());
			else 
				System.out.println("Error, unable to create the file");
		}
		catch(IOException e){
			System.out.println(e.getLocalizedMessage());
		}

		input.close();
    }
}
