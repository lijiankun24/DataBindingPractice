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

class RecyclerViewPresenter implements RecyclerViewContract.RecyclerViewPresenter {

    private final RecyclerViewContract.RecyclerViewView mView;

    private final GirlsRepository mRepository;

    RecyclerViewPresenter(@NonNull RecyclerViewContract.RecyclerViewView view,
                                 @NonNull GirlsRepository repository) {
        mView = checkNotNull(view, "recyclerViewView cannot be null");
        mRepository = checkNotNull(repository, "girlsRepository cannot be null");

        mView.setPresenter(this);
    }

    @Override
    public void loadDatas() {
        mRepository.getDatas(new GirlsDataSource.LoadGirlsCallback() {
            @Override
            public void onGirlsLoaded(List<Girl> girls) {
                mView.showDatas(girls);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
