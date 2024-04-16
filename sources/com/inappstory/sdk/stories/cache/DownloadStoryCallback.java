package com.inappstory.sdk.stories.cache;

import com.inappstory.sdk.stories.api.models.Story;
/* loaded from: classes3.dex */
public interface DownloadStoryCallback {
    void onDownload(Story story, int i, Story.StoryType storyType);

    void onError(c cVar);
}
