package  com.example.picture;
import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.google.gson.Gson;

import org.json.JSONObject;

public class MyLocationListener implements BDLocationListener {
    TextView text12;
    RequestQueue queue;
    Context context;
    ImageView text15;

    MyLocationListener(TextView text12,ImageView text15, RequestQueue queue, Context context) {
        this.text12 = text12;
        this.text15=text15;
        this.queue=queue;
        this.context=context;
    }

    String cityName;

    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        cityName = bdLocation.getDistrict();
        queue = Volley.newRequestQueue(context);
        String url = "https://free-api.heweather.net/s6/weather/now?location="+cityName+"&key=3da8d46826d246f5ab2f112d16448156";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Gson gson = new Gson();
                WeatherBean weatherBean = gson.fromJson(jsonObject.toString(), WeatherBean.class);
                String cityName = weatherBean.getHeWeather6().get(0).getBasic().getLocation();
                String date = weatherBean.getHeWeather6().get(0).getUpdate().getLoc();
                String temp = weatherBean.getHeWeather6().get(0).getNow().getTmp();
                String cond = weatherBean.getHeWeather6().get(0).getNow().getWind_dir();
                String dir = weatherBean.getHeWeather6().get(0).getNow().getWind_sc();
                String qlty = weatherBean.getHeWeather6().get(0).getNow().getCond_txt();
                if(qlty.equals("晴")){
                    text15.setImageResource(R.mipmap.qingtian);
                }
                if(qlty.equals("多云")){
                    text15.setImageResource(R.drawable.duoyun);
                }
                if(qlty.equals("少云")){
                    text15.setImageResource(R.drawable.duoyun1);
                }
                if(qlty.equals("晴间多云")){
                    text15.setImageResource(R.drawable.duoyun2);
                }
                if(qlty.equals("阴")){
                    text15.setImageResource(R.drawable.duoyun3);
                }
                if(qlty.equals("有风")){
                    text15.setImageResource(R.drawable.duoyun4);
                }
                if(qlty.equals("平静")){
                    text15.setImageResource(R.drawable.duoyun5);
                }
                if(qlty.equals("微风")){
                    text15.setImageResource(R.drawable.duoyun6);
                }
                if(qlty.equals("和风")){
                    text15.setImageResource(R.drawable.duoyun7);
                }
                if(qlty.equals("清风")){
                    text15.setImageResource(R.drawable.duoyun8);
                }
                if(qlty.equals("强风/劲风")){
                    text15.setImageResource(R.drawable.duoyun9);
                }
                if(qlty.equals("疾风")){
                    text15.setImageResource(R.drawable.duoyun10);
                }
                if(qlty.equals("大风")){
                    text15.setImageResource(R.drawable.duoyun11);
                }
                if(qlty.equals("烈风")){
                    text15.setImageResource(R.drawable.duoyun12);
                }
                if(qlty.equals("风暴")){
                    text15.setImageResource(R.drawable.duoyun13);
                }
                if(qlty.equals("狂爆风")){
                    text15.setImageResource(R.drawable.duoyun14);
                }
                if(qlty.equals("飓风")){
                    text15.setImageResource(R.drawable.duoyun15);
                }
                if(qlty.equals("龙卷风")){
                    text15.setImageResource(R.drawable.duoyun16);
                }
                if(qlty.equals("热带风暴")){
                    text15.setImageResource(R.drawable.duoyun17);
                }
                if(qlty.equals("阵雨")){
                    text15.setImageResource(R.drawable.duoyun18);
                }
                if(qlty.equals("强阵雨")){
                    text15.setImageResource(R.drawable.duoyun19);
                }
                if(qlty.equals("雷阵雨")){
                    text15.setImageResource(R.drawable.duoyun20);
                }
                if(qlty.equals("强雷阵雨")){
                    text15.setImageResource(R.drawable.duoyun21);
                }
                if(qlty.equals("雷阵雨伴有冰雹")){
                    text15.setImageResource(R.drawable.duoyun22);
                }
                if(qlty.equals("小雨")){
                    text15.setImageResource(R.drawable.duoyun23);
                }
                if(qlty.equals("中雨")){
                    text15.setImageResource(R.drawable.duoyun24);
                }
                if(qlty.equals("大雨")){
                    text15.setImageResource(R.drawable.duoyun25);
                }
                if(qlty.equals("极端降雨")){
                    text15.setImageResource(R.drawable.duoyun66);
                }
                if(qlty.equals("毛毛雨/细雨")){
                    text15.setImageResource(R.drawable.duoyun26);
                }
                if(qlty.equals("暴雨")){
                    text15.setImageResource(R.drawable.duoyun27);
                }
                if(qlty.equals("大暴雨")){
                    text15.setImageResource(R.drawable.duoyun28);
                }
                if(qlty.equals("特大暴雨")){
                    text15.setImageResource(R.drawable.duoyun29);
                }
                if(qlty.equals("冻雨")){
                    text15.setImageResource(R.drawable.duoyun30);
                }
                if(qlty.equals("小到中雨")){
                    text15.setImageResource(R.drawable.duoyun31);
                }
                if(qlty.equals("中到大雨")){
                    text15.setImageResource(R.drawable.duoyun32);
                }
                if(qlty.equals("大到暴雨")){
                    text15.setImageResource(R.drawable.duoyun33);
                }
                if(qlty.equals("暴雨到大暴雨")){
                    text15.setImageResource(R.drawable.duoyun34);
                }
                if(qlty.equals("大暴雨到特大暴雨")){
                    text15.setImageResource(R.drawable.duoyun35);
                }
                if(qlty.equals("雨")){
                    text15.setImageResource(R.drawable.duoyun36);
                }
                if(qlty.equals("小雪")){
                    text15.setImageResource(R.drawable.duoyun37);
                }
                if(qlty.equals("中雪")){
                    text15.setImageResource(R.drawable.duoyun38);
                }
                if(qlty.equals("大雪")){
                    text15.setImageResource(R.drawable.duoyun39);
                }
                if(qlty.equals("暴雪")){
                    text15.setImageResource(R.drawable.duoyun40);
                }
                if(qlty.equals("雨夹雪")){
                    text15.setImageResource(R.drawable.duoyun41);
                }
                if(qlty.equals("雨雪天气")){
                    text15.setImageResource(R.drawable.duoyun42);
                }
                if(qlty.equals("阵雨夹雪")){
                    text15.setImageResource(R.drawable.duoyun43);
                }
                if(qlty.equals("阵雪")){
                    text15.setImageResource(R.drawable.duoyun44);
                }
                if(qlty.equals("小到中雪")){
                    text15.setImageResource(R.drawable.duoyun45);
                }
                if(qlty.equals("中到大雪")){
                    text15.setImageResource(R.drawable.duoyun46);
                }
                if(qlty.equals("大到暴雪")){
                    text15.setImageResource(R.drawable.duoyun47);
                }
                if(qlty.equals("雪")){
                    text15.setImageResource(R.drawable.duoyun48);
                }
                if(qlty.equals("薄雾")){
                    text15.setImageResource(R.drawable.duoyun49);
                }
                if(qlty.equals("雾")){
                    text15.setImageResource(R.drawable.duoyun50);
                }
                if(qlty.equals("霾")){
                    text15.setImageResource(R.drawable.duoyun51);
                }
                if(qlty.equals("扬沙")){
                    text15.setImageResource(R.drawable.duoyun52);
                }
                if(qlty.equals("浮尘")){
                    text15.setImageResource(R.drawable.duoyun53);
                }
                if(qlty.equals("沙尘暴")){
                    text15.setImageResource(R.drawable.duoyun54);
                }
                if(qlty.equals("强沙尘暴")){
                    text15.setImageResource(R.drawable.duoyun55);
                }
                if(qlty.equals("浓雾")){
                    text15.setImageResource(R.drawable.duoyun56);
                }
                if(qlty.equals("强浓雾")){
                    text15.setImageResource(R.drawable.duoyun57);
                }
                if(qlty.equals("中度霾")){
                    text15.setImageResource(R.drawable.duoyun58);
                }
                if(qlty.equals("重度霾")){
                    text15.setImageResource(R.drawable.duoyun59);
                }
                if(qlty.equals("严重霾")){
                    text15.setImageResource(R.drawable.duoyun60);
                }
                if(qlty.equals("大雾")){
                    text15.setImageResource(R.drawable.duoyun61);
                }
                if(qlty.equals("特强浓雾")){
                    text15.setImageResource(R.drawable.duoyun62);
                }
                if(qlty.equals("热")){
                    text15.setImageResource(R.drawable.duoyun63);
                }
                if(qlty.equals("冷")){
                    text15.setImageResource(R.drawable.duoyun64);
                }
                if(qlty.equals("未知")){
                    text15.setImageResource(R.drawable.duoyun65);
                }
                text12.setText(cityName);
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                System.out.println(volleyError);
            }
            });
    queue.add(request);
}

    }
