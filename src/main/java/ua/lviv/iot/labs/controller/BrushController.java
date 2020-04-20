package ua.lviv.iot.labs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
import ua.lviv.iot.business.BrushService;
import ua.lviv.iot.labs.models.Brush;

@RequestMapping("/brush")
@RestController
public class BrushController {

    @Autowired
    private BrushService brushService;

    @GetMapping
    public List<Brush> getBrush() {
        return brushService.getAllStationeries();
    }

    @GetMapping(path = "/{id}")
    public Brush getBrush(@PathVariable("id") Integer brushId) {
        return brushService.getStationery(brushId);
    }

    @PostMapping
    public Brush createBrush(@RequestBody Brush brush) {
        return brushService.createStationery(brush);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Brush> deleteBrush(@PathVariable("id") Integer brushId) {
        HttpStatus status = brushService.deleteStationery(brushId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Brush>(status);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Brush> updateBrush(@PathVariable("id") Integer brushId, @RequestBody Brush brush) {
        HttpStatus status = brushService.updateStationery(brushId, brush) != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Brush>(status);
    }
}
