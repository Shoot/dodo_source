package com.inappstory.sdk.stories.outercallbacks.storieslist;
/* loaded from: classes3.dex */
public interface ListCallback {
    void itemClick(int i, int i2, String str, String str2, int i3, boolean z, String str3);

    void loadError(String str);

    void storiesLoaded(int i, String str);

    void storiesUpdated(int i, String str);
}
