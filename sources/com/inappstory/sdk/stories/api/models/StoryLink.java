package com.inappstory.sdk.stories.api.models;
/* loaded from: classes3.dex */
public class StoryLink {
    String target;
    String type;

    public StoryLink(String str, String str2) {
        this.type = str;
        this.target = str2;
    }

    public String getTarget() {
        return this.target;
    }

    public String getType() {
        return this.type;
    }

    public StoryLink() {
    }
}
