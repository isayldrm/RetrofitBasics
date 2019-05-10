package com.example.retrofitbasics_6.restApi;

import com.example.retrofitbasics_6.model.Bilgi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/comments")
    Call<List<Bilgi>> bilgiGetir();
}
