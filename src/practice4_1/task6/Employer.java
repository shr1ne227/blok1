package practice4_1.task6;

public class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncome() {
        return income * 12;
    }

    @Override
    public String toString() {
        return "Сотрудник " + firstName + " " + lastName;
    }
}
