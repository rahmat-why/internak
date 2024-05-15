package id.co.InTernak.repository;

import id.co.InTernak.model.tsArticle;
import id.co.InTernak.model.tsArticleJoined;
import id.co.InTernak.vo.tsArticleVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface tsArticleRepository extends JpaRepository<tsArticle,Integer> {


}
