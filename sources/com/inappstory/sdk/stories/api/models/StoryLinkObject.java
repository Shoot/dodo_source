package com.inappstory.sdk.stories.api.models;
/* loaded from: classes3.dex */
public class StoryLinkObject {
    String elementId;
    StoryLink link;
    String type;

    public StoryLinkObject(String str, StoryLink storyLink) {
        this.type = str;
        this.link = storyLink;
    }

    public String getElementId() {
        return this.elementId;
    }

    public StoryLink getLink() {
        return this.link;
    }

    public String getType() {
        return this.type;
    }

    public StoryLinkObject(String str, StoryLink storyLink, String str2) {
        this.type = str;
        this.link = storyLink;
        this.elementId = str2;
    }

    public StoryLinkObject() {
    }
}
