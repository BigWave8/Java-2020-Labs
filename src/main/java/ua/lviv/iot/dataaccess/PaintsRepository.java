package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.labs.models.Paints;

@Repository
public interface PaintsRepository extends JpaRepository<Paints, Integer> {

}
