package com.bwei.shidongliang20171211.retrofit;

import com.bwei.shidongliang20171211.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/11 9:09
 */
//http://120.27.23.105/product/getCarts?uid=100
public interface IGetDataBase {
    @GET("/product/getCarts")
    Call<Bean> get(@Query("uid") String uid);
}
