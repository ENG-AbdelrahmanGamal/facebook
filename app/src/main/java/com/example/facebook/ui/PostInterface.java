package com.example.facebook.ui;

import com.example.facebook.pojo.PostModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Call<PostModel>getPosts ();

}
