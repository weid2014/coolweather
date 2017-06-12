package com.augurit.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017-06-12.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata updata;
    public class Updata{
        @SerializedName("loc")
        public String updataTime;
    }
}
