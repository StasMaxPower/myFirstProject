package lesson_31.task2;

import lesson_17.task1.CopyWithApache;
import lesson_17.task1.CopyWithNIO;
import lesson_31.task2.intefaces.CopyFileTask;
import lesson_31.task2.intefaces.Task;
import lesson_31.task2.intefaces.TaskExecutor;
import lesson_31.task2.intefaces.TasksStorage;

public class Main {

    public static void main(String[] args) {

        CopyFileTask task1 = new CopyFileTaskImpl("E:\\Хулиганы.avi", "1.avi", 1);
        CopyFileTask task2 = new CopyFileTaskImpl("E:\\Хулиганы.avi", "2.avi", 2);
        CopyFileTask task3 = new CopyFileTaskImpl("E:\\Хулиганы.avi", "3.avi", 3);
        CopyFileTask task4 = new CopyFileTaskImpl("E:\\Хулиганы.avi", "4.avi", 4);
        CopyFileTask task5 = new CopyFileTaskImpl("E:\\Хулиганы111.avi", "5.avi", 5);

        task1.setFileCopyUtils(new CopyWithApache());
        task2.setFileCopyUtils(new CopyWithApache());
        task3.setFileCopyUtils(new CopyWithApache());
        task4.setFileCopyUtils(new CopyWithApache());
        task5.setFileCopyUtils(new CopyWithApache());

        TasksStorage tasksStorage = new TaskStorageImpl();
        tasksStorage.add(task1);
        tasksStorage.add(task2);
        tasksStorage.add(task3);
        tasksStorage.add(task4);
        tasksStorage.add(task5);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(tasksStorage);
        executor2.setStorage(tasksStorage);
        executor3.setStorage(tasksStorage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
