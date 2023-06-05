package com.example.apimodelclass.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelApi {
    public  ModelApiService createModelApiService() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        ModelApiService modelApiService = retrofit.create(ModelApiService.class);
        return modelApiService;
    }
}
