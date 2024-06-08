package id.co.InTernak.rest;

import id.co.InTernak.model.User;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.UserService;
import id.co.InTernak.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/users"})
public class UserRest {
    @Autowired
    private UserService userService;

    public UserRest(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/getUsers"})
    public DtoResponse getUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/getUserById/{userId}")
    public DtoResponse getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping({"/getUserActive"})
    public DtoResponse getUserActive() {
        return this.userService.getUserActive();
    }

    @PostMapping({"/saveUser"})
    public DtoResponse createUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    @PostMapping({"/updateUser"})
    public DtoResponse updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @PostMapping({"/deleteUser"})
    public DtoResponse deleteUser(@RequestBody User user) {
        return this.userService.deleteUser(user);
    }
}