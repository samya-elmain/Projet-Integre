package ma.ac.emi.ginfo.restfull.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate dateDebut;
    LocalDate dateFin;
    double montant;

    @ManyToOne
    @JoinColumn(name = "bike_id")
    Bike bike;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;
    boolean rendue;

    public Location() {
    }

    public Location(LocalDate dateDebut, LocalDate dateFin, Bike bike, Client client) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montant = 0;
        this.bike = bike;
        this.client = client;
        this.rendue = false;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getMontant() {
        return montant;
    }

    public void calculerMontant(){
        long a =dateDebut.toEpochDay();
        long b =dateFin.toEpochDay();
        long l = b-a;
        this.montant = this.bike.getPrice()*l;
    }
}
