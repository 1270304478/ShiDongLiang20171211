package com.bwei.shidongliang20171211.view;

import com.bwei.shidongliang20171211.bean.Bean;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/11 9:31
 */
public interface IMainView {
    public void onSuccess(Bean bean);
    public void onFailure(Exception e);
}
