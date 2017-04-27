package com.lijiankun24.databindingpractice.layout;

import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.Student;
import com.lijiankun24.databindingpractice.common.util.Toaster;

/**
 * LayoutActivity.java
 * <p>
 * Created by lijiankun on 17/4/26.
 */

public class LayoutActivity extends BaseActivity implements LayoutContract.View {

    private ActivityLayoutBinding mBinding = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_layout;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityLayoutBinding) {
            mBinding = (ActivityLayoutBinding) binding;
            LayoutPresenter mPresenter = new LayoutPresenter(this);
            mPresenter.loadCourse();
            mPresenter.loadStudent();
        }
    }

    @Override
    public void showCourse(Course course) {
        mBinding.setCourse(course);
    }

    @Override
    public void showStudent(Student student) {
        mBinding.setStudent(student);
    }

    @Override
    public void showMethodReferences(Course course) {
        String msg = "Toast by method references \n the name of course is " + course.name;
        Toaster.showShort(msg);
    }

    @Override
    public void showListenerBindings(Course course) {
        String msg = "Toast by listener bindings \n the time of course is " + course.time;
        Toaster.showShort(msg);
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
        mBinding.setLayoutPresenter(((LayoutPresenter) presenter));
    }

}
