package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.tsArticleCommentDao;
import id.co.InTernak.model.tsArticleComment;
import id.co.InTernak.model.tsNotification;
import id.co.InTernak.model.tsViewComment;
import id.co.InTernak.repository.tsArticleCommentRepository;
import id.co.InTernak.repository.tsViewCommentRepository;
import id.co.InTernak.vo.tsArticleCommentVo;
import id.co.InTernak.vo.tsNotificationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class tsArticleCommentDaoImpl  implements tsArticleCommentDao {
    @Autowired
    private tsArticleCommentRepository tsArticleCommentRepository;
    @Autowired
    private tsViewCommentRepository tsViewCommentRepository;

    @Override
    public List<tsArticleCommentVo> getAllCommentperAtc(int id) {
        return null;
    }

 /*   @Override
    public List<tsArticleCommentVo> getAllCommentperAtc(int id) {
        Iterable<tsViewComment> comments = tsViewCommentRepository.getAllCommentperArticle();
        List<tsArticleCommentVo> tsArticleCommentVos = new ArrayList<>();
        for (tsViewComment item : comments) {
            tsArticleCommentVo tsArticleCommentVo = new tsArticleCommentVo(item);
            tsArticleCommentVos.add(tsArticleCommentVo);
        }
        return tsArticleCommentVos;
    }*/
}
