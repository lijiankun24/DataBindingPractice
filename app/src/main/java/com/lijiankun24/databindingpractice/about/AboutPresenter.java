package com.lijiankun24.databindingpractice.about;

import com.lijiankun24.databindingpractice.data.model.Author;

/**
 * AboutPresenter.java
 * <p>
 * Created by lijiankun on 17/5/2.
 */

public class AboutPresenter implements AboutContract.Presenter {

    private AboutContract.View mView = null;

    private Author mAuthor = null;

    AboutPresenter(AboutContract.View view) {
        mView = view;
        mView.initView();
        mView.setPresenter(this);
    }

    @Override
    public void initData() {
        mAuthor = new Author();
        this.loadAuthor();
    }

    @Override
    public void loadAuthor() {
        mView.showAuthor(mAuthor);
    }

    @Override
    public void toGithub() {
        mView.toGithub();
    }

    @Override
    public void toWeibo() {
        mView.toWeibo();
    }

    @Override
    public void toBlog() {
        mView.toBlog();
    }

    @Override
    public void toMail() {
        mView.toMail();
    }
}
