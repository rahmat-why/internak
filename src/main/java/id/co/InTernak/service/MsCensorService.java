package id.co.InTernak.service;

import id.co.InTernak.model.MsCensor;
import id.co.InTernak.response.DtoResponse;

public interface MsCensorService {
    DtoResponse getAllCensors();
    DtoResponse getCensorById(Integer cns_id);
    DtoResponse saveCensor(MsCensor msCensor);
    DtoResponse updateCensor(MsCensor msCensor);
    DtoResponse deleteCensor(MsCensor msCensor);
}
