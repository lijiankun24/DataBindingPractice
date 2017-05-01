package com.lijiankun24.databindingpractice.viewstub;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;

/**
 * ViewStubContract.java
 * <p>
 * Created by lijiankun on 17/5/1.
 */

interface ViewStubContract {

    interface Presenter extends BasePresenter{
    }

    interface View extends BaseView<Presenter>{
        void showClickToast();
    }
}
