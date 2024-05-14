package id.co.InTernak.service;

import id.co.InTernak.model.MsCage;
import id.co.InTernak.response.DtoResponse;
import org.springframework.web.bind.annotation.RequestParam;

public interface MsCageService {
    DtoResponse getAllCages();
    DtoResponse getCageById(Integer cag_id);
    DtoResponse saveCage(MsCage msCage);
    DtoResponse updateCage(MsCage msCage);
    DtoResponse deleteCage(MsCage msCage);
}
