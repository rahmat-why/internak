package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.MsCageDao;
import id.co.InTernak.model.MsCage;
import id.co.InTernak.model.MsCensor;
import id.co.InTernak.repository.MsCageRepository;
import id.co.InTernak.vo.MsCageVo;
import id.co.InTernak.vo.MsCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MsCageDaoImpl implements MsCageDao {
    @Autowired
    private MsCageRepository msCageRepository;
    @Override
    public List<MsCageVo> getAllCages() {
        Iterable<MsCage> msCages = msCageRepository.findAll();
        List<MsCageVo> msCageVos = new ArrayList<>();
        for (MsCage item : msCages) {
            MsCageVo msCageVo = new MsCageVo(item);
            msCageVos.add(msCageVo);
        }
        return msCageVos;
    }
}
