//package ma.ac.emi.ginfo.restfull.controllors;
//
//import ma.ac.emi.ginfo.restfull.entities.Bike;
//import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
//import ma.ac.emi.ginfo.restfull.services.ShowBikes;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Collection;
//import java.util.List;
//
//@RestController
//public class BikeController {
//    @Autowired
//    BikeRepository bikeRepository;
//    @Autowired
//    HttpServletRequest request;
//    @Autowired
//    ShowBikes showBikes;
//
//    @PostMapping("/add")
//    public Bike save(@RequestBody Bike newBike){
//        return bikeRepository.save(newBike);
//    }
//    @GetMapping("/bikes")
//    List<Bike> showAllBikes() {
//        return showBikes.showAllBikes();
//    }
//    @GetMapping("/owner/{id}/bikes")
//    List<Bike> showBikesByOwner(@PathVariable(name="id") Long id) {
//        return showBikes.showBikesByOwner(id);
//    }
//
//
//
//}
