package com.lijiankun24.databindingpractice.recyclerview;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.lijiankun24.databindingpractice.BR;
import com.lijiankun24.databindingpractice.data.Girl;
import com.lijiankun24.databindingpractice.databinding.ItemGirlBinding;

import java.util.List;

/**
 * CustomRecyclerViewAdapter.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.CustomViewHolder> {

    private LayoutInflater mInflater = null;

    private List<Girl> mGirls = null;

    CustomRecyclerViewAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    void setGirls(List<Girl> girls) {
        mGirls = girls;
        notifyDataSetChanged();
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(ItemGirlBinding.inflate(mInflater, parent, false));
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Girl girl = mGirls.get(position);
        holder.getGirlBinding().setVariable(BR.girl, girl);
        holder.getGirlBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mGirls == null ? 0 : mGirls.size();
    }

    static class CustomViewHolder extends RecyclerView.ViewHolder {
        private ItemGirlBinding mGirlBinding = null;

        CustomViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            mGirlBinding = (ItemGirlBinding) binding;
        }

        ViewDataBinding getGirlBinding() {
            return mGirlBinding;
        }
    }
}
