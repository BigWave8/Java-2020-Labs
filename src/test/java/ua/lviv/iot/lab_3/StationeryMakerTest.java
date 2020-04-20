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
		assertEquals(7, result.get(0).getTargetAge());
	}

	@Test
	public void findStationeryForHighShoolTest() {
		List<AbstractStationery> result = stationeryMaker.findStationeryForHighSchool(15);
		assertEquals(1, result.size());
		assertEquals(15, result.get(1).getTargetAge());
	}

	@Test
	public void findStationeryForStudentTest() {
		List<AbstractStationery> result = stationeryMaker.findStationeryForStudent(18);
		assertEquals(1, result.size());
		assertEquals(18, result.get(2).getTargetAge());
	}

}
