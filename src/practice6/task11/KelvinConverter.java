package practice6.task11;

public class KelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public String getScaleName() {
        return "K";
    }
}
