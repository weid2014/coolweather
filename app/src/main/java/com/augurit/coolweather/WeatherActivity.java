package com.augurit.coolweather;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.augurit.coolweather.util.HttpUtil;
import com.augurit.coolweather.util.LogUtil;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2017-06-12.
 */
public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather);
        String weatherId=getIntent().getStringExtra("weather_id");
        requestWeather(weatherId);
    }

    /**
     * 根据城市id请求城市天气信息
     * @param weatherId
     */
    private void requestWeather(String weatherId) {
        String weatherURL = "http://guolin.tech/api/weather?cityid=" + weatherId + "&key=bc0418b57b2d4918819d3974ac1285d9";
        LogUtil.d("请求链接是--"+weatherURL);
        LogUtil.d("请求id是--"+weatherId);
        HttpUtil.sendOkHttpRequest(weatherURL, new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText=response.body().string();
                LogUtil.d("请求结果--"+responseText);
            }
            @Override
            public void onFailure(Call call, IOException e) {

            }

        });
    }
}
