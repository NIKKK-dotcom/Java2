import java.util.*;


class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

public class Lesson6 {
    public static void section1(){
        Set<String> guest = new HashSet<>();
        guest.add("Боб");
        guest.add("Алиса");
        guest.add("Алиса");
        System.out.println(guest);




    }
    public static void section2(){
        Set<String> names = new HashSet<>();
        names.add("Nikk");
        names.add("Kate");
        names.add("Tolya");
        System.out.println(names);
        names.remove("Tolya");
        System.out.println(names);
        System.out.println(names.contains("Nikk"));
        System.out.println(names.isEmpty());
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        names.clear();
        System.out.println(names);
    }
    public static void section3(){
        Set<String> names = new LinkedHashSet<>();
        names.add("lol");
        names.add("зз");
        names.add("ll");
        names.add("uu");
        names.add("dd");
        System.out.println(names);
    }
}

