package ua.lviv.iot.labs.models;

public class Pen extends AbstractWritingInstruments {
    private int thicknessOfRodInMillimeters;
    private Type type;

    public Pen(double priceInHryvnia, String producer, String barCode, int targetAge, String color,
            BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial,
            int lineThicknessInMillimeters, boolean canChangeRod, int thicknessOfRodInMillimeters,
            Type type) {
        super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor,
                bodyMaterial, lineThicknessInMillimeters, canChangeRod);
        this.thicknessOfRodInMillimeters = thicknessOfRodInMillimeters;
        this.type = type;
    }

    public int getThicknessOfRodInMillimeters() {
        return thicknessOfRodInMillimeters;
    }

    public void setThicknessOfRodInMillimeters(int thicknessOfRodInMillimeters) {
        this.thicknessOfRodInMillimeters = thicknessOfRodInMillimeters;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
