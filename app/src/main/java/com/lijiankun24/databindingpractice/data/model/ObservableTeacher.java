package com.lijiankun24.databindingpractice.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lijiankun24.databindingpractice.BR;

/**
 * ObservableTeacher.java
 * <p>
 * Created by lijiankun on 17/4/21.
 */

public class ObservableTeacher extends BaseObservable{

    private String name;

    private String age;

    public ObservableTeacher(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
