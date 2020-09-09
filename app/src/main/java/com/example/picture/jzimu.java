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

public class jzimu extends AppCompatActivity implements View.OnClickListener {

    private Button zuo;
    private Button you;
    private Button ch;
    private Button en;
    private Button auto;
    private ImageView zimu1;
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
    private int[] photos = {R.drawable.aa, R.drawable.bb, R.drawable.cc,
            R.drawable.dd, R.drawable.ee,
            R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.ii,R.drawable.jj,R.drawable.kk, R.drawable.ll, R.drawable.mm,
            R.drawable.nn, R.drawable.oo,
            R.drawable.pp,R.drawable.qq,R.drawable.rr,R.drawable.ss,R.drawable.tt,R.drawable.uu, R.drawable.vv, R.drawable.ww,
            R.drawable.xx, R.drawable.yy, R.drawable.zz};
    private int photoIndex = 0;
    private int maxIndex = 25;
    static Handler handler =new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            {
                zimu1=(ImageView)findViewById(R.id.zimu1) ;
                    switch (photoIndex) {
                        case 0: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aa);
                            mediaPlayer.start();
                            photoIndex = 1;
                            break;
                        }
                        case 1: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bb);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bb);
                            mediaPlayer.start();
                            photoIndex = 2;
                            break;
                        }
                        case 2: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cc);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cc);
                            mediaPlayer.start();
                            photoIndex = 3;
                            break;
                        }
                        case 3: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dd);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dd);
                            mediaPlayer.start();
                            photoIndex = 4;
                            break;
                        }
                        case 4: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                            mediaPlayer.start();
                            photoIndex = 5;
                            break;
                        }
                        case 5: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ff);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ff);
                            mediaPlayer.start();
                            photoIndex = 6;
                            break;
                        }
                        case 6: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gg);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gg);
                            mediaPlayer.start();
                            photoIndex = 7;
                            break;
                        }
                        case 7: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hh);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hh);
                            mediaPlayer.start();
                            photoIndex = 8;
                            break;
                        }
                        case 8: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ii);
                            mediaPlayer.start();
                            photoIndex = 9;
                            break;
                        }
                        case 9: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jj);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jj);
                            mediaPlayer.start();
                            photoIndex = 10;
                            break;
                        }
                        case 10: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.kk);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.kk);
                            mediaPlayer.start();
                            photoIndex = 11;
                            break;
                        }
                        case 11: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ll);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ll);
                            mediaPlayer.start();
                            photoIndex = 12;
                            break;
                        }
                        case 12: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mm);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mm);
                            mediaPlayer.start();
                            photoIndex = 13;
                            break;
                        }
                        case 13: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nn);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nn);
                            mediaPlayer.start();
                            photoIndex = 14;
                            break;
                        }
                        case 14: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oo);
                            mediaPlayer.start();
                            photoIndex = 15;
                            break;
                        }
                        case 15: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pp);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pp);
                            mediaPlayer.start();
                            photoIndex = 16;
                            break;
                        }
                        case 16: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.qq);
                            mediaPlayer.start();
                            photoIndex = 17;
                            break;
                        }
                        case 17: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rr);
                            mediaPlayer.start();
                            photoIndex = 18;
                            break;
                        }
                        case 18: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ss);
                            mediaPlayer.start();
                            photoIndex = 19;
                            break;
                        }
                        case 19: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tt);
                            mediaPlayer.start();
                            photoIndex = 20;
                            break;
                        }
                        case 20: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.uu);
                            mediaPlayer.start();
                            photoIndex = 21;
                            break;
                        }
                        case 21: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vv);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vv);
                            mediaPlayer.start();
                            photoIndex = 22;
                            break;
                        }
                        case 22: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ww);
                            mediaPlayer.start();
                            photoIndex = 23;
                            break;
                        }
                        case 23: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.xx);
                            mediaPlayer.start();
                            photoIndex = 24;
                            break;
                        }
                        case 24: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                            mediaPlayer.start();
                            photoIndex = 25;
                            break;
                        }
                        case 25: {//如果没有歌
                            zimu1.setImageResource(photos[photoIndex]);
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.zz);
                            mediaPlayer.start();
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                            }
                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.zz);
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
        setContentView(R.layout.zimu);
        text13=(TextView)findViewById(R.id.text13);
        ground=( pl.droidsonroids.gif.GifImageView)findViewById(R.id.ground);
        zuo=(Button)findViewById(R.id.zuo);
        you=(Button)findViewById(R.id.you);
        ch=(Button)findViewById(R.id.ch1);
        en=(Button)findViewById(R.id.en);
        auto=(Button)findViewById(R.id.autoplay);
        zimu1=(ImageView)findViewById(R.id.zimu1);
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
                    mediaPlayer = MediaPlayer.create(this, R.raw.aa);
                    mediaPlayer.start();
                }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.bb);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.cc);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.dd);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ee);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ff);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.gg);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.hh);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ii);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.jj);
                    mediaPlayer.start();
                }
                if(photoIndex == 10){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.kk);
                    mediaPlayer.start();
                }
                if(photoIndex == 11){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ll);
                    mediaPlayer.start();
                }
                if(photoIndex == 12){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.mm);
                    mediaPlayer.start();
                }
                if(photoIndex == 13){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.nn);
                    mediaPlayer.start();
                }
                if(photoIndex == 14){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.oo);
                    mediaPlayer.start();
                }
                if(photoIndex == 15){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.pp);
                    mediaPlayer.start();
                }
                if(photoIndex == 16){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.qq);
                    mediaPlayer.start();
                }
                if(photoIndex == 17){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.rr);
                    mediaPlayer.start();
                }
                if(photoIndex == 18){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ss);
                    mediaPlayer.start();
                }
                if(photoIndex == 19){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.tt);
                    mediaPlayer.start();
                }
                if(photoIndex == 20){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.uu);
                    mediaPlayer.start();
                }
                if(photoIndex == 21){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.vv);
                    mediaPlayer.start();
                }
                if(photoIndex == 22){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ww);
                    mediaPlayer.start();
                }
                if(photoIndex == 23){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.xx);
                    mediaPlayer.start();
                }
                if(photoIndex == 24){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.yy);
                    mediaPlayer.start();
                }
                if(photoIndex == 25){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.zz);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "中文播放", Toast.LENGTH_SHORT).show();
                break;
            case R.id.en:
                if(photoIndex == 0){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.aa);
                    mediaPlayer.start();
                }
                if(photoIndex == 1){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.bb);
                    mediaPlayer.start();
                }
                if(photoIndex == 2){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.cc);
                    mediaPlayer.start();
                }
                if(photoIndex == 3){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.dd);
                    mediaPlayer.start();
                }
                if(photoIndex == 4){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ee);
                    mediaPlayer.start();
                }
                if(photoIndex == 5){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ff);
                    mediaPlayer.start();
                }
                if(photoIndex == 6){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.gg);
                    mediaPlayer.start();
                }
                if(photoIndex == 7){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.hh);
                    mediaPlayer.start();
                }
                if(photoIndex == 8){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ii);
                    mediaPlayer.start();
                }
                if(photoIndex == 9){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.jj);
                    mediaPlayer.start();
                }
                if(photoIndex == 10){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.kk);
                    mediaPlayer.start();
                }
                if(photoIndex == 11){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ll);
                    mediaPlayer.start();
                }
                if(photoIndex == 12){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.mm);
                    mediaPlayer.start();
                }
                if(photoIndex == 13){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.nn);
                    mediaPlayer.start();
                }
                if(photoIndex == 14){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.oo);
                    mediaPlayer.start();
                }
                if(photoIndex == 15){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.pp);
                    mediaPlayer.start();
                }
                if(photoIndex == 16){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.qq);
                    mediaPlayer.start();
                }
                if(photoIndex == 17){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.rr);
                    mediaPlayer.start();
                }
                if(photoIndex == 18){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ss);
                    mediaPlayer.start();
                }
                if(photoIndex == 19){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.tt);
                    mediaPlayer.start();
                }
                if(photoIndex == 20){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.uu);
                    mediaPlayer.start();
                }
                if(photoIndex == 21){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.vv);
                    mediaPlayer.start();
                }
                if(photoIndex == 22){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.ww);
                    mediaPlayer.start();
                }
                if(photoIndex == 23){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.xx);
                    mediaPlayer.start();
                }
                if(photoIndex == 24){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.yy);
                    mediaPlayer.start();
                }
                if(photoIndex == 25){//如果没有歌
                    mediaPlayer = MediaPlayer.create(this, R.raw.zz);
                    mediaPlayer.start();
                }
                Toast.makeText(this, "英文播放", Toast.LENGTH_SHORT).show();
                break;
        }
        zimu1.setImageResource(photos[photoIndex]);

    }
    protected  void onPause(){
        super.onPause();

        System.out.println("调用onpause");
        handler.removeCallbacks(runnable);
    }




}