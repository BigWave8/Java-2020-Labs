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
import ua.lviv.iot.business.PaintsService;
import ua.lviv.iot.labs.models.Paints;

@RequestMapping("/paints")
@RestController
public class PaintsController {

    @Autowired
    private PaintsService paintsService;

    @GetMapping
    public List<Paints> getPaints() {
        return paintsService.getAllStationeries();
    }

    @GetMapping(path = "/{id}")
    public Paints getPaints(@PathVariable("id") Integer paintId) {
        return paintsService.getStationery(paintId);
    }

    @PostMapping
    public Paints createPaints(@RequestBody Paints paint) {
        return paintsService.createStationery(paint);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Paints> deletePaints(@PathVariable("id") Integer paintId) {
        HttpStatus status = paintsService.deleteStationery(paintId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Paints>(status);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Paints> updatePaints(@PathVariable("id") Integer paintId, @RequestBody Paints paint) {
        paint.setId(paintId);
        HttpStatus status = paintsService.updateStationery(paintId, paint) != null ? HttpStatus.OK
                : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Paints>(paint, status);
    }

}
