package com.lijiankun24.databindingpractice.viewstub;

/**
 * ViewStubPresenter.java
 * <p>
 * Created by lijiankun on 17/5/1.
 */

public class ViewStubPresenter implements ViewStubContract.Presenter {

    private ViewStubContract.View mView = null;

    public ViewStubPresenter(ViewStubContract.View view) {
        mView = view;
        mView.initView();
    }

    @Override
    public void showClickToast() {
        mView.showClickToast();
    }
}
