package com.inappstory.sdk.stories.ui.list;
/* loaded from: classes3.dex */
public interface ListManager {
    void changeStory(int i, String str);

    void changeUserId();

    void clear();

    void clearAllFavorites();

    void closeReader();

    void openReader();

    void storyFavorite(int i, boolean z, boolean z2);
}
