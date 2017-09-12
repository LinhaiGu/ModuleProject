package com.glh.consultingmanager;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.glh.baselibrary.BaseActivity;
import com.glh.cosnultingmanager.R;


/**
 * 咨询模块
 * Created by glh on 2017-09-12.
 */
public class MainActivity extends BaseActivity {

    private Button mConsultingButton;

    @Override
    protected int layout() {
        return R.layout.consulting_layout;
    }

    @Override
    protected void initView() {
        mConsultingButton = findViewById(R.id.btn_consulting);
        mConsultingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consultingModule();
            }
        });
    }

    public void consultingModule() {
        ARouter.getInstance().build("/consultinglibrary/consulting/main").navigation();
    }

}
