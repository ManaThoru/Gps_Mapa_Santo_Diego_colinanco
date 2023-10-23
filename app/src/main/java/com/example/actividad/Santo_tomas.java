package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Santo_tomas extends AppCompatActivity {
    private VideoView vi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santo_tomas);
        vi1 = findViewById(R.id.videoView);

        vi1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.santo));

        MediaController media = new MediaController(this);
        vi1.setMediaController(media);
        media.setAnchorView(vi1);
        vi1.start();
    }
}
