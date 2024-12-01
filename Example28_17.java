
import java.util.Scanner;

public class Example28_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number #1: ");
        int number1 = scanner.nextInt();
        System.out.print("Input number #2: ");
        int number2 = scanner.nextInt();


        int sum = number1 + number2;
        int minus = number1 - number2;


        System.out.println("Сложение чисел: " + number1 + " + " + number2 + " = " + sum);
        System.out.println("Разность чисел: " + number1 + " - " + number2 + " = " + minus);

        scanner.close();
    }
}

