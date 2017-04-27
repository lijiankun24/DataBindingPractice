package com.lijiankun24.databindingpractice.layout;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.Student;

/**
 * LayoutContract.java
 * <p>
 * Created by lijiankun on 17/4/26.
 */

public interface LayoutContract {

    interface Presenter extends BasePresenter {
        void loadCourse();

        void loadStudent();

        void showMethodReferences(android.view.View view);

        void showListenerBindings(android.view.View view);
    }

    interface View extends BaseView<Presenter> {
        void showCourse(Course course);

        void showStudent(Student student);

        void showMethodReferences(Course course);

        void showListenerBindings(Course course);
    }
}
