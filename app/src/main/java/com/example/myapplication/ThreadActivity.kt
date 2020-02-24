package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread1 is made")
            }
        }
        val thread: Thread = Thread(runnable)

        button.setOnClickListener {
            thread.start()
        }

        Thread(object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1", "Thread3 is made")
            runOnUiThread {
                button.setBackgroundColor(getColor(R.color.textview_color))
            }
        }).start()
    }
}
