package com.lijiankun24.databindingpractice.main;

import android.content.Context;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */

interface MainContract {

    interface Presenter extends BasePresenter {

        void toLayoutActivity();

        void toObservableActivity();

        void toRecyclerViewActivity();
    }

    interface View extends BaseView<MainPresenter> {
        void toLayoutActivity();

        void toObservableActivity();

        void toRecyclerViewActivity();
    }
}
