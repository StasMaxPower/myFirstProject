package lesson_18.task1;

import lesson_17.task2.Write;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) throws IOException {

/*        Reader reader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
       // System.out.println(bufferedReader.lines().findFirst());
       // bufferedReader.lines().collect(Collectors.toList()).forEach(System.out::println);

        Writer writer = new FileWriter("data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        writer.write("Hello");
        writer.close();*/

        Path path = Path.of("data.txt");
        System.out.println(Files.readString(path));
       // System.out.println(Files.writeString(path, "Hello world"));



    }
}
