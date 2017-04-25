package com.lijiankun24.databindingpractice.recyclerview;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * ImageViewAttrAdapter.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class ImageViewAttrAdapter {

    @BindingAdapter({"imageUrl", "placeHolder", "error"})
    public static void loadImage(ImageView imageView, String url, Drawable holderDrawable, Drawable errorDrawable) {
        Log.i("lijk", "loadImage url is " + url);
        Glide.with(imageView.getContext())
                .load(url)
                .error(errorDrawable)
                .centerCrop()
                .into(imageView);
    }
}
