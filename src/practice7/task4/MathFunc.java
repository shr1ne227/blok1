package practice7.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double base, int exponent) {
        double result = 1;
        int n = Math.abs(exponent);
        for (int i = 0; i < n; i++) {
            result *= base;
        }
        if (exponent < 0) {
            return 1 / result;
        }
        return result;
    }

    @Override
    public double complexModulus(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public double circleArea(double radius) {
        return PI * pow(radius, 2);
    }
}
