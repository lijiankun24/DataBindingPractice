package com.lijiankun24.databindingpractice.main;

import android.view.View;

import com.lijiankun24.databindingpractice.BasePresenter;
import com.lijiankun24.databindingpractice.BaseView;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

interface MainContract {

    interface MainPresenter extends BasePresenter {
        void saveCourse(View view, Course course);
    }

    interface MainView extends BaseView<MainPresenter> {

    }
}
