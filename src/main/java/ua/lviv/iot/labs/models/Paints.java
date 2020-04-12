package ua.lviv.iot.labs.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Paints extends AbstractWritingAccessories {

    private String type;

    private int numberOfColours;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Paints_Brashes", joinColumns = {
            @JoinColumn(name = "paints_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "brush_id", nullable = false) })
    @JsonIgnoreProperties("paints")
    private Set<Brush> brushes;

    public Paints(double priceInHryvnia, String producer, String barCode, int targetAge, String color,
            BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial, String type, int numberOfColours) {
        super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor, bodyMaterial);
        this.type = type;
        this.numberOfColours = numberOfColours;
    }

    public Paints() {
        super(0.0, null, null, 0, null, null, new BodyColor(0, null), null);
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

    public Set<Brush> getBrushes() {
        return brushes;
    }

    public void setBrushes(Set<Brush> brushes) {
        this.brushes = brushes;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "type" + "," + "numberOfColours";
    }

    public String toCSV() {
        return super.toCSV() + "," + getType() + "," + getNumberOfColours();
    }

}
