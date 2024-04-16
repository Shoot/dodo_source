package com.inappstory.sdk.game.reader;

import com.inappstory.sdk.stories.api.models.Story;
/* loaded from: classes3.dex */
public class GameStoryData {
    public String feedId;
    public int slideIndex;
    public int slidesCount;
    public int storyId;
    public String tags;
    public String title;
    public Story.StoryType type;

    public GameStoryData(int i, int i2, int i3, String str, String str2, String str3, Story.StoryType storyType) {
        this.storyId = i;
        this.slideIndex = i2;
        this.slidesCount = i3;
        this.title = str;
        this.tags = str2;
        this.feedId = str3;
        this.type = storyType;
    }
}
