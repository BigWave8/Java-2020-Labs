package ua.lviv.iot.labs.models;

public class Paints extends AbstractWritingAccessories {
    private String type;
    private int numberOfColours;

    public Paints(double priceInHryvnia, String producer, String barCode, int targetAge,
            String color, BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial,
            String type, int numberOfColours) {
        super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor,
                bodyMaterial);
        this.type = type;
        this.numberOfColours = numberOfColours;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfColours() {
        return numberOfColours;
    }

    public void setNumberOfColours(int numberOfColours) {
        this.numberOfColours = numberOfColours;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "type" + "," + "numberOfColours";
    }

    public String toCSV() {
        return super.toCSV() + "," + getType() + "," + getNumberOfColours();
    }

}
