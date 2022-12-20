package ma.ac.emi.ginfo.restfull.repositories;

import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface BikeRepository extends JpaRepository<Bike, Long> {
//    List<Bike> findByLocalisation(String localisation);
//    @Query(value = "SELECT * FROM bike where OWNER_ID = :id", nativeQuery = true)
//    List<Bike> findByOwner(@Param("id") Long id);
}