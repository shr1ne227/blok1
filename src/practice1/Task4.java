package practice1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        while (size <= 0) {
            System.out.print("Введите размер массива (целое число > 0): ");
            if (sc.hasNextInt()) {
                size = sc.nextInt();
            } else {
                sc.next();
            }
        }

        int[] numbers = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        int count = 0;
        while (count < size) {
            if (sc.hasNextInt()) {
                numbers[count] = sc.nextInt();
                count++;
            } else {
                System.out.println("\"" + sc.next() + "\" — не целое число, введите ещё раз");
            }
        }

        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < numbers.length);

        int sumWhile = 0;
        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }

        int min = numbers[0];
        int max = numbers[0];
        int k = 1;
        while (k < numbers.length) {
            if (numbers[k] < min) {
                min = numbers[k];
            }
            if (numbers[k] > max) {
                max = numbers[k];
            }
            k++;
        }

        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
