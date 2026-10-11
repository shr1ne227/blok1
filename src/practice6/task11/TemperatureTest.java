package practice6.task11;

import java.util.Scanner;

public class TemperatureTest {
    public static void printConversions(double celsius, Convertable[] converters) {
        System.out.printf("%8.2f °C", celsius);
        for (int i = 0; i < converters.length; i++) {
            System.out.printf(" = %8.2f %s", converters[i].convert(celsius), converters[i].getScaleName());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Convertable[] converters = {new KelvinConverter(), new FahrenheitConverter()};

        double[] samples = {-273.15, -40, 0, 36.6, 100};
        System.out.println("Таблица перевода температур:");
        for (int i = 0; i < samples.length; i++) {
            printConversions(samples[i], converters);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру по Цельсию: ");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Нужно ввести число: ");
        }
        double celsius = sc.nextDouble();
        printConversions(celsius, converters);
    }
}
