package com.lijiankun24.databindingpractice.data;

import android.content.Context;

import com.lijiankun24.databindingpractice.data.source.GirlsRepository;
import com.lijiankun24.databindingpractice.data.source.local.GirlsLocalDataSource;
import com.lijiankun24.databindingpractice.data.source.remote.GirlsRemoteDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Injection.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class Injection {

    public static GirlsRepository provideGirlsRepository(Context context) {
        checkNotNull(context);
        return GirlsRepository.getInstance(GirlsRemoteDataSource.getInstance(),
                GirlsLocalDataSource.getInstance(context));
    }
}
