package com.example.retrofitbasics_6.restApi;

import com.example.retrofitbasics_6.model.Bilgi;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {
    public static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return ourInstance;
    }

    public Call<List<Bilgi>> getBilgi() {
        Call<List<Bilgi>> call = getRestApiClient().bilgiGetir();
        return call;
    }
}
