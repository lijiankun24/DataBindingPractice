package com.lijiankun24.databindingpractice.model;

import android.databinding.ObservableBoolean;

/**
 * User.java
 * <p>
 * Created by lijiankun on 17/4/19.
 */

public class User {

    public final String name;

    public final int age;

    public ObservableBoolean isAdult;

    public User(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = new ObservableBoolean(isAdult);
    }
}
