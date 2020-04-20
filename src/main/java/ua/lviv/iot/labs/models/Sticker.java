package ua.lviv.iot.labs.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sticker extends AbstractPaperProducts {

    private String colorOfSticker;

    private boolean hasGlue;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "notebook_id")
    @JsonIgnoreProperties("stickers")
    private Notebook notebook;

    public Sticker() {
        super(0, null, null, 0, null, 0, 0);
    }

    public String getColorOfSticker() {
        return colorOfSticker;
    }

    public void setColorOfSticker(String colorOfSticker) {
        this.colorOfSticker = colorOfSticker;
    }

    public boolean isHasGlue() {
        return hasGlue;
    }

    public void setHasGlue(boolean hasGlue) {
        this.hasGlue = hasGlue;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
