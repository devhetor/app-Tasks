package com.devmasterteam.tasks.service.repository

import android.content.Context
import com.devmasterteam.tasks.service.repository.remote.RetrofitClient

class PriorityRepository(val context: Context) {

    val remote = RetrofitClient.getService(PriorityRepository::class.java)

    fun list(){
        val call = remote.list()
        //TODO continuar
    }

}