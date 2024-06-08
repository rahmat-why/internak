package id.co.InTernak.service.impl;

import id.co.InTernak.dao.ProvinceDao;
import id.co.InTernak.dao.UserDao;
import id.co.InTernak.model.Province;
import id.co.InTernak.model.User;
import id.co.InTernak.repository.ProvinceRepository;
import id.co.InTernak.repository.UserRepository;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.ProvinceService;
import id.co.InTernak.vo.ProvinceVo;
import id.co.InTernak.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public DtoResponse getAllProvinces() {
        List<ProvinceVo> provinces = provinceDao.getAllProvinces();
        return provinces != null && !provinces.isEmpty() ?
                new DtoResponse(200, provinces) :
                new DtoResponse(200, null, "No data available");
    }

    @Override
    public DtoResponse getProvinceActive() {
        List<ProvinceVo> activeProvinces = provinceDao.getProvinceActive();
        return activeProvinces != null && !activeProvinces.isEmpty() ?
                new DtoResponse(200, activeProvinces) :
                new DtoResponse(200, null, "No data available");
    }

//    @Override
//    public DtoResponse getProvinceById(Integer prv_id) {
//        Province province = provinceDao.getProvinceById(prv_id);
//        return province != null ?
//                new DtoResponse(200, province) :
//                new DtoResponse(404, null, "Province not found");
//    }

    public DtoResponse getProvinceById(Integer prv_id) {
        List<Province> provinces = Collections.singletonList(this.provinceDao.getProvinceById(prv_id));
        if (provinces != null && !provinces.isEmpty()) {
            return new DtoResponse(200, provinces, "successfully get user.");
        } else {
            return new DtoResponse(200, null, "No data available.");
        }
    }
}
