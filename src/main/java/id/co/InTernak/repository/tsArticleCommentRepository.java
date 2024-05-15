package id.co.InTernak.repository;

import id.co.InTernak.model.tsArticleComment;
import id.co.InTernak.model.tsViewComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface tsArticleCommentRepository extends JpaRepository<tsArticleComment,Integer> {

}
