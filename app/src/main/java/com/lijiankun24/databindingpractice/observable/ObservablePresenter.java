package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;

import com.lijiankun24.databindingpractice.data.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.data.model.Student;

/**
 * ObservablePresenter.java
 * <p>
 * Created by lijiankun on 17/4/24.
 */

public class ObservablePresenter implements ObservableContract.Presenter {

    private ObservableContract.View mView = null;

    private Student mStudent = null;

    private ObservableTeacher mObservableTeacher = null;

    private ObservableArrayMap<String, Object> mObservableMap = null;

    private ObservableList<String> mObservableList = null;

    public ObservablePresenter(ObservableContract.View view) {
        mView = view;
        mView.initView();
        mView.initListeners();
        mView.setPresenter(this);
    }

    @Override
    public void initData() {
        mStudent = new Student("lijiankun24", 24, "18810554454", true);
        mObservableTeacher = new ObservableTeacher("Mrs Li", "24");
        mObservableMap = new ObservableArrayMap<>();
        mObservableMap.put("firstName", "Google");
        mObservableMap.put("lastName", "Baidu");
        mObservableList = new ObservableArrayList<>();
        mObservableList.add("item1");
        mObservableList.add("item2");
        mObservableList.add("item3");
        this.loadStudent();
        this.loadObservableTeacher();
        this.loadObservableMap();
        this.loadObservableList();
    }

    @Override
    public void loadStudent() {
        mView.showStudent(mStudent);
    }

    @Override
    public void loadObservableTeacher() {
        mView.showObservableTeacher(mObservableTeacher);
    }

    @Override
    public void changeStudentIsAdult(boolean isAdult, Student student) {
        if (student == null) {
            return;
        }
        student.isAdult.set(isAdult);
    }

    @Override
    public void changeStudentMobile(String mobile) {
        mStudent.mobile.set(mobile);
    }

    @Override
    public void changeTeacherNameAndAge(String name, String age) {
        if (mObservableTeacher != null) {
            mObservableTeacher.setName(name);
            mObservableTeacher.setAge(age);
        }
    }

    @Override
    public void loadObservableMap() {
        mView.showObservableMap(mObservableMap);
    }

    @Override
    public void loadObservableList() {
        mView.showObservableList(mObservableList);
    }
}
