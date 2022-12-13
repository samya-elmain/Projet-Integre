package ma.ac.emi.ginfo.restfull;

import ma.ac.emi.ginfo.restfull.entities.Bike;
import ma.ac.emi.ginfo.restfull.entities.Owner;
import ma.ac.emi.ginfo.restfull.entities.PointRencontre;
import ma.ac.emi.ginfo.restfull.repositories.BikeRepository;
import ma.ac.emi.ginfo.restfull.repositories.OwnerRepository;
import ma.ac.emi.ginfo.restfull.services.AddBikeLocation;
import ma.ac.emi.ginfo.restfull.services.ShowBikes;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class RestFullApplication {

    BikeRepository br;
    OwnerRepository or;
    ShowBikes showBikes;
    AddBikeLocation addBike;

    public RestFullApplication(BikeRepository br, OwnerRepository or, ShowBikes showBikes, AddBikeLocation addBike) {
        this.br = br;
        this.or = or;
        this.showBikes = showBikes;
        this.addBike = addBike;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("hhhhhhhhhhhhhhhhhh");
            Owner owner1 = new Owner("samya","el main","samya01","samya01@gmail.com","123456");
            Bike bike = new Bike("bike","category","brand","model","description","pictures", PointRencontre.AGDAL,20L,owner1);
            Bike bike2 = new Bike("bike2","category","brand","model","description","pictures",PointRencontre.IRFANE,20L,owner1);
            or.save(owner1);
            addBike.addBike(bike);
            addBike.addBike(bike2);
            System.out.println("****************************");
            System.out.println(showBikes.showAllBikes());
            System.out.println("****************************");
            System.out.println("****************************");
            System.out.println(or.findAll());

        };
    }

}
