package com.lijiankun24.databindingpractice.layout;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Course;

/**
 * LayoutContract.java
 * <p>
 * Created by lijiankun on 17/4/26.
 */

public interface LayoutContract {

    interface Presenter extends BasePresenter{
        void loadCourse();
    }

    interface View extends BaseView<Presenter>{
        void showCourse(Course course);
    }
}
