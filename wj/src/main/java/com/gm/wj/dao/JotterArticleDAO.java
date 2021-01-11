package com.gm.wj.dao;

import com.gm.wj.entity.JotterArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JotterArticleDAO  extends JpaRepository<JotterArticle,Integer> {
    JotterArticle findById(int id);
}
