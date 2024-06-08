package id.co.InTernak.service;

import id.co.InTernak.model.User;
import id.co.InTernak.response.DtoResponse;

public interface UserService {
    DtoResponse getAllUsers();

    DtoResponse getUserActive();

    DtoResponse saveUser(User user);

    DtoResponse updateUser(User user);

    DtoResponse deleteUser(User user);
    DtoResponse getUserById(Integer userId);


}

