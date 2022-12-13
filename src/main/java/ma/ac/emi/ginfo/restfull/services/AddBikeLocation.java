package ma.ac.emi.ginfo.restfull.services;

import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class AddBikeLocation {
    BikeRepository bikeRepository;
    OwnerRepository ownerRepository;

    public AddBikeLocation(BikeRepository bikeRepository, OwnerRepository ownerRepository) {
        this.bikeRepository = bikeRepository;
        this.ownerRepository = ownerRepository;
    }

    public Bike addBike(Bike newBike){
         return bikeRepository.save(newBike);
    }

}
