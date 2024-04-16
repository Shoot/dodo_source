package com.inappstory.sdk.stories.api.models.callbacks;

import com.inappstory.sdk.stories.api.models.Story;
/* loaded from: classes3.dex */
public interface GetStoryByIdCallback {
    void getStory(Story story);

    void loadError(int i);
}
