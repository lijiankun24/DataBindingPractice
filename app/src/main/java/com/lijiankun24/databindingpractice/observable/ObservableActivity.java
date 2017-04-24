package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayList;
import android.databinding.ViewDataBinding;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.model.Student;
import com.lijiankun24.databindingpractice.databinding.ActivityObservableBinding;

import java.util.ArrayList;
import java.util.List;

public class ObservableActivity extends BaseActivity {

    private ActivityObservableBinding mBinding = null;

    private List<String> mStrinigList = null;

    private ObservableArrayList<Student> mStudentList = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_observable;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityObservableBinding) {
            mBinding = (ActivityObservableBinding) binding;
            initView();
            initDataBindingParams();
        }
    }

    private void initDataBindingParams() {
        setUpData();
        mBinding.setObservablePresenter(new ObservablePresenter());
        if (mStrinigList != null) {
            mBinding.setNameList(mStrinigList);
        }
        if (mStudentList != null) {
            mBinding.setStudentList(mStudentList);
        }
    }

    private void setUpData() {
        mStrinigList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mStrinigList.add("Mr " + i);
        }

        mStudentList = new ObservableArrayList<>();
        mStudentList.add(new Student("Num 0", 0, "" + 0, false));
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
