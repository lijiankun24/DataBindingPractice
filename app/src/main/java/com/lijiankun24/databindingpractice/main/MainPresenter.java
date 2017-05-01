package com.lijiankun24.databindingpractice.main;

/**
 * MainPresenter.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView = null;

    MainPresenter(MainContract.View view) {
        mView = view;
        mView.initView();
        mView.setPresenter(this);
    }

    @Override
    public void toLayoutActivity() {
        mView.toLayoutActivity();
    }

    @Override
    public void toObservableActivity() {
        mView.toObservableActivity();
    }

    @Override
    public void toRecyclerViewActivity() {
        mView.toRecyclerViewActivity();
    }

    @Override
    public void toViewStubActivity() {
        mView.toViewStubActivity();
    }
}
