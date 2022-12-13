package ma.ac.emi.ginfo.restfull.entities;

import javax.persistence.*;
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
    PointRencontre localisation;
    Long price;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    Owner owner;
    int stars;
    boolean favourite;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Bike() {
    }

    public Bike(String name, String category, String brand, String model, String description, String pictures, PointRencontre localisation, Long price, Owner owner) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.pictures = pictures;
        this.localisation = localisation;
        this.price = price;
        this.owner = owner;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
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


}
