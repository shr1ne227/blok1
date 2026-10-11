package practice4_1.task6;

public class EmployerTest {
    public static void main(String[] args) {
        Employer boss = new Manager("Ольга", "Смирнова", 90000, 25000);
        System.out.printf("%s: годовой доход %,.2f руб.%n", boss, boss.getIncome());
        System.out.println();

        Employer[] staff = {
                new Employer("Иван", "Иванов", 60000),
                new Manager("Пётр", "Петров", 70000, 15000),
                new Employer("Анна", "Кузнецова", 55000),
                boss
        };

        System.out.println("Годовой доход сотрудников:");
        for (int i = 0; i < staff.length; i++) {
            System.out.printf("%-28s %,15.2f руб.%n", staff[i], staff[i].getIncome());
        }
    }
}
