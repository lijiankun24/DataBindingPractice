package com.lijiankun24.databindingpractice.observable;

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

    public ObservablePresenter(ObservableContract.View view) {
        mView = view;
        mView.initView();
        mView.initListeners();
        mView.setPresenter(this);
    }

    @Override
    public void initData() {
        mStudent = new Student("lijiankun24", 24, "18810554454", true);
        this.loadStudent();
        this.loadObservableTeacher();
    }

    @Override
    public void loadStudent() {
        mView.showStudent(mStudent);
    }

    @Override
    public void loadObservableTeacher() {
        ObservableTeacher teacher = new ObservableTeacher("Mrs Li", "24");
        mView.showObservableTeacher(teacher);
    }

    @Override
    public void changeStudentIsAdult(boolean isAdult, Student student) {
        if (student != null) {
            student.isAdult.set(isAdult);
        }
    }

    @Override
    public void changeStudentMobile(String mobile) {
        if (mStudent != null) {
            mStudent.mobile.set(mobile);
        }
    }

    //    private int index = -1;
//
//    private int studentNum = 1;
//
//    @Override
//    public void changeText(View view, List<String> stringList) {
//        if (stringList.size() <= 0) {
//            return;
//        }
//
//        index = index < 0 ? (stringList.size() - 1) : index;
//        if (index >= 0 && view instanceof TextView) {
//            TextView textView = ((TextView) view);
//            textView.setText(view.getContext().getString(R.string.observable_list1, index, stringList.get(index--)));
//        }
//    }
//
//    @Override
//    public void changeText(ObservableArrayList<Student> studentObservableList) {
//        studentObservableList.add(0, new Student("Num " + studentNum, studentNum, "PhoneNum " + studentNum, false));
//        studentNum++;
//    }
}
