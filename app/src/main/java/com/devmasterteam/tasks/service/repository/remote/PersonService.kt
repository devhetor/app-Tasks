package com.devmasterteam.tasks.service.repository.remote

import com.devmasterteam.tasks.service.model.PersonModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface PersonService {

    //http://devmasterteam.com/CursoAndroidAPI/Authentication/Create
    @POST("Authentication/Login")
    @FormUrlEncoded
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<PersonModel>

    @POST("Authentication/Create")
    @FormUrlEncoded
    fun create(
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("name") name: String
    ): Call<PersonModel>

}

/*

{
heitorbrandolin@gmaiil.com
123abc

    "name": "heitor",
    "token": "QqlQ2s0tgfWg+/H3ydL2f6zZYQAH9BvkOm7QusW9GL27Ib9+/HYCfN8eHUm2DusL",
    "personKey": "QoodFVbVu1uCQvCUqkJyqxtkLGAtyHu/84iEYeECFVU="
}

 */