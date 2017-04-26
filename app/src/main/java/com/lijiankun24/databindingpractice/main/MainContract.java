package com.lijiankun24.databindingpractice.main;

import android.content.Context;
import android.view.View;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.Student;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

interface MainContract {

    interface MainPresenter extends BasePresenter {
        void saveCourse(View view, Course course);

        void changeUserIsAdult(Context context, Student student, boolean isAdult);

        void toLayoutActivity(Context context);

        void toObservableActivity(Context context);

        void toRecyclerViewActivity(Context context);
    }

    interface MainView extends BaseView<MainPresenter> {

    }
}
