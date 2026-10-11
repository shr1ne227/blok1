package practice2.task4;

import java.util.Scanner;

public class ShopTest {
    private static Scanner sc = new Scanner(System.in);

    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Нужно ввести целое число, попробуйте ещё раз: ");
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    private static double readDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Нужно ввести число, попробуйте ещё раз: ");
        }
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("1 - добавить компьютер");
            System.out.println("2 - удалить компьютер");
            System.out.println("3 - найти компьютер");
            System.out.println("4 - показать все компьютеры");
            System.out.println("0 - выход");
            choice = readInt("Ваш выбор: ");

            if (choice == 1) {
                String brand = readLine("Марка: ");
                String model = readLine("Модель: ");
                int ram = readInt("ОЗУ, ГБ: ");
                double price = readDouble("Цена, руб.: ");
                shop.add(new Computer(brand, model, ram, price));
                System.out.println("Компьютер добавлен. Всего в магазине: " + shop.getCount());
            } else if (choice == 2) {
                String model = readLine("Модель для удаления: ");
                if (shop.remove(model)) {
                    System.out.println("Компьютер удалён");
                } else {
                    System.out.println("Компьютер с такой моделью не найден");
                }
            } else if (choice == 3) {
                String brand = readLine("Марка: ");
                String model = readLine("Модель: ");
                Computer found = shop.find(brand, model);
                if (found != null) {
                    System.out.println("Найден: " + found);
                } else {
                    System.out.println("Такого компьютера в магазине нет");
                }
            } else if (choice == 4) {
                shop.printAll();
            } else if (choice != 0) {
                System.out.println("Нет такого пункта меню");
            }
        }
        System.out.println("До свидания!");
    }
}
