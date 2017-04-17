package com.lijiankun24.databindingpractice.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.databinding.ActivityMainBinding;
import com.lijiankun24.databindingpractice.model.Course;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Course course = new Course("Englist", "2017/4/17", "lijiankun24");
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setCourse(course);
    }

    @Override
    public void onClick(View view) {

    }
}
