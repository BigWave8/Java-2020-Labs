package ua.lviv.iot.lab_3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab_3.manager.StationeryMaker;
import ua.lviv.iot.lab_3.models.AbstractStationery;

class StationeryMakerTest extends BaseStationeryMakerTest {

	private StationeryMaker stationeryMaker;

	@BeforeEach
	void setUp() throws Exception {
		stationeryMaker = new StationeryMaker();
		stationeryMaker.addStationeries(stationeries);
	}

	@Test
	public void findStationeryForFirstGraderTest() {
		List<AbstractStationery> result = stationeryMaker.findStationeryForFirstGrader(7);
		assertEquals(1, result.size());
	}

	@Test
	public void findStationeryForHighShoolTest() {
		List<AbstractStationery> result = stationeryMaker.findStationeryForHighSchool(9);
		assertEquals(1, result.size());
	}

	@Test
	public void findStationeryForStudentTest() {
		List<AbstractStationery> result = stationeryMaker.findStationeryForStudent(18);
		assertEquals(1, result.size());
	}

}
