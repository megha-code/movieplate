package com.example.megha.movieplate.utility.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Megha on 27-03-2016.
 */
public class ApiClientOmdb {
    private static ApiInterfaceOmdb mService;

    public static ApiInterfaceOmdb getInterface() {
        if (mService == null) {
            Gson gson = new GsonBuilder().create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.omdbapi.com/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            mService = retrofit.create(ApiInterfaceOmdb.class);
        }
        return mService;
    }

}
