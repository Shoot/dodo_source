package com.inappstory.sdk.stories.ui.reader;
/* loaded from: classes3.dex */
public interface BaseReaderScreen {
    void closeStoryReader(int i);

    void forceFinish();

    void observeGameReader(String str);

    void removeAllStoriesFromFavorite();

    void removeStoryFromFavorite(int i);

    void shareComplete(boolean z);
}
