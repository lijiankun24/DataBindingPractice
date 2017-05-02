package com.lijiankun24.databindingpractice.about;

import com.lijiankun24.databindingpractice.common.base.BasePresenter;
import com.lijiankun24.databindingpractice.common.base.BaseView;
import com.lijiankun24.databindingpractice.data.model.Author;

/**
 * AboutContract.java
 * <p>
 * Created by lijiankun on 17/5/2.
 */

public interface AboutContract {

    interface Presenter extends BasePresenter {

        void initData();

        void loadAuthor();

        void toGithub();

        void toWeibo();

        void toBlog();

        void toMail();
    }

    interface View extends BaseView<Presenter> {

        void showAuthor(Author author);

        void toGithub();

        void toWeibo();

        void toBlog();

        void toMail();
    }
}
