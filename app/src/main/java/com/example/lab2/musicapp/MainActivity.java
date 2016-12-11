package com.example.lab2.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button info=(Button)findViewById(R.id.info);
        Button artist=(Button)findViewById(R.id.artist);
        Button album=(Button)findViewById(R.id.album);
        Button play=(Button)findViewById(R.id.play);
        Button pause=(Button)findViewById(R.id.pause);
        Button stop=(Button)findViewById(R.id.stop);
       final MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.music);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
mp.stop();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,info.class);
                startActivity(i);
            }
        });
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,artist.class);
                startActivity(i);
            }
        });
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,album.class);
                startActivity(i);
            }
        });
    }
}
