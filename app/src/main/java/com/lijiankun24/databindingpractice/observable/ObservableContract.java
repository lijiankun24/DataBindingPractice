package com.lijiankun24.databindingpractice.observable;

import android.content.Context;
import android.view.View;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.common.model.Student;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */
interface ObservableContract {

    interface ObservablePresenter extends BasePresenter {
        void changeTeacher(Context context, ObservableTeacher teacher);
    }

    interface ObservableView extends BaseView<ObservablePresenter> {

    }
}


