package com.lijiankun24.databindingpractice.data.source.local;

import android.content.Context;
import android.support.annotation.NonNull;

import com.lijiankun24.databindingpractice.data.source.GirlsDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * GirlsLocalDataSource.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class GirlsLocalDataSource implements GirlsDataSource {

    private static GirlsLocalDataSource INSTANCE;

    private Context mContext;

    // Prevent direct instantiation.
    private GirlsLocalDataSource(@NonNull Context context) {
        checkNotNull(context);
        mContext = context;
    }

    public static GirlsLocalDataSource getInstance(@NonNull Context context) {
        if (INSTANCE == null) {
            INSTANCE = new GirlsLocalDataSource(context);
        }
        return INSTANCE;
    }

    @Override
    public void getDatas(@NonNull LoadGirlsCallback callback) {
        callback.onDataNotAvailable();
    }
}
