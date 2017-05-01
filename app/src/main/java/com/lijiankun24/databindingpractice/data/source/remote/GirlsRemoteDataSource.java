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
        addGirl("Girl1", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-28-18094719_120129648541065_8356500748640452608_n.jpg");
        addGirl("Girl2", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-27-17934080_117414798808566_8957027985114791936_n.jpg?imageslim");
        addGirl("Girl3", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-25-13651793_897557617014845_571817176_n.jpg");
        addGirl("Girl4", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-24-18013547_1532023163498554_215541963087151104_n.jpg");
        addGirl("Girl5", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-24-18094714_158946097967074_5909424912493182976_n.jpg");
        addGirl("Girl6", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-21-18013964_1389732981073150_4044061109068496896_n.jpg");
        addGirl("Girl7", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-20-17932350_1238028809599424_2089669844847820800_n.jpg");
        addGirl("Girl8", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-19-17881407_1845958195665029_1132383288824954880_n.jpg");
        addGirl("Girl9", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-18-17882540_190116561497334_440657494176432128_n.jpg");
        addGirl("Girl10", "http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-16-17934400_1738549946443321_2924146161843437568_n.jpg");
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
