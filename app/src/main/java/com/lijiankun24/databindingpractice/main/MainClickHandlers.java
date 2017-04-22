package com.lijiankun24.databindingpractice.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.observable.ObservableActivity;

/**
 * MainClickHandlers.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

public class MainClickHandlers {

    private Activity mActivity;

    public MainClickHandlers(Activity activity) {
        mActivity = activity;
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
        if (mActivity == null) {
            return;
        }
        Toast.makeText(mActivity, resInt, Toast.LENGTH_SHORT).show();
    }
}
