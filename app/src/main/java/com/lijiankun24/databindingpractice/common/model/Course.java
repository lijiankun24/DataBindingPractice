package com.lijiankun24.databindingpractice.common.model;

/**
 * Course.java
 * <p>
 * Created by lijiankun on 17/4/17.
 */

public class Course {
    public final String name;

    public final String time;

    public final String teacher;

    public Course(String name, String time, String teacher) {
        this.name = name;
        this.time = time;
        this.teacher = teacher;
    }
}
