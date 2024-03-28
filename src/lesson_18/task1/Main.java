package lesson_18.task1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) {

        File file = new File("test");
        System.out.println(file.exists());

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt")|| pathname.getName().endsWith(".docx");
            }
        });

        for (File file1 : files) {
            System.out.println(file1.getName());
        }

    }

}
