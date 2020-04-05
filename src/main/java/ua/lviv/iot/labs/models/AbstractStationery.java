package ua.lviv.iot.labs.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractStationery {
    private double priceInHryvnia;
    private String producer;
    private String barCode;
    private int targetAge;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AbstractStationery(double priceInHryvnia, String producer, String barCode, int targetAge) {
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
        return "priceInHryvnia" + "," + "producer" + "," + "barCode" + "," + "targetAge";
    }

    public String toCSV() {
        return getPriceInHryvnia() + "," + getProducer() + "," + getBarCode() + "," + getTargetAge();
    }

}
