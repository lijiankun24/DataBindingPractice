package com.lijiankun24.databindingpractice.layout;

import com.lijiankun24.databindingpractice.common.model.Course;

/**
 * LayoutPresenter.java
 * <p>
 * Created by lijiankun on 17/4/26.
 */

public class LayoutPresenter implements LayoutContract.Presenter {

    private LayoutContract.View mView = null;

    public LayoutPresenter(LayoutContract.View view) {
        mView = view;
        mView.initView();
        mView.setPresenter(this);
    }

    @Override
    public void loadCourse() {
        Course course = new Course("English", "Monday", "Mr Li");
        mView.showCourse(course);
    }
}
