package ua.lviv.iot.labs.models;

public abstract class AbstractWritingAccessories extends AbstractStationery {
    private String color;
    private BodyShape bodyShape;
    private BodyColor bodyColor;
    private String bodyMaterial;

    public AbstractWritingAccessories(double priceInHryvnia, String producer, String barCode,
            int targetAge, String color, BodyShape bodyShape, BodyColor bodyColor,
            String bodyMaterial) {
        super(priceInHryvnia, producer, barCode, targetAge);
        this.color = color;
        this.bodyShape = bodyShape;
        this.bodyColor = bodyColor;
        this.bodyMaterial = bodyMaterial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BodyShape getBodyShape() {
        return bodyShape;
    }

    public void setBodyShape(BodyShape bodyShape) {
        this.bodyShape = bodyShape;
    }

    public BodyColor getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(BodyColor bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getHeaders() {
        return super.getHeaders() + "color" + "bodyShape" + bodyColor.getHeaders() + "bodyMaterial";
    }

}
