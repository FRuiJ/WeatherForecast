package com.example.weatherforecastone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addCityIv, moreIv;
    LinearLayout pointLayout;
    ViewPager mainVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_iv_add:
                break;
            case R.id.main_iv_more:
                break;
        }
    }

    private void initView() {
        addCityIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLayout = findViewById(R.id.main_bottom_layout_point);
        mainVp = findViewById(R.id.main_vp);
        addCityIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);
    }
}