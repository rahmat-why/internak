package id.co.InTernak.service;

import id.co.InTernak.response.DtoResponse;

public interface ProvinceService {
    DtoResponse getAllProvinces();

    DtoResponse getProvinceActive();

    DtoResponse getProvinceById(Integer user);
}
