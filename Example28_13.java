
import java.time.Year;
import java.util.Scanner;

public class Example28_13
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();

        Year currentYear = Year.now();
        int currentYearInt = currentYear.getValue();

        int ageIfBirthdayHappened = currentYearInt - birthYear;

        System.out.println( name + " Вам " + ageIfBirthdayHappened);
        scanner.close();
    }
}

