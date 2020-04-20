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
import ua.lviv.iot.business.NotebookService;
import ua.lviv.iot.labs.models.Notebook;

@RequestMapping("/notebook")
@RestController
public class NotebookController {

    @Autowired
    private NotebookService notebookService;

    @GetMapping
    public List<Notebook> getNotebooks() {
        return notebookService.getAllStationeries();
    }

    @GetMapping(path = "/{id}")
    public Notebook getNotebook(final @PathVariable("id") Integer notebookId) {
        return notebookService.getStationery(notebookId);
    }

    @PostMapping
    public Notebook createNotebook(final @RequestBody Notebook notebook) {
        return notebookService.createStationery(notebook);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Notebook> deleteNotebook(final @PathVariable("id") Integer notebookId) {
        HttpStatus status = notebookService.deleteStationery(notebookId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Notebook>(status);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Notebook> updateNotebook(final @PathVariable("id") Integer notebookId,
            @RequestBody Notebook notebook) {
        notebook.setId(notebookId);
        HttpStatus status = notebookService.updateStationery(notebookId, notebook) != null ? HttpStatus.OK
                : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Notebook>(notebook, status);
    }