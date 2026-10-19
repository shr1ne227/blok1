package practice3.converter;

import java.util.Scanner;

public class CurrencyConverter {
    private String[] codes;
    private double[] ratesToRub;

    public CurrencyConverter() {
        codes = new String[]{"RUB", "USD", "EUR", "CNY"};
        ratesToRub = new double[]{1.0, 81.5, 94.8, 11.4};
    }

    public int getCurrencyCount() {
        return codes.length;
    }

    public String getCode(int index) {
        return codes[index];
    }

    public double getRateToRub(int index) {
        return ratesToRub[index];
    }

    public int indexOf(String code) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public double convert(double amount, String from, String to) {
        int fromIndex = indexOf(from);
        int toIndex = indexOf(to);
        if (fromIndex == -1 || toIndex == -1) {
            return -1;
        }
        double rubles = amount * ratesToRub[fromIndex];
        return rubles / ratesToRub[toIndex];
    }

    public String format(double amount, String code) {
        return String.format("%,.2f %s", amount, code.toUpperCase());
    }

    private static String readCode(Scanner sc, CurrencyConverter converter, String question) {
        System.out.print(question);
        String code = sc.next();
        while (converter.indexOf(code) == -1) {
            System.out.print("Такой валюты нет, введите ещё раз: ");
            code = sc.next();
        }
        return code;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Курсы валют (условные):");
        for (int i = 0; i < converter.getCurrencyCount(); i++) {
            System.out.printf("1 %s = %8.2f RUB%n", converter.getCode(i), converter.getRateToRub(i));
        }

        System.out.println();
        double amount = 1500;
        String[] targets = {"USD", "EUR", "CNY"};
        for (int i = 0; i < targets.length; i++) {
            double result = converter.convert(amount, "RUB", targets[i]);
            System.out.printf("%s = %s%n", converter.format(amount, "RUB"), converter.format(result, targets[i]));
        }
        double result = converter.convert(100, "USD", "EUR");
        System.out.printf("%s = %s%n", converter.format(100, "USD"), converter.format(result, "EUR"));

        String list = "";
        for (int i = 0; i < converter.getCurrencyCount(); i++) {
            if (i > 0) {
                list += ", ";
            }
            list += converter.getCode(i);
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Нужно ввести число: ");
        }
        double userAmount = sc.nextDouble();
        String from = readCode(sc, converter, "Из какой валюты (" + list + "): ");
        String to = readCode(sc, converter, "В какую валюту (" + list + "): ");
        double converted = converter.convert(userAmount, from, to);
        System.out.printf("%s = %s%n", converter.format(userAmount, from), converter.format(converted, to));
    }
}
