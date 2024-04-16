package com.inappstory.sdk.stories.ui.views;

import android.view.View;
/* loaded from: classes3.dex */
public interface IStoriesListItem {
    View getVideoView();

    View getView();

    void setHasAudio(View view, boolean z);

    void setId(View view, int i);

    void setImage(View view, String str, int i);

    void setOpened(View view, boolean z);

    void setTitle(View view, String str, Integer num);

    void setVideo(View view, String str);
}
