package com.lijiankun24.databindingpractice.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.databinding.ActivityMainBinding;
import com.lijiankun24.databindingpractice.model.Course;
import com.lijiankun24.databindingpractice.model.User;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mMainBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initDataBindingParams();
        initView();
    }

    private void initDataBindingParams() {
        mMainBinding.setCourse(new Course("English", "2017/4/17", "lijiankun24"));
        mMainBinding.setUser(new User("lijiankun24", 24, true));
        mMainBinding.setHandler(new MainClickHandlers(MainActivity.this));
        mMainBinding.setMainPresenter(new MainPresenter());
    }

    private void initView() {
        setSupportActionBar(mMainBinding.includeToolbar.toolbar);
    }
}
