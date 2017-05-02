package com.lijiankun24.databindingpractice.common.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Utils.java
 * <p>
 * Created by lijiankun on 17/5/2.
 */

public class Utils {

    public static void sendMail(Context context, String mailUrl) {
        Intent data = new Intent(Intent.ACTION_SENDTO);
        data.setData(Uri.parse("mailto:" + mailUrl));
        context.startActivity(data);
    }

    public static  void toBrower(Context context, String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        context.startActivity(intent);
    }

}
