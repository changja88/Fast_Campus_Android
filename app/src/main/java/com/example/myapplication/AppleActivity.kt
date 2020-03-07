package com.example.myapplication

import android.app.Activity
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import kotlinx.android.synthetic.main.activity_apple.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AppleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)


        test.setOnClickListener {

            Log.d("abcc", "1111")
            (application as MasterApplication).service.getSongList().enqueue(
                object : Callback<ArrayList<Song>> {
                    override fun onFailure(call: Call<ArrayList<Song>>, t:
                    Throwable) {
                    }

                    override fun onResponse(
                        call: Call<ArrayList<Song>>,
                        response: Response<ArrayList<Song>>
                    ) {
                        if (response.isSuccessful) {
                            val songList = response.body()
                            val adapter = MelonAdapter(
                                songList!!,
                                LayoutInflater.from(this@AppleActivity),
                                Glide.with(this@AppleActivity),
                                this@AppleActivity
                            )
                            song_list.adapter = adapter
                        }

                    }
                }
            )
        }

    }

    inner class MelonAdapter(
        var songList: ArrayList<Song>,
        val inflater: LayoutInflater,
        val glide: RequestManager,
        val activity: Activity
    ) : RecyclerView.Adapter<MelonAdapter.ViewHolder>() {

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val title: TextView
            val thumbnail: ImageView
            val play: ImageView

            init {
                title = itemView.findViewById(R.id.song_title)
                thumbnail = itemView.findViewById(R.id.song_img)
                play = itemView.findViewById(R.id.song_play)

                play.setOnClickListener {
                    val position: Int = adapterPosition
                    val path = songList.get(position).song
                    val mediaPlayer = MediaPlayer.create(
                        this@AppleActivity,
                        Uri.parse(path)
                    )
                    mediaPlayer.start()
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = inflater.inflate(R.layout.song_item_view, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return songList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.title.setText(songList.get(position).title)
            glide.load(songList.get(position).thumbnail).into(holder.thumbnail)
        }
    }


}
