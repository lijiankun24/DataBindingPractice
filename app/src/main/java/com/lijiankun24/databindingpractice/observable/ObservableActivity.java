package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.text.Editable;
import android.text.TextWatcher;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.data.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.data.model.Student;
import com.lijiankun24.databindingpractice.databinding.ActivityObservableBinding;

public class ObservableActivity extends BaseActivity implements ObservableContract.View {

    private ActivityObservableBinding mBinding = null;

    private ObservablePresenter mObservablePresenter = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_observable;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityObservableBinding) {
            mBinding = (ActivityObservableBinding) binding;
            mObservablePresenter = new ObservablePresenter(this);
            mObservablePresenter.initData();
        }
    }

    @Override
    public void initView() {
        setSupportActionBar(mBinding.includeToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.observable_activity_title);
        }
    }

    @Override
    public void initListeners() {
        mBinding.etStudentMobile.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence sequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence sequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mObservablePresenter.changeStudentMobile(mBinding.etStudentMobile.getText().toString().trim());
            }
        });
        mBinding.includeView1.etName.addTextChangedListener(new CustomTextWatcher());
        mBinding.includeView1.etAge.addTextChangedListener(new CustomTextWatcher());
    }

    @Override
    public void setPresenter(ObservableContract.Presenter presenter) {
        mBinding.setObservablePresenter((ObservablePresenter) presenter);
    }

    @Override
    public void showStudent(Student student) {
        mBinding.setStudent(student);
    }

    @Override
    public void showObservableTeacher(ObservableTeacher observableTeacher) {
        mBinding.setObservableTeacher(observableTeacher);
    }

    @Override
    public void showObservableMap(ObservableArrayMap<String, Object> map) {
        mBinding.setObservableMap(map);
    }

    @Override
    public void showObservableList(ObservableList<String> list) {
        mBinding.setObservableList(list);
    }

    private class CustomTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence sequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence sequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (mObservablePresenter != null) {
                mObservablePresenter.changeTeacherNameAndAge(mBinding.includeView1.etName.getText().toString().trim(),
                        mBinding.includeView1.etAge.getText().toString().trim());
            }
        }
    }
}
