package id.co.InTernak.service.impl;

import id.co.InTernak.dao.MsCensorDao;
import id.co.InTernak.model.MsCensor;
import id.co.InTernak.repository.MsCensorRepository;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.MsCensorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.InTernak.constant.MsCageConstant.mGetSuccess;
import static id.co.InTernak.constant.MsCensorConstant.*;

@Service
@Transactional
public class MsCensorServiceImpl implements MsCensorService {
    @Autowired
    private MsCensorDao msCensorDao;
    @Autowired
    private MsCensorRepository msCensorRepository;
    @Override
    public DtoResponse getAllCensors() {
        if(msCensorDao.getAllCensors() != null){
            return new DtoResponse(200, msCensorDao.getAllCensors(), mGetSuccess);
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse getCensorById(Integer cns_id) {
        MsCensor censor = msCensorRepository.findById(cns_id).orElseThrow();
        if(censor != null){
            return new DtoResponse(200, censor, mGetSuccess);
        }
        return new DtoResponse(404, null, mEmptyData);
    }

    @Override
    public DtoResponse saveCensor(MsCensor msCensor) {
        if(msCensor.getCns_name() == null || msCensor.getCns_description() == null || msCensor.getCns_status() == null) {
            return new DtoResponse(500, msCensor, mRequiredData);
        }
        try {
            msCensor.setCns_status(1);
            msCensorRepository.save(msCensor);
            return new DtoResponse(200, msCensor, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, msCensor, mRequiredData);
        }
    }

    @Override
    public DtoResponse updateCensor(MsCensor msCensor) {
        if(msCensor.getCns_id() == null || msCensor.getCns_name() == null || msCensor.getCns_description() == null || msCensor.getCns_status() == null) {
            return new DtoResponse(500, msCensor, mRequiredData);
        }
        try {
            MsCensor updateCensor = msCensorRepository.save(msCensor);
            if(updateCensor != null){
                return new DtoResponse(200, null, mUpdateSuccess);
            }else {
                return new DtoResponse(404, null, mNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mRequiredData);
        }
    }

    @Override
    public DtoResponse deleteCensor(MsCensor msCensor) {
        if(msCensor.getCns_id() == null) {
            return new DtoResponse(500, null, mRequiredData);
        }
        MsCensor censorData = msCensorRepository.findById(msCensor.getCns_id()).orElseThrow();
        if(censorData != null){
            try{
                msCensorRepository.delete(msCensor);
                return new DtoResponse(200, null, mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500, null, mRequiredData);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }
}
