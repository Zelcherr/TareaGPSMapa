package com.example.tareagpsmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPromocional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_promocional);

        VideoView VideoSanto = findViewById(R.id.Video);
        String video = "android.resource://"+getPackageName()+"/"+R.raw.videost;
        Uri uri = Uri.parse(video);
        VideoSanto.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        VideoSanto.setMediaController(mediaController);
        mediaController.setAnchorView(VideoSanto);
    }
}