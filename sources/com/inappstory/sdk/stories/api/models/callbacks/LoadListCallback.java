package com.inappstory.sdk.stories.api.models.callbacks;

import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryListType;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.utils.SessionManager;
import java.lang.reflect.Type;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class LoadListCallback extends NetworkCallback<List<Story>> {
    @Override // com.inappstory.sdk.network.NetworkCallback
    protected void error424(String str) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().loadListError("");
        }
        SessionManager.getInstance().closeSession(true, false);
    }

    @Override // com.inappstory.sdk.network.Callback
    public Type getType() {
        return new StoryListType();
    }

    @Override // com.inappstory.sdk.network.NetworkCallback
    public void onError(int i, String str) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().loadListError("");
        }
    }

    @Override // com.inappstory.sdk.network.Callback
    public abstract void onSuccess(List<Story> list);
}
