package com.example.mad_practical_6_21012011033

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val Start= findViewById<FloatingActionButton>(R.id.play_button)
        Start.setOnClickListener(){
            play()
        }
        val Stop= findViewById<FloatingActionButton>(R.id.stop_button)
        Stop.setOnClickListener(){
            pause()
        }

    }
    fun play(){
        val intent = Intent(applicationContext,MyService::class.java)
        intent.putExtra(MyService.playerconstant,"PLAY")
        startService(intent)

    }
    fun pause(){
        val intent = Intent(applicationContext,MyService::class.java)
        intent.putExtra(MyService.playerconstant,"PAUSE")
        stopService(intent)

    }
    fun stop(){
        val intent=Intent(applicationContext,MyService::class.java)
        intent.putExtra(MyService.playerconstant,"STOP")
        stopService(intent)
    }



}
