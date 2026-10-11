package practice4.task1;

public class SeasonTest {
    public static void printLove(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Название: " + favorite.getTitle());
        System.out.println("Порядковый номер: " + favorite.ordinal());
        System.out.println("Средняя температура: " + favorite.getAverageTemperature() + " °C");
        System.out.println("Описание: " + favorite.getDescription());
        printLove(favorite);
        printLove(Season.valueOf("WINTER"));

        System.out.println();
        System.out.println("Все времена года:");
        for (Season season : Season.values()) {
            System.out.printf("%-7s %-6s %4d °C   %s%n", season, season.getTitle(),
                    season.getAverageTemperature(), season.getDescription());
        }
    }
}
