import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson7 {
    public static void section1(){
        List<String> names = Arrays.asList("Екатерина", "Анастасия", "Владислав", "Антон", "Эмма", "Коля");

//        List<String> filteredNames = new ArrayList<>();
//        for (String name: names) {
//            if (name.startsWith("А")) {
//                filteredNames.add(name);
//            }
//        }

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("В"))
                .sorted()
                .collect(Collectors.toList());


        System.out.println(filteredNames);
    }
    public static void section2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());
        List<String> names = Arrays.asList("Екатерина", "Анастасия", "Владислав", "Антон", "Эмма", "Коля");
        List<Integer> lengthNames = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(lengthNames);
        names.stream().forEach(System.out::println);
        names.stream().limit(3).forEach(System.out::println);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7,7,4,5,6);
        numbers2.stream().distinct().forEach(System.out::println);
        boolean hasEven = numbers2.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
        boolean allEven = numbers2.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);
       long l = numbers2.stream().count();
        System.out.println(l);

//        (p1, p2) -> {
//
//        }

    }
}
