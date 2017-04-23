package com.lijiankun24.databindingpractice.recyclerview;

import android.databinding.ViewDataBinding;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.databinding.ActivityRecyclerViewBinding;

public class RecyclerViewActivity extends BaseActivity {

    private ActivityRecyclerViewBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recycler_view;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityRecyclerViewBinding) {
            mBinding = (ActivityRecyclerViewBinding) binding;
            initView();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                RecyclerViewActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.recyclerview_activity_title);
        }
    }
}
