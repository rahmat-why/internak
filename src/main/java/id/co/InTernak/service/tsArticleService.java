package id.co.InTernak.service;

import id.co.InTernak.model.tsArticle;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.vo.tsArticleVo;

public interface tsArticleService {
    DtoResponse addArticle(tsArticleVo tsArticle);
    DtoResponse updateArticle(tsArticleVo tsArticle);
    DtoResponse getArticle(Integer id);
    DtoResponse deleteArticle(tsArticleVo tsArticle);
    DtoResponse getOther(Integer id);
    DtoResponse getLatest();
}
