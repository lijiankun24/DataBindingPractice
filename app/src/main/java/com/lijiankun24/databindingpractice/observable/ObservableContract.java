package com.lijiankun24.databindingpractice.observable;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.data.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.data.model.Student;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */
interface ObservableContract {

    interface Presenter extends BasePresenter {

        void initData();

        void loadStudent();

        void loadObservableTeacher();

        void changeStudentIsAdult(boolean isAdult, Student student);

        void changeStudentMobile(String mobile);
    }

    interface View extends BaseView<Presenter> {

        void initListeners();

        void showStudent(Student student);

        void showObservableTeacher(ObservableTeacher observableTeacher);
    }
}


