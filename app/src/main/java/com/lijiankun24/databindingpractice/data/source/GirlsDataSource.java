package com.lijiankun24.databindingpractice.data.source;

import android.support.annotation.NonNull;

import com.lijiankun24.databindingpractice.data.Girl;

import java.util.List;

/**
 * GirlsDataSource.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public interface GirlsDataSource {

    interface LoadGirlsCallback {
        void onGirlsLoaded(List<Girl> girls);

        void onDataNotAvailable();
    }

    void getDatas(@NonNull LoadGirlsCallback callback);
}
