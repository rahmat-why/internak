package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.UserDao;
import id.co.InTernak.model.User;
import id.co.InTernak.repository.CityRepository;
import id.co.InTernak.repository.ProvinceRepository;
import id.co.InTernak.repository.UserRepository;
import id.co.InTernak.vo.UserVo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private ProvinceRepository provinceRepository;

    public UserDaoImpl() {
    }


    @Autowired
    private EntityManager entityManager;





    public List<UserVo> getAllUsers() {
        Iterable<User> users = this.userRepository.findAll();
        List<UserVo> userVos = new ArrayList();
        Iterator var3 = users.iterator();

        while(var3.hasNext()) {
            User item = (User)var3.next();
            UserVo userVo = new UserVo(item);
            userVos.add(userVo);
        }

        return userVos;
    }


    public List<UserVo> getUserActive() {
        Iterable<User> users = this.userRepository.findByStatus(1);
        List<UserVo> userVos = new ArrayList();
        Iterator var3 = users.iterator();

        while(var3.hasNext()) {
            User item = (User)var3.next();
            UserVo userVo = new UserVo(item);
            userVos.add(userVo);
        }

        return userVos;
    }

    @Override
    public UserVo getUserById(Integer userId) {
        List<Object[]> results = userRepository.getUserById(userId);
        UserVo userVo = null;

        for (Object[] result : results) {
            Integer usr_id = (Integer) result[0];
            String usr_fullname = (String) result[1];
            String usr_phone = (String) result[3];
            String usr_email = (String) result[4];
            String usr_username = (String) result[5];
            String usr_password = (String) result[6];
            String usr_position = (String) result[7];
            Integer usr_status = (Integer) result[8];
            String cty_name = (String) result[9];
            String prv_name = (String) result[10];

            userVo = new UserVo(usr_id, usr_fullname, usr_phone, usr_email, usr_username, usr_password, usr_position, usr_status, cty_name, prv_name);
        }

        return userVo;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

}
