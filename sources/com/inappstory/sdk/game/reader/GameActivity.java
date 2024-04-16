package com.inappstory.sdk.game.reader;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.BuildConfig;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.game.cache.GameLoadCallback;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.inner.share.InnerShareFilesPrepare;
import com.inappstory.sdk.inner.share.ShareFilesPrepareCallback;
import com.inappstory.sdk.lrudiskcache.FileManager;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.share.IASShareData;
import com.inappstory.sdk.share.IASShareManager;
import com.inappstory.sdk.stories.api.models.GameCenterData;
import com.inappstory.sdk.stories.api.models.GameSplashScreen;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderType;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderValue;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.DownloadInterruption;
import com.inappstory.sdk.stories.cache.FileLoadProgressCallback;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.callbacks.GameDownloadCallback;
import com.inappstory.sdk.stories.events.GameCompleteEvent;
import com.inappstory.sdk.stories.outercallbacks.game.GameLoadedCallback;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.ui.OverlapFragmentObserver;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.views.IASWebView;
import com.inappstory.sdk.stories.ui.views.IASWebViewClient;
import com.inappstory.sdk.stories.ui.views.IGameLoaderView;
import com.inappstory.sdk.stories.ui.views.IGameReaderLoaderView;
import com.inappstory.sdk.stories.ui.views.IProgressLoaderView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import com.inappstory.sdk.stories.utils.AudioModes;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
import com.inappstory.sdk.stories.utils.ShowGoodsCallback;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.stories.utils.StoryShareBroadcastReceiver;
import com.inappstory.sdk.utils.StringsUtils;
import com.inappstory.sdk.utils.ZipLoadCallback;
import com.inappstory.sdk.utils.ZipLoader;
import defpackage.tmb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class GameActivity extends androidx.appcompat.app.c implements OverlapFragmentObserver {
    public static final int GAME_READER_REQUEST = 878;
    private static final int PERMISSIONS_REQUEST_RECORD_AUDIO = 101;
    private PermissionRequest audioRequest;
    private View baseContainer;
    private View closeButton;
    private ImageView loader;
    private RelativeLayout loaderContainer;
    private IProgressLoaderView loaderView;
    GameManager manager;
    private ImageView refreshGame;
    GameStoryData storyDataModel;
    private IASWebView webView;
    private View webViewContainer;
    private boolean isFullscreen = false;
    private boolean closing = false;
    boolean showClose = true;
    private boolean onBackPressedLocked = false;
    AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new s();
    Boolean forceFullscreen = Boolean.FALSE;
    boolean gameReaderGestureBack = false;
    boolean hasSplashFile = false;
    Runnable showRefresh = new h();
    DownloadInterruption interruption = new DownloadInterruption();
    GameLoadedCallback gameLoadedCallback = new j();
    View customLoaderView = null;
    boolean shareViewIsShown = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.inappstory.sdk.game.reader.GameActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0256a implements Runnable {
            RunnableC0256a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GameActivity.this.downloadGame();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameActivity.this.interruption.active = false;
            GameActivity gameActivity = GameActivity.this;
            gameActivity.changeView(gameActivity.customLoaderView, gameActivity.refreshGame);
            new Handler().postDelayed(new RunnableC0256a(), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindowInsets rootWindowInsets;
            View findViewById;
            if (GameActivity.this.getWindow() != null) {
                rootWindowInsets = GameActivity.this.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    ((RelativeLayout.LayoutParams) GameActivity.this.closeButton.getLayoutParams()).topMargin = Math.max(rootWindowInsets.getSystemWindowInsetTop(), Sizes.dpToPxExt(16));
                    GameActivity.this.closeButton.requestLayout();
                }
                if (Sizes.isTablet() && (findViewById = GameActivity.this.findViewById(R.id.gameContainer)) != null) {
                    Point screenSize = Sizes.getScreenSize();
                    if (rootWindowInsets != null) {
                        screenSize.y -= rootWindowInsets.getSystemWindowInsetTop() + rootWindowInsets.getSystemWindowInsetBottom();
                    }
                    findViewById.getLayoutParams().height = screenSize.y;
                    findViewById.getLayoutParams().width = (int) (screenSize.y / 1.5f);
                    findViewById.requestLayout();
                }
            }
            GameActivity.this.closeButton.setVisibility(0);
        }
    }

    /* loaded from: classes3.dex */
    class c implements ShareFilesPrepareCallback {
        final /* synthetic */ IASShareData a;

        c(IASShareData iASShareData) {
            this.a = iASShareData;
        }

        @Override // com.inappstory.sdk.inner.share.ShareFilesPrepareCallback
        public void onPrepared(List<String> list) {
            IASShareData iASShareData = this.a;
            iASShareData.files = list;
            GameActivity.this.shareCustomOrDefault(iASShareData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements GameDownloadCallback {
        e() {
        }

        @Override // com.inappstory.sdk.stories.callbacks.GameDownloadCallback
        public void complete(GameCenterData gameCenterData) {
            boolean z;
            GameActivity.this.downloadSplash(gameCenterData);
            try {
                GameActivity.this.replaceGameInstanceStorageData(gameCenterData.instanceUserData);
            } catch (JSONException unused) {
            }
            GameActivity gameActivity = GameActivity.this;
            gameActivity.manager.resources = gameActivity.getIntent().getStringExtra("gameResources");
            GameManager gameManager = GameActivity.this.manager;
            gameManager.gameConfig = gameCenterData.initCode;
            gameManager.path = gameCenterData.url;
            try {
                GameScreenOptions gameScreenOptions = gameCenterData.options;
                gameManager.resources = JsonParser.getJson(gameCenterData.resources);
                GameActivity gameActivity2 = GameActivity.this;
                if (gameScreenOptions != null && gameScreenOptions.fullScreen) {
                    z = true;
                } else {
                    z = false;
                }
                gameActivity2.isFullscreen = z;
                GameActivity gameActivity3 = GameActivity.this;
                Boolean bool = gameActivity3.forceFullscreen;
                if (bool != null) {
                    gameActivity3.isFullscreen = bool.booleanValue();
                }
                GameActivity.this.replaceConfigs();
                GameActivity.this.gameLoadedCallback.complete(gameCenterData, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.inappstory.sdk.stories.callbacks.GameDownloadCallback
        public void error(String str) {
            GameActivity.this.gameLoadedCallback.complete(null, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends WebChromeClient {
        boolean a = false;
        final /* synthetic */ GameStoryData b;

        f(GameStoryData gameStoryData) {
            this.b = gameStoryData;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (this.b != null && GameActivity.this.webView != null) {
                GameActivity.this.webView.sendWebConsoleLog(consoleMessage, Integer.toString(this.b.storyId), this.b.slideIndex);
            }
            Log.d("InAppStory_SDK_Game", "Console: " + consoleMessage.messageLevel().name() + ": " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources;
            for (String str : permissionRequest.getResources()) {
                str.hashCode();
                if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    GameActivity.this.audioRequest = permissionRequest;
                    GameActivity.this.askForPermission(permissionRequest.getOrigin().toString(), "android.permission.RECORD_AUDIO", 101);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i > 10 && !this.a) {
                GameActivity gameActivity = GameActivity.this;
                String str = gameActivity.manager.gameConfig;
                if (str != null) {
                    this.a = true;
                    gameActivity.initGame(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements GameLoadCallback {
        final /* synthetic */ GameDownloadCallback a;

        g(GameDownloadCallback gameDownloadCallback) {
            this.a = gameDownloadCallback;
        }

        @Override // com.inappstory.sdk.game.cache.GameLoadCallback
        public void onError(String str) {
            GameDownloadCallback gameDownloadCallback = this.a;
            if (gameDownloadCallback != null) {
                gameDownloadCallback.error(str);
            }
        }

        @Override // com.inappstory.sdk.game.cache.GameLoadCallback
        public void onSuccess(GameCenterData gameCenterData) {
            GameDownloadCallback gameDownloadCallback = this.a;
            if (gameDownloadCallback != null) {
                gameDownloadCallback.complete(gameCenterData);
            }
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameActivity gameActivity = GameActivity.this;
            gameActivity.changeView(gameActivity.refreshGame, GameActivity.this.customLoaderView);
        }
    }

    /* loaded from: classes3.dex */
    class i implements ZipLoadCallback {
        i() {
        }

        @Override // com.inappstory.sdk.utils.ZipLoadCallback
        public void onError(String str) {
            if (GameActivity.this.refreshGame != null) {
                GameActivity.this.refreshGame.post(GameActivity.this.showRefresh);
            }
            InAppStoryManager.showDLog("Game_Loading", str);
        }

        @Override // com.inappstory.sdk.utils.ZipLoadCallback
        public void onLoad(String str, String str2) {
            GameActivity gameActivity = GameActivity.this;
            gameActivity.manager.gameLoaded = true;
            gameActivity.webView.loadDataWithBaseURL(str, GameActivity.this.webView.setDir(str2), "text/html; charset=utf-8", "UTF-8", null);
            if (GameActivity.this.refreshGame != null) {
                GameActivity.this.refreshGame.postDelayed(GameActivity.this.showRefresh, 5000L);
            }
        }

        @Override // com.inappstory.sdk.utils.ProgressCallback
        public void onProgress(long j, long j2) {
            GameActivity.this.loaderView.setProgress((int) ((j * 100) / j2), 100);
        }
    }

    /* loaded from: classes3.dex */
    class j implements GameLoadedCallback {
        j() {
        }

        @Override // com.inappstory.sdk.stories.outercallbacks.game.GameLoadedCallback
        public void complete(GameCenterData gameCenterData, String str) {
            if (str == null) {
                GameActivity.this.setLayout();
                GameActivity.this.loaderView.setIndeterminate(false);
                GameActivity.this.manager.loadGame(gameCenterData);
                return;
            }
            GameActivity.this.closeButton.setVisibility(0);
            GameStoryData storyDataModel = GameActivity.this.getStoryDataModel();
            if (CallbackManager.getInstance().getGameReaderCallback() != null) {
                CallbackManager.getInstance().getGameReaderCallback().gameLoadError(storyDataModel, GameActivity.this.getIntent().getStringExtra("gameId"));
            }
            InAppStoryManager.showDLog("Game_Loading", str);
            GameActivity.this.refreshGame.post(GameActivity.this.showRefresh);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k implements ValueCallback<String> {
        k() {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(String str) {
            if (!str.equals(tmb.h.TRUE_JSON_NAME)) {
                GameActivity.this.closeGame();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l implements ValueCallback<String> {
        l() {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(String str) {
            if (!str.equals(tmb.h.TRUE_JSON_NAME)) {
                GameActivity.this.gameCompleted(null, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        final /* synthetic */ HashMap a;

        m(HashMap hashMap) {
            this.a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            String oldTempShareId;
            if (this.a.containsKey("shared")) {
                z = ((Boolean) this.a.get("shared")).booleanValue();
            } else {
                z = false;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                oldTempShareId = ScreensManager.getInstance().getTempShareId();
            } else {
                oldTempShareId = ScreensManager.getInstance().getOldTempShareId();
            }
            GameActivity.this.shareComplete(oldTempShareId, z);
            if (!z) {
                GameActivity.this.resumeGame();
            }
            GameActivity.this.shareViewIsShown = false;
            ScreensManager.getInstance().clearShareIds();
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameActivity gameActivity = GameActivity.this;
            gameActivity.shareViewIsShown = true;
            gameActivity.pauseGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class o extends AnimatorListenerAdapter {
        final /* synthetic */ View a;

        o(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a.setVisibility(8);
            this.a.setAlpha(1.0f);
            GameActivity.this.onBackPressedLocked = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class p implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        p(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.b.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class q extends AnimatorListenerAdapter {
        final /* synthetic */ View a;

        q(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a.setVisibility(8);
            GameActivity.this.onBackPressedLocked = false;
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ GameStoryData c;

        /* loaded from: classes3.dex */
        class a implements ShowGoodsCallback {
            a() {
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onEmptyResume(String str) {
                GameActivity.this.goodsWidgetComplete(str);
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onPause() {
                GameActivity.this.pauseGame();
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onResume(String str) {
                GameActivity.this.goodsWidgetComplete(str);
                GameActivity.this.resumeGame();
            }
        }

        r(String str, String str2, GameStoryData gameStoryData) {
            this.a = str;
            this.b = str2;
            this.c = gameStoryData;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreensManager screensManager = ScreensManager.getInstance();
            String str = this.a;
            GameActivity gameActivity = GameActivity.this;
            a aVar = new a();
            String str2 = this.b;
            GameStoryData gameStoryData = this.c;
            screensManager.showGoods(str, gameActivity, aVar, true, str2, gameStoryData.storyId, gameStoryData.slideIndex, gameStoryData.feedId);
        }
    }

    /* loaded from: classes3.dex */
    class s implements AudioManager.OnAudioFocusChangeListener {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ int a;

            a(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                GameActivity.this.gameReaderAudioFocusChange(this.a);
            }
        }

        s() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            GameActivity.this.webView.post(new a(i));
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            View view = GameActivity.this.closeButton;
            if (GameActivity.this.showClose) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            GameActivity.this.refreshGame.removeCallbacks(GameActivity.this.showRefresh);
            GameActivity gameActivity = GameActivity.this;
            gameActivity.hideView(gameActivity.loaderContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameActivity.this.closeGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameActivity.this.closeGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeView(View view, View view2) {
        if (view != null && view2 != null) {
            this.onBackPressedLocked = true;
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view2.setVisibility(0);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
            duration.addUpdateListener(new p(view, view2));
            duration.addListener(new q(view2));
            duration.start();
        }
    }

    private void checkInsets() {
        if (Build.VERSION.SDK_INT >= 28) {
            runOnUiThread(new b());
        } else {
            this.closeButton.setVisibility(0);
        }
    }

    private void checkIntentValues(GameLoadedCallback gameLoadedCallback) {
        boolean z;
        this.manager.gameCenterId = getIntent().getStringExtra("gameId");
        this.manager.path = getIntent().getStringExtra("gameUrl");
        this.manager.dataModel = getStoryDataModel();
        GameManager gameManager = this.manager;
        if (gameManager.path == null) {
            if (gameManager.gameCenterId == null) {
                gameLoadedCallback.complete(null, "No game path or id");
                finish();
                return;
            }
            String string = KeyValueStorage.getString("gameInstanceSplash_" + this.manager.gameCenterId);
            if (string != null) {
                File file = new File(string);
                this.hasSplashFile = file.exists();
                setLoader(file);
            }
            downloadGame();
            return;
        }
        GameScreenOptions gameScreenOptions = (GameScreenOptions) JsonParser.fromJson(getIntent().getStringExtra("options"), GameScreenOptions.class);
        if (gameScreenOptions != null && gameScreenOptions.fullScreen) {
            z = true;
        } else {
            z = false;
        }
        this.isFullscreen = z;
        Boolean bool = this.forceFullscreen;
        if (bool != null) {
            this.isFullscreen = bool.booleanValue();
        }
        this.manager.resources = getIntent().getStringExtra("gameResources");
        this.manager.gameConfig = getIntent().getStringExtra("gameConfig");
        this.manager.splashImagePath = getIntent().getStringExtra("splashImagePath");
        replaceConfigs();
        setLoaderOld();
        gameLoadedCallback.complete(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeGame() {
        if (this.closing) {
            return;
        }
        GameStoryData storyDataModel = getStoryDataModel();
        ZipLoader.getInstance().terminate();
        if (this.manager == null) {
            finish();
            return;
        }
        this.closing = true;
        if (storyDataModel != null && CallbackManager.getInstance().getGameCallback() != null) {
            CallbackManager.getInstance().getGameCallback().closeGame(storyDataModel.storyId, StringsUtils.getNonNull(storyDataModel.title), StringsUtils.getNonNull(storyDataModel.tags), storyDataModel.slidesCount, storyDataModel.slideIndex);
        }
        if (CallbackManager.getInstance().getGameReaderCallback() != null) {
            CallbackManager.getInstance().getGameReaderCallback().closeGame(storyDataModel, getIntent().getStringExtra("gameId"));
        }
        if (this.manager.gameLoaded) {
            this.webView.evaluateJavascript("closeGameReader();", new l());
        } else {
            gameCompleted(null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadGame() {
        downloadGame(this.manager.gameCenterId, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (com.inappstory.sdk.lrudiskcache.FileManager.checkShaAndSize(r4, r8.size, r8.sha1) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void downloadSplash(com.inappstory.sdk.stories.api.models.GameCenterData r8) {
        /*
            r7 = this;
            com.inappstory.sdk.stories.api.models.GameSplashScreen r8 = r8.splashScreen
            r0 = 1
            if (r8 == 0) goto Lf
            java.lang.String r1 = r8.url
            boolean r1 = android.webkit.URLUtil.isValidUrl(r1)
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "gameInstanceSplash_"
            r2.append(r3)
            com.inappstory.sdk.game.reader.GameManager r4 = r7.manager
            java.lang.String r4 = r4.gameCenterId
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.inappstory.sdk.stories.utils.KeyValueStorage.getString(r2)
            if (r2 == 0) goto L46
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L46
            r7.setLoader(r4)
            if (r1 == 0) goto L46
            java.lang.Long r5 = r8.size
            java.lang.String r6 = r8.sha1
            boolean r4 = com.inappstory.sdk.lrudiskcache.FileManager.checkShaAndSize(r4, r5, r6)
            if (r4 == 0) goto L46
            goto L5c
        L46:
            if (r1 == 0) goto L5c
            java.lang.String r1 = r8.url
            com.inappstory.sdk.InAppStoryService r4 = com.inappstory.sdk.InAppStoryService.getInstance()
            com.inappstory.sdk.lrudiskcache.LruDiskCache r4 = r4.getInfiniteCache()
            com.inappstory.sdk.game.reader.GameActivity$d r5 = new com.inappstory.sdk.game.reader.GameActivity$d
            r5.<init>(r8, r2)
            com.inappstory.sdk.stories.cache.DownloadInterruption r6 = r7.interruption
            com.inappstory.sdk.stories.cache.Downloader.downloadFileBackground(r1, r0, r4, r5, r6)
        L5c:
            if (r8 == 0) goto L66
            java.lang.String r8 = r8.url
            boolean r8 = android.webkit.URLUtil.isValidUrl(r8)
            if (r8 != 0) goto L8c
        L66:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            com.inappstory.sdk.game.reader.GameManager r0 = r7.manager
            java.lang.String r0 = r0.gameCenterId
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.inappstory.sdk.stories.utils.KeyValueStorage.removeString(r8)
            if (r2 == 0) goto L8c
            java.io.File r8 = new java.io.File
            r8.<init>(r2)
            boolean r0 = r8.exists()
            if (r0 == 0) goto L8c
            r8.deleteOnExit()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.game.reader.GameActivity.downloadSplash(com.inappstory.sdk.stories.api.models.GameCenterData):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        r2 = getWindow().getDecorView().getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String generateJsonConfig() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            com.inappstory.sdk.game.reader.GameConfigOptions r1 = new com.inappstory.sdk.game.reader.GameConfigOptions
            r1.<init>()
            boolean r2 = r6.isFullscreen
            r1.fullScreen = r2
            com.inappstory.sdk.network.NetworkClient r2 = com.inappstory.sdk.network.NetworkClient.getInstance()
            java.lang.String r2 = r2.getBaseUrl()
            r1.apiBaseUrl = r2
            com.inappstory.sdk.InAppStoryManager r2 = com.inappstory.sdk.InAppStoryManager.getInstance()
            android.content.res.Resources r3 = r6.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            r4 = 2
            if (r3 != r4) goto L29
            java.lang.String r3 = "landscape"
            goto L2b
        L29:
            java.lang.String r3 = "portrait"
        L2b:
            r1.screenOrientation = r3
            java.lang.String r3 = com.inappstory.sdk.network.NetworkClient.getUAString(r6)
            r1.userAgent = r3
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            java.lang.String r4 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            r5 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            goto L48
        L43:
            r3 = move-exception
            r3.printStackTrace()
            r3 = r0
        L48:
            r1.appPackageId = r3
            java.lang.String r3 = "1.16.11"
            r1.sdkVersion = r3
            if (r2 == 0) goto L5c
            java.lang.String r3 = r2.getApiKey()
            r1.apiKey = r3
            java.lang.String r2 = r2.getUserId()
            r1.userId = r2
        L5c:
            com.inappstory.sdk.stories.api.models.CachedSessionData r2 = com.inappstory.sdk.stories.api.models.CachedSessionData.getInstance(r6)
            java.lang.String r2 = r2.sessionId
            r1.sessionId = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toLanguageTag()
            r1.lang = r3
            android.content.ContentResolver r3 = r6.getContentResolver()
            java.lang.String r4 = "android_id"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r4)
            r1.deviceId = r3
            java.util.ArrayList r3 = r6.generatePlaceholders()
            r1.placeholders = r3
            com.inappstory.sdk.game.reader.SafeAreaInsets r3 = new com.inappstory.sdk.game.reader.SafeAreaInsets
            r3.<init>()
            r4 = 28
            if (r2 < r4) goto Lc7
            android.view.Window r2 = r6.getWindow()
            if (r2 == 0) goto Lc7
            android.view.Window r2 = r6.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.WindowInsets r2 = defpackage.mc4.a(r2)
            if (r2 == 0) goto Lc7
            int r4 = r2.getSystemWindowInsetTop()
            int r4 = com.inappstory.sdk.stories.utils.Sizes.pxToDpExt(r4, r6)
            r3.top = r4
            int r4 = r2.getSystemWindowInsetBottom()
            int r4 = com.inappstory.sdk.stories.utils.Sizes.pxToDpExt(r4, r6)
            r3.bottom = r4
            int r4 = r2.getSystemWindowInsetLeft()
            int r4 = com.inappstory.sdk.stories.utils.Sizes.pxToDpExt(r4, r6)
            r3.left = r4
            int r2 = r2.getSystemWindowInsetRight()
            int r2 = com.inappstory.sdk.stories.utils.Sizes.pxToDpExt(r2, r6)
            r3.right = r2
        Lc7:
            r1.safeAreaInsets = r3
            com.inappstory.sdk.game.reader.GameManager r2 = r6.manager
            java.lang.String r2 = r2.gameCenterId
            if (r2 == 0) goto Ld1
            r1.gameInstanceId = r2
        Ld1:
            java.lang.String r0 = com.inappstory.sdk.network.JsonParser.getJson(r1)     // Catch: java.lang.Exception -> Ld5
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.game.reader.GameActivity.generateJsonConfig():java.lang.String");
    }

    private String generateJsonPlaceholders() {
        try {
            return JsonParser.getJson(generatePlaceholders());
        } catch (Exception e2) {
            e2.printStackTrace();
            return "[]";
        }
    }

    private ArrayList<GameDataPlaceholder> generatePlaceholders() {
        Map<String, String> placeholders = InAppStoryManager.getInstance().getPlaceholders();
        Map<String, ImagePlaceholderValue> imagePlaceholdersValues = InAppStoryManager.getInstance().getImagePlaceholdersValues();
        ArrayList<GameDataPlaceholder> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                arrayList.add(new GameDataPlaceholder("text", entry.getKey(), entry.getValue()));
            }
        }
        for (Map.Entry<String, ImagePlaceholderValue> entry2 : imagePlaceholdersValues.entrySet()) {
            if (entry2.getKey() != null && entry2.getValue() != null && entry2.getValue().getType() == ImagePlaceholderType.URL) {
                arrayList.add(new GameDataPlaceholder(ElementGenerator.TYPE_IMAGE, entry2.getKey(), entry2.getValue().getUrl()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GameStoryData getStoryDataModel() {
        if (this.storyDataModel == null) {
            if (getIntent().getStringExtra("storyId") == null) {
                return null;
            }
            this.storyDataModel = new GameStoryData(Integer.parseInt(getIntent().getStringExtra("storyId")), getIntent().getIntExtra("slideIndex", 0), getIntent().getIntExtra("slidesCount", 0), getIntent().getStringExtra("title"), getIntent().getStringExtra("tags"), getIntent().getStringExtra("feedId"), Story.storyTypeFromName(getIntent().getStringExtra("storyType")));
        }
        return this.storyDataModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideView(View view) {
        if (view == null) {
            return;
        }
        this.onBackPressedLocked = true;
        view.animate().alpha(0.0f).setDuration(500L).setListener(new o(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initGame(String str) {
        this.webView.evaluateJavascript(str, null);
    }

    private void initWebView() {
        GameStoryData storyDataModel = getStoryDataModel();
        this.webView.setWebViewClient(new IASWebViewClient());
        this.webView.setWebChromeClient(new f(storyDataModel));
        this.webView.addJavascriptInterface(new GameJSInterface(this, this.manager), "Android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseGame() {
        IASWebView iASWebView = this.webView;
        if (iASWebView != null) {
            iASWebView.evaluateJavascript("pauseUI();", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceConfigs() {
        String str = this.manager.gameConfig;
        if (str != null) {
            if (str.contains("{{%sdkVersion}}")) {
                GameManager gameManager = this.manager;
                gameManager.gameConfig = gameManager.gameConfig.replace("{{%sdkVersion}}", BuildConfig.VERSION_NAME);
            }
            if (!this.manager.gameConfig.contains("{{%sdkConfig}}") && !this.manager.gameConfig.contains("\"{{%sdkConfig}}\"")) {
                if (this.manager.gameConfig.contains("{{%sdkPlaceholders}}") || this.manager.gameConfig.contains("\"{{%sdkPlaceholders}}\"")) {
                    String generateJsonPlaceholders = generateJsonPlaceholders();
                    GameManager gameManager2 = this.manager;
                    gameManager2.gameConfig = gameManager2.gameConfig.replace("\"{{%sdkPlaceholders}}\"", generateJsonPlaceholders);
                    GameManager gameManager3 = this.manager;
                    gameManager3.gameConfig = gameManager3.gameConfig.replace("{{%sdkPlaceholders}}", generateJsonPlaceholders);
                    return;
                }
                return;
            }
            String generateJsonConfig = generateJsonConfig();
            GameManager gameManager4 = this.manager;
            gameManager4.gameConfig = gameManager4.gameConfig.replace("\"{{%sdkConfig}}\"", generateJsonConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceGameInstanceStorageData(Map<String, Object> map) throws JSONException {
        if (map != null && !map.isEmpty()) {
            String str = "gameInstance_" + this.manager.gameCenterId + "__" + InAppStoryService.getInstance().getUserId();
            String string = KeyValueStorage.getString(str);
            if (string == null) {
                KeyValueStorage.saveString(str, JsonParser.mapToJsonString(map));
                return;
            }
            HashMap hashMap = new HashMap(JsonParser.toObjectMap(new JSONObject(string)));
            for (String str2 : map.keySet()) {
                hashMap.put(str2, map.get(str2));
            }
            KeyValueStorage.saveString(str, JsonParser.mapToJsonString(hashMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeGame() {
        IASWebView iASWebView = this.webView;
        if (iASWebView != null) {
            iASWebView.evaluateJavascript("resumeUI();", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayout() {
        int i2;
        if (this.isFullscreen) {
            if (Build.VERSION.SDK_INT >= 26) {
                i2 = 16;
            } else {
                i2 = 0;
            }
            getWindow().getDecorView().setSystemUiVisibility(i2 | 1792);
            getWindow().getAttributes().flags |= 201326592;
            getWindow().setNavigationBarColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoader(File file) {
        if (file != null && file.exists()) {
            ImageLoader.getInstance().displayImage(file.getAbsolutePath(), -1, this.loader);
        } else {
            this.loader.setBackgroundColor(-16777216);
        }
    }

    private void setLoaderOld() {
        String str = this.manager.splashImagePath;
        if (str != null && !str.isEmpty() && InAppStoryService.isNotNull()) {
            ImageLoader.getInstance().displayImage(this.manager.splashImagePath, -1, this.loader, InAppStoryService.getInstance().getCommonCache());
        } else {
            this.loader.setBackgroundColor(-16777216);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private void setViews() {
        View view;
        this.webView = (IASWebView) findViewById(R.id.gameWebview);
        this.loader = (ImageView) findViewById(R.id.loader);
        this.baseContainer = findViewById(R.id.draggable_frame);
        this.loaderContainer = (RelativeLayout) findViewById(R.id.loaderContainer);
        ImageView imageView = (ImageView) findViewById(R.id.gameRefresh);
        this.refreshGame = imageView;
        imageView.setImageDrawable(getResources().getDrawable(AppearanceManager.getCommonInstance().csRefreshIcon()));
        IGameReaderLoaderView csGameReaderLoaderView = AppearanceManager.getCommonInstance().csGameReaderLoaderView();
        IGameLoaderView csGameLoaderView = AppearanceManager.getCommonInstance().csGameLoaderView();
        if (csGameReaderLoaderView != null) {
            this.loaderView = csGameReaderLoaderView;
            this.customLoaderView = csGameReaderLoaderView.getView(this);
        } else if (csGameLoaderView != null) {
            this.loaderView = csGameLoaderView;
            this.customLoaderView = csGameLoaderView.getView();
        } else {
            GameReaderLoadProgressBar gameReaderLoadProgressBar = new GameReaderLoadProgressBar(this);
            this.loaderView = gameReaderLoadProgressBar;
            this.customLoaderView = gameReaderLoadProgressBar;
        }
        this.loaderView.setIndeterminate(true);
        if (Sizes.isTablet() && (view = this.baseContainer) != null) {
            view.setOnClickListener(new u());
        }
        View findViewById = findViewById(R.id.close_button);
        this.closeButton = findViewById;
        findViewById.setOnClickListener(new v());
        this.webViewContainer = findViewById(R.id.webViewContainer);
        initWebView();
        if (Sizes.isTablet()) {
            getWindow().setStatusBarColor(-16777216);
        }
        this.refreshGame.setOnClickListener(new a());
        this.loaderContainer.addView(this.customLoaderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareCustomOrDefault(IASShareData iASShareData) {
        int i2;
        int i3;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.isShareProcess(false);
        }
        if (CallbackManager.getInstance().getShareCallback() != null) {
            GameStoryData storyDataModel = getStoryDataModel();
            if (storyDataModel != null) {
                int i4 = storyDataModel.storyId;
                i3 = storyDataModel.slideIndex;
                i2 = i4;
            } else {
                i2 = -1;
                i3 = 0;
            }
            ScreensManager.getInstance().openOverlapContainerForShare(this, this, null, i2, i3, iASShareData);
            return;
        }
        new IASShareManager().shareDefault(StoryShareBroadcastReceiver.class, this, iASShareData);
    }

    @TargetApi(21)
    public void askForPermission(String str, String str2, int i2) {
        if (iu1.a(getApplicationContext(), str2) != 0) {
            if (l5.w(this, str2)) {
                l5.t(this, new String[]{str2}, i2);
                return;
            } else {
                l5.t(this, new String[]{str2}, i2);
                return;
            }
        }
        PermissionRequest permissionRequest = this.audioRequest;
        if (permissionRequest != null) {
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    public void close() {
        closeGame();
    }

    @Override // com.inappstory.sdk.stories.ui.OverlapFragmentObserver
    public void closeView(HashMap<String, Object> hashMap) {
        new Handler(Looper.getMainLooper()).post(new m(hashMap));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.empty_animation, R.anim.alpha_fade_out);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gameCompleted(String str, String str2) {
        String stringExtra;
        qq6<GameCompleteEvent> gameObserver;
        try {
            GameManager gameManager = this.manager;
            if (gameManager != null && str2 != null) {
                gameManager.tapOnLink(str2);
            }
            GameStoryData storyDataModel = getStoryDataModel();
            if (storyDataModel != null) {
                Intent intent = new Intent();
                this.closing = true;
                intent.putExtra("storyId", storyDataModel.storyId);
                intent.putExtra("slideIndex", storyDataModel.slideIndex);
                if (str != null) {
                    intent.putExtra("gameState", str);
                }
                if (Sizes.isTablet() && (stringExtra = getIntent().getStringExtra("observableUID")) != null && (gameObserver = ScreensManager.getInstance().getGameObserver(stringExtra)) != null) {
                    gameObserver.l(new GameCompleteEvent(str, storyDataModel.storyId, storyDataModel.slideIndex));
                }
                setResult(-1, intent);
                finish();
                return;
            }
            finish();
        } catch (Exception e2) {
            InAppStoryService.createExceptionLog(e2);
            this.closing = false;
        }
    }

    void gameReaderAudioFocusChange(int i2) {
        IASWebView iASWebView = this.webView;
        if (iASWebView != null) {
            iASWebView.evaluateJavascript("('handleAudioFocusChange' in window) && handleAudioFocusChange(" + i2 + ");", null);
        }
    }

    void gameReaderGestureBack() {
        IASWebView iASWebView = this.webView;
        if (iASWebView != null) {
            if (this.manager.gameLoaded) {
                iASWebView.evaluateJavascript("gameReaderGestureBack();", new k());
            } else {
                gameCompleted(null, null);
            }
        }
    }

    void goodsWidgetComplete(String str) {
        if (this.manager.gameLoaded) {
            IASWebView iASWebView = this.webView;
            iASWebView.evaluateJavascript("goodsWidgetComplete(\"" + str + "\");", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadJsApiResponse(String str, String str2) {
        IASWebView iASWebView = this.webView;
        iASWebView.evaluateJavascript(str2 + "('" + str + "');", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        String oldTempShareId;
        boolean z;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 909) {
            if (Build.VERSION.SDK_INT >= 22) {
                oldTempShareId = ScreensManager.getInstance().getTempShareId();
            } else {
                oldTempShareId = ScreensManager.getInstance().getOldTempShareId();
            }
            if (i3 == -1) {
                z = true;
            } else {
                z = false;
            }
            shareComplete(oldTempShareId, z);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.onBackPressedLocked) {
            return;
        }
        if (this.gameReaderGestureBack) {
            gameReaderGestureBack();
        } else {
            closeGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cs_activity_game);
        if (InAppStoryManager.isNull()) {
            finish();
            return;
        }
        ScreensManager.getInstance().currentGameActivity = this;
        GameManager gameManager = new GameManager(this);
        this.manager = gameManager;
        gameManager.callback = new i();
        setViews();
        checkInsets();
        checkIntentValues(this.gameLoadedCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        try {
            DownloadInterruption downloadInterruption = this.interruption;
            if (downloadInterruption != null) {
                downloadInterruption.active = true;
            }
            ImageView imageView = this.refreshGame;
            if (imageView != null) {
                imageView.removeCallbacks(this.showRefresh);
            }
        } catch (Exception unused) {
        }
        if (ScreensManager.getInstance().currentGameActivity == this) {
            ScreensManager.getInstance().currentGameActivity = null;
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        pauseGame();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 101) {
            PermissionRequest permissionRequest = this.audioRequest;
            if (permissionRequest != null && iArr.length > 0 && iArr[0] == 0) {
                permissionRequest.grant(permissionRequest.getResources());
            } else {
                permissionRequest.deny();
            }
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.shareViewIsShown) {
            this.manager.onResume();
            resumeGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAudioManagerMode(String str) {
        ((AudioManager) getSystemService("audio")).setMode(AudioModes.getModeVal(str));
    }

    public void share(InnerShareData innerShareData) {
        IASShareData iASShareData = new IASShareData(innerShareData.getText(), innerShareData.getPayload());
        if (!innerShareData.getFiles().isEmpty()) {
            new InnerShareFilesPrepare().prepareFiles(this, new c(iASShareData), innerShareData.getFiles());
        } else {
            shareCustomOrDefault(iASShareData);
        }
    }

    public void shareComplete(String str, boolean z) {
        IASWebView iASWebView = this.webView;
        iASWebView.loadUrl("javascript:(function(){share_complete(\"" + str + "\", " + z + ");})()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showGoods(String str, String str2) {
        GameStoryData storyDataModel = getStoryDataModel();
        if (storyDataModel == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new r(str, str2, storyDataModel));
    }

    public void tapOnLinkDefault(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            startActivity(intent);
            overridePendingTransition(R.anim.popup_show, R.anim.empty_animation);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "Can't open this url: " + str, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateUI() {
        GameStoryData storyDataModel = getStoryDataModel();
        if (storyDataModel != null) {
            ProfilingManager profilingManager = ProfilingManager.getInstance();
            profilingManager.setReady("game_init" + storyDataModel.storyId + "_" + storyDataModel.slideIndex);
        }
        runOnUiThread(new t());
    }

    @Override // com.inappstory.sdk.stories.ui.OverlapFragmentObserver
    public void viewIsOpened() {
        new Handler(Looper.getMainLooper()).post(new n());
    }

    private void downloadGame(String str, GameDownloadCallback gameDownloadCallback) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.gameCacheManager().getGame(str, new g(gameDownloadCallback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements FileLoadProgressCallback {
        final /* synthetic */ GameSplashScreen a;
        final /* synthetic */ String b;

        d(GameSplashScreen gameSplashScreen, String str) {
            this.a = gameSplashScreen;
            this.b = str;
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onSuccess(File file) {
            if (file != null && file.exists()) {
                GameSplashScreen gameSplashScreen = this.a;
                if (FileManager.checkShaAndSize(file, gameSplashScreen.size, gameSplashScreen.sha1)) {
                    KeyValueStorage.saveString("gameInstanceSplash_" + GameActivity.this.manager.gameCenterId, file.getAbsolutePath());
                    GameActivity gameActivity = GameActivity.this;
                    if (!gameActivity.hasSplashFile) {
                        gameActivity.setLoader(file);
                        return;
                    } else if (this.b != null) {
                        File file2 = new File(this.b);
                        if (file2.exists()) {
                            file2.delete();
                        }
                        GameActivity.this.setLoader(file2);
                        return;
                    } else {
                        return;
                    }
                }
                file.delete();
            }
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onError(String str) {
        }

        @Override // com.inappstory.sdk.utils.ProgressCallback
        public void onProgress(long j, long j2) {
        }
    }
}
