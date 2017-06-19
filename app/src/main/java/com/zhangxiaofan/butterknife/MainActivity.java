package com.zhangxiaofan.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_main_first)
    TextView tvMainFirst;
    @BindView(R.id.tv_main_second)
    TextView tvMainSecond;
    @BindView(R.id.tv_main_third)
    TextView tvMainThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_main_first, R.id.tv_main_second, R.id.tv_main_third})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_main_first:
                break;
            case R.id.tv_main_second:
                break;
            case R.id.tv_main_third:
                break;
        }
    }
}
