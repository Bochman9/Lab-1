
import java.util.Scanner;

public class Example28_15 {
    public static void main(String [] args) {
        // чтение входных данных от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scanner.nextInt();
        // сложение двух чисел
        int output = num1 + num2;
        System.out.println( + num1 + " + " + num2 + " = " + output);
    }
}
