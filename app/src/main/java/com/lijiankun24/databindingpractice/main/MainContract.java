package com.lijiankun24.databindingpractice.main;

import android.content.Context;
import android.view.View;

import com.lijiankun24.databindingpractice.base.BasePresenter;
import com.lijiankun24.databindingpractice.base.BaseView;
import com.lijiankun24.databindingpractice.model.Course;
import com.lijiankun24.databindingpractice.model.User;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

interface MainContract {

    interface MainPresenter extends BasePresenter {
        void saveCourse(View view, Course course);

        void changeUserIsAdult(Context context, User user, boolean isAdult);
    }

    interface MainView extends BaseView<MainPresenter> {

    }
}
