package com.example.a19310_000.honeyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 19310_000 on 2018/2/18.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    //先定义出单日天气的实体类，然后在声明实体类引用的时候使用集合类型来进行声明
}
