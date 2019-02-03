package com.kotlinboot.kotlinboot.repository

import com.kotlinboot.kotlinboot.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ArticleRepository:JpaRepository<Article,Long>