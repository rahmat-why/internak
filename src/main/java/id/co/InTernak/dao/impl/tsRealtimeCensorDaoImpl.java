package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.tsRealtimeCensorDao;
import id.co.InTernak.model.tsRealtimeCensor;
import id.co.InTernak.repository.tsRealtimeCensorRepository;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class tsRealtimeCensorDaoImpl implements tsRealtimeCensorDao {
    @Autowired
    tsRealtimeCensorRepository tsRealtimeCensorRepository;

    @Override
    public tsRealtimeCensorVo getLatestData() {
        tsRealtimeCensor tsRealtimeCensor = tsRealtimeCensorRepository.getLatestData();
        tsRealtimeCensorVo tsRealtimeCensorVo = new tsRealtimeCensorVo(tsRealtimeCensor.getRlt_id(), tsRealtimeCensor.getDtc_id(), tsRealtimeCensor.getRlt_value(), tsRealtimeCensor.getRlt_timestamp());
        return tsRealtimeCensorVo;
    }
}

