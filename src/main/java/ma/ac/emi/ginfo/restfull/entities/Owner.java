package ma.ac.emi.ginfo.restfull.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstame;
    String secondname;
    String username;
    String email;
    String password;
    @OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
    List<Bike> bikes = new ArrayList<>();

    public Owner() {
    }

    public Owner(String firstame, String secondname, String username, String email, String password) {
        this.firstame = firstame;
        this.secondname = secondname;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstame() {
        return firstame;
    }

    public void setFirstame(String firstame) {
        this.firstame = firstame;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }
    public boolean add(Bike bike) {
        bike.setOwner(this);
        return bikes.add(bike);
    }

    public boolean remove(Object o) {
        return bikes.remove(o);
    }

}
