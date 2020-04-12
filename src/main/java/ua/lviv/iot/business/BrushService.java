package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.BrushRepository;
import ua.lviv.iot.labs.models.Brush;

@Service
public class BrushService {

    @Autowired
    private BrushRepository brushRepository;

    public Brush createBrush(Brush brush) {
        return brushRepository.save(brush);
    }

    public List<Brush> findAll() {
        return brushRepository.findAll();
    }

    public Brush findBrush(Integer brushId) {
        return brushRepository.findById(brushId).get();
    }

    public HttpStatus deleteBrush(Integer brushId) {
        if (brushRepository.existsById(brushId)) {
            brushRepository.deleteById(brushId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Brush> updateBrush(Brush brush, Integer brushId) {
        if (brushRepository.existsById(brushId)) {
            brush.setId(brushId);
            Brush changedBrush = brushRepository.save(brush);
            return new ResponseEntity<Brush>(changedBrush, HttpStatus.OK);
        } else {
            return new ResponseEntity<Brush>(HttpStatus.NOT_FOUND);
        }
    }
}
