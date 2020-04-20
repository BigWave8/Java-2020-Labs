package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.labs.models.Notebook;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer> {

}
