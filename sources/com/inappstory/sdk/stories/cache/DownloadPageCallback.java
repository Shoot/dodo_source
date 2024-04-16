package com.inappstory.sdk.stories.cache;
/* loaded from: classes3.dex */
public interface DownloadPageCallback {
    DownloadPageFileStatus downloadFile(UrlWithAlter urlWithAlter, SlideTaskData slideTaskData);

    void onError(c cVar);

    void onSlideError(SlideTaskData slideTaskData);
}
