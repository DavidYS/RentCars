package Entity;

import DTO.CarDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private long Id;

    private String fuel;
    private String transmission;
    private String brand;
    private String licensePlate;
    private boolean availability;

    @OneToMany
    private List<Rent> rents = new ArrayList<>();

    public CarDTO toDTO() {
        CarDTO carDTO = new CarDTO();
        carDTO.setAvailability(this.availability);
        carDTO.setBrand(this.brand);
        carDTO.setFuel(this.fuel);
        carDTO.setLicensePlate(this.licensePlate);
        carDTO.setTransmission(this.transmission);
        return carDTO;
    }

    public void update(CarDTO carDTO){
        this.licensePlate = getLicensePlate();
        this.transmission = getTransmission();
        this.brand = getBrand();
        this.fuel = getFuel();
        this.availability = isAvailability();
    }

    public long getId() {
        return Id;
    }


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
