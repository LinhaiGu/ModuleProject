package com.glh.tcproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.glh.baselibrary.BaseActivity;
import com.glh.consultinglibrary.ConsultingManActivity;
import com.glh.orderlibrary.OrderMainActivity;

public class MainActivity extends BaseActivity {

    private Button mOrderButton;
    private Button mConsultingButton;

    @Override
    protected int layout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mOrderButton = findViewById(R.id.id_main_order);
        mConsultingButton = findViewById(R.id.id_main_consulting);
        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/orderlibrary/order/main").navigation();
            }
        });
        mConsultingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/consultinglibrary/consulting/main").navigation();
            }
        });
    }
}
