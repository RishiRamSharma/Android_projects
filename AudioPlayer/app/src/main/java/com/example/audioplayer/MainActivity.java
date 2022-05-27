package com.example.audioplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_play,btn_pause,btn_stop;
    MediaPlayer mplayer;
    protected class MyButtonListener implements View.OnClickListener{
   @Override
   public void onClick(View view){
   switch (view.getId()){
       case R.id.btn_play: mplayer.start();
       break;
       case R.id.btn_pause: mplayer.pause();
       break;
       case R.id.btn_stop:mplayer.stop();
       break;
   }
   }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_play = (Button) findViewById(R.id.btn_play);
    btn_play = (Button) findViewById(R.id.btn_play);
    btn_pause=(Button)findViewById(R.id.btn_pause);
    btn_stop=(Button) findViewById(R.id.btn_stop);

btn_play.setOnClickListener(new MyButtonListener());
btn_pause.setOnClickListener(new MyButtonListener());
btn_stop.setOnClickListener(new MyButtonListener());

mplayer = MediaPlayer.create(this,R.raw.tune1);
}
}