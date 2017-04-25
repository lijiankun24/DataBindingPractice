package com.lijiankun24.databindingpractice.data.source;

import android.support.annotation.NonNull;

import com.lijiankun24.databindingpractice.data.Girl;

import java.util.List;

/**
 * GirlsRepository.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class GirlsRepository implements GirlsDataSource {

    private static GirlsRepository INSTANCE = null;

    private final GirlsDataSource mGirlsRemoteDataSource;

    private final GirlsDataSource mGirlsLocalDataSource;

    private GirlsRepository(@NonNull GirlsDataSource girlsRemoteDataSource,
                            @NonNull GirlsDataSource girlsLocalDataSource) {
        mGirlsRemoteDataSource = girlsRemoteDataSource;
        mGirlsLocalDataSource = girlsLocalDataSource;
    }

    public static GirlsRepository getInstance(GirlsDataSource girlsRemoteDataSource,
                                              GirlsDataSource girlsLocalDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new GirlsRepository(girlsRemoteDataSource, girlsLocalDataSource);
        }
        return INSTANCE;
    }

    @Override
    public void getDatas(@NonNull LoadGirlsCallback callback) {
        mGirlsLocalDataSource.getDatas(new LoadGirlsCallback() {
            @Override
            public void onGirlsLoaded(List<Girl> girls) {
                callback.onGirlsLoaded(girls);
            }

            @Override
            public void onDataNotAvailable() {
                mGirlsRemoteDataSource.getDatas(callback);
            }
        });
    }
}
