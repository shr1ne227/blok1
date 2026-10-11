package practice7.task4;

public class MathFuncTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);
        System.out.println();

        double[][] powTests = {{2, 10}, {5, 0}, {-3, 3}, {2, -2}, {1.5, 2}};
        System.out.println("Возведение в степень:");
        for (int i = 0; i < powTests.length; i++) {
            double base = powTests[i][0];
            int exponent = (int) powTests[i][1];
            System.out.printf("%5.1f ^ %2d = %10.4f   (Math.pow: %10.4f)%n",
                    base, exponent, mc1.pow(base, exponent), Math.pow(base, exponent));
        }

        System.out.println();
        double[][] complexTests = {{3, 4}, {-5, 12}, {1, 1}, {0, -2}};
        System.out.println("Модуль комплексного числа:");
        for (int i = 0; i < complexTests.length; i++) {
            double re = complexTests[i][0];
            double im = complexTests[i][1];
            String sign = "+";
            if (im < 0) {
                sign = "-";
            }
            System.out.printf("|%.0f %s %.0fi| = %.4f%n", re, sign, Math.abs(im), mc1.complexModulus(re, im));
        }

        System.out.println();
        MathFunc func = new MathFunc();
        double radius = 5;
        System.out.printf("Длина окружности радиуса %.1f = %.4f%n", radius, func.circleLength(radius));
        System.out.printf("Площадь круга радиуса %.1f = %.4f%n", radius, func.circleArea(radius));
    }
}
