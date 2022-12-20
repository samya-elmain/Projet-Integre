package ma.ac.emi.ginfo.restfull;

import ma.ac.emi.ginfo.restfull.entities.*;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import ma.ac.emi.ginfo.restfull.repositories.ClientRepository;
import ma.ac.emi.ginfo.restfull.repositories.LocationRepository;
import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
import ma.ac.emi.ginfo.restfull.services.BikesService;
import ma.ac.emi.ginfo.restfull.services.ClientService;
import ma.ac.emi.ginfo.restfull.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class RestFullApplication {
    @Autowired
    BikesService bikesService;
    @Autowired
    OwnerService ownerService;
    @Autowired
    ClientService clientService;


    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("hhhhhhhhhhhhhhhhhh");
            Owner owner1 = new Owner("samya","el main","samya01","samya01@gmail.com","123456");
            Owner owner2 = new Owner("sabrine","el main","samya01","samya01@gmail.com","123456");
            Bike bike = new Bike("bike","category","brand","model","description","pictures", PointRencontre.AGDAL,20);
            Bike bike2 = new Bike("bike2","category","brand","model","description","pictures",PointRencontre.IRFANE,25);
            Bike bike3 = new Bike("bike3","category","brand","model","description","pictures",PointRencontre.IRFANE,30);

            owner1.add(bike);
            owner1.add(bike2);
            owner2.add(bike3);

            ownerService.addOwner(owner1);
            ownerService.addOwner(owner2);

            bikesService.addBike(bike);
            bikesService.addBike(bike2);
            bikesService.addBike(bike3);

            Client client = new Client("amina","bakkali","aminaa","amina01@gmail.com","123456");
            Location location1 = new Location(LocalDate.of(2022,12,1), LocalDate.of(2022,12,3), bike,client);
            clientService.addClient(client);
            bikesService.addLocation(location1);

            System.out.println("****************************");

            System.out.println(bikesService.showAllBikes());
            System.out.println(ownerService.showAllOwners());

            System.out.println("****************************");
            location1.calculerMontant();
            System.out.println(location1.getMontant());




        };
    }

}
