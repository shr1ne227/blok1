package practice1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            sum += term;
            System.out.printf("%2d) %-5s = %.4f%n", n, "1/" + n, term);
        }
        System.out.printf("Сумма первых 10 членов = %.4f%n", sum);
    }
}
