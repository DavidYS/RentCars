package Entity;

import DTO.RentDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Rent {

    @Id
    @GeneratedValue
    private long Id;

    private int price;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Car car;

    @ManyToOne
    private Location location;

    @ManyToOne
    private User user;

    public RentDTO toDTO() {
        RentDTO rentDTO = new RentDTO();
        rentDTO.setEndDate(this.endDate);
        rentDTO.setStartDate(this.startDate);
        rentDTO.setPrice(this.price);
        return rentDTO;
    }

    public void update(RentDTO rentDTO) {
        this.price = getPrice();
        this.startDate = getStartDate();
        this.endDate = getEndDate();
    }

    public long getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
