package com.example.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("post")
    fun getPosts(): Call<List<Post>>
    @GET("posts/{postId}")

}






