package com.lijiankun24.databindingpractice.layout;

import android.databinding.ViewDataBinding;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.databinding.ActivityLayoutBinding;

public class LayoutActivity extends BaseActivity implements LayoutContract.View {

    private LayoutPresenter mPresenter = null;

    private ActivityLayoutBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_layout;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityLayoutBinding) {
            mBinding = (ActivityLayoutBinding) binding;
            mPresenter = new LayoutPresenter(this);
            mPresenter.loadCourse();
        }
    }

    @Override
    public void showCourse(Course course) {
        mBinding.setCourse(course);
    }

    @Override
    public void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.layout_activity_title);
        }
    }

    @Override
    public void setPresenter(LayoutContract.Presenter presenter) {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                LayoutActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
