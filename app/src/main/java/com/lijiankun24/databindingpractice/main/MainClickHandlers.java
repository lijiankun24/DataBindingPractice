package com.lijiankun24.databindingpractice.main;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.lijiankun24.databindingpractice.R;

import java.lang.ref.WeakReference;

/**
 * MainClickHandlers.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

public class MainClickHandlers {

    private WeakReference<Activity> mActivityWR = null;

    public MainClickHandlers(Activity activity) {
        if (mActivityWR == null || mActivityWR.get() == null) {
            mActivityWR = new WeakReference<>(activity);
        }
    }

    public void onNameClick(View v) {
        Toaster(R.string.name);
    }

    public void onTimeClick(View v) {
        Toaster(R.string.time);
    }

    public void onTeacherClick(View v) {
        Toaster(R.string.teacher);
    }

    private void Toaster(int resInt) {
        if (mActivityWR == null || mActivityWR.get() == null) {
            return;
        }
        Toast.makeText(mActivityWR.get(), resInt, Toast.LENGTH_SHORT).show();
    }
}
