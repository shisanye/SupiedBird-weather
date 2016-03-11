package com.example.jd.coolweather.activity.model;

/**
 * Created by JD on 2016/3/8.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int Id){
        this.id = Id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        this.cityName = name;
    }
    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
