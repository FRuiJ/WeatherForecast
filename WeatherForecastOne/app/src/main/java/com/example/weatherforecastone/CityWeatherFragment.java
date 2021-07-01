package com.example.weatherforecastone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weatherforecastone.Bean.IndexBean;
import com.example.weatherforecastone.Bean.WeatherBean;
import com.google.gson.Gson;

import java.util.List;

public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {
    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv, dressIndexTv, carIndexTv, coldIndexTv, sportIndexTv, raysIndexTv;
    ImageView dayIv;
    LinearLayout futureLayout;
    private final String key = "&key=df2f7823c9e09064c9356c5b62f2f20f";
    private final String temp_url = "http://apis.juhe.cn/simpleWeather/query?city=";
    private final String index_url = "http://apis.juhe.cn/simpleWeather/life?city=";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
//        可以通过传值获取activity获取当前fragment加载的是那个地方的天气情况
        Bundle bundle = getArguments();
        String city = bundle.getString("city");
        String Url1 = temp_url + city + key;
        String Url2 = index_url + city + key;
        loadData(Url1);
        loadData(Url2);
        return view;

    }

    @Override
    public void onSuccess(String result) {
        parseShowData(result);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        super.onError(ex, isOnCallback);
    }

    private void parseShowData(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        WeatherBean.ResultDTO.RealtimeDTO resultsBean = weatherBean.getResult().getRealtime();
        // 今日
        WeatherBean.ResultDTO.FutureDTO todayDataBean = weatherBean.getResult().getFuture().get(0);

        tempTv.setText(resultsBean.getTemperature());
        cityTv.setText(weatherBean.getResult().getCity());
        conditionTv.setText(resultsBean.getInfo());
        windTv.setText(resultsBean.getDirect());
        tempRangeTv.setText(todayDataBean.getTemperature());
        dateTv.setText(todayDataBean.getDate());
        IndexBean indexBean = new Gson().fromJson(result, IndexBean.class);
        IndexBean.ResultDTO.LifeDTO life = indexBean.getResult().getLife();
        dressIndexTv.setText(life.getChuanyi().getV());
//        carIndexTv.setText(life.getXiche().getV());
//        coldIndexTv.setText(life.getGanmao().getV());
//        sportIndexTv.setText(life.getYundong().getV());
//        raysIndexTv.setText(life.getZiwaixian().getV());
        List<WeatherBean.ResultDTO.FutureDTO> futureDTOList = weatherBean.getResult().getFuture();
        futureDTOList.remove(0);
        for (int i = 0; i < futureDTOList.size(); i++) {

        }
    }

    private void initView(View view) {
        tempTv = view.findViewById(R.id.frag_tv_current_temperature);
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.frag_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);
        tempRangeTv = view.findViewById(R.id.frag_tv_temp_range);
        dateTv = view.findViewById(R.id.frag_tv_date);
        dressIndexTv = view.findViewById(R.id.frag_tv_dress);
        carIndexTv = view.findViewById(R.id.frag_tv_car);
        coldIndexTv = view.findViewById(R.id.frag_tv_cold);
        sportIndexTv = view.findViewById(R.id.frag_tv_sport);
        raysIndexTv = view.findViewById(R.id.frag_tv_rays);
        dayIv = view.findViewById(R.id.frag_iv_day);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        dressIndexTv.setOnClickListener(this);
        carIndexTv.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frag_tv_dress:

                break;
            case R.id.frag_tv_car:

                break;
            case R.id.frag_tv_cold:

                break;
            case R.id.frag_tv_sport:

                break;
            case R.id.frag_tv_rays:

                break;
        }
    }
}