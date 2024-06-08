package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.ProvinceDao;
import id.co.InTernak.model.Province;
import id.co.InTernak.repository.ProvinceRepository;
import id.co.InTernak.vo.ProvinceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProvinceDaoImpl implements ProvinceDao {
    @Autowired
    private ProvinceRepository provinceRepository;

    public ProvinceDaoImpl() {
    }

    public List<ProvinceVo> getAllProvinces() {
        Iterable<Province> provinces = this.provinceRepository.findAll();
        List<ProvinceVo> provinceVos = new ArrayList();
        Iterator var3 = provinces.iterator();

        while(var3.hasNext()) {
            Province item = (Province) var3.next();
            ProvinceVo provinceVo = new ProvinceVo(item);
            provinceVos.add(provinceVo);
        }

        return provinceVos;
    }

    @Override
    public List<ProvinceVo> getProvinceActive() {
        return null;
    }

    @Override
    public Province getProvinceById(Integer prv_id) {
        return null;
    }
}
