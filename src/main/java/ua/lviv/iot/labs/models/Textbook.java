package ua.lviv.iot.labs.models;

public class Textbook extends AbstractPaperProducts {
    private String edition;
    private int circulation;
    private String subject;

    public Textbook(double priceInHryvnia, String producer, String barCode, int targetAge,
            Format format, int article, int densityInGramsPerSguareMeter, String edition,
            int circulation, String subject) {
        super(priceInHryvnia, producer, barCode, targetAge, format, article,
                densityInGramsPerSguareMeter);
        this.edition = edition;
        this.circulation = circulation;
        this.subject = subject;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "edition" + "," + "circulation" + "," + "subject";
    }

    public String toCSV() {
        return super.toCSV() + "," + getEdition() + "," + getCirculation() + "," + getSubject();
    }

}
