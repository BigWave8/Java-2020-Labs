package ua.lviv.iot.labs.models;

public abstract class AbstractStationery {
    private double priceInHryvnia;
    private String producer;
    private String barCode;
    private int targetAge;

    public AbstractStationery(double priceInHryvnia, String producer, String barCode,
            int targetAge) {
        super();
        this.priceInHryvnia = priceInHryvnia;
        this.producer = producer;
        this.barCode = barCode;
        this.targetAge = targetAge;
    }

    public double getPriceInHryvnia() {
        return priceInHryvnia;
    }

    public void setPriceInHryvnia(double priceInHryvnia) {
        this.priceInHryvnia = priceInHryvnia;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public int getTargetAge() {
        return targetAge;
    }

    public void setTargetAge(int targetAge) {
        this.targetAge = targetAge;
    }

    public String getHeaders() {
        return "priceInHryvnia" + "producer" + "barCode" + "targetAge";
    }

}
