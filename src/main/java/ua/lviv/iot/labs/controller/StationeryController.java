package ua.lviv.iot.labs.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.labs.models.AbstractStationery;
import ua.lviv.iot.labs.models.Notebook;

@RequestMapping("/stationeries")
@RestController
public class StationeryController {

    private Map<Integer, AbstractStationery> stationeries = new HashMap<Integer, AbstractStationery>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<AbstractStationery> getStationeries() {
        return new LinkedList<AbstractStationery>(stationeries.values());
    }

    @GetMapping(path = "/{id}")
    public AbstractStationery getStationery(@PathVariable("id") Integer stationeriesId) {
        System.out.println(stationeriesId);
        return stationeries.get(stationeriesId);
    }

    @PostMapping
    public AbstractStationery createStationery(@RequestBody Notebook stationery) {
        stationery.setId(idCounter.incrementAndGet());
        stationeries.put(stationery.getId(), stationery);
        return stationery;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<AbstractStationery> deleteStationery(@PathVariable("id") Integer stationeriesId) {
        HttpStatus status = stationeries.remove(stationeriesId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<AbstractStationery> updateStationery(@PathVariable("id") Integer stationeriesId,
            @RequestBody Notebook stationery) {
        stationery.setId(stationeriesId);
        HttpStatus status = stationeries.replace(stationeriesId, stationery) == null ? HttpStatus.NOT_FOUND
                : HttpStatus.CREATED;
        return ResponseEntity.status(status).build();

    }
}