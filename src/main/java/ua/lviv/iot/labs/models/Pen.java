package ua.lviv.iot.labs.models;

public class Pen extends AbstractWritingInstruments {
    private int thicknessOfRodInMillimeters;
    private TypeOfPen typeOfPen;

    public Pen(double priceInHryvnia, String producer, String barCode, int targetAge, String color, BodyShape bodyShape,
            BodyColor bodyColor, String bodyMaterial, int lineThicknessInMillimeters, boolean canChangeRod,
            int thicknessOfRodInMillimeters, TypeOfPen typeOfPen) {
        super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor, bodyMaterial,
                lineThicknessInMillimeters, canChangeRod);
        this.thicknessOfRodInMillimeters = thicknessOfRodInMillimeters;
        this.typeOfPen = typeOfPen;
    }

    public TypeOfPen getTypeOfPen() {
        return typeOfPen;
    }

    public void setTypeOfPen(TypeOfPen typeOfPen) {
        this.typeOfPen = typeOfPen
    }

    public int getThicknessOfRodInMillimeters() {
        return thicknessOfRodInMillimeters;
    }

    public void setThicknessOfRodInMillimeters(int thicknessOfRodInMillimeters) {
        this.thicknessOfRodInMillimeters = thicknessOfRodInMillimeters;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "thicknessOfRodInMillimeters" + "," + "typeOfPen";
    }

    public String toCSV
        return super.toCSV() + "," + getThicknessOfRodInMillimeters() + "," + getTypeOfPen();
    }

}
