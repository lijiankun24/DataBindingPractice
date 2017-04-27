package com.lijiankun24.databindingpractice;

import android.app.Application;

import com.lijiankun24.databindingpractice.common.util.Toaster;

/**
 * MyApplication.java
 * <p>
 * Created by lijiankun on 17/4/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Toaster.init(MyApplication.this);
    }
}
