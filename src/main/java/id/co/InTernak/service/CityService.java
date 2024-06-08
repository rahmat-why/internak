package id.co.InTernak.service;

import id.co.InTernak.response.DtoResponse;

public interface CityService {
    DtoResponse getAllCities();

    DtoResponse getCityActive();

    DtoResponse getCityById(Integer cty_id);
}
