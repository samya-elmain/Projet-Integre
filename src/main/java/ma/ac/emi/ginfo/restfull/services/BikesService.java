package ma.ac.emi.ginfo.restfull.services;

import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.entities.Location;
import ma.ac.emi.ginfo.restfull.entities.Owner;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import ma.ac.emi.ginfo.restfull.repositories.LocationRepository;
import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikesService {
    @Autowired
    BikeRepository bikeRepository;
    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    LocationRepository locationRepository;
    public Bike addBike(Bike newBike){
        return bikeRepository.save(newBike);
    }
    public List<Bike> showAllBikes(){
        return bikeRepository.findAll();
    }
    public Location addLocation(Location loc){
        return locationRepository.save(loc);
    }


//    public void louerBike(Bike newBike, Client client){
//        client.getBikes().add(newBike);
//    }

}
