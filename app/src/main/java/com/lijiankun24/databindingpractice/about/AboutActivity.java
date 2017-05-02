package com.lijiankun24.databindingpractice.about;

import android.databinding.ViewDataBinding;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.common.base.BaseActivity;
import com.lijiankun24.databindingpractice.common.util.Utils;
import com.lijiankun24.databindingpractice.data.model.Author;
import com.lijiankun24.databindingpractice.databinding.ActivityAboutBinding;

public class AboutActivity extends BaseActivity implements AboutContract.View {

    private ActivityAboutBinding mBinding = null;

    private Author mAuthor = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_about;
    }

    @Override
    protected void initControls(ViewDataBinding binding) {
        if (binding instanceof ActivityAboutBinding) {
            mBinding = (ActivityAboutBinding) binding;
            AboutPresenter presenter = new AboutPresenter(this);
            presenter.initData();
        }
    }

    @Override
    public void initView() {
        initToolbar(mBinding.includeToolbar.toolbar, true, R.string.about_activity_title);
    }

    @Override
    public void setPresenter(AboutContract.Presenter presenter) {
        mBinding.setAboutPresenter((AboutPresenter) presenter);
    }

    @Override
    public void showAuthor(Author author) {
        mBinding.setAuthor(author);
        mAuthor = author;
    }

    @Override
    public void toGithub() {
        Utils.toBrower(AboutActivity.this, mAuthor.getGithub());
    }

    @Override
    public void toWeibo() {
        Utils.toBrower(AboutActivity.this, mAuthor.getWeibo());
    }

    @Override
    public void toBlog() {
        Utils.toBrower(AboutActivity.this, mAuthor.getBlog());
    }

    @Override
    public void toMail() {
        Utils.sendMail(AboutActivity.this, mAuthor.getMail());
    }


}
