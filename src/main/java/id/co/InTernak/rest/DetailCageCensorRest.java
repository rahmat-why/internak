package id.co.InTernak.rest;

import id.co.InTernak.model.MsCage;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.DetailCageCensorService;
import id.co.InTernak.service.MsCageService;
import id.co.InTernak.vo.DetailCageCensorVo;
import id.co.InTernak.vo.DetailCageCensorVoForm;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/dt-cage-censor")
public class DetailCageCensorRest {
    private DetailCageCensorService detailCageCensorService;
    public DetailCageCensorRest(DetailCageCensorService detailCageCensorService){this.detailCageCensorService = detailCageCensorService;}
    @GetMapping("/get")
    public DtoResponse getDetailById(@RequestParam("dtc_id") Integer dtc_id){
        return detailCageCensorService.getDetailById(dtc_id);
    }
    @PostMapping("/create")
    public DtoResponse createCage(@RequestBody DetailCageCensorVoForm detailCageCensorVo){
        return detailCageCensorService.saveDetail(detailCageCensorVo);
    }
    @PutMapping("/update")
    public DtoResponse updateCage(@RequestBody DetailCageCensorVoForm detailCageCensorVo){
        return detailCageCensorService.updateDetail(detailCageCensorVo);
    }
}
