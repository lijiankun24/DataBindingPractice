package com.lijiankun24.databindingpractice.main;

import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.Student;
import com.lijiankun24.databindingpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding mMainBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityMainBinding) {
            mMainBinding = (ActivityMainBinding) binding;
            initDataBindingParams();
            initView();
        }
    }

    private void initDataBindingParams() {
        mMainBinding.setCourse(new Course("English", "2017/4/17", "lijiankun24"));
        mMainBinding.setStudent(new Student("lijiankun24", 24, "", true));
        mMainBinding.setHandler(new MainClickHandlers(MainActivity.this));
        mMainBinding.setMainPresenter(new MainPresenter());
    }

    private void initView() {
        setSupportActionBar(mMainBinding.includeToolbar.toolbar);
    }
}
