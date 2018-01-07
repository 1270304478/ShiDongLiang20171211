package com.bwei.shidongliang20171211.utils;

import android.app.Application;


import com.bwei.shidongliang20171211.retrofit.IGetDataBase;
import com.facebook.drawee.backends.pipeline.Fresco;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/11 9:37
 */
public class IApplication extends Application {

    public static IGetDataBase iGetDataBase;


    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoderUtil.initConfig(this);
        Fresco.initialize(this);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://120.27.23.105")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        iGetDataBase = retrofit.create(IGetDataBase.class);
    }
}
