package com.inappstory.sdk.stories.ui.widgets.readerscreen.webview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.StoryLoadedData;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.StoriesViewManager;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
/* loaded from: classes3.dex */
public class WebAppInterface {
    StoriesViewManager manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebAppInterface(Context context, StoriesViewManager storiesViewManager) {
        this.manager = storiesViewManager;
    }

    static String getMethodName() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    private void logMethod(String str) {
        InAppStoryManager.showDLog("JS_method_test", this.manager.storyId + " " + getMethodName() + " " + str);
    }

    @JavascriptInterface
    public void defaultTap(String str) {
        logMethod(str);
    }

    @JavascriptInterface
    public void emptyLoaded() {
        logMethod("");
    }

    @JavascriptInterface
    public void openGame(String str) {
        this.manager.openGameReaderFromGameCenter(str);
        logMethod(str);
    }

    @JavascriptInterface
    public void openGameReader(String str, String str2, String str3, String str4, String str5) {
        this.manager.openGameReaderWithoutGameCenter(str, str2, str3, str4, str5);
        logMethod(str);
    }

    @JavascriptInterface
    public void resetTimers() {
        this.manager.resetTimers();
        logMethod("");
    }

    @JavascriptInterface
    public void sendApiRequest(String str) {
        this.manager.sendApiRequest(str);
    }

    @JavascriptInterface
    public void setAudioManagerMode(String str) {
        this.manager.setAudioManagerMode(str);
        logMethod(str);
    }

    @JavascriptInterface
    public void share(String str, String str2) {
        this.manager.share(str, str2);
        logMethod(str + " " + str2);
    }

    @JavascriptInterface
    public void showSingleStory(int i, int i2) {
        logMethod("" + i + " " + i2);
        StoriesViewManager storiesViewManager = this.manager;
        if (storiesViewManager.storyId != i) {
            storiesViewManager.showSingleStory(i, i2);
        } else if (storiesViewManager.index != i2) {
            storiesViewManager.changeIndex(i2);
        }
    }

    @JavascriptInterface
    public void storyClick(String str) {
        this.manager.storyClick(str);
        logMethod(str);
    }

    @JavascriptInterface
    public void storyFreezeUI() {
        this.manager.freezeUI();
        logMethod("");
    }

    @JavascriptInterface
    public String storyGetLocalData() {
        String string;
        String str;
        synchronized (this.manager) {
            try {
                string = KeyValueStorage.getString("story" + this.manager.storyId + "__" + InAppStoryService.getInstance().getUserId());
                if (string != null) {
                    str = string;
                } else {
                    str = "";
                }
                logMethod(str);
                if (string == null) {
                    string = "";
                }
            } finally {
            }
        }
        return string;
    }

    @JavascriptInterface
    public void storyLoaded() {
        this.manager.storyLoaded(-1);
        logMethod("");
    }

    @JavascriptInterface
    public void storyLoadingFailed(String str) {
        if (str != null) {
            this.manager.slideLoadError(((StoryLoadedData) JsonParser.fromJson(str, StoryLoadedData.class)).index);
        }
        logMethod("");
    }

    @JavascriptInterface
    public void storyPauseUI() {
        this.manager.pauseUI();
        logMethod("");
    }

    @JavascriptInterface
    public void storyResumeUI() {
        this.manager.resumeUI();
        logMethod("");
    }

    @JavascriptInterface
    public void storyResumed(double d) {
        this.manager.storyResumedEvent(d);
        logMethod("" + d);
    }

    @JavascriptInterface
    public void storySendData(String str) {
        this.manager.storySendData(str);
        logMethod(str);
    }

    @JavascriptInterface
    public void storySetLocalData(String str, boolean z) {
        synchronized (this.manager) {
            this.manager.storySetLocalData(str, z);
            logMethod(str + " " + z);
        }
    }

    @JavascriptInterface
    public void storyShowNext() {
        this.manager.storyShowNext();
        logMethod("");
    }

    @JavascriptInterface
    public void storyShowNextSlide(long j) {
        if (j != 0) {
            InAppStoryManager.showDLog("jsDuration", j + " showNext");
            this.manager.restartStoryWithDuration(j);
        } else {
            StoriesViewManager storiesViewManager = this.manager;
            storiesViewManager.changeIndex(storiesViewManager.index + 1);
        }
        logMethod("" + j);
    }

    @JavascriptInterface
    public void storyShowPrev() {
        this.manager.storyShowPrev();
        logMethod("");
    }

    @JavascriptInterface
    public void storyShowSlide(int i) {
        StoriesViewManager storiesViewManager = this.manager;
        if (storiesViewManager.index != i) {
            storiesViewManager.changeIndex(i);
        }
        logMethod("" + i);
    }

    @JavascriptInterface
    public void storyShowTextInput(String str, String str2) {
        this.manager.storyShowTextInput(str, str2);
        logMethod("");
    }

    @JavascriptInterface
    public void storyStarted() {
        this.manager.storyStartedEvent();
        this.manager.pageFinished();
        logMethod("");
    }

    @JavascriptInterface
    public void storyStatisticEvent(String str, String str2, String str3) {
        this.manager.sendStoryWidgetEvent(str, str2, str3);
        logMethod(str + " " + str2 + " " + str3);
    }

    @JavascriptInterface
    public void openGameReader(String str, String str2, String str3, String str4) {
        this.manager.openGameReaderWithoutGameCenter(str, str2, str3, str4, null);
        logMethod(str);
    }

    @JavascriptInterface
    public void storyLoaded(String str) {
        if (str != null) {
            this.manager.storyLoaded(((StoryLoadedData) JsonParser.fromJson(str, StoryLoadedData.class)).index);
        } else {
            this.manager.storyLoaded(-1);
        }
        logMethod(str + "");
    }

    @JavascriptInterface
    public void storyStatisticEvent(String str, String str2) {
        this.manager.sendStoryWidgetEvent(str, str2, str2);
        logMethod(str + " " + str2);
    }

    @JavascriptInterface
    public void storyStarted(double d) {
        this.manager.storyStartedEvent();
        this.manager.pageFinished();
        logMethod("" + d);
    }
}
