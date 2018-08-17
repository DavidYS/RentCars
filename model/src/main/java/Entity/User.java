package Entity;

import DTO.UserDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long Id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private int age;

    @ManyToOne
    private String role;

    @OneToMany
    private List<Rent> rents = new ArrayList<>();

    public UserDTO toDTO(){
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(this.age);
        userDTO.setCity(this.city);
        userDTO.setCountry(this.country);
        userDTO.setFirstName(this.firstName);
        userDTO.setLastName(this.lastName);
        userDTO.setUsername(this.username);
        userDTO.setPassword(this.password);
        return userDTO;
    }

    public void update(UserDTO userDTO){
        this.age = getAge();
        this.username = getUsername();
        this.password = getPassword();
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.country = getCountry();
        this.city = getCity();
    }

    public long getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
