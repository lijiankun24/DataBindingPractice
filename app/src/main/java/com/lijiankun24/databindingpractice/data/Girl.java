package com.lijiankun24.databindingpractice.data;

import java.util.UUID;

/**
 * Girl.java
 * <p>
 * Created by lijiankun on 17/4/25.
 */

public class Girl {

    private static final int DEFAULT_AGE = 18;

    private static final String DEFAULT_FROM = "Moon";

    private final String mId;

    private final String mName;

    private final String mAvatar;

    private final int mAge;

    private final String mFrom;

    public Girl(String name, String avatar) {
        this(UUID.randomUUID().toString(), name, avatar, DEFAULT_AGE, DEFAULT_FROM);
    }

    public Girl(String id, String name, String avatar, int age, String from) {
        mId = id;
        mName = name;
        mAvatar = avatar;
        mAge = age;
        mFrom = from;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public int getAge() {
        return mAge;
    }

    public String getFrom() {
        return mFrom;
    }
}
