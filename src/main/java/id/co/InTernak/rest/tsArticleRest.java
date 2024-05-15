package id.co.InTernak.rest;

import id.co.InTernak.model.tsArticle;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.tsArticleService;
import id.co.InTernak.service.tsNotificationService;
import id.co.InTernak.vo.tsArticleVo;
import id.co.InTernak.vo.tsNotificationVo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsArticleRest {
    private tsArticleService service;
    public tsArticleRest(tsArticleService Service) {
        this.service = Service;
    }

    @PostMapping("/ts-article/create")
    public DtoResponse create(@RequestBody tsArticleVo tsArticleVo){
        return service.addArticle(tsArticleVo);
    }
    @PutMapping("/article/update")
    public DtoResponse update(@RequestBody tsArticleVo tsArticle){
        return service.updateArticle(tsArticle);
    }
    @GetMapping("/ts-article/get")
    public DtoResponse get(@RequestParam ("id") Integer id){return service.getArticle(id);}
    @GetMapping("/ts-article/getOthers")
    public DtoResponse getOthers(@RequestParam ("id") Integer id){return service.getOther(id);}
    @DeleteMapping("/ts-article/delete")
    public DtoResponse delete(@RequestBody tsArticleVo tsArticle){return service.deleteArticle(tsArticle);}
}
