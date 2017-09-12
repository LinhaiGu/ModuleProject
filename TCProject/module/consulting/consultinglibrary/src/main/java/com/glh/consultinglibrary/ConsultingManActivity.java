package com.glh.consultinglibrary;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.glh.baselibrary.BaseActivity;

/**
 * 资讯项目
 * Created by glh on 2017-09-12.
 */
@Route(path = "/consultinglibrary/consulting/main")
public class ConsultingManActivity extends BaseActivity {

    private Button mConsultingButton;

    @Override
    protected int layout() {
        return R.layout.module_consulting_layout;
    }

    @Override
    protected void initView() {
        mConsultingButton = findViewById(R.id.id_consulting);
        mConsultingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConsultingManActivity.this, "咨询项目", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
