package ua.lviv.iot.labs.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Notebook extends AbstractPaperProducts {

    private boolean oneColorOnCover;

    private Ruling ruling;

    @OneToMany(mappedBy = "notebook", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("notebook")
    private Set<Sticker> stickers;

    public Notebook(double priceInHryvnia, String producer, String barCode, int targetAge, Format format, int article,
            int densityInGramsPerSguareMeter, boolean oneColorOnCover, Ruling ruling) {
        super(priceInHryvnia, producer, barCode, targetAge, format, article, densityInGramsPerSguareMeter);
        this.oneColorOnCover = oneColorOnCover;
        this.ruling = ruling;
    }

    public Notebook() {
        super(0, null, null, 0, null, 0, 0);
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

    public Set<Sticker> getStickers() {
        return stickers;
    }

    public void setStickers(Set<Sticker> stickers) {
        this.stickers = stickers;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "oneColorOnCover" + "," + "ruling";
    }

    public String toCSV() {
        return super.toCSV() + "," + isOneColorOnCover() + "," + getRuling();
    }

}
