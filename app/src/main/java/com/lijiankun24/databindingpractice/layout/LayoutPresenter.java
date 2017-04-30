package com.lijiankun24.databindingpractice.layout;

import android.view.View;

import com.lijiankun24.databindingpractice.data.model.Course;
import com.lijiankun24.databindingpractice.data.model.Student;

/**
 * LayoutPresenter.java
 * <p>
 * Created by lijiankun on 17/4/26.
 */

public class LayoutPresenter implements LayoutContract.Presenter {

    private LayoutContract.View mView = null;

    private Course mCourse = null;

    private Student mStudent = null;

    LayoutPresenter(LayoutContract.View view) {
        mView = view;
        mView.initView();
        mView.setPresenter(this);
        mCourse = new Course("English", "Monday", "Mr Li");
        mStudent = new Student("lijiankun24", 24, "18812345678", true);
    }

    @Override
    public void loadCourse() {
        mView.showCourse(mCourse);
    }

    @Override
    public void loadStudent() {
        mView.showStudent(mStudent);
    }

    @Override
    public void showMethodReferences(View view) {
        mView.showMethodReferences(mCourse);
    }

    @Override
    public void showListenerBindings(View view) {
        mView.showListenerBindings(mCourse);
    }
}
