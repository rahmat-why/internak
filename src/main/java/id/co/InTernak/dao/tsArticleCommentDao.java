package id.co.InTernak.dao;

import id.co.InTernak.model.tsArticleComment;
import id.co.InTernak.vo.tsArticleCommentVo;

import java.util.List;

public interface tsArticleCommentDao {
    List<tsArticleCommentVo> getAllCommentperAtc(int id);

}
