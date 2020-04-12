package ua.lviv.iot.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs.models.AbstractStationery;
import ua.lviv.iot.labs.writer.StationeryWriter;

public class StationaryWriterTest extends BaseStationeryMakerTest {
    StationeryWriter stationeryWriter = new StationeryWriter();

    @Test
    void WriteToFileTest() throws IOException {
        stationeryWriter.setTextWriter(new FileWriter("text.csv"));
        stationeryWriter.writeToFile(stationeries);
    }

    @Test
    void StringWriterTest() throws IOException {
        String expectedResult = "";

        stationeryWriter.setTextWriter(new StringWriter());
        stationeryWriter.writeToFile(stationeries);

        expectedResult += stationeries.get(0).getHeaders() + "\r\n";
        for (AbstractStationery stationery : stationeries) {
            expectedResult += stationery.toCSV() + "\r\n";
        }
        assertEquals(expectedResult, stationeryWriter.toString());
    }
}