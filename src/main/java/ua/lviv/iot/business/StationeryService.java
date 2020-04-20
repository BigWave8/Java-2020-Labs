package ua.lviv.iot.business;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StationeryService<T> {

    protected abstract JpaRepository<T, Integer> jpaRepository();

    public T createStationery(T stationery) {
        return jpaRepository().save(stationery);
    }

    public T getStationery(Integer stationeryId) {
        return jpaRepository().findById(stationeryId).orElse(null);
    }

    public List<T> getAllStationeries() {
        return jpaRepository().findAll();
    }

    public boolean deleteStationery(Integer stationeryId) {
        if (jpaRepository().existsById(stationeryId)) {
            jpaRepository().deleteById(stationeryId);
            return true;
        }
        return false;
    }

    public T updateStationery(Integer stationeryId, T stationery) {
        if (jpaRepository().existsById(stationeryId)) {
            T oldStationery = jpaRepository().findById(stationeryId).get();
            jpaRepository().save(stationery);
            return oldStationery;
        }
        return null;
    }
}