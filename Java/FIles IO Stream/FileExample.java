import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileExample {
    public static void main(String[] args) {
        // Creating a Path object representing a file
        Path filePath = Paths.get("example.txt");

        try {
            // Writing to a file using Files.write method
            String content = "Hello, World!";
            Files.write(filePath, content.getBytes());

            // Reading from a file using Files.readAllLines method
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
