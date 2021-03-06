package com.lijiankun24.databindingpractice.main;

import android.content.Intent;
import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.databinding.ActivityMainBinding;
import com.lijiankun24.databindingpractice.layout.LayoutActivity;
import com.lijiankun24.databindingpractice.observable.ObservableActivity;
import com.lijiankun24.databindingpractice.recyclerview.RecyclerViewActivity;
import com.lijiankun24.databindingpractice.viewstub.ViewStubActivity;

public class MainActivity extends BaseActivity implements MainContract.View {

    private ActivityMainBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityMainBinding) {
            mBinding = (ActivityMainBinding) binding;
            new MainPresenter(this);
        }
    }

    @Override
    public void initView() {
        initToolbar(mBinding.includeToolbar.toolbar, false, R.string.app_name);
    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        mBinding.setMainPresenter(presenter);
    }

    @Override
    public void toLayoutActivity() {
        startActivity(new Intent(MainActivity.this, LayoutActivity.class));
    }

    @Override
    public void toObservableActivity() {
        startActivity(new Intent(MainActivity.this, ObservableActivity.class));
    }

    @Override
    public void toRecyclerViewActivity() {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    @Override
    public void toViewStubActivity() {
        startActivity(new Intent(MainActivity.this, ViewStubActivity.class));
    }
}
