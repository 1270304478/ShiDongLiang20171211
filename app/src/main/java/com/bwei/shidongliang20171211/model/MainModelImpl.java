package com.bwei.shidongliang20171211.model;

import com.bwei.shidongliang20171211.bean.Bean;
import com.bwei.shidongliang20171211.utils.IApplication;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/11 9:30
 */
public class MainModelImpl {
    public void getData(final ModelCallBack callBack){
        Call<Bean> call= IApplication.iGetDataBase.get("97");
        call.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Bean bean =   response.body();
                callBack.onSuccess(bean);
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                callBack.onFailure(new Exception(""));
            }
        });
    }
}
