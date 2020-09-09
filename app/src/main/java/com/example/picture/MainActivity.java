package com.example.picture;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import com.android.volley.RequestQueue;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button shuiguo;
    private Button dongwu;
    private Button shuzi;
    private Button jiaotong;
    private Button yanse;
    private Button zimu;
    private Button test;
    private Button test2;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text10;
    private TextView text11;
    private TextView text12;
    private ImageView text15;
    private LocationClient mLocationClient;
    private MyLocationListener myLocationListener;
    RequestQueue queue = null;
    private static final int LOCATION_CODE = 1;
    private LocationManager lm;
    private  pl.droidsonroids.gif.GifImageView ground;
    private int[] photos = {R.drawable.ground0,R.drawable.ground1,R.drawable.ground2,R.drawable.ground3,R.drawable.background,
            R.drawable.ground4,R.drawable.ground5,R.drawable.ground6,R.drawable.ground7,R.drawable.ground8,
            R.drawable.ground9,R.drawable.ground10,R.drawable.ground11,R.drawable.ground12,R.drawable.ground13,
            R.drawable.ground14,R.drawable.ground15,R.drawable.ground16,R.drawable.ground17,R.drawable.ground18,R.drawable.ground19,
            R.drawable.ground};
    private int count=0;
    private  TextView text13;
    private Button plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shuiguo = (Button) findViewById(R.id.shuiguo);
        dongwu = (Button) findViewById(R.id.dongwu);
        shuzi = (Button) findViewById(R.id.shuzi);
        jiaotong = (Button) findViewById(R.id.jiaotong);
        yanse = (Button) findViewById(R.id.yanse);
        zimu = (Button) findViewById(R.id.zimu);
        test = (Button) findViewById(R.id.test);
        test2 = (Button) findViewById(R.id.test2);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text10 = (TextView) findViewById(R.id.text10);
        text11 = (TextView) findViewById(R.id.text11);
        text12 = (TextView) findViewById(R.id.text12);
        text15 = (ImageView) findViewById(R.id.text15);
        text13=(TextView)findViewById(R.id.text13);
        plus = (Button) findViewById(R.id.plus);
        ground=( pl.droidsonroids.gif.GifImageView)findViewById(R.id.ground);
        shuiguo.setOnClickListener(this);
        dongwu.setOnClickListener(this);
        shuzi.setOnClickListener(this);
        jiaotong.setOnClickListener(this);
        yanse.setOnClickListener(this);
        zimu.setOnClickListener(this);
        test.setOnClickListener(this);
        test2.setOnClickListener(this);
        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        text6.setOnClickListener(this);
        text10.setOnClickListener(this);
        text11.setOnClickListener(this);
        quanxian();
        myLocationListener = new MyLocationListener(text12,text15,queue,this);
        mLocationClient = new LocationClient(this);
        mLocationClient.registerLocationListener(myLocationListener);
        initLocation();
        mLocationClient.start();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==22)
                    count=0;
                ground.setBackgroundResource(photos[count++]);
            }
        });
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==22)
                    count=0;
                ground.setBackgroundResource(photos[count++]);
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shuiguo:
                Toast.makeText(this, "水果", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, jshuiguo.class);
                startActivity(intent1);
                break;
            case R.id.dongwu:
                Toast.makeText(this, "动物", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, jdongwu.class);
                startActivity(intent2);
                break;
            case R.id.shuzi:
                Toast.makeText(this, "数字", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, jshuzi.class);
                startActivity(intent3);
                break;
            case R.id.jiaotong:
                Toast.makeText(this, "交通工具", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, jjiaotong.class);
                startActivity(intent4);
                break;
            case R.id.yanse:
                Toast.makeText(this, "颜色", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(this, jyanse.class);
                startActivity(intent5);
                break;
            case R.id.zimu:
                Toast.makeText(this, "字母", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(this, jzimu.class);
                startActivity(intent6);
                break;
            case R.id.test:
                Toast.makeText(this, "汉语测试", Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(this, jgametest.class);
                startActivity(intent10);
                break;
            case R.id.test2:
                Toast.makeText(this, "英语测试", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(this, jgametesten.class);
                startActivity(intent11);
                break;
            case R.id.text1:
                Toast.makeText(this, "水果.", Toast.LENGTH_SHORT).show();
                Intent intent31 = new Intent(this, jshuiguo.class);
                startActivity(intent31);
                break;
            case R.id.text2:
                Toast.makeText(this, "动物.", Toast.LENGTH_SHORT).show();
                Intent intent12 = new Intent(this, jdongwu.class);
                startActivity(intent12);
                break;
            case R.id.text3:
                Toast.makeText(this, "数字.", Toast.LENGTH_SHORT).show();
                Intent intent13 = new Intent(this, jshuzi.class);
                startActivity(intent13);
                break;
            case R.id.text4:
                Toast.makeText(this, "交通工具.", Toast.LENGTH_SHORT).show();
                Intent intent14 = new Intent(this, jjiaotong.class);
                startActivity(intent14);
                break;
            case R.id.text5:
                Toast.makeText(this, "颜色.", Toast.LENGTH_SHORT).show();
                Intent intent15 = new Intent(this, jyanse.class);
                startActivity(intent15);
                break;
            case R.id.text6:
                Toast.makeText(this, "字母.", Toast.LENGTH_SHORT).show();
                Intent intent16 = new Intent(this, jzimu.class);
                startActivity(intent16);
                break;
            case R.id.text10:
                Toast.makeText(this, "汉语测试.", Toast.LENGTH_SHORT).show();
                Intent intent20 = new Intent(this, jgametest.class);
                startActivity(intent20);
                break;
            case R.id.text11:
                Toast.makeText(this, "英语测试.", Toast.LENGTH_SHORT).show();
                Intent intent21 = new Intent(this, jgametesten.class);
                startActivity(intent21);
                break;
        }
    }

    void initLocation() {
        LocationClientOption option = new LocationClientOption();
        option.setIsNeedAddress(true);
        option.setOpenGps(true);
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        option.setCoorType("bd09ll");
        option.setScanSpan(1000);
        mLocationClient.setLocOption(option);
    }
    public void quanxian() {
        lm = (LocationManager) MainActivity.this.getSystemService(MainActivity.this.LOCATION_SERVICE);
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            Log.e("BRG", "没有权限");
            // 没有权限，申请权限。
            Toast.makeText(this, "没有定位权限，天气功能无法使用！", Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION_CODE);
        }

    }




}
