package ua.lviv.iot.labs.models;

public class BodyColor {
    private int colorCount;
    private String colorName;

    public BodyColor(int colorCount, String colorName) {
        super();
        this.colorCount = colorCount;
        this.colorName = colorName;
    }

    public int getColorCount() {
        return colorCount;
    }

    public void setColorCount(int colorCount) {
        this.colorCount = colorCount;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHeaders() {
        return "colorCount" + "," + "colorName";
    }

    public String toCSV() {
        return getColorCount() + "," + getColorName();
    }

}
