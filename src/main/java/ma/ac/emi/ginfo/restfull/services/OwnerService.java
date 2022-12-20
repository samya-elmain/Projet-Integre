package ma.ac.emi.ginfo.restfull.services;
import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.entities.Owner;
import ma.ac.emi.ginfo.restfull.entities.PointRencontre;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OwnerService {
    @Autowired
    BikeRepository bikeRepository;
    @Autowired
    OwnerRepository ownerRepository;
    public Owner addOwner(Owner newOwner){
        return ownerRepository.save(newOwner);
    }
    public List<Owner> showAllOwners(){
        return ownerRepository.findAll();
    }

    //    public List<Bike> showBikesByOwner(Long id){
//        return bikeRepository.findByOwner(id);
//    }


}
