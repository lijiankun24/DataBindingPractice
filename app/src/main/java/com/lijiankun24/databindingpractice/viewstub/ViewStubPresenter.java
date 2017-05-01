package com.lijiankun24.databindingpractice.viewstub;

/**
 * ViewStubPresenter.java
 * <p>
 * Created by lijiankun on 17/5/1.
 */

public class ViewStubPresenter implements ViewStubContract.Presenter {

    ViewStubPresenter(ViewStubContract.View view) {
        view.initView();
    }
}
