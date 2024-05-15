package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.tsArticleDao;
import id.co.InTernak.model.tsArticle;
import id.co.InTernak.model.tsArticleJoined;
import id.co.InTernak.model.tsNotification;
import id.co.InTernak.model.tsRealtimeCensor;
import id.co.InTernak.repository.tsArticleJoinedRepository;
import id.co.InTernak.repository.tsArticleRepository;
import id.co.InTernak.repository.tsNotificationRepository;
import id.co.InTernak.repository.tsRealtimeCensorRepository;
import id.co.InTernak.vo.tsArticleVo;
import id.co.InTernak.vo.tsNotificationVo;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class tsArticleDaoImpl implements tsArticleDao {
    @Autowired
     private tsArticleJoinedRepository tsArticleRepository;
    @Override
    public List<tsArticleVo> getOther(int id) {
        List<tsArticleJoined> articles = tsArticleRepository.getOther(id);
        List<tsArticleVo> tsArticleVos = new ArrayList<>();
        for (tsArticleJoined item : articles) {
            tsArticleVo tsArticleVo = new tsArticleVo(item);
            tsArticleVos.add(tsArticleVo);
        }
        return tsArticleVos;
    }

    @Override
    public tsArticleVo getLatest() {
        tsArticleJoined tsArticle = tsArticleRepository.getLatest();
        tsArticleVo tsArticleVo = new tsArticleVo(tsArticle);
        return tsArticleVo;
    }

    @Override
    public tsArticleVo getArticle(int id) {
        List<tsArticleJoined> article = tsArticleRepository.getArticle(id);
        tsArticleVo tsArticleVo = new tsArticleVo(article.get(0));
        return tsArticleVo;
    }
}
