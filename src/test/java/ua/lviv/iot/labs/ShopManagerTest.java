package ua.lviv.iot.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.labs.manager.ShopManager;
import ua.lviv.iot.labs.models.SortType;

class ShopManagerTest extends BaseStationeryMakerTest {

    @Test
    public void testSortByPrice() {
        ShopManager.sortByPrice(stationeries, SortType.ASCENDING);
        assertEquals(7, stationeries.get(0).getPriceInHryvnia());
        assertEquals(10, stationeries.get(1).getPriceInHryvnia());
        assertEquals(14, stationeries.get(2).getPriceInHryvnia());
        assertEquals(20, stationeries.get(3).getPriceInHryvnia());
    }

    @Test
    public void testSortByProducer() {
        ShopManager.sortByProducer(stationeries, SortType.ASCENDING);
        assertEquals("Gelsone", stationeries.get(0).getProducer());
        assertEquals("RADIUS", stationeries.get(1).getProducer());
        assertEquals("RADIUS", stationeries.get(2).getProducer());
        assertEquals("Sigma", stationeries.get(3).getProducer());
    }

    @Test
    public void testSortByBarCode() {
        ShopManager.sortByBarCode(stationeries, SortType.ASCENDING);
        assertEquals("2384491", stationeries.get(0).getBarCode());
        assertEquals("2384492", stationeries.get(1).getBarCode());
        assertEquals("2384493", stationeries.get(2).getBarCode());
        assertEquals("2384494", stationeries.get(3).getBarCode());
    }

    @Test
    public void testSortByTargetAge() {
        ShopManager.sortByTargetAge(stationeries, SortType.ASCENDING);
        assertEquals(7, stationeries.get(0).getTargetAge());
        assertEquals(9, stationeries.get(1).getTargetAge());
        assertEquals(15, stationeries.get(2).getTargetAge());
        assertEquals(18, stationeries.get(3).getTargetAge());
    }

}
