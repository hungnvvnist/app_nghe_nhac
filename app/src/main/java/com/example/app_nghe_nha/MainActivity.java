package com.example.app_nghe_nha;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView _play, _next, _previous;
    private TextView _nameSong, _singer, _startTime, _endTime;
    private SeekBar _seekBar;
    public ArrayList<Song> songs;
    public int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();
        addSongs();
        _play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, songs.get(index).getFile());
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    _play.setImageResource(R.mipmap.ic_1);
                }else {
                    mediaPlayer.start();
                    _play.setImageResource(R.mipmap.ic_3);
                }
            }
        });
        _next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void findID() {
        _play = findViewById(R.id.img_play);
        _next = findViewById(R.id.img_next);
        _previous = findViewById(R.id.img_previous);
        _nameSong = findViewById(R.id.tv_nameSong);
        _singer = findViewById(R.id.tv_singer);
        _startTime = findViewById(R.id.tv_startTime);
        _endTime = findViewById(R.id.tv_endTime);
        _seekBar = findViewById(R.id.seekBar);
    }
    private void addSongs() {
        songs = new ArrayList<>();
        songs.add(new Song("Song 1", "Singer 1", R.raw.bai_1));
        songs.add(new Song("Song 2", "Singer 2", R.raw.bai_2));
        songs.add(new Song("Song 3", "Singer 3", R.raw.bai_3));
        songs.add(new Song("Song 4", "Singer 4", R.raw.bai_4));
    }
}
