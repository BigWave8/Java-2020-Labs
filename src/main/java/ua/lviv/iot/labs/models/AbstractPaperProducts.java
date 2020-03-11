package ua.lviv.iot.labs.models;

public abstract class AbstractPaperProducts extends AbstractStationery {
    private Format format;
    private int article;
    private int densityInGramsPerSguareMeter;

    public AbstractPaperProducts(double priceInHryvnia, String producer, String barCode,
            int targetAge, Format format, int article, int densityInGramsPerSguareMeter) {
        super(priceInHryvnia, producer, barCode, targetAge);
        this.format = format;
        this.article = article;
        this.densityInGramsPerSguareMeter = densityInGramsPerSguareMeter;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getDensityInGramsPerSguareMeter() {
        return densityInGramsPerSguareMeter;
    }

    public void setDensityInGramsPerSguareMeter(int densityInGramsPerSguareMeter) {
        this.densityInGramsPerSguareMeter = densityInGramsPerSguareMeter;
    }
    
    public String getHeaders() {
        return super.getHeaders() + "format" + "article" + "densityInGramsPerSguareMeter";
    }

}
