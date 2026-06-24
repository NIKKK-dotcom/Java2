import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lesson4 {
    public static void section1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(16);
        numbers.add(0,8);
        numbers.add(1,6);
        numbers.set(2,4);
        System.out.println(numbers.get(2));
        numbers.remove(1);
        Collections.sort(numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        for (int n: numbers){
            System.out.print(n);
        }
    }
    public static void section2(){
        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.remove("a");
        System.out.println(letters.contains("b"));
        System.out.println(letters.indexOf("a"));
        for(String i:letters){
            System.out.println(i);
        }
    }
    public static void section3(){
        LinkedList<String> train = new LinkedList<>();
        train.addLast("Локомотив");
        train.addLast("Вагон 1");
        train.addLast("Вагон 2");
        train.addLast("Вагон 3");
//        train.removeFirst();
        while (!train.isEmpty()){
            String wagon = train.removeFirst();
            System.out.println(wagon);
        }

    }
}
