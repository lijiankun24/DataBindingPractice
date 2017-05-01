package com.lijiankun24.databindingpractice.recyclerview;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.data.Girl;
import com.lijiankun24.databindingpractice.data.Injection;
import com.lijiankun24.databindingpractice.databinding.ActivityRecyclerViewBinding;

import java.util.List;

public class RecyclerViewActivity extends BaseActivity implements RecyclerViewContract.View {

    private ActivityRecyclerViewBinding mBinding = null;

    public LinearLayoutManager mLayoutManager = null;

    private CustomRecyclerViewAdapter mAdapter = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recycler_view;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityRecyclerViewBinding) {
            mBinding = (ActivityRecyclerViewBinding) binding;
            RecyclerViewPresenter presenter = new RecyclerViewPresenter(RecyclerViewActivity.this,
                    Injection.provideGirlsRepository(RecyclerViewActivity.this));
            presenter.loadDatas();
        }
    }

    @Override
    public void setPresenter(RecyclerViewContract.Presenter presenter) {
    }

    @Override
    public void showDatas(List<Girl> girls) {
        mAdapter.setGirls(girls);
    }

    @Override
    public void initView() {
        initToolbar(mBinding.includeToolbar.toolbar, true, R.string.recyclerview_activity_title);
        initDataBindingParams();
    }

    private void initDataBindingParams() {
        mLayoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        mBinding.setRecyclerViewActivity(RecyclerViewActivity.this);
        mAdapter = new CustomRecyclerViewAdapter(RecyclerViewActivity.this);
        mBinding.rv.setAdapter(mAdapter);
    }
}
