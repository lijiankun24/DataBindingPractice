package com.lijiankun24.databindingpractice.main;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * MainPresenter.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

public class MainPresenter implements MainContract.MainPresenter {

    @Override
    public void saveCourse(View view, Course course) {
        if (course == null) {
            return;
        }
        Log.i("lijk", "name is " + course.name);
        Log.i("lijk", "time is " + course.time);
        Log.i("lijk", "teacher is " + course.teacher);
        if (view instanceof TextView) {
            Log.i("lijk", "text is " + ((TextView) view).getText());
        }
    }
}
