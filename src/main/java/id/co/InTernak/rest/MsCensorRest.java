package id.co.InTernak.rest;

import id.co.InTernak.model.MsCensor;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.MsCensorService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/censor")
public class MsCensorRest {
    private MsCensorService msCensorService;
    public MsCensorRest(MsCensorService msCensorService){this.msCensorService = msCensorService;}
    @GetMapping("/getAll")
    public DtoResponse getCensors(){
        return msCensorService.getAllCensors();
    }
    @GetMapping("/get{cns_id}")
    public DtoResponse getCensorById(@RequestParam Integer cns_id){
        return msCensorService.getCensorById(cns_id);
    }
    @PostMapping("/create")
    public DtoResponse createCensor(@RequestBody MsCensor msCensor){
        return msCensorService.saveCensor(msCensor);
    }

    @PutMapping("/update")
    public DtoResponse updateCensor(@RequestBody MsCensor msCensor){
        return msCensorService.updateCensor(msCensor);
    }

    @DeleteMapping("/delete")
    public DtoResponse deleteCensor(@RequestBody MsCensor msCensor){
        return msCensorService.deleteCensor(msCensor);
    }
}
