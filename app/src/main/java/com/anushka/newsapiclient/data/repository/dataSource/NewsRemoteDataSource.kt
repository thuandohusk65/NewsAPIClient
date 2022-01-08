package com.anushka.newsapiclient.data.repository.dataSource

import com.anushka.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
    suspend fun getSearchedTopHeadlines(
        country: String,
        search: String,
        page: Int
    ): Response<APIResponse>
}