
import java.util.Calendar;
import java.util.Scanner;

public class Example28_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;

            System.out.print("Введите ваш возраст: ");
            myyear = sc.nextInt();
            result = Math.abs(myyear - year);

        System.out.println("Вы родились в " + result + " году");


    }
}