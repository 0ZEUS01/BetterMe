package Controller;

import Model.Users;
import Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository UsersRepo;

    @GetMapping("/GetAllUsers")
    public ResponseEntity<?> getAllUsers() {
        List<Users> u = UsersRepo.findAll();
        if (u.size()>0){
            return new ResponseEntity<List<Users>>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No User available", HttpStatus.NOT_FOUND);
        }
    }
}
