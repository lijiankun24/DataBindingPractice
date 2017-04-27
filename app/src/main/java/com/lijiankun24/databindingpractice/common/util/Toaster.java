package com.lijiankun24.databindingpractice.common.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Toaster.java
 * <p>
 * Created by lijiankun on 17/4/27.
 */

public class Toaster {

    // Toast
    private static Toast toast;

    public static void init(Context context) {
        if (toast == null) {
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }
    }

    public static void showShort(CharSequence msg) {
        if (toast != null && !TextUtils.isEmpty(msg)) {
            toast.setText(msg);
            toast.show();
        }
    }

    public static void showShort(int resId) {
        if (toast != null && resId != 0) {
            toast.setText(resId);
            toast.show();
        }
    }
}
