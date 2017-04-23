package com.lijiankun24.databindingpractice.observable;

import android.databinding.ViewDataBinding;
import android.view.MenuItem;

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                ObservableActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.observable_activity_title);
        }
    }
}
