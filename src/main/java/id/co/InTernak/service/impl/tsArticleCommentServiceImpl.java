package id.co.InTernak.service.impl;

import id.co.InTernak.model.tsArticle;
import id.co.InTernak.model.tsArticleComment;
import id.co.InTernak.repository.tsArticleCommentRepository;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.tsArticleCommentService;
import id.co.InTernak.vo.tsArticleCommentVo;
import id.co.InTernak.vo.tsArticleVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static id.co.InTernak.constant.AllConstant.*;
@Service
@Transactional
public class tsArticleCommentServiceImpl implements tsArticleCommentService {
    @Autowired
    private tsArticleCommentRepository tsArticleCommentRepository;

    @Override
    public DtoResponse addComment(tsArticleCommentVo tsArticleComment) {
        try {
            if (tsArticleComment.getCmt_description() == null || tsArticleComment.getCmt_description().isEmpty() ||
                    tsArticleComment.getCmt_datetime() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            LocalDateTime localDateTime = LocalDateTime.now();
            tsArticleComment comment = new tsArticleComment();
            comment.setAtc_id(tsArticleComment.getAtc_id());
            comment.setCmt_id(tsArticleComment.getCmt_id());
            comment.setUsr_id(tsArticleComment.getUsr_id());
            comment.setCmt_datetime(localDateTime);
            comment.setCmt_description(tsArticleComment.getCmt_description());
            tsArticleCommentRepository.save(comment);
            return new DtoResponse(200, null, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, null, mCreateFailed);
        }
    }

    @Override
    public DtoResponse deleteComment(tsArticleCommentVo tsArticleComment) {
        try {
            Optional<tsArticleComment> comment = tsArticleCommentRepository.findById(tsArticleComment.getCmt_id());
            if(comment.isPresent()){
            tsArticleCommentRepository.delete(comment.get());
                return new DtoResponse(200, null, DeleteSuccess);
            }
            return null;
        }
        catch (Exception e){
            return new DtoResponse(500, null, DeleteFailed);
        }
    }

}
