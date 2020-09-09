package com.example.picture;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.OnLifecycleEvent;

public class jyanse extends AppCompatActivity implements View.OnClickListener {

    private Button zuo;
    private Button you;
    private Button ch;
    private Button en;
    private Button auto;
    private ImageView yanse1;
    public boolean aflag=false;
    private MediaPlayer mediaPlayer;
    private Button plus;
    private  pl.droidsonroids.gif.GifImageView ground;
    private int[] photos1 = {R.drawable.ground0,R.drawable.ground1,R.drawable.ground2,R.drawable.ground3,R.drawable.background,
            R.drawable.ground4,R.drawable.ground5,R.drawable.ground6,R.drawable.ground7,R.drawable.ground8,
            R.drawable.ground9,R.drawable.ground10,R.drawable.ground11,R.drawable.ground12,R.drawable.ground13,
            R.drawable.ground14,R.drawable.ground15,R.drawable.ground16,R.drawable.ground17,R.drawable.ground18,R.drawable.ground19,
            R.drawable.ground};
    private int count=0;
    private TextView text13;
    private int[] photos = {R.drawable.hongse, R.drawable.chengse, R.drawable.huangse,
            R.drawable.lvse, R.drawable.qingse,
            R.drawable.lanse,R.drawable.zise,R.drawable.heise,R.drawable.huise,R.drawable.fense};
    private int photoIndex = 0;
    private int maxIndex = 9;
    static Handler handler =new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            {
                yanse1=(ImageView)findViewById(R.id.yanse1) ;
                switch (photoIndex) {
                    case 0: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_hongse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_hongse);
                        mediaPlayer.start();
                        photoIndex = 1;
                        break;
                    }
                    case 1: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_chengse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_chengse);
                        mediaPlayer.start();
                        photoIndex = 2;
                        break;
                    }
                    case 2: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_huangse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_huangse);
                        mediaPlayer.start();
                        photoIndex = 3;
                        break;
                    }
                    case 3: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_lvse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_lvse);
                        mediaPlayer.start();
                        photoIndex = 4;
                        break;
                    }
                    case 4: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_qingse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_qingse);
                        mediaPlayer.start();
                        photoIndex = 5;
                        break;
                    }
                    case 5: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_lanse);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_lanse);
                        mediaPlayer.start();
                        photoIndex = 6;
                        break;
                    }
                    case 6: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_zise);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_zise);
                        mediaPlayer.start();
                        photoIndex = 7;
                        break;
                    }
                    case 7: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_heise);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_heise);
                        mediaPlayer.start();
                        photoIndex = 8;
                        break;
                    }
                    case 8: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_huise);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_huise);
                        mediaPlayer.start();
                        photoIndex = 9;
                        break;
                    }
                    case 9: {//如果没有歌
                        yanse1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_fense);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_fense);
                        mediaPlayer.start();
                        photoIndex = 0;
                        break;
                    }

                }
                handler.postDelayed(runnable, 2000);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yanse);
        text13=(TextView)findViewById(R.id.text13);
        ground=( pl.droidsonroids.gif.GifImageView)findViewById(R.id.ground);
        zuo=(Button)findViewById(R.id.zuo);
        you=(Button)findViewById(R.id.you);
        ch=(Button)findViewById(R.id.ch1);
        en=(Button)findViewById(R.id.en);
        auto=(Button)findViewById(R.id.autoplay);
        yanse1=(ImageView)findViewById(R.id.yanse1);
        plus=(Button)findViewById(R.id.plus);
        zuo.setOnClickListener(this);
        you.setOnClickListener(this);
        ch.setOnClickListener(this);
        en.setOnClickListener(this);
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aflag=!aflag;
                if(aflag) {
                    auto.setBackground(getApplicationContext().getResources().getDrawable(R.drawable.autuo_2));
                    handler.post(runnable);
                }
                else if(!aflag)
                {
                    auto.setBackground(getApplicationContext().getResources().getDrawable(R.drawable.auto_1));
                    handler.removeCallbacks(runnable);}
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==22)
                    count=0;
                ground.setBackgroundResource(photos1[count++]);
            }
        });
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==22)
                    count=0;
                ground.setBackgroundResource(photos1[count++]);
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zuo:
                if (photoIndex == 0) {
                    photoIndex = maxIndex;
                } else {
                    photoIndex = photoIndex - 1;
                }
                Toast.makeText(this, "上一张", Toast.LENGTH_SHORT).show();
                break;
            case R.id.you:
                if (photoIndex == maxIndex) {
                    photoIndex = 0;
                } else {
                    photoIndex = photoIndex + 1;
                }
                Toast.makeText(this, "下一张", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ch1:
                if(photoIndex == 0){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_hongse);
                    mediaPlayer.start();
                }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_chengse);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_huangse);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_lvse);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_qingse);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_lanse);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_zise);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_heise);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_huise);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_fense);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "中文播放", Toast.LENGTH_SHORT).show();
                break;
            case R.id.en:
                if(photoIndex == 0){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_hongse);
                    mediaPlayer.start();
                }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_chengse);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_huangse);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_lvse);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_qingse);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_lanse);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_zise);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_heise);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_huise);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_fense);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "英文播放", Toast.LENGTH_SHORT).show();
                break;
        }
        yanse1.setImageResource(photos[photoIndex]);

    }



    protected  void onPause(){
        super.onPause();

        System.out.println("调用onpause");
        handler.removeCallbacks(runnable);
    }


}