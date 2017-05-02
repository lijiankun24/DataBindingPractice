package com.lijiankun24.databindingpractice.data.model;

import com.lijiankun24.databindingpractice.common.util.Consts;

/**
 * Author.java
 * <p>
 * Created by lijiankun on 17/5/2.
 */

public class Author {

    private String github = null;

    private String weibo = null;

    private String blog = null;

    private String mail = null;

    public Author() {
        github = Consts.github;
        weibo = Consts.weibo;
        blog = Consts.blog;
        mail = Consts.mail;
    }

    public String getGithub() {
        return github;
    }

    public String getWeibo() {
        return weibo;
    }

    public String getBlog() {
        return blog;
    }

    public String getMail() {
        return mail;
    }
}
