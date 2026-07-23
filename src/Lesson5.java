import java.util.*;

public class Lesson5 {
    public static void section1(){
        HashMap<String,String> PhoneBook = new HashMap<>();
        PhoneBook.put("Kate","842");
        PhoneBook.put("Nikk","847");
        PhoneBook.put("Lola","356");
        PhoneBook.put("Natasha","891");
        PhoneBook.put("Igor","167");
        PhoneBook.put("Igor","429");
        System.out.println(PhoneBook);
    }
    public static void section2(){
        LinkedHashMap<Integer,String> history = new LinkedHashMap<>();
        history.put(1,"YouTube");
        history.put(2,"Pinterest");
        System.out.println(history);
    }
    public static void section3(){
        TreeMap<Integer,Integer> characteristics = new TreeMap<>(Collections.reverseOrder());
        characteristics.put(10,5);
        characteristics.put(27,3);
        characteristics.put(6,4);
        System.out.println(characteristics);
        System.out.println(characteristics.lastKey());


    }
}
