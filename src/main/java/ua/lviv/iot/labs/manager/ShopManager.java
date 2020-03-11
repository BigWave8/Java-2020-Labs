package ua.lviv.iot.labs.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.labs.models.AbstractStationery;
import ua.lviv.iot.labs.models.SortType;

public class ShopManager {

    private static final SortByPrice SORT_BY_PRICE = new SortByPrice();

    private static final SortByBarCodeComparator SORT_BY_BARCOD_COMPARATOR = new ShopManager().new SortByBarCodeComparator();

    public static void sortByPrice(List<AbstractStationery> stationeries, SortType sortType) {

        stationeries
                .sort(sortType == SortType.ASCENDING ? SORT_BY_PRICE : SORT_BY_PRICE.reversed());
    }

    static class SortByPrice implements Comparator<AbstractStationery> {

        @Override
        public int compare(AbstractStationery firstStationery,
                AbstractStationery secondStationery) {
            return (int) (firstStationery.getPriceInHryvnia()
                    - secondStationery.getPriceInHryvnia());
        }

    }

    public static void sortByProducer(List<AbstractStationery> stationeries, SortType sortType) {
        Comparator<AbstractStationery> producerComparator = new Comparator<AbstractStationery>() {

            @Override
            public int compare(AbstractStationery firstStationery,
                    AbstractStationery secondStationery) {
                return firstStationery.getProducer().compareTo(secondStationery.getProducer());
            }
        };
        stationeries.sort(sortType == SortType.ASCENDING ? producerComparator
                : producerComparator.reversed());

    }

    public static void sortByBarCode(List<AbstractStationery> stationeries, SortType sortType) {
        stationeries.sort(sortType == SortType.ASCENDING ? SORT_BY_BARCOD_COMPARATOR
                : SORT_BY_BARCOD_COMPARATOR.reversed());
    }

    public class SortByBarCodeComparator implements Comparator<AbstractStationery> {

        @Override
        public int compare(AbstractStationery firstStationery,
                AbstractStationery secondStationery) {
            return firstStationery.getBarCode().compareTo(secondStationery.getBarCode());
        }

    }

    public static void sortByTargetAge(List<AbstractStationery> stationeries, SortType sortType) {
        Comparator<AbstractStationery> targetAgeComparator = (firstStationery,
                secondStationery) -> firstStationery.getTargetAge()
                        - secondStationery.getTargetAge();
        stationeries.sort(sortType == SortType.ASCENDING ? targetAgeComparator
                : targetAgeComparator.reversed());
    }

}
