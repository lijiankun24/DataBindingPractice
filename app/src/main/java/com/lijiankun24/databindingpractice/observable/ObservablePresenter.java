package com.lijiankun24.databindingpractice.observable;

import android.databinding.ObservableArrayList;
import android.view.View;
import android.widget.TextView;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.model.Student;

import java.util.List;

/**
 * ObservablePresenter.java
 * <p>
 * Created by lijiankun on 17/4/24.
 */

public class ObservablePresenter implements ObservableContract.ObservablePresenter {

    private int index = -1;

    private int studentNum = 1;

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
        studentObservableList.add(0, new Student("Num " + studentNum, studentNum, "PhoneNum " + studentNum, false));
        studentNum++;
    }
}
