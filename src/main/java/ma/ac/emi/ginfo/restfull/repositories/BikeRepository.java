package ma.ac.emi.ginfo.restfull.repositories;

import ma.ac.emi.ginfo.restfull.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    Collection<Bike> findByLocalisation(String localisation);
}