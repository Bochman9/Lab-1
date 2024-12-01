
import java.util.Scanner;

public class Example28_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Kol-vo dney: ");
        int den = in.nextInt();
        System.out.println("В данном месяце: " + month + ' ' + den + " дней");

        in.close();
    }
}
