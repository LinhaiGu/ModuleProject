package com.glh.consultingmanager;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


public class ConsultingApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
