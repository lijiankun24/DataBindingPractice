package com.lijiankun24.databindingpractice.recyclerview;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.data.Girl;
import com.lijiankun24.databindingpractice.data.Injection;
import com.lijiankun24.databindingpractice.databinding.ActivityRecyclerViewBinding;

import java.util.List;

public class RecyclerViewActivity extends BaseActivity implements RecyclerViewContract.RecyclerViewView {

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
            initView();
            initDataBindingParams();
        }
    }

    @Override
    public void setPresenter(RecyclerViewContract.RecyclerViewPresenter presenter) {
    }

    @Override
    public void showDatas(List<Girl> girls) {
        Log.i("lijk", "girls.size ====== " + girls.size());
        mAdapter.setGirls(girls);
    }

    private void initDataBindingParams() {
        mLayoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        mBinding.setRecyclerViewActivity(RecyclerViewActivity.this);
        mAdapter = new CustomRecyclerViewAdapter(RecyclerViewActivity.this);
        mBinding.rv.setAdapter(mAdapter);

        RecyclerViewPresenter presenter = new RecyclerViewPresenter(RecyclerViewActivity.this,
                Injection.provideGirlsRepository(RecyclerViewActivity.this));
        presenter.loadDatas();
    }

    private void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.recyclerview_activity_title);
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
}
