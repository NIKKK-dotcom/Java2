


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

public class Lesson1 {
    public static void section1(){
        BankAccount acc1 = new BankAccount();
        acc1.GetBalance();
        acc1.AddMoney(10000);
        acc1.WithDraw(6000);
    }
    public static void section2(){
        Animal animal = new Animal();
        animal.eat();
        animal.voice();
        Dog dog = new Dog();
        dog.voice();
        Cat cat = new Cat();
        cat.play();
        cat.voice();

    }
}
