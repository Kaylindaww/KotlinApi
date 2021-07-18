package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import okhttp3.Response
import javax.security.auth.callback.Callback
import com.example.api.Post as Post1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getPosts()
    }
    fun getPosts(){
        val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
      val request=retrofit.getPosts()

        request.enqueue(object :callback<List<post?>, reponse:Response<List<post?>){
           var postList=response.body()!!
            rcView=findViewById<R.id r>()
        }
}
