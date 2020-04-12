package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.StickerRepository;
import ua.lviv.iot.labs.models.Sticker;

@Service
public class StickerService {

    @Autowired
    private StickerRepository stickerRepository;

    public Sticker createSticker(Sticker sticker) {
        return stickerRepository.save(sticker);
    }

    public List<Sticker> findAll() {
        return stickerRepository.findAll();
    }

    public Sticker findSticker(Integer stickerId) {
        return stickerRepository.findById(stickerId).get();
    }

    public HttpStatus deleteSticker(Integer stickerId) {
        if (stickerRepository.existsById(stickerId)) {
            stickerRepository.deleteById(stickerId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Sticker> updateSticker(Sticker sticker, Integer stickerId) {
        if (stickerRepository.existsById(stickerId)) {
            sticker.setId(stickerId);
            Sticker changedSticker = stickerRepository.save(sticker);
            return new ResponseEntity<Sticker>(changedSticker, HttpStatus.OK);
        } else {
            return new ResponseEntity<Sticker>(HttpStatus.NOT_FOUND);
        }
    }
}
