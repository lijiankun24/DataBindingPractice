package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;

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

        void loadObservableMap();

        void loadObservableList();

        void changeStudentIsAdult(boolean isAdult, Student student);

        void changeStudentMobile(String mobile);

        void changeTeacherNameAndAge(String name, String age);
    }

    interface View extends BaseView<Presenter> {

        void initListeners();

        void showStudent(Student student);

        void showObservableTeacher(ObservableTeacher observableTeacher);

        void showObservableMap(ObservableArrayMap<String, Object> map);

        void showObservableList(ObservableList<String> list);
    }
}


