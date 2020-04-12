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
public class Brush extends AbstractWritingInstruments {

    private String nap;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Paints_Brashes", joinColumns = {
            @JoinColumn(name = "brush_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "paints_id", nullable = false) })
    @JsonIgnoreProperties("brushes")
    private Set<Paints> paints;

    public Brush() {
        super(0.0, null, null, 0, null, null, new BodyColor(0, null), null, 0, false);
        this.nap = null;
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Set<Paints> getPaints() {
        return paints;
    }

    public void setPaints(Set<Paints> paints) {
        this.paints = paints;
    }

}
