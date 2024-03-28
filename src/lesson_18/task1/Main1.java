package lesson_18.task1;

import java.io.File;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) throws IOException {

        File file = new File("test\\1.txt");
        System.out.println(file.mkdirs());

        file.createNewFile();
    }


}
