
import java.util.Scanner;

public class Example28_08
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input username: ");
        String username = in.nextLine();
        System.out.println("Input Middle name: ");
        String Middlename = in.nextLine();

        System.out.println("Hello " + username + ' ' + name + ' ' + Middlename);

        in.close();
    }
}