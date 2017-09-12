package com.glh.orderlibrary;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.glh.baselibrary.BaseActivity;


/**
 * 订单模块
 * Created by glh on 2017-09-12.
 */
@Route(path = "/orderlibrary/order/main")
public class OrderMainActivity extends BaseActivity {

    private Button mOrderButton;

    @Override
    protected int layout() {
        return R.layout.module_order_layout;
    }

    @Override
    protected void initView() {
        mOrderButton = findViewById(R.id.id_order);
        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderModule();
            }
        });
    }

    public void orderModule() {
        Toast.makeText(this, "订单项目", Toast.LENGTH_SHORT).show();
    }

}
