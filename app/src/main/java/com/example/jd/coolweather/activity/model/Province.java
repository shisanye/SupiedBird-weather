package com.example.jd.coolweather.activity.model;

/**
 * Created by JD on 2016/3/8.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int Id){
        this.id = Id;
    }
    public String getProvince(){
        return provinceName;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String name){
        this.provinceName = name;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }
}
