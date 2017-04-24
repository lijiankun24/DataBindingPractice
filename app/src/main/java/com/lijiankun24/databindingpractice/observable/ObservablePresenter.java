package com.lijiankun24.databindingpractice.observable;

import android.content.Context;
import android.databinding.ObservableArrayList;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.model.ObservableTeacher;
import com.lijiankun24.databindingpractice.common.model.Student;

import java.util.List;

/**
 * ObservablePresenter.java
 * <p>
 * Created by lijiankun on 17/4/24.
 */

public class ObservablePresenter implements ObservableContract.ObservablePresenter {

    private int index = -1;

    private int studentNum = 0;

    @Override
    public void changeTeacher(Context context, ObservableTeacher teacher) {
    }

    @Override
    public void changeText(View view, List<String> stringList) {
        if (stringList.size() <= 0) {
            return;
        }

        index = index < 0 ? (stringList.size() - 1) : index;
        if (index >= 0 && view instanceof TextView) {
            TextView textView = ((TextView) view);
            textView.setText(view.getContext().getString(R.string.observable_list1, index, stringList.get(index--)));
        }
    }

    @Override
    public void changeText(ObservableArrayList<Student> studentObservableList) {
        studentObservableList.add(new Student("Num " + studentNum, studentNum, "PhoneNum " + studentNum, false));
        studentNum++;
    }

    @Override
    public void changeText(View view, String text) {
        Log.i("lijk", " === outer ");
        if (view instanceof TextView) {
            Log.i("lijk", " === inner " + text);
            TextView textView = ((TextView) view);
            textView.setText(text);
        }
    }
}
