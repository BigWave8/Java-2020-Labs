package ua.lviv.iot.business;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StationeryService<Service> {

    protected abstract JpaRepository<Service, Integer> jpaRepository();

    public Service createStationery(Service stationery) {
        return jpaRepository().save(stationery);
    }

    public Service getStationery(Integer stationeryId) {
        return jpaRepository().findById(stationeryId).orElse(null);
    }

    public List<Service> getAllStationeries() {
        return jpaRepository().findAll();
    }

    public boolean deleteStationery(Integer stationeryId) {
        if (jpaRepository().existsById(stationeryId)) {
            jpaRepository().deleteById(stationeryId);
            return true;
        }
        return false;
    }

    public Service updateStationery(Integer stationeryId, Service stationery) {
        if (jpaRepository().existsById(stationeryId)) {
            jpaRepository().save(stationery);
            return stationery;
        }
        return null;
    }
}
