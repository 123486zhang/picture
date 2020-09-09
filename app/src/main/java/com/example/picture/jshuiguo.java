package com.example.picture;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class jshuiguo extends AppCompatActivity implements View.OnClickListener {

    private Button zuo;
    private Button you;
    private Button ch;
    private Button en;
    private Button auto;
    private ImageView shuiguo1;
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
    private int[] photos = {R.drawable.caomei, R.drawable.li, R.drawable.mangguo,
            R.drawable.mihoutao, R.drawable.ningmeng,
            R.drawable.putao,R.drawable.tao,R.drawable.xiangjiao,R.drawable.xigua,R.drawable.boluo
            ,R.drawable.mugua,R.drawable.pingguo,R.drawable.shiliu,R.drawable.zao,R.drawable.yingtao};
    private int photoIndex = 0;
    private int maxIndex = 14;
    static Handler handler =new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            {

                shuiguo1 = (ImageView) findViewById(R.id.shuiguo1);
                switch (photoIndex) {
                    case 0: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_caomei);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_caomei);
                        mediaPlayer.start();
                        photoIndex = 1;
                        break;
                    }
                    case 1: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_li);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_li);
                        mediaPlayer.start();
                        photoIndex = 2;
                        break;
                    }
                    case 2: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_mangguo);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_mangguo);
                        mediaPlayer.start();
                        photoIndex = 3;
                        break;
                    }
                    case 3: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_mihoutao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_mihoutao);
                        mediaPlayer.start();
                        photoIndex = 4;
                        break;
                    }
                    case 4: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_niengmeng);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_lemon);
                        mediaPlayer.start();
                        photoIndex = 5;
                        break;
                    }
                    case 5: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_putao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_putao);
                        mediaPlayer.start();
                        photoIndex = 6;
                        break;
                    }
                    case 6: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_tao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_tao);
                        mediaPlayer.start();
                        photoIndex = 7;
                        break;
                    }
                    case 7: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_xiangjiao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_xiangjiao);
                        mediaPlayer.start();
                        photoIndex = 8;
                        break;
                    }
                    case 8: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_xigua);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_xigua);
                        mediaPlayer.start();
                        photoIndex = 9;
                        break;
                    }
                    case 9: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_boluo);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_boluo);
                        mediaPlayer.start();
                        photoIndex = 10;
                        break;
                    }
                    case 10: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_mugua);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_mugua);
                        mediaPlayer.start();
                        photoIndex = 11;
                        break;
                    }
                    case 11: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_pingguo);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_pingguo);
                        mediaPlayer.start();
                        photoIndex = 12;
                        break;
                    }
                    case 12: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_shiliu);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_shiliu);
                        mediaPlayer.start();
                        photoIndex = 13;
                        break;
                    }
                    case 13: {//如果没有歌
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_zao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_zao);
                        mediaPlayer.start();
                        photoIndex = 14;
                        break;
                    }
                    case 14: {//如果没有
                        shuiguo1.setImageResource(photos[photoIndex]);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ch_yingtao);
                        mediaPlayer.start();
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.en_yingtao);
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
        setContentView(R.layout.shuiguo);
        plus=(Button)findViewById(R.id.plus);
        text13=(TextView)findViewById(R.id.text13);
        ground=( pl.droidsonroids.gif.GifImageView)findViewById(R.id.ground);
        zuo=(Button)findViewById(R.id.zuo);
        you=(Button)findViewById(R.id.you);
        ch=(Button)findViewById(R.id.ch1);
        en=(Button)findViewById(R.id.en);
        auto=(Button)findViewById(R.id.autoplay);
        shuiguo1=(ImageView)findViewById(R.id.shuiguo1);
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
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_caomei);
                    mediaPlayer.start();
                }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_li);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_mangguo);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_mihoutao);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_niengmeng);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_putao);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_tao);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_xiangjiao);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_xigua);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_boluo);
                    mediaPlayer.start();
                }
                if(photoIndex == 10){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_mugua);
                    mediaPlayer.start();
                }
                if(photoIndex == 11){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_pingguo);
                    mediaPlayer.start();
                }
                if(photoIndex == 12){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_shiliu);
                    mediaPlayer.start();
                }
                if(photoIndex == 13){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_zao);
                    mediaPlayer.start();
                }
                if(photoIndex == 14){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ch_yingtao);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "中文播放", Toast.LENGTH_SHORT).show();
                break;
            case R.id.en:
                if(photoIndex == 0){//如果没有歌
                mediaPlayer = MediaPlayer.create(this, R.raw.en_caomei);
                mediaPlayer.start();
            }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_li);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_mangguo);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_mihoutao);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_lemon);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_putao);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_tao);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_xiangjiao);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_xigua);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_boluo);
                    mediaPlayer.start();
                }
                if(photoIndex == 10){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_mugua);
                    mediaPlayer.start();
                }
                if(photoIndex == 11){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_pingguo);
                    mediaPlayer.start();
                }
                if(photoIndex == 12){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_shiliu);
                    mediaPlayer.start();
                }
                if(photoIndex == 13){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_zao);
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_zao);
                    mediaPlayer.start();
                }
                if(photoIndex == 14){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.en_yingtao);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "英文播放", Toast.LENGTH_SHORT).show();
                break;
        }
        shuiguo1.setImageResource(photos[photoIndex]);

    }
    @Override
    protected  void onPause(){
        super.onPause();

        System.out.println("调用onpause");
        handler.removeCallbacks(runnable);
    }




}