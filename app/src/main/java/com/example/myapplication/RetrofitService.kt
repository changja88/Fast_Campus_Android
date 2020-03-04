package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET


interface RetrofitService {

    @GET("json/students/")
    fun getStudentsList(): Call<ArrayList<PersonFromServer>>



}