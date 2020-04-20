package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.StickerRepository;
import ua.lviv.iot.labs.models.Sticker;

@Service
public class StickerService extends StationeryService<Sticker> {

    @Autowired
    private StickerRepository stickerRepository;

    @Override
    protected JpaRepository<Sticker, Integer> jpaRepository() {
        return stickerRepository;
    }
}