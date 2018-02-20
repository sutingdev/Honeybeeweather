package com.example.a19310_000.honeyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19310_000 on 2018/2/18.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;//为什么他不用注解

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
