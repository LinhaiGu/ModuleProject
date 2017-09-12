package com.glh.ordermanager;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.glh.baselibrary.BaseActivity;


/**
 * 订单模块
 * Created by glh on 2017-09-12.
 */
public class MainActivity extends BaseActivity {
    private Button mOrderButton;

    @Override
    protected int layout() {
        return R.layout.order_layout;
    }

    @Override
    protected void initView() {
        mOrderButton = findViewById(R.id.btn_order);
        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderModule();
            }
        });
    }

    public void orderModule() {
        ARouter.getInstance().build("/orderlibrary/order/main").navigation();
    }

}
