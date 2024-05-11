package id.co.InTernak.rest;

import id.co.InTernak.response.DtoResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Rest {
    @GetMapping("/test")
    public DtoResponse test(){
        return new DtoResponse(200, "ok", "ok");
    }
}
