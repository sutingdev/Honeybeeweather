package com.example.a19310_000.honeyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19310_000 on 2018/2/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
