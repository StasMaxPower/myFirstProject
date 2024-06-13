package lesson_21.task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

/*        List<String> list = List.of("Hello", "World", "Java");

        Stream<String> stream = list.stream().filter(x->x.startsWith("H"));
        List<String> collect = stream.collect(Collectors.toList());
        System.out.println(collect);*/


/*        long count = Stream.of(1, 2, 3).
                count();*/
/*        Stream.generate(()-> new Random().nextInt(10))
                .limit(10)
                .forEach(x-> System.out.println(x));*/

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        List<String> list = List.of("Hello world", "Hello World Java", "Java","Java", "Hello world");
        List<String> list1 = List.of("Hello1", "World1", "Java1");

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else return -1;
            }
        };

        var s = list.stream()
                //  flatMap(x -> Arrays.stream(x.split(" ")))
                .limit(5)
                .peek(x -> System.out.println("До peek " + x))
                // .filter(x->x.startsWith("H"))
                .collect(Collectors.groupingBy(String::length));
        System.out.println(s);



        List<String> company = List.of("company1", "company2", "java");
        var companyes = company.stream().filter(x->x.startsWith("c")).map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(companyes);
    }

}
