package com.lijiankun24.databindingpractice.viewstub;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.util.Toaster;
import com.lijiankun24.databindingpractice.databinding.ActivityViewStubBinding;
import com.lijiankun24.databindingpractice.databinding.LayoutViewStubBinding;

public class ViewStubActivity extends BaseActivity implements ViewStubContract.View {

    private ActivityViewStubBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_view_stub;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityViewStubBinding) {
            mBinding = (ActivityViewStubBinding) binding;
            new ViewStubPresenter(this);
        }
    }

    @Override
    public void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.viewstub_activity_title);
        }

        mBinding.viewStub.setOnInflateListener((viewStub, view) -> {
            LayoutViewStubBinding mStubBinding = DataBindingUtil.findBinding(view);
            mStubBinding.tvViewStub.setOnClickListener((view1 -> showClickToast()));
        });

        if (!mBinding.viewStub.isInflated()) {
            mBinding.viewStub.getViewStub().inflate();
        }
    }

    @Override
    public void setPresenter(ViewStubContract.Presenter presenter) {
        mBinding.setViewStubPresenter((ViewStubPresenter) presenter);
    }

    @Override
    public void showClickToast() {
        Toaster.showShort(R.string.viewstub_toast_content);
    }
}
