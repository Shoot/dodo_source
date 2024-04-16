package com.inappstory.sdk.game.reader;

import android.media.AudioManager;
import android.os.Build;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.network.jsapiclient.JsApiClient;
import com.inappstory.sdk.network.jsapiclient.JsApiResponseCallback;
import com.inappstory.sdk.stories.api.models.GameCenterData;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.UrlObject;
import com.inappstory.sdk.stories.api.models.WebResource;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.outercallbacks.common.gamereader.GameCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SlideData;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryData;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
import com.inappstory.sdk.utils.StringsUtils;
import com.inappstory.sdk.utils.ZipLoadCallback;
import com.inappstory.sdk.utils.ZipLoader;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class GameManager {
    ZipLoadCallback callback;
    GameStoryData dataModel;
    String gameCenterId;
    String gameConfig;
    boolean gameLoaded;
    GameActivity host;
    String path;
    String resources;
    String splashImagePath;

    /* loaded from: classes3.dex */
    class c implements JsApiResponseCallback {
        c() {
        }

        @Override // com.inappstory.sdk.network.jsapiclient.JsApiResponseCallback
        public void onJsApiResponse(String str, String str2) {
            GameManager gameManager = GameManager.this;
            gameManager.host.loadJsApiResponse(gameManager.modifyJsResult(str), str2);
        }
    }

    public GameManager(GameActivity gameActivity) {
        this.host = gameActivity;
    }

    private void gameCompletedWithObject(String str, GameFinishOptions gameFinishOptions, String str2) {
        String str3;
        if (CallbackManager.getInstance().getGameCallback() != null && this.dataModel != null) {
            GameCallback gameCallback = CallbackManager.getInstance().getGameCallback();
            GameStoryData gameStoryData = this.dataModel;
            gameCallback.finishGame(gameStoryData.storyId, gameStoryData.title, gameStoryData.tags, gameStoryData.slidesCount, gameStoryData.slideIndex, str2);
        }
        if (CallbackManager.getInstance().getGameReaderCallback() != null) {
            CallbackManager.getInstance().getGameReaderCallback().finishGame(this.dataModel, str2, this.gameCenterId);
        }
        GameFinishStoryOptions gameFinishStoryOptions = gameFinishOptions.openStory;
        if (gameFinishStoryOptions != null && (str3 = gameFinishStoryOptions.id) != null && !str3.isEmpty()) {
            InAppStoryManager.getInstance().showStoryCustom(gameFinishOptions.openStory.id, this.host, AppearanceManager.getCommonInstance());
        }
        this.host.gameCompleted(str, null);
    }

    private void gameCompletedWithUrl(String str, String str2, String str3) {
        if (CallbackManager.getInstance().getGameCallback() != null && this.dataModel != null) {
            GameCallback gameCallback = CallbackManager.getInstance().getGameCallback();
            GameStoryData gameStoryData = this.dataModel;
            int i = gameStoryData.storyId;
            String nonNull = StringsUtils.getNonNull(gameStoryData.title);
            String nonNull2 = StringsUtils.getNonNull(this.dataModel.tags);
            GameStoryData gameStoryData2 = this.dataModel;
            gameCallback.finishGame(i, nonNull, nonNull2, gameStoryData2.slidesCount, gameStoryData2.slideIndex, StringsUtils.getNonNull(str3));
        }
        if (CallbackManager.getInstance().getGameReaderCallback() != null) {
            CallbackManager.getInstance().getGameReaderCallback().finishGame(this.dataModel, str3, this.gameCenterId);
        }
        this.host.gameCompleted(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String modifyJsResult(String str) {
        if (str == null) {
            return "";
        }
        return str.replaceAll("'", "\\\\'");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gameCompleted(String str, String str2, String str3) {
        GameFinishOptions gameFinishOptions = (GameFinishOptions) JsonParser.fromJson(str2, GameFinishOptions.class);
        if (gameFinishOptions == null) {
            gameCompletedWithUrl(str, str2, str3);
            return;
        }
        String str4 = gameFinishOptions.openUrl;
        if (str4 != null) {
            gameCompletedWithUrl(str, str4, str3);
        } else {
            gameCompletedWithObject(str, gameFinishOptions, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gameInstanceSetData(String str, String str2, boolean z) {
        String str3;
        if (InAppStoryService.isNull()) {
            return;
        }
        if (str == null) {
            str3 = this.gameCenterId;
        } else {
            str3 = str;
        }
        if (str3 == null) {
            return;
        }
        KeyValueStorage.saveString("gameInstance_" + str + "__" + InAppStoryService.getInstance().getUserId(), str2);
        if (InAppStoryService.getInstance().getSendStatistic() && z) {
            NetworkClient.getApi().sendGameData(str, str2).enqueue(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gameLoaded(String str) {
        GameLoadedConfig gameLoadedConfig = (GameLoadedConfig) JsonParser.fromJson(str, GameLoadedConfig.class);
        GameActivity gameActivity = this.host;
        gameActivity.gameReaderGestureBack = gameLoadedConfig.backGesture;
        gameActivity.showClose = gameLoadedConfig.showClose;
        this.gameLoaded = true;
        gameActivity.updateUI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadGame(GameCenterData gameCenterData) {
        ArrayList arrayList = new ArrayList();
        String str = this.resources;
        if (str != null) {
            arrayList = JsonParser.listFromJson(str, WebResource.class);
        }
        ZipLoader.getInstance().downloadAndUnzip(arrayList, this.path, ZipLoader.urlParts(this.path)[0], this.gameCenterId, gameCenterData, this.callback, this.host.interruption, "game");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onResume() {
        String str;
        if (ScreensManager.getInstance().getTempShareId() != null) {
            str = ScreensManager.getInstance().getTempShareId();
        } else if (ScreensManager.getInstance().getOldTempShareId() != null) {
            str = ScreensManager.getInstance().getOldTempShareId();
        } else {
            str = null;
        }
        if (str != null) {
            this.host.shareComplete(str, false);
        }
        ScreensManager.getInstance().clearShareIds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void openUrl(String str) {
        String str2;
        UrlObject urlObject = (UrlObject) JsonParser.fromJson(str, UrlObject.class);
        if (urlObject != null && (str2 = urlObject.url) != null && !str2.isEmpty()) {
            tapOnLink(urlObject.url);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int pausePlaybackOtherApp() {
        return ((AudioManager) this.host.getSystemService("audio")).requestAudioFocus(this.host.audioFocusChangeListener, 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendApiRequest(String str) {
        new JsApiClient(this.host).sendApiRequest(str, new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendGameStat(String str, String str2) {
        StatisticManager.getInstance().sendGameEvent(str, str2, this.dataModel.feedId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAudioManagerMode(String str) {
        this.host.setAudioManagerMode(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void shareData(String str, String str2) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null && !inAppStoryService.isShareProcess()) {
            inAppStoryService.isShareProcess(true);
            InnerShareData innerShareData = (InnerShareData) JsonParser.fromJson(str2, InnerShareData.class);
            if (Build.VERSION.SDK_INT >= 22) {
                ScreensManager.getInstance().setTempShareId(str);
                ScreensManager.getInstance().setTempShareStoryId(-1);
            } else {
                ScreensManager.getInstance().setOldTempShareId(str);
                ScreensManager.getInstance().setOldTempShareStoryId(-1);
            }
            this.host.share(innerShareData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showGoods(String str, String str2) {
        this.host.showGoods(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void storySetData(String str, boolean z) {
        if (InAppStoryService.isNull() || this.dataModel == null) {
            return;
        }
        KeyValueStorage.saveString("story" + this.dataModel.storyId + "__" + InAppStoryService.getInstance().getUserId(), str);
        if (InAppStoryService.getInstance().getSendStatistic() && z) {
            NetworkClient.getApi().sendStoryData(Integer.toString(this.dataModel.storyId), str, Session.getInstance().id).enqueue(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tapOnLink(String str) {
        SlideData slideData;
        if (InAppStoryService.isNull()) {
            return;
        }
        GameStoryData gameStoryData = this.dataModel;
        if (gameStoryData != null) {
            slideData = new SlideData(new StoryData(gameStoryData.storyId, StringsUtils.getNonNull(gameStoryData.title), StringsUtils.getNonNull(this.dataModel.tags), this.dataModel.slidesCount), this.dataModel.slideIndex);
        } else {
            slideData = null;
        }
        if (CallbackManager.getInstance().getCallToActionCallback() != null) {
            CallbackManager.getInstance().getCallToActionCallback().callToAction(slideData, StringsUtils.getNonNull(str), ClickAction.GAME_READER);
        } else if (CallbackManager.getInstance().getUrlClickCallback() != null) {
            CallbackManager.getInstance().getUrlClickCallback().onUrlClick(StringsUtils.getNonNull(str));
        } else {
            this.host.tapOnLinkDefault(StringsUtils.getNonNull(str));
        }
    }

    /* loaded from: classes3.dex */
    class a extends NetworkCallback<Response> {
        a() {
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
        }
    }

    /* loaded from: classes3.dex */
    class b extends NetworkCallback<Response> {
        b() {
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
        }
    }
}
