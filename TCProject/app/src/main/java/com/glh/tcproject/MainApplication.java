package com.glh.tcproject;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.init(this);
    }
}
