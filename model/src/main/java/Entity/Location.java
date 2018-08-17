package Entity;

import DTO.LocationDTO;
import DTO.LocationDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private long Id;

    private String country;
    private String state;
    private String city;
    private String street;
    private String zipCode;

    @OneToMany
    private List<Rent> rents = new ArrayList<>();

    public LocationDTO toDTO() {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setCountry(this.country);
        locationDTO.setState(this.state);
        locationDTO.setCity(this.city);
        locationDTO.setStreet(this.street);
        locationDTO.setZipCode(this.zipCode);
        return locationDTO;
    }

    public void update(LocationDTO locationDTO){
        this.street = getStreet();
        this.zipCode = getZipCode();
        this.state = getState();
        this.city = getCity();
        this.country = getCountry();
    }
    public long getId() {
        return Id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
