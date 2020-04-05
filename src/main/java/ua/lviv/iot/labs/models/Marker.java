package ua.lviv.iot.labs.models;

public class Marker extends AbstractWritingInstruments {
    private String basic;
    private String type;

    public Marker(double priceInHryvnia, String producer, String barCode, int targetAge,
            String color, BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial,
            int lineThicknessInMillimeters, boolean canChangeRod, String basic, String type) {
        super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor,
                bodyMaterial, lineThicknessInMillimeters, canChangeRod);
        this.basic = basic;
        this.type = type;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "basic" + "," + "type";
    }

    public String toCSV() {
        return super.toCSV() + "," + getBasic() + "," + getType();
    }

}
