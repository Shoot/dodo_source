package com.inappstory.sdk.stories.api.models.callbacks;

import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.stories.api.models.Feed;
import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public abstract class LoadFeedCallback extends NetworkCallback<Feed> {
    @Override // com.inappstory.sdk.network.Callback
    public Type getType() {
        return Feed.class;
    }

    @Override // com.inappstory.sdk.network.Callback
    public abstract void onSuccess(Feed feed);
}
