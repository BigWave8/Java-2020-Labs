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

@RequestMapping("/stationeries")
@RestController
public class StationeryController {

    @Autowired
    private NotebookService notebookService;

    @GetMapping
    public List<Notebook> getStationeries() {
        return notebookService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Notebook getNotebook(@PathVariable("id") Integer notebookId) {
        return notebookService.findNotebook(notebookId);
    }

    @PostMapping
    public Notebook createNotebook(@RequestBody Notebook notebook) {
        return notebookService.createNotebook(notebook);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Notebook> deleteNotebook(@PathVariable("id") Integer notebookId) {
        HttpStatus status = notebookService.deleteNotebook(notebookId);
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Notebook> updateNotebook(@PathVariable("id") Integer notebookId,
            @RequestBody Notebook stationery) {
        return notebookService.updateNotebook(stationery, notebookId);
    }
}