
public class Example28_18 {
    static double a = 10.0;
    static double b = 4.0;
    static double c;

// Метод для расчета гипотенузы

public static double hyp() {
    return c = Math.sqrt(a * a + b * b);
}

// Метод для вычисления a^b
public static double power(double base, double exponent) {
    return Math.exp(exponent * Math.log(base));
}


    public static void main(String[] args) {
    System.out.println("katet a = " + a);
    System.out.println("katet b = " + b);
    System.out.println("hypotenuse c = " + hyp());

    // Пример вычисления a^b
        double result = power(a, b);
        System.out.println("a^b = " + result); }
}
