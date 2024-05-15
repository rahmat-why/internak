package id.co.InTernak.repository;

import id.co.InTernak.model.tsArticle;
import id.co.InTernak.model.tsArticleJoined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface tsArticleJoinedRepository extends JpaRepository<tsArticleJoined,Integer> {
    @Procedure(procedureName = "atc_getArticle")
    List<tsArticleJoined> getArticle(int id);
    @Procedure(procedureName = "atc_getOthers")
    List<tsArticleJoined> getOther(int id);
    @Procedure(procedureName = "atc_getLatestArticle")
    tsArticleJoined getLatest();
}
