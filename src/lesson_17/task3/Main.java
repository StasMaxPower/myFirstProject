package lesson_17.task3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Path path = Path.of("data.txt");

        try {
            Reader reader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            //Writer writer = new FileWriter("data.txt");
            System.out.println(bufferedReader.readLine());
           // BufferedWriter bufferedWriter = new BufferedWriter(writer);
           // bufferedWriter.
            reader.close();

        } catch (Exception ignored){
        }

       // System.out.println(Files.readString(path));


    }

}
