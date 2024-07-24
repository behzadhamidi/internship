package IO.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String filePath = "D:\\javac\\behzad.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(filePath) )) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
