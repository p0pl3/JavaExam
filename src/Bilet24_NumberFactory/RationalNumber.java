package Bilet24_NumberFactory;

public class RationalNumber {
    private double value;

    public RationalNumber(double value) {
        this.value = value;
    }

    public double getModulus() {
        return Math.abs(value);
    }
}
