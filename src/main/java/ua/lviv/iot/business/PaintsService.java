package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.PaintsRepository;
import ua.lviv.iot.labs.models.Paints;

@Service
public class PaintsService extends StationeryService<Paints> {

    @Autowired
    private PaintsRepository paintsRepository;

    @Override
    protected JpaRepository<Paints, Integer> jpaRepository() {
        return paintsRepository;
    }

}
