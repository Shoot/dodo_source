package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.content.Context;
/* loaded from: classes3.dex */
public interface SimpleStoriesView {
    void cancelDialog(String str);

    void changeSoundStatus();

    void checkIfClientIsSet();

    void clearSlide(int i);

    void destroyView();

    void freezeUI();

    Context getContext();

    float getCoordinate();

    StoriesViewManager getManager();

    void goodsWidgetComplete(String str);

    void loadJsApiResponse(String str, String str2);

    void restartVideo();

    void resumeVideo();

    void screenshotShare();

    void sendDialog(String str, String str2);

    void setStoriesView(SimpleStoriesView simpleStoriesView);

    void shareComplete(String str, boolean z);

    void slidePause();

    void slideStart();

    void stopVideo();

    void swipeUp();
}
