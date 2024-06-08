package id.co.InTernak.dao;

import id.co.InTernak.model.Province;
import id.co.InTernak.model.User;
import id.co.InTernak.vo.ProvinceVo;
import id.co.InTernak.vo.UserVo;

import java.util.List;

public interface ProvinceDao {

    List<ProvinceVo> getAllProvinces();

    List<ProvinceVo> getProvinceActive();

    Province     getProvinceById(Integer prv_id);

}
