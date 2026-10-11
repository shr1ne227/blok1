package practice1;

import java.util.Scanner;

public class Task7 {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 10, 20};
        long[] expected = {1, 1, 120, 3628800, 2432902008176640000L};
        System.out.println("Проверка метода factorial:");
        for (int i = 0; i < tests.length; i++) {
            long actual = factorial(tests[i]);
            String status;
            if (actual == expected[i]) {
                status = "OK";
            } else {
                status = "ОШИБКА";
            }
            System.out.println(tests[i] + "! = " + actual + "  [" + status + "]");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число от 0 до 20: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            long f = factorial(n);
            if (f == -1) {
                System.out.println("Число должно быть от 0 до 20");
            } else {
                System.out.println(n + "! = " + f);
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
