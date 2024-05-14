package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.MsCensorDao;
import id.co.InTernak.model.MsCensor;
import id.co.InTernak.repository.MsCensorRepository;
import id.co.InTernak.vo.MsCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MsCensorDaoImpl implements MsCensorDao {
    @Autowired
    private MsCensorRepository msCensorRepository;
    @Override
    public List<MsCensorVo> getAllCensors() {
        Iterable<MsCensor> msCensors = msCensorRepository.findAll();
        List<MsCensorVo> msCensorVos = new ArrayList<>();
        for (MsCensor item : msCensors) {
            MsCensorVo msCensorVo = new MsCensorVo(item);
            msCensorVos.add(msCensorVo);
        }
        return msCensorVos;
    }
}
