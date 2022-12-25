package com.example.bendicion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;

public class MainActivity extends AppCompatActivity {
        ImageView   imag_play;
        ImageView  imag_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imag_play =findViewById(R.id.image_play);
        imag_stop =findViewById(R.id.image_stop);



        ExoPlayer player = new ExoPlayer.Builder(this).build();

        imag_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaItem url = MediaItem.fromUri("http://162.210.192.98:8534");
                player.setMediaItem(url);
                player.prepare();
                player.play();
            }
        });

            imag_stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    player.stop();
                }
            });



    }
}