package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.CityDao;
import id.co.InTernak.model.City;
import id.co.InTernak.model.Province;
import id.co.InTernak.repository.CityRepository;
import id.co.InTernak.vo.CityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityRepository cityRepository;

    public CityDaoImpl() {
    }

    public List<CityVo> getAllCities() {
        Iterable<City> cities = this.cityRepository.findAll();
        List<CityVo> cityVos = new ArrayList();
        Iterator var3 = cities.iterator();

        while(var3.hasNext()) {
            City item = (City) var3.next();
            CityVo cityVo = new CityVo(item);
            cityVos.add(cityVo);
        }

        return cityVos;
    }


    @Override
    public List<CityDao> getCityActive() {
        return null;
    }

    @Override
    public Province getCityById(Integer prv_id) {
        return null;
    }
}
