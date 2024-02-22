package lesson_6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int a = 11;
        Cat cat = new Cat();
        System.out.println(cat.feedCat(a));
        Class<? extends Cat> aClass = cat.getClass();
        Method method = aClass.getDeclaredMethod("sayMeow");
        method.setAccessible(true);
        method.invoke(cat);
    }
}
