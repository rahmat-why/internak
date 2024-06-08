package id.co.InTernak.rest;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.CityService;
import id.co.InTernak.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/cities"})
public class CityRest {
    @Autowired
    private CityService cityService;
    @GetMapping({"/getCity"})
    public DtoResponse getCity() {
        return this.cityService.getAllCities();
    }
}
