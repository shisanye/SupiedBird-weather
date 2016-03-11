package com.example.jd.coolweather.activity.util;

/**
 * Created by JD on 2016/3/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
