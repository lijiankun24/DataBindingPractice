package com.lijiankun24.databindingpractice.recyclerview;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * ImageViewAttrAdapter.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class ImageViewAttrAdapter {

    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView imageView, String url, Drawable error) {
        if (imageView == null || TextUtils.isEmpty(url)) {
            return;
        }
        Glide.with(imageView.getContext())
                .load(url)
                .error(error)
                .centerCrop()
                .into(imageView);
    }
}
