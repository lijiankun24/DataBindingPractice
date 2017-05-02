package com.lijiankun24.databindingpractice.recyclerview;

import android.support.annotation.NonNull;

import com.lijiankun24.databindingpractice.data.Girl;
import com.lijiankun24.databindingpractice.data.source.GirlsDataSource;
import com.lijiankun24.databindingpractice.data.source.GirlsRepository;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * RecyclerViewPresenter.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

class RecyclerViewPresenter implements RecyclerViewContract.Presenter {

    private final RecyclerViewContract.View mView;

    private final GirlsRepository mRepository;

    RecyclerViewPresenter(@NonNull RecyclerViewContract.View view,
                                 @NonNull GirlsRepository repository) {
        mView = checkNotNull(view, "recyclerViewView cannot be null");
        mRepository = checkNotNull(repository, "girlsRepository cannot be null");
        mView.setPresenter(this);
        mView.initView();
    }

    @Override
    public void loadDatas() {
        mView.showLoading();
        mRepository.getDatas(new GirlsDataSource.LoadGirlsCallback() {
            @Override
            public void onGirlsLoaded(List<Girl> girls) {
                mView.showLoaded();
                mView.showDatas(girls);
            }

            @Override
            public void onDataNotAvailable() {
                mView.showLoaded();
            }
        });
    }
}
