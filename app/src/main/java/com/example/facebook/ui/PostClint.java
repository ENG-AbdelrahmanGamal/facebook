package com.example.facebook.ui;

import com.example.facebook.pojo.PostModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClint {

    private static final String base_Url="https://jsonplaceholder.typicode.com/";
    private PostInterface postInterface;
    private PostClint Instance;

    public PostClint() {
        Retrofit retrofit=new Retrofit.Builder().baseUrl(base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        postInterface=retrofit.create(PostInterface.class);
        }

    public PostClint getInstance() {
        if (getInstance()==null)
        {
            Instance=new PostClint();
        }
        return Instance;
      }
    public Call<PostModel>getPosts(){
        return postInterface.getPosts();
    }



}
