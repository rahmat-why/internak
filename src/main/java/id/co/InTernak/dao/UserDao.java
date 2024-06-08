package id.co.InTernak.dao;

import id.co.InTernak.model.User;
import id.co.InTernak.vo.UserVo;

import java.util.List;

public interface UserDao {

    List<UserVo> getAllUsers();

    List<UserVo> getUserActive();
    UserVo getUserById(Integer userId);

    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int usr_id);


}