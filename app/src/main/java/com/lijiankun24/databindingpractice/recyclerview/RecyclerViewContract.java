package com.lijiankun24.databindingpractice.recyclerview;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.data.Girl;

import java.util.List;

/**
 * MainContract.java
 * <p>
 * Created by lijiankun on 17/4/18.
 */
interface RecyclerViewContract {

    interface RecyclerViewPresenter extends BasePresenter {
        void loadDatas();
    }

    interface RecyclerViewView extends BaseView<RecyclerViewPresenter> {
        void showDatas(List<Girl> girls);
    }
}


