package id.co.InTernak.dao;

import id.co.InTernak.model.Province;
import id.co.InTernak.vo.CityVo;

import java.util.List;

public interface CityDao {
    List<CityVo> getAllCities();

    List<CityDao> getCityActive();

    Province getCityById(Integer cty_id);
}
