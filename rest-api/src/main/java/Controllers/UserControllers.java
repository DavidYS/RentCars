package Controllers;

import DTO.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/user")
public interface UserControllers {

    @GetMapping("/readAll")
    List<UserDTO> readAllUsers();


}
