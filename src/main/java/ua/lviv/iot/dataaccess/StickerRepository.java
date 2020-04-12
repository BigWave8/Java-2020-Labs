package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.labs.models.Sticker;

@Repository
public interface StickerRepository extends JpaRepository<Sticker, Integer> {

}
