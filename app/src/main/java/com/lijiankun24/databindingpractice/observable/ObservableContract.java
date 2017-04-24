package com.lijiankun24.databindingpractice.observable;

import android.content.Context;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.view.View;
import android.widget.TextView;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.common.model.Student;

import java.util.List;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */
interface ObservableContract {

    interface ObservablePresenter extends BasePresenter {
        void changeTeacher(Context context, ObservableTeacher teacher);

        void changeText(View view, List<String> stringList);

        void changeText(View view, String text);

        void changeText(ObservableArrayList<Student> studentObservableList);
    }

    interface ObservableView extends BaseView<ObservablePresenter> {

    }
}


