package practice2.task4;

public class Shop {
    private Computer[] computers;
    private int count;

    public Shop() {
        computers = new Computer[2];
        count = 0;
    }

    public void add(Computer computer) {
        if (count == computers.length) {
            Computer[] bigger = new Computer[computers.length * 2];
            for (int i = 0; i < count; i++) {
                bigger[i] = computers[i];
            }
            computers = bigger;
        }
        computers[count] = computer;
        count++;
    }

    public boolean remove(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Computer find(String brand, String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand().equalsIgnoreCase(brand)
                    && computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("В магазине нет компьютеров");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + computers[i]);
        }
    }
}
