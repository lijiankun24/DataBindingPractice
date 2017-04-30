package com.lijiankun24.databindingpractice.data.model;

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

    public final ObservableField<String> mobile;

    public final ObservableBoolean isAdult;

    public Student(String name, int age, String mobile, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.mobile = new ObservableField<>(mobile);
        this.isAdult = new ObservableBoolean(isAdult);
    }
}
