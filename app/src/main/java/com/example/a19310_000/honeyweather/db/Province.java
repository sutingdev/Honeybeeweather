package com.example.a19310_000.honeyweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 19310_000 on 2018/2/12.
 */

public class Province extends DataSupport {
    private int id;//每个实体类中都应该有的字段
    private String provinceName;//省的名字
    private int provinceCode;//省的代号

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
