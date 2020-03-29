package ua.lviv.iot.labs;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.labs.models.AbstractStationery;
import ua.lviv.iot.labs.models.BodyColor;
import ua.lviv.iot.labs.models.BodyShape;
import ua.lviv.iot.labs.models.Pen;
import ua.lviv.iot.labs.models.TypeOfPen;

class BaseStationeryMakerTest {
    protected List<AbstractStationery> stationeries;

    @BeforeEach
    public void createToyCars() {
        stationeries = new LinkedList<AbstractStationery>();
        stationeries.add(new Pen(20, "Gelsone", "2384493", 18, "blue", BodyShape.HEXAGON, new BodyColor(1, "Red"),
                "Plastik", 2, false, 6, TypeOfPen.GEL));
        stationeries.add(new Pen(7, "RADIUS", "2384491", 7, "red", BodyShape.RECTANGLE, new BodyColor(1, "Blue"),
                "	Metal", 2, true, 12, TypeOfPen.GEL));
        stationeries.add(new Pen(14, "RADIUS", "2384492", 9, "black", BodyShape.TRIANGLE, new BodyColor(1, "White"),
                "Plastik", 2, false, 8, TypeOfPen.GEL));
        stationeries.add(new Pen(10, "Sigma", "2384494", 15, "violet", BodyShape.FIGURED, new BodyColor(1, "Red"),
                "Plastik", 2, false, 7, TypeOfPen.GEL));
    }
}
