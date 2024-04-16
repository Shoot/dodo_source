package com.inappstory.sdk.game.reader;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
/* loaded from: classes3.dex */
public class GameJSInterface {
    Context mContext;
    GameManager manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameJSInterface(Context context, GameManager gameManager) {
        this.mContext = context;
        this.manager = gameManager;
    }

    @JavascriptInterface
    public void gameComplete(String str) {
        this.manager.gameCompleted(str, null, null);
    }

    @JavascriptInterface
    public String gameInstanceGetLocalData(String str) {
        if (InAppStoryService.isNull()) {
            return "";
        }
        if (str == null) {
            str = this.manager.gameCenterId;
        }
        if (str == null) {
            return "";
        }
        String string = KeyValueStorage.getString("gameInstance_" + str + "__" + InAppStoryService.getInstance().getUserId());
        if (string == null) {
            return "";
        }
        return string;
    }

    @JavascriptInterface
    public void gameInstanceSetLocalData(String str, String str2, boolean z) {
        this.manager.gameInstanceSetData(str, str2, z);
    }

    @JavascriptInterface
    public void gameLoaded(String str) {
        this.manager.gameLoaded(str);
    }

    @JavascriptInterface
    public void gameStatisticEvent(String str, String str2) {
        this.manager.sendGameStat(str, str2);
    }

    @JavascriptInterface
    public void openUrl(String str) {
        this.manager.openUrl(str);
    }

    @JavascriptInterface
    public int pausePlaybackOtherApp() {
        return this.manager.pausePlaybackOtherApp();
    }

    @JavascriptInterface
    public void sendApiRequest(String str) {
        this.manager.sendApiRequest(str);
    }

    @JavascriptInterface
    public void setAudioManagerMode(String str) {
        this.manager.setAudioManagerMode(str);
    }

    @JavascriptInterface
    public void share(String str, String str2) {
        this.manager.shareData(str, str2);
    }

    @JavascriptInterface
    public void showGoodsWidget(String str, String str2) {
        this.manager.showGoods(str2, str);
    }

    @JavascriptInterface
    public String storyGetLocalData(int i) {
        if (InAppStoryService.isNull()) {
            return "";
        }
        String string = KeyValueStorage.getString("story" + i + "__" + InAppStoryService.getInstance().getUserId());
        if (string == null) {
            return "";
        }
        return string;
    }

    @JavascriptInterface
    public void storySetLocalData(int i, String str, boolean z) {
        this.manager.storySetData(str, z);
    }

    @JavascriptInterface
    public void gameComplete(String str, String str2, String str3) {
        this.manager.gameCompleted(str, str3, str2);
    }

    @JavascriptInterface
    public void emptyLoaded() {
    }
}
