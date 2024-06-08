package id.co.InTernak.rest;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.ProvinceService;
import id.co.InTernak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/provinces"})
public class ProvinceRest {
    @Autowired
    private ProvinceService provinceService;
    @GetMapping({"/getProvince"})
    public DtoResponse getProvinces() {
        return this.provinceService.getAllProvinces();
    }
}
