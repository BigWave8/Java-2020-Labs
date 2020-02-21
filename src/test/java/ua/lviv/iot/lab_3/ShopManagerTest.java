package ua.lviv.iot.lab_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab_3.manager.ShopManager;
import ua.lviv.iot.lab_3.models.SortType;

class ShopManagerTest extends BaseStationeryMakerTest {

	@Test
	public void testSortGoodsByPrice() {
		ShopManager.sortPensByPriceInHryvnia(stationeries, SortType.ASCENDING);
		assertEquals(7, stationeries.get(0).getPriceInHryvnia());
		assertEquals(10, stationeries.get(1).getPriceInHryvnia());
		assertEquals(14, stationeries.get(2).getPriceInHryvnia());
		assertEquals(20, stationeries.get(3).getPriceInHryvnia());
	}

	@Test
	public void testSortGoodsBySize() {
		ShopManager.sortPensByTargetAge(stationeries, SortType.ASCENDING);
		assertEquals(7, stationeries.get(0).getTargetAge());
		assertEquals(10, stationeries.get(1).getTargetAge());
		assertEquals(15, stationeries.get(2).getTargetAge());
		assertEquals(18, stationeries.get(3).getTargetAge());
	}

}
