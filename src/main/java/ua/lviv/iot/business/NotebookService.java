package ua.lviv.iot.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.dataaccess.NotebookRepository;
import ua.lviv.iot.labs.models.Notebook;

@Service
public class NotebookService {

    @Autowired
    private NotebookRepository notebookRepository;

    public Notebook createNotebook(Notebook notebook) {
        return notebookRepository.save(notebook);
    }

    public List<Notebook> findAll() {
        return notebookRepository.findAll();
    }

    public Notebook findNotebook(Integer notebookId) {
        return notebookRepository.findById(notebookId).get();
    }

    public HttpStatus deleteNotebook(Integer notebookId) {
        if (notebookRepository.existsById(notebookId)) {
            notebookRepository.deleteById(notebookId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Notebook> updateNotebook(Notebook notebook, Integer notebookId) {
        if (notebookRepository.existsById(notebookId)) {
            notebook.setId(notebookId);
            Notebook changedNotebook = notebookRepository.save(notebook);
            return new ResponseEntity<Notebook>(changedNotebook, HttpStatus.OK);
        } else {
            return new ResponseEntity<Notebook>(HttpStatus.NOT_FOUND);
        }
    }
}
