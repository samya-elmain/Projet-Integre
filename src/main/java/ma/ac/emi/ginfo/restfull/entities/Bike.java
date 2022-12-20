package ma.ac.emi.ginfo.restfull.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String category;
    String brand;
    String model;
    String description;
    String pictures;
    @Enumerated(EnumType.STRING)
    PointRencontre localisation;
    double price;
    int stars;
    boolean favourite;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    @JsonIgnore
    Owner owner;
    public Bike() {
    }

    public Bike(String name, String category, String brand, String model, String description, String pictures, PointRencontre localisation, double price) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.pictures = pictures;
        this.localisation = localisation;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public PointRencontre getLocalisation() {
        return localisation;
    }

    public void setLocalisation(PointRencontre localisation) {
        this.localisation = localisation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }



}
