package Entity;

import DTO.RoleDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private long Id;

    private String role;

    @OneToMany
    private List<Role> roles = new ArrayList<>();


    public RoleDTO toDTO(){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setRole(this.role);
        return roleDTO;
    }

    public void update(RoleDTO roleDTO){
        this.role = getRole();
    }

    public long getId() {
        return Id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
