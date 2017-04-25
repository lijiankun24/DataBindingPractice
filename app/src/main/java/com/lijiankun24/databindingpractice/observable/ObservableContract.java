package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayList;
import android.view.View;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Student;

import java.util.List;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */
interface ObservableContract {

    interface ObservablePresenter extends BasePresenter {
        void changeText(View view, List<String> stringList);

        void changeText(ObservableArrayList<Student> studentObservableList);
    }

    interface ObservableView extends BaseView<ObservablePresenter> {
    }
}


