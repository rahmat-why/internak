package id.co.InTernak.rest;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.tsArticleCommentService;
import id.co.InTernak.service.tsArticleService;
import id.co.InTernak.vo.tsArticleCommentVo;
import id.co.InTernak.vo.tsArticleVo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class tsArticleCommentRest {

    private tsArticleCommentService service;
    public tsArticleCommentRest(tsArticleCommentService Service) {
        this.service = Service;
    }

    @PostMapping("/ts-article-comment/create")
    public DtoResponse create(@RequestBody tsArticleCommentVo tsArticleVo){
        return service.addComment(tsArticleVo);
    }
    @DeleteMapping("/ts-article-comment/delete")
    public DtoResponse delete(@RequestBody tsArticleCommentVo tsArticle){return service.deleteComment(tsArticle);}
}
