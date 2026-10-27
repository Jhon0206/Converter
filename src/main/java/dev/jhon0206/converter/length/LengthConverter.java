package dev.jhon0206.converter.length;

public class LengthConverter {

    public double convert(double valor, LengthUnit origin, LengthUnit destiny) {
        double valueInMeters = origin.convertToMeters(valor);
        return destiny.convertFromMeters(valueInMeters);
    }
}
