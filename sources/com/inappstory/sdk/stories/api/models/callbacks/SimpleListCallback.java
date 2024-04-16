package com.inappstory.sdk.stories.api.models.callbacks;

import com.inappstory.sdk.network.SimpleApiCallback;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryListType;
import java.lang.reflect.Type;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class SimpleListCallback implements SimpleApiCallback<List<Story>> {
    @Override // com.inappstory.sdk.network.SimpleApiCallback
    public Type getType() {
        return new StoryListType();
    }

    @Override // com.inappstory.sdk.network.SimpleApiCallback
    public abstract void onError(String str);

    @Override // com.inappstory.sdk.network.SimpleApiCallback
    public abstract void onSuccess(List<Story> list, Object... objArr);
}
