package com.example.diplomaapp.api;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface AuthApi {

    @POST("/login")
    @FormUrlEncoded
    Call<String> checkUser(@Header("Authorization") String authToken,
            @Field("username") String username,
            @Field("password") String password);
}
