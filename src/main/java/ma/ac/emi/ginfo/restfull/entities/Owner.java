package ma.ac.emi.ginfo.restfull.entities;

import javax.persistence.*;
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
    @OneToMany(fetch = FetchType.LAZY)
    Collection<Bike> bikes;

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

    public Collection<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(Collection<Bike> bikes) {
        this.bikes = bikes;
    }

}
