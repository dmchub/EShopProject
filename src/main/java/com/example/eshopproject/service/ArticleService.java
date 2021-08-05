package com.example.eshopproject.service;

import com.example.eshopproject.domain.Article;

public interface ArticleService {

    Article findArticleById(Long id);

    Article saveArticle(Article article);

    void deleteArticleById(Long id);
}
