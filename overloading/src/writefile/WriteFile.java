package writefile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        String fileName = "D:\\javac\\behzad2.txt";


        String content = "behzad try hard\namir helps behzad\nbarnameh nevisi sakhte";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(content);
            writer.newLine();
            writer.write("behzad hamidi");
            writer.write("Another line.");
        } catch (IOException e) {

            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
