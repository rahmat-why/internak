package id.co.InTernak.service;

import id.co.InTernak.model.tsArticleComment;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.vo.tsArticleCommentVo;

public interface tsArticleCommentService {
    DtoResponse addComment(tsArticleCommentVo tsArticleComment);
DtoResponse deleteComment(tsArticleCommentVo tsArticleComment);
}
