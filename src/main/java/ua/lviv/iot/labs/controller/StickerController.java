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
import ua.lviv.iot.business.StickerService;
import ua.lviv.iot.labs.models.Sticker;

@RequestMapping("/sticker")
@RestController
public class StickerController {

    @Autowired
    private StickerService stickerService;

    @GetMapping
    public List<Sticker> getSticker() {
        return stickerService.getAllStationeries();
    }

    @GetMapping(path = "/{id}")
    public Sticker getSticker(@PathVariable("id") Integer stickerId) {
        return stickerService.getStationery(stickerId);
    }

    @PostMapping
    public Sticker createSticker(@RequestBody Sticker sticker) {
        return stickerService.createStationery(sticker);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Sticker> deleteSticker(@PathVariable("id") Integer stickerId) {
        HttpStatus status = stickerService.deleteStationery(stickerId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Sticker>(status);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Sticker> updateSticker(@PathVariable("id") Integer stickerId, @RequestBody Sticker sticker) {
        sticker.setId(stickerId);
        HttpStatus status = stickerService.updateStationery(stickerId, sticker) != null ? HttpStatus.OK
                : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Sticker>(sticker, status);
    }
}
