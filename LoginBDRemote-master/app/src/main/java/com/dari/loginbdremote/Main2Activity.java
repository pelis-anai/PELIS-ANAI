package com.dari.loginbdremote;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by DARI on 07/09/2017.
 */
public class Main2Activity extends Activity {
VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main2);


    videoView =(VideoView) findViewById(R.id.videoView);


        Uri uri = Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.setMediaController((new MediaController(this)));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }

}