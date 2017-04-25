package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.common.model.Student;
import com.lijiankun24.databindingpractice.databinding.ActivityObservableBinding;

import java.util.ArrayList;
import java.util.List;

public class ObservableActivity extends BaseActivity {

    private ActivityObservableBinding mBinding = null;

    private List<String> mStrinigList = null;

    private ObservableArrayList<Student> mStudentList = null;

    private ObservableTeacher mTeacher = null;

    private ObservableField<String> mObservableText = null;

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
        if (mTeacher != null) {
            mBinding.setObservableTeacher(mTeacher);
        }
        if (mStrinigList != null) {
            mBinding.setNameList(mStrinigList);
        }
        if (mStudentList != null) {
            mBinding.setStudentList(mStudentList);
        }
        if (mObservableText != null) {
            mBinding.setObservableText(mObservableText);
        }
    }

    private void setUpData() {
        mStrinigList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mStrinigList.add("Mr " + i);
        }

        mStudentList = new ObservableArrayList<>();
        mStudentList.add(new Student("Num 0", 0, "" + 0, false));

        mTeacher = new ObservableTeacher("Mrs Li", "24");

        mObservableText = new ObservableField<>();
    }

    private void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.observable_activity_title);
        }

        mBinding.includeView1.etName.addTextChangedListener(new MyAction());
        mBinding.includeView1.etAge.addTextChangedListener(new MyAction());
        mBinding.etText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence sequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence sequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mObservableText.set(editable.toString());
            }
        });
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

    private class MyAction implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence sequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence sequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            handleInputData();
        }
    }

    private void handleInputData() {
        String name = mBinding.includeView1.etName.getText().toString().trim();
        String age = mBinding.includeView1.etAge.getText().toString().trim();
        if (mTeacher == null) {
            return;
        }
        mTeacher.setName(name);
        mTeacher.setAge(age);
    }
}
