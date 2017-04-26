package com.lijiankun24.databindingpractice.main;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lijiankun24.databindingpractice.common.model.Course;
import com.lijiankun24.databindingpractice.common.model.Student;
import com.lijiankun24.databindingpractice.layout.LayoutActivity;
import com.lijiankun24.databindingpractice.observable.ObservableActivity;
import com.lijiankun24.databindingpractice.recyclerview.RecyclerViewActivity;

/**
 * MainPresenter.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

public class MainPresenter implements MainContract.MainPresenter {

    @Override
    public void toLayoutActivity(Context context) {
        context.startActivity(new Intent(context, LayoutActivity.class));
    }

    @Override
    public void toObservableActivity(Context context) {
        context.startActivity(new Intent(context, ObservableActivity.class));
    }

    @Override
    public void toRecyclerViewActivity(Context context) {
        context.startActivity(new Intent(context, RecyclerViewActivity.class));
    }

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

    @Override
    public void changeUserIsAdult(Context context, Student student, boolean isAdult) {
        student.isAdult.set(isAdult);
        Toast.makeText(context, "TextView " + (isAdult ? "visible" : "invisible"),
                Toast.LENGTH_SHORT).show();
    }
}
