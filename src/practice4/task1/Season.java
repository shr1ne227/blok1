package practice4.task1;

public enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 8),
    SUMMER("Лето", 22) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", 6);

    private final String title;
    private final int averageTemperature;

    Season(String title, int averageTemperature) {
        this.title = title;
        this.averageTemperature = averageTemperature;
    }

    public String getTitle() {
        return title;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
