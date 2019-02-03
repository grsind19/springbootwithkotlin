package com.kotlinboot.kotlinboot.controller

import com.kotlinboot.kotlinboot.model.Article
import com.kotlinboot.kotlinboot.repository.ArticleRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ArticleController(private  val articleRepository: ArticleRepository){

    @GetMapping("/articles")
    fun getAllArticles():List<Article> =
            articleRepository.findAll()


    @PostMapping("/articles")
    fun createNewArticle(@Valid @RequestBody article: Article) : Article =
            articleRepository.save(article)
}

