package com.lijiankun24.databindingpractice.data.source.remote;

import android.os.Handler;
import android.support.annotation.NonNull;

import com.google.common.collect.Lists;

import com.lijiankun24.databindingpractice.data.Girl;
import com.lijiankun24.databindingpractice.data.source.GirlsDataSource;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * GirlsRemoteDataSource.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class GirlsRemoteDataSource implements GirlsDataSource {

    private static final int SERVICE_LATENCY_IN_MILLIS = 500;

    private static GirlsRemoteDataSource INSTANCE = null;

    private static final Map<String, Girl> GIRLS_SERVICE_DATA;

    static {
        GIRLS_SERVICE_DATA = new LinkedHashMap<>();
        addGirl("Girl 1", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-24-18013547_1532023163498554_215541963087151104_n.jpg");
        addGirl("Girl 2", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-24-18094714_158946097967074_5909424912493182976_n.jpg");
    }

    private GirlsRemoteDataSource() {
    }

    public static GirlsRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GirlsRemoteDataSource();
        }
        return INSTANCE;
    }

    private static void addGirl(String name, String avatar) {
        Girl girl = new Girl(name, avatar);
        GIRLS_SERVICE_DATA.put(girl.getId(), girl);
    }

    @Override
    public void getDatas(@NonNull LoadGirlsCallback callback) {
        Handler handler = new Handler();
        handler.postDelayed(() -> callback.onGirlsLoaded(Lists.newArrayList(GIRLS_SERVICE_DATA.values()))
                , SERVICE_LATENCY_IN_MILLIS);
    }
}
