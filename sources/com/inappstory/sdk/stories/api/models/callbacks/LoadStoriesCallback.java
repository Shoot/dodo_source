package com.inappstory.sdk.stories.api.models.callbacks;

import java.util.List;
/* loaded from: classes3.dex */
public interface LoadStoriesCallback {
    void onError();

    void setFeedId(String str);

    void storiesLoaded(List<Integer> list);
}
