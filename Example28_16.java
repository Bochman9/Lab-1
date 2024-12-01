
import java.util.Scanner;

public class Example28_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();


 int numberMinusOne = number - 1;
 int numberPlusOne = number + 1;
 int sum = number + numberMinusOne + numberPlusOne;
 int squareOfSum = sum * sum;


 System.out.println("Последовательность чисел:");
 System.out.println(numberMinusOne);
 System.out.println(number);
 System.out.println(numberPlusOne);
 System.out.println(squareOfSum);

scanner.close();
    }
}

