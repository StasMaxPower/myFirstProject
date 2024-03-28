package lesson_17.task1;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
/*        ICopyUtils iCopyUtils = new CopyWithIo();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\Stas\\Desktop\\ТРЕНЕРОВОЧНЫЙ ДЕНЬ.avi", "1.avi");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода IO " + (end - start));*/
        //20 сек

/*        ICopyUtils iCopyUtils = new CopyWithNIO();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\Stas\\Desktop\\ТРЕНЕРОВОЧНЫЙ ДЕНЬ.avi", "1.avi");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода NIO " + (end - start));*/
        //2 секунды

/*        ICopyUtils iCopyUtils = new CopyWithApache();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\Stas\\Desktop\\ТРЕНЕРОВОЧНЫЙ ДЕНЬ.avi", "1.avi");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода Apache " + (end - start));
        //4 секунды*/

        Path path = Paths.get("data.txt");
        System.out.println(Files.readString(path));
        System.out.println();
        String s = "        {\n" +
                "            \"value\": \"Иванов Виктор\",\n" +
                "            \"unrestricted_value\": \"Иванов Виктор\",\n" +
                "            \"data\": {\n" +
                "                \"surname\": \"Иванов\",\n" +
                "                \"name\": \"Виктор\",\n" +
                "                \"patronymic\": null,\n" +
                "                \"gender\": \"MALE\"\n" +
                "            }\n" +
                "        }";

        JSONObject jo = new JSONObject(s);

        System.out.println(((JSONObject)jo.get("data")).get("surname"));

    }
}
