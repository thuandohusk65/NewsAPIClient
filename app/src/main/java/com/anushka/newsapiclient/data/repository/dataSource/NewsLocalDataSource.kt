package com.anushka.newsapiclient.data.repository.dataSource

import com.anushka.newsapiclient.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
    fun getSavedArticle(): Flow<List<Article>>
    fun deleteArticleFromDB(article: Article)
}