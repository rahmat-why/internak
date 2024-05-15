package id.co.InTernak.dao;

import id.co.InTernak.vo.tsArticleVo;

import java.util.List;

public interface tsArticleDao {
    List<tsArticleVo> getOther(int id);
    tsArticleVo getLatest();
    tsArticleVo getArticle(int id);
}
