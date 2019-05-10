package com.example.retrofitbasics_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.retrofitbasics_6.adapter.adapterBilgi;
import com.example.retrofitbasics_6.model.Bilgi;
import com.example.retrofitbasics_6.restApi.ManagerAll;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Bilgi> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        istek();
    }

    private void tanimla() {
        listView = (ListView) findViewById(R.id.list_view);
    }

    private void istek() {
        list = new ArrayList<>();
        Call<List<Bilgi>> bilgiList = ManagerAll.getInstance().getBilgi();
        bilgiList.enqueue(new Callback<List<Bilgi>>() {
            @Override
            public void onResponse(Call<List<Bilgi>> call, Response<List<Bilgi>> response) {
                if (response.isSuccessful()) {
                    list = response.body();
                    adapterBilgi adp = new adapterBilgi(list, getApplicationContext());
                    listView.setAdapter(adp);
                }
            }

            @Override
            public void onFailure(Call<List<Bilgi>> call, Throwable t) {

            }
        });
    }

}
