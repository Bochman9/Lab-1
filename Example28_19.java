
public class Example28_19 {


public static double hyp(double a, double b) {
    return Math.sqrt(a * a + b * b);
}

    public static void main(String[] args) {

    // Пример использования метода hyp()
        double catetA = 3.0; double catetB = 4.0;
        double hypotenuse = hyp(catetA, catetB);

        System.out.println("Гипотенуза треугольника с катетами " + catetA + " и " + catetB + " равна: " + hypotenuse);
}
}

//не забыть скопировать в папку java_ex