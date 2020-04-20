package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.NotebookRepository;
import ua.lviv.iot.labs.models.Notebook;

@Service
public class NotebookService extends StationeryService<Notebook> {

    @Autowired
    private NotebookRepository notebookRepository;

    @Override
    protected JpaRepository<Notebook, Integer> jpaRepository() {
        return notebookRepository;
    }
}
