package com.lijiankun24.databindingpractice.observable;

import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.databinding.ActivityObservableBinding;

public class ObservableActivity extends BaseActivity {

    private ActivityObservableBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_observable;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityObservableBinding) {
            mBinding = (ActivityObservableBinding) binding;
            initView();
        }
    }

    private void initView() {

    }
}
