package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_out_stagram_user_info.*

class OutStagramUserInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_out_stagram_user_info)


        all_list.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    OutStagramPostListActivity::class.java
                )
            )
        }
        my_list.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    OutStagramMyPostListActivity::class.java
                )
            )
        }
        upload.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    OutStagramUploadActivity::class.java
                )
            )
        }

        logout.setOnClickListener {
            val sp = getSharedPreferences("login_sp", Context.MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("login_sp", "null")
            editor.commit()
            (application as MasterApplication).createRetrofit()
            finish()
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
