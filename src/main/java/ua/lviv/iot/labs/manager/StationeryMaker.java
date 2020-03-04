package ua.lviv.iot.labs.manager;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.labs.models.AbstractStationery;

public class StationeryMaker {
    private List<AbstractStationery> stationeries = new LinkedList<>();

    public void addStationeries(List<AbstractStationery> stationeries) {
        this.stationeries.addAll(stationeries);

    }

    public void addStationery(AbstractStationery stationery) {
        this.stationeries.add(stationery);

    }

    public List<AbstractStationery> findStationeryForFirstGrader(int targetAge) {
        List<AbstractStationery> result = new LinkedList<AbstractStationery>();
        for (AbstractStationery stationery : stationeries) {
            if (stationery.getTargetAge() == targetAge) {
                result.add(stationery);
            }
        }
        return result;
    }

    public List<AbstractStationery> findStationeryForHighSchool(int targetAge) {
        return this.stationeries.stream()
                .filter(stationery -> stationery.getTargetAge() == targetAge)
                .collect(Collectors.toList());
    }

    public List<AbstractStationery> findStationeryForStudent(int targetAge) {
        return this.stationeries.stream()
                .filter(stationery -> stationery.getTargetAge() == targetAge)
                .collect(Collectors.toList());
    }
}
