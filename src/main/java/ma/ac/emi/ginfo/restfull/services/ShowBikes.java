package ma.ac.emi.ginfo.restfull.services;
import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.entities.PointRencontre;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShowBikes {
    @Autowired
    BikeRepository bikeRepository;
    public Collection<Bike> showAllBikes(){
        return bikeRepository.findAll();
    }


}
