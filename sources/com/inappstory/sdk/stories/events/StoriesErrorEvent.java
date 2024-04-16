package com.inappstory.sdk.stories.events;
/* loaded from: classes3.dex */
public class StoriesErrorEvent {
    public static final int CACHE = 6;
    public static final int EMPTY_LINK = 5;
    public static final int LOAD_LIST = 1;
    public static final int LOAD_ONBOARD = 3;
    public static final int LOAD_SINGLE = 2;
    public static final int OPEN_SESSION = 0;
    public static final int READER = 4;
    String feed;
    int type;

    public StoriesErrorEvent(int i, String str) {
        this.type = i;
        this.feed = str;
    }

    public String getFeed() {
        return this.feed;
    }

    public int getType() {
        return this.type;
    }

    public StoriesErrorEvent(int i) {
        this.type = i;
    }
}
