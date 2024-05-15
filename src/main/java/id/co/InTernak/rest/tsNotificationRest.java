package id.co.InTernak.rest;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.tsNotificationService;
import id.co.InTernak.service.tsRealtimeCensorService;
import id.co.InTernak.vo.tsNotificationVo;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsNotificationRest {
    @Autowired
private tsNotificationService service;
    public tsNotificationRest(tsNotificationService rltService) {
        this.service = rltService;
    }

    @PostMapping("/ts-notification/add")
    public DtoResponse createTs(@RequestBody tsNotificationVo tsNotificationVo){
        return service.addNotif(tsNotificationVo);
    }
    @GetMapping("/ts-notification/update")
    public DtoResponse updateNotif(@RequestBody tsNotificationVo tsNotificationVo){
        return service.updateNotif(tsNotificationVo);
    }
    @GetMapping("/ts-notification/getall")
    public DtoResponse getAll(){
        return service.getAllNotif();
    }


}
