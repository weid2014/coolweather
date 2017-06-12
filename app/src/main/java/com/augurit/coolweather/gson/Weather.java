package com.augurit.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017-06-12.
 */
public class Weather {
    public String status;
    public Basic bssic;
    public AQI aqi;
    public Now now;
    public Suggerstion mSuggerstion;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}
