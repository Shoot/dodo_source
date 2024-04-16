package com.inappstory.sdk.stories.outercallbacks.common.reader;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class SlideData {
    public int index;
    @NonNull
    public StoryData story;

    public SlideData(@NonNull StoryData storyData, int i) {
        this.story = storyData;
        this.index = i;
    }
}
