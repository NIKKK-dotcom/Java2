


class BankAccount{
    private double balance = 0;

    public void GetBalance(){
        System.out.println(balance);
    }

    public void AddMoney(double money){
        if (money>0){
            balance+=money;
            System.out.println(balance);
        }
        else{
            System.out.println("Сумма пополнения должна юыть больше нуля!");
        }
    }

    public void WithDraw(double money){
        if (balance<money){
            System.out.println("Недостаточно средств!");
        }
        else if (money<=0){
            System.out.println("Сумма списания должна юыть больше нуля!");
        }
        else{
            balance-=money;
            System.out.println(balance);
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("Я животное и я ем");
    }
    public void sleep(){
        System.out.println("Я животное и я сплю");
    }
    public void voice(){
        System.out.println("Я животное и я издаю звук");
    }
}
class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("Я собака и я гавкаю");
    }
    public void Sit(){
        System.out.println("Я собака и я села.");
    }

}
class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("Я кошка и я мяукаю");
    }
    public void play(){
        System.out.println("Я кошка и я играю с клубком.");
    }
}
class Person1{
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Employee extends Person1 {
    private double salary = 0;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

    public class Lesson1 {
        public static void section1() {
            BankAccount acc1 = new BankAccount();
            acc1.GetBalance();
            acc1.AddMoney(10000);
            acc1.WithDraw(6000);
        }

        public static void section2() {
            Animal animal = new Animal();
            animal.eat();
            animal.voice();
            Dog dog = new Dog();
            dog.voice();
            Cat cat = new Cat();
            cat.play();
            cat.voice();

        }

        public static void dz() {                         //     ДЗЗЗЗЗ
            Employee emp = new Employee("Иван", 30, 50000);
            System.out.println("Имя: " + emp.getName());
            System.out.println("Возраст: " + emp.getAge());
            System.out.println("Зарплата: " + emp.getSalary());
        }
    }

