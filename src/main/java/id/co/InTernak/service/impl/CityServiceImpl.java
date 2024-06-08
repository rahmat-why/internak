package id.co.InTernak.service.impl;

import id.co.InTernak.dao.CityDao;
import id.co.InTernak.dao.ProvinceDao;
import id.co.InTernak.model.City;
import id.co.InTernak.model.Province;
import id.co.InTernak.repository.ProvinceRepository;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.CityService;
import id.co.InTernak.vo.CityVo;
import id.co.InTernak.vo.ProvinceVo;
import id.co.InTernak.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;


    @Override
    public DtoResponse getAllCities() {
        List<CityVo> cities = cityDao.getAllCities();
        return cities != null && !cities.isEmpty() ?
                new DtoResponse(200, cities) :
                new DtoResponse(200, null, "No data available");
    }

    @Override
    public DtoResponse getCityActive() {
        List<CityDao> activeCities = cityDao.getCityActive();
        return activeCities != null && !activeCities.isEmpty() ?
                new DtoResponse(200, activeCities) :
                new DtoResponse(200, null, "No data available");
    }

    public DtoResponse getCityById(Integer cty_id) {
        List<Province> cities = Collections.singletonList(this.cityDao.getCityById(cty_id));
        if (cities != null && !cities.isEmpty()) {
            return new DtoResponse(200, cities, "successfully get user.");
        } else {
            return new DtoResponse(200, null, "No data available.");
        }
    }

}
