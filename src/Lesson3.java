import java.util.InputMismatchException;
import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}
class NeznanyeException extends Exception{
    public NeznanyeException(String message){
        super(message);
    }

}
class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

public class Lesson3 {
    static void section1(){
        try{
            int a = 1000;
            int b = 10;
            System.out.println(a/b);
        } catch (ArithmeticException mistake){
            System.out.println("Делить на ноль нельзя" +" " + mistake.getMessage());
        } finally {
            System.out.println("Cпасибо, что пользуетесь нашим калькулятором. 7 дней премки кончились, заплатите пж.");
        }

    }
    static void section2(){
        try{
            throw new CustomException("Лол тебя взломали докс сват там да");
        } catch (CustomException trolling){
            System.out.println("Перехвачено исключение: " + trolling.getMessage());
        }finally {
            System.out.println("Malewarebytes там почистил там да");
        }
    }
    static void section3(){
        try {
            throw new NeznanyeException("хз");
        }catch (NeznanyeException neznanie){
            System.out.println("Перехвачено исключение: " + neznanie.getMessage());
        }finally {
            System.out.println("знай.");
        }
    }
    static void DZ(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Введите число: ");
                int number = scanner.nextInt();

                if (number < 0){
                    throw new NegativeNumberException("Число не должно быть отрицательным");
                }

                System.out.println(100 / number);
                break;

            } catch (ArithmeticException e){
                System.out.println("Делить на ноль нельзя");
            } catch (InputMismatchException e){
                System.out.println("Введите число");
                scanner.nextLine();
            } catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
