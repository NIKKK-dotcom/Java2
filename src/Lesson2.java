class Calc{
    public static void sum(int numb1,int numb2){
        System.out.println(numb1+numb2);
    }

    public static void minus(int numb1,int numb2) {
        System.out.println(numb1 - numb2);
    }

    public static void multiply(int numb1,int numb2) {
        System.out.println(numb1 * numb2);
    }

    public static void divide(int numb1,int numb2){
        System.out.println(numb1/numb2);
    }

    public static void sum(double numb1,double numb2){
        System.out.println(numb1+numb2);
    }
}

interface IAnimal {
    void MakeSound();
    void Eat();
    void Sleep();
    void Move();
}

class Horse implements IAnimal {
    @Override
    public void MakeSound() {
        System.out.println("Я лошадь и я ржу хз");
    }

    @Override
    public void Eat() {
        System.out.println("Я лошадь и я ем");
    }

    @Override
    public void Sleep() {
        System.out.println("Я лошадь и я сплю");
    }

    @Override
    public void Move() {
        System.out.println("Я лошадь и я двигаюсь");
    }
}

interface ICars{
    void AddFuel();
    void ChangeWheels();
    void PowerOn();
    void Stop();
}

class XZ implements ICars {
    @Override
    public void AddFuel() {
        System.out.println("Я машина и я заправилась");
    }

    @Override
    public void ChangeWheels() {
        System.out.println("Я машина и мне поменяли колеса");
    }

    @Override
    public void PowerOn() {
        System.out.println("Я машина и я включиласьхз");
    }

    @Override
    public void Stop() {
        System.out.println("Я машина и я затормозила и остановилась.");
    }
}

public class Lesson2 {

    public static void section1(){
        Calc.sum(10,20);
        Calc.sum(1.5,2.5);
    }

    public static void section2(){
        Horse horse = new Horse();
        horse.Eat();
    }
    public static void section3(){
        XZ car = new XZ();
        car.AddFuel();
        car.ChangeWheels();
    }
}


