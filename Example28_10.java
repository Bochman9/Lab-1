
import java.util.Scanner;

public class Example28_10{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("den nedeli: ");
    String den = in.nextLine();
    System.out.println("Input month: ");
    String month = in.nextLine();
    System.out.println("Input date: ");
    int date = in.nextInt();
    System.out.println("Today: " + den + ' ' + date + ' ' + month);

    in.close();
}
}
