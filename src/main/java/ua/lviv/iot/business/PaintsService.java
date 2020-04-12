package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.PaintsRepository;
import ua.lviv.iot.labs.models.Paints;

@Service
public class PaintsService {

    @Autowired
    private PaintsRepository paintsRepository;

    public Paints createPaints(Paints paints) {
        return paintsRepository.save(paints);
    }

    public List<Paints> findAll() {
        return paintsRepository.findAll();
    }

    public Paints findPaints(Integer paintsId) {
        return paintsRepository.findById(paintsId).get();
    }

    public HttpStatus deletePaints(Integer paintsId) {
        if (paintsRepository.existsById(paintsId)) {
            paintsRepository.deleteById(paintsId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Paints> updatePaints(Paints paints, Integer paintsId) {
        if (paintsRepository.existsById(paintsId)) {
            paints.setId(paintsId);
            Paints changedPaints = paintsRepository.save(paints);
            return new ResponseEntity<Paints>(changedPaints, HttpStatus.OK);
        } else {
            return new ResponseEntity<Paints>(HttpStatus.NOT_FOUND);
        }
    }

}
