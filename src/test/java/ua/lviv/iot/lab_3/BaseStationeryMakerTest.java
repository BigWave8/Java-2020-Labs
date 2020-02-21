package ua.lviv.iot.lab_3;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.lab_3.models.AbstractStationery;
import ua.lviv.iot.lab_3.models.BodyColor;
import ua.lviv.iot.lab_3.models.BodyShape;
import ua.lviv.iot.lab_3.models.Pen;
import ua.lviv.iot.lab_3.models.Type;

class BaseStationeryMakerTest {
	protected List<AbstractStationery> stationeries;

	@BeforeEach
	public void createToyCars() {
		stationeries = new LinkedList<AbstractStationery>();
		stationeries.add(new Pen(20, "Gelsone", "2384492", 18, "blue", BodyShape.HEXAGON, new BodyColor(1, "Red"),
				"Plastik", 2, false, 6, Type.GEL));
		stationeries.add(new Pen(7, "RADIUS", "2384492", 7, "red", BodyShape.RECTANGLE, new BodyColor(1, "Blue"),
				"	Metal", 2, true, 12, Type.GEL));
		stationeries.add(new Pen(14, "RADIUS", "2384492", 9, "black", BodyShape.TRIANGLE, new BodyColor(1, "White"),
				"Plastik", 2, false, 8, Type.GEL));
		stationeries.add(new Pen(10, "Sigma", "2384492", 15, "violet", BodyShape.FIGURED, new BodyColor(1, "Red"),
				"Plastik", 2, false, 7, Type.GEL));
	}
}
