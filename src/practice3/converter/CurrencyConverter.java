package practice3.converter;

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
    }
}
