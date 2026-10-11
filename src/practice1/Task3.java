package practice1;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.print("Массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
