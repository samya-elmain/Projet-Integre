package ma.ac.emi.ginfo.restfull.repositories;


import ma.ac.emi.ginfo.restfull.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
