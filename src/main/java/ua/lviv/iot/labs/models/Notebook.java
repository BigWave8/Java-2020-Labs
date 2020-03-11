package ua.lviv.iot.labs.models;

public class Notebook extends AbstractPaperProducts {
    private boolean oneColorOnCover;
    private Ruling ruling;

    public Notebook(double priceInHryvnia, String producer, String barCode, int targetAge,
            Format format, int article, int densityInGramsPerSguareMeter, boolean oneColorOnCover,
            Ruling ruling) {
        super(priceInHryvnia, producer, barCode, targetAge, format, article,
                densityInGramsPerSguareMeter);
        this.oneColorOnCover = oneColorOnCover;
        this.ruling = ruling;
    }

    public boolean isOneColorOnCover() {
        return oneColorOnCover;
    }

    public void setOneColorOnCover(boolean oneColorOnCover) {
        this.oneColorOnCover = oneColorOnCover;
    }

    public Ruling getRuling() {
        return ruling;
    }

    public void setRuling(Ruling ruling) {
        this.ruling = ruling;
    }
    
    public String getHeaders() {
        return super.getHeaders() + "oneColorOnCover" + "ruling";
    }

}
