package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.BrushRepository;
import ua.lviv.iot.labs.models.Brush;

@Service
public class BrushService extends StationeryService<Brush> {

    @Autowired
    private BrushRepository brushRepository;

    @Override
    protected JpaRepository<Brush, Integer> jpaRepository() {
        return brushRepository;
    }
}
