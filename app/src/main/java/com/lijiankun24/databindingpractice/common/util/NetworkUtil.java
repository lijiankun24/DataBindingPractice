package com.lijiankun24.databindingpractice.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * NetworkUtil.java
 * <p>
 * Created by lijiankun on 17/4/27.
 */

public class NetworkUtil {

    public static void showNetworkInfo(Context context) {
        String msg;
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                msg = mNetworkInfo.isAvailable() ? "Network is available" : "Network is not available";
            } else {
                msg = "Network is not available";
            }
            Toaster.showShort(msg);
        }
    }
}
