

import java.util.Scanner;
import java.lang.Math;

public class Example28_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


System.out.print("Введите основание (a): ");
double a = scanner.nextDouble();


System.out.print("Введите степень (b): ");
double b = scanner.nextDouble();


// Вычисление a^b
double result = Math.pow(a, b);


// Вывод результата
System.out.println(a + " в степени " + b + " равно " + result);
    scanner.close();
                                            }
                        }

