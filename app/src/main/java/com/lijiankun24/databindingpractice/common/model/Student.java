package com.lijiankun24.databindingpractice.common.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Student.java
 * <p>
 * Created by lijiankun on 17/4/19.
 */

public class Student {

    public final String name;

    public final int age;

    public final ObservableField<String> mobileNum;

    public ObservableBoolean isAdult;

    public Student(String name, int age, String mobileNum, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.mobileNum = new ObservableField<>(mobileNum);
        this.isAdult = new ObservableBoolean(isAdult);
    }
}
