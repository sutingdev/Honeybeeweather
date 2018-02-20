package com.example.a19310_000.honeyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19310_000 on 2018/2/18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    //使用注解的方式让JSON字段和Java字段之间建立映射关系

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;//更新时间
    }
}
