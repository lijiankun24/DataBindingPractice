package com.lijiankun24.databindingpractice.common.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.layout.LayoutActivity;

/**
 * BaseActivity, getLayoutId and initControls is important.
 * <p>
 * Created by lijiankun on 17/4/18.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutId() != 0) {
            ViewDataBinding mBinding = DataBindingUtil.setContentView(this, getLayoutId());
            if (mBinding != null) {
                initControls(mBinding);
            }
        }
    }

    protected abstract int getLayoutId();

    protected abstract void initControls(ViewDataBinding binding);

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                BaseActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
