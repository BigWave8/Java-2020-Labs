package ua.lviv.iot.labs.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.labs.models.AbstractStationery;

public class StationeryWriter {
    private Writer textWriter;

    public void setTextWriter(Writer textWriter) {
        this.textWriter = textWriter;
    }

    public void writeToFile(List<AbstractStationery> stationeries) {
        try {
            textWriter.write(stationeries.get(0).getHeaders());
            textWriter.write("\r\n");
            for (AbstractStationery stationery : stationeries) {
                textWriter.write(stationery.toCSV());
                textWriter.write("\r\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                textWriter.flush();
                textWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String toString() {
        return textWriter.toString();
    }

}
