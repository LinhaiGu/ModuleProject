package com.glh.baselibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * 基础SDK中的Activity
 * Created by glh on 2017-09-12.
 */

public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        if (getIntent() != null) {
            parseArgumentsFromIntent(getIntent());
        }
        initView();
    }


    /**
     * 从intent中解析数据，具体子类来实现
     *
     * @param argIntent Intent
     */
    protected void parseArgumentsFromIntent(Intent argIntent) {
    }

    /**
     * 加载layout布局，具体由子类实现
     *
     * @return layout
     */
    protected abstract int layout();

    /**
     * 初始化View,具体由子类实现
     */
    protected abstract void initView();
}
