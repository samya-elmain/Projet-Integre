//package ma.ac.emi.ginfo.restfull.controllors;
//
//import ma.ac.emi.ginfo.restfull.entities.Bike;
//import ma.ac.emi.ginfo.restfull.entities.Owner;
//import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
//import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Collection;
//@RestController
//public class OwnerController {
//    @Autowired
//    OwnerRepository ownerRepository;
//    @Autowired
//    HttpServletRequest request;
//    @PostMapping("/addOwner")
//    public Owner save(@RequestBody Owner newOwner){
//        return ownerRepository.save(newOwner);
//    }
//    @GetMapping("/owners")
//    Collection<Owner> showAllBikes() {
//        return ownerRepository.findAll();
//    }
//}
