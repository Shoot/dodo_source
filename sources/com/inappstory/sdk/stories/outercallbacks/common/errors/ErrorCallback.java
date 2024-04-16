package com.inappstory.sdk.stories.outercallbacks.common.errors;
/* loaded from: classes3.dex */
public interface ErrorCallback {
    void cacheError();

    void emptyLinkError();

    void loadListError(String str);

    void loadOnboardingError(String str);

    void loadSingleError();

    void noConnection();

    void readerError();

    void sessionError();
}
