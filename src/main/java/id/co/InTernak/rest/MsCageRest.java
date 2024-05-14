package id.co.InTernak.rest;

import id.co.InTernak.model.MsCage;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.MsCageService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/cage")
public class MsCageRest {
    private MsCageService msCageService;
    public MsCageRest(MsCageService msCageService){this.msCageService = msCageService;}
    @GetMapping("/getAll")
    public DtoResponse getCages(){
        return msCageService.getAllCages();
    }
    @GetMapping("/get{cag_id}")
    public DtoResponse getCageById(@RequestParam Integer cag_id){
        return msCageService.getCageById(cag_id);
    }
    @PostMapping("/create")
    public DtoResponse createCage(@RequestBody MsCage msCage){
        return msCageService.saveCage(msCage);
    }

    @PutMapping("/update")
    public DtoResponse updateCage(@RequestBody MsCage msCage){
        return msCageService.updateCage(msCage);
    }

    @DeleteMapping("/delete")
    public DtoResponse deleteCage(@RequestBody MsCage msCage){
        return msCageService.deleteCage(msCage);
    }
}
