package dev.jhon0206.converter.length;

public enum LengthUnit {
    METER(1.0), KILOMETER(1000.0);

    private final double metersPerUnit;

    LengthUnit(double metersPerUnit) { this.metersPerUnit = metersPerUnit; }

    public double convertToMeters(double value) { return value * metersPerUnit; }

    public double convertFromMeters(double meters) { return meters / metersPerUnit; }
}
