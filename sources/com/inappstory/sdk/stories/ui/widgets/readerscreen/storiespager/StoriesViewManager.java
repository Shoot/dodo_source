package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.game.reader.GameReaderLoadProgressBar;
import com.inappstory.sdk.game.reader.GameStoryData;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.network.jsapiclient.JsApiClient;
import com.inappstory.sdk.network.jsapiclient.JsApiResponseCallback;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.slidestructure.SlideStructure;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowSlideCallback;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.dialog.ContactDialog;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.SimpleStoriesGeneratedView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.webview.SimpleStoriesWebView;
import com.inappstory.sdk.stories.utils.AudioModes;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
import com.inappstory.sdk.stories.utils.WebPageConvertCallback;
import com.inappstory.sdk.stories.utils.WebPageConverter;
import com.inappstory.sdk.utils.StringsUtils;
import com.inappstory.sdk.utils.ZipLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class StoriesViewManager {
    public static final Pattern FONT_SRC = Pattern.compile("@font-face [^}]*src: url\\(['\"](http[^'\"]*)['\"]\\)");
    Context context;
    ReaderPageManager pageManager;
    private GameReaderLoadProgressBar progressBar;
    ShowLoader showLoader;
    ShowRefresh showRefresh;
    SimpleStoriesView storiesView;
    public int storyId;
    public int index = -1;
    public int loadedIndex = -1;
    public int loadedId = -1;
    int slideInCache = 0;
    private int latestVisibleIndex = -1;
    Handler showRefreshHandler = new Handler(Looper.getMainLooper());
    boolean lastLoadIsEmpty = false;
    boolean notFirstLoading = false;
    WebPageConverter converter = new WebPageConverter();
    boolean isVideo = false;
    private boolean storyIsLoaded = false;
    public int source = 0;
    private final Object latestIndexLock = new Object();

    /* loaded from: classes3.dex */
    public class ShowLoader implements Runnable {
        int slideIndex;

        public ShowLoader(int i) {
            this.slideIndex = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesViewManager.this.clearShowLoader();
            int i = this.slideIndex;
            StoriesViewManager storiesViewManager = StoriesViewManager.this;
            int i2 = storiesViewManager.index;
            if (i == i2) {
                storiesViewManager.pageManager.showLoader(i2);
            }
            StoriesViewManager storiesViewManager2 = StoriesViewManager.this;
            SimpleStoriesView simpleStoriesView = storiesViewManager2.storiesView;
            if (simpleStoriesView != null) {
                simpleStoriesView.clearSlide(storiesViewManager2.getLatestVisibleIndex());
            }
            StoriesViewManager.this.setLatestVisibleIndex(-1);
        }
    }

    /* loaded from: classes3.dex */
    public class ShowRefresh implements Runnable {
        int slideIndex;

        public ShowRefresh(int i) {
            this.slideIndex = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesViewManager.this.clearShowLoader();
            StoriesViewManager.this.clearShowRefresh();
            int i = this.slideIndex;
            StoriesViewManager storiesViewManager = StoriesViewManager.this;
            int i2 = storiesViewManager.index;
            if (i == i2) {
                storiesViewManager.pageManager.slideLoadError(i2);
            }
            StoriesViewManager storiesViewManager2 = StoriesViewManager.this;
            SimpleStoriesView simpleStoriesView = storiesViewManager2.storiesView;
            if (simpleStoriesView != null) {
                simpleStoriesView.clearSlide(storiesViewManager2.getLatestVisibleIndex());
            }
            StoriesViewManager.this.setLatestVisibleIndex(-1);
        }
    }

    /* loaded from: classes3.dex */
    class a implements JsApiResponseCallback {
        a() {
        }

        @Override // com.inappstory.sdk.network.jsapiclient.JsApiResponseCallback
        public void onJsApiResponse(String str, String str2) {
            StoriesViewManager.this.storiesView.loadJsApiResponse(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements WebPageConvertCallback {
        b() {
        }

        @Override // com.inappstory.sdk.stories.utils.WebPageConvertCallback
        public void onConvert(String str, String str2, int i) {
            StoriesViewManager storiesViewManager = StoriesViewManager.this;
            if (storiesViewManager.index != i) {
                return;
            }
            storiesViewManager.loadWebData(str2, str);
        }
    }

    /* loaded from: classes3.dex */
    class c implements ContactDialog.SendListener {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                StoriesViewManager.this.storiesView.sendDialog(this.a, this.b);
            }
        }

        c() {
        }

        @Override // com.inappstory.sdk.stories.ui.dialog.ContactDialog.SendListener
        public void onSend(String str, String str2) {
            new Handler(Looper.getMainLooper()).post(new a(str, str2));
        }
    }

    /* loaded from: classes3.dex */
    class d implements ContactDialog.CancelListener {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                StoriesViewManager.this.storiesView.cancelDialog(this.a);
            }
        }

        d() {
        }

        @Override // com.inappstory.sdk.stories.ui.dialog.ContactDialog.CancelListener
        public void onCancel(String str) {
            new Handler(Looper.getMainLooper()).post(new a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesViewManager.this.resumeStory();
        }
    }

    public StoriesViewManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowLoader() {
        synchronized (this.latestIndexLock) {
            ShowLoader showLoader = this.showLoader;
            if (showLoader != null) {
                try {
                    this.showRefreshHandler.removeCallbacks(showLoader);
                } catch (Exception unused) {
                }
            }
            this.showLoader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowRefresh() {
        synchronized (this.latestIndexLock) {
            ShowRefresh showRefresh = this.showRefresh;
            if (showRefresh != null) {
                try {
                    this.showRefreshHandler.removeCallbacks(showRefresh);
                } catch (Exception unused) {
                }
            }
            this.showRefresh = null;
        }
    }

    private GameStoryData getGameStoryData() {
        Story.StoryType storyType;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        String str = null;
        if (inAppStoryService == null || inAppStoryService.getDownloadManager() == null) {
            return null;
        }
        ReaderPageManager readerPageManager = this.pageManager;
        if (readerPageManager != null) {
            storyType = readerPageManager.getStoryType();
        } else {
            storyType = Story.StoryType.COMMON;
        }
        Story.StoryType storyType2 = storyType;
        Story storyById = inAppStoryService.getDownloadManager().getStoryById(this.storyId, storyType2);
        if (storyById == null) {
            return null;
        }
        int i = storyById.id;
        int i2 = storyById.lastIndex;
        int i3 = storyById.slidesCount;
        String str2 = storyById.statTitle;
        String str3 = storyById.tags;
        ReaderPageManager readerPageManager2 = this.pageManager;
        if (readerPageManager2 != null) {
            str = readerPageManager2.getFeedId();
        }
        return new GameStoryData(i, i2, i3, str2, str3, str, storyType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLatestVisibleIndex() {
        int i;
        synchronized (this.latestIndexLock) {
            i = this.latestVisibleIndex;
        }
        return i;
    }

    private void initViews(SlideStructure slideStructure) {
        ((SimpleStoriesGeneratedView) this.storiesView).initViews(slideStructure);
    }

    private void logMemory() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
        long maxMemory = runtime.maxMemory() / 1048576;
        Log.e("memoryUsage", freeMemory + " " + (maxMemory - freeMemory) + " " + maxMemory);
    }

    private void sendShowStoryEvents() {
        ReaderPageManager readerPageManager = this.pageManager;
        if (readerPageManager != null) {
            readerPageManager.sendShowStoryEvents(this.storyId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestVisibleIndex(int i) {
        synchronized (this.latestIndexLock) {
            this.latestVisibleIndex = i;
        }
    }

    public void changeIndex(int i) {
        this.pageManager.openSlideByIndex(i);
    }

    public void changeSoundStatus() {
        this.storiesView.changeSoundStatus();
    }

    public void freezeUI() {
        this.storiesView.freezeUI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void gameComplete(String str) {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView instanceof SimpleStoriesWebView) {
            ((SimpleStoriesWebView) simpleStoriesView).gameComplete(str);
        }
    }

    public File getCachedFile(String str, String str2) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null) {
            return null;
        }
        LruDiskCache commonCache = inAppStoryService.getCommonCache();
        try {
            return Downloader.updateFile(commonCache.getFullFile(str2), str, commonCache, str2);
        } catch (Exception e2) {
            InAppStoryService.createExceptionLog(e2);
            return null;
        }
    }

    public float getClickCoordinate() {
        return this.storiesView.getCoordinate();
    }

    String getLayoutWithFonts(String str) {
        ArrayList<String> arrayList = new ArrayList();
        Matcher matcher = FONT_SRC.matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 1) {
                arrayList.add(this.converter.fromHtml(matcher.group(1)).toString());
            }
        }
        for (String str2 : arrayList) {
            String fontFile = Downloader.getFontFile(str2);
            if (fontFile != null) {
                str = str.replaceFirst(str2, ZipLoader.FILE + fontFile);
            }
        }
        return str;
    }

    public ReaderPageManager getPageManager() {
        return this.pageManager;
    }

    public GameReaderLoadProgressBar getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void goodsWidgetComplete(String str) {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            simpleStoriesView.goodsWidgetComplete(str);
        }
    }

    void innerLoad(Story story) {
        try {
            setWebViewSettings(story);
        } catch (IOException e2) {
            InAppStoryService.createExceptionLog(e2);
        }
    }

    public void loadEmptyData(String str, String str2) {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (!(simpleStoriesView instanceof SimpleStoriesWebView)) {
            return;
        }
        ((SimpleStoriesWebView) simpleStoriesView).loadWebData(str, str2);
        this.lastLoadIsEmpty = true;
    }

    public void loadStory(int i, int i2) {
        if (InAppStoryService.isNull()) {
            return;
        }
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(i, this.pageManager.getStoryType());
        synchronized (this) {
            try {
                if (this.loadedId == i && this.loadedIndex == i2) {
                    return;
                }
                if (storyById != null && !storyById.checkIfEmpty()) {
                    if (storyById.getSlidesCount() <= i2) {
                        return;
                    }
                    this.storyId = i;
                    this.index = i2;
                    this.loadedIndex = i2;
                    this.loadedId = i;
                    int checkIfPageLoaded = InAppStoryService.getInstance().getDownloadManager().checkIfPageLoaded(i, i2, this.pageManager.getStoryType());
                    this.slideInCache = checkIfPageLoaded;
                    if (checkIfPageLoaded == 1) {
                        innerLoad(storyById);
                        this.pageManager.slideLoadedInCache(i2, true);
                    } else if (checkIfPageLoaded == -1) {
                        this.pageManager.slideLoadError(i2);
                    } else if (!InAppStoryService.isConnected()) {
                        if (CallbackManager.getInstance().getErrorCallback() != null) {
                            CallbackManager.getInstance().getErrorCallback().noConnection();
                        }
                    } else {
                        this.pageManager.storyLoadStart();
                    }
                }
            } finally {
            }
        }
    }

    public void loadWebData(String str, String str2) {
        if (!(this.storiesView instanceof SimpleStoriesWebView)) {
            return;
        }
        clearShowLoader();
        clearShowRefresh();
        synchronized (this.latestIndexLock) {
            this.showRefresh = new ShowRefresh(this.index);
            ShowLoader showLoader = new ShowLoader(this.index);
            this.showLoader = showLoader;
            this.showRefreshHandler.postDelayed(showLoader, 500L);
            this.showRefreshHandler.postDelayed(this.showRefresh, 5000L);
            Log.e("showRefreshHandler", "create showLoader");
            Log.e("showRefreshHandler", "create showRefresh");
        }
        ((SimpleStoriesWebView) this.storiesView).loadWebData(str, str2);
    }

    public void openGameReaderFromGameCenter(String str) {
        Context context;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null && (context = this.context) != null) {
            inAppStoryService.openGameReaderWithGC(context, getGameStoryData(), str);
        }
    }

    public void openGameReaderWithoutGameCenter(String str, String str2, String str3, String str4, String str5) {
        ProfilingManager profilingManager = ProfilingManager.getInstance();
        profilingManager.addTask("game_init", "game_" + this.storyId + "_" + this.index);
        ScreensManager.getInstance().openGameReader(this.context, getGameStoryData(), null, str, str2, str3, str4, str5);
    }

    public void pauseStory() {
        this.storiesView.slidePause();
    }

    public void pauseUI() {
        ReaderPageManager readerPageManager = this.pageManager;
        if (readerPageManager != null) {
            readerPageManager.pauseSlide(false);
        }
    }

    public void playStory() {
        if (this.storyIsLoaded) {
            sendShowStoryEvents();
            sendShowSlideEvents();
            this.storiesView.slideStart();
        }
    }

    public void resetTimers() {
        this.pageManager.resetCurrentDuration();
    }

    public void restartStory() {
        this.storiesView.restartVideo();
    }

    public void restartStoryWithDuration(long j) {
        this.pageManager.restartCurrentWithDuration(j);
    }

    public void resumeStory() {
        this.storiesView.resumeVideo();
    }

    public void resumeUI() {
        ReaderPageManager readerPageManager = this.pageManager;
        if (readerPageManager != null) {
            readerPageManager.resumeSlide(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void screenshotShare() {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            simpleStoriesView.screenshotShare();
        }
    }

    public void sendApiRequest(String str) {
        new JsApiClient(this.storiesView.getContext()).sendApiRequest(str, new a());
    }

    public void sendShowSlideEvents() {
        ShowSlideCallback showSlideCallback;
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.pageManager.getStoryType());
        if (storyById != null && (showSlideCallback = CallbackManager.getInstance().getShowSlideCallback()) != null) {
            int i = storyById.id;
            String nonNull = StringsUtils.getNonNull(storyById.statTitle);
            String nonNull2 = StringsUtils.getNonNull(storyById.tags);
            int slidesCount = storyById.getSlidesCount();
            int i2 = this.index;
            showSlideCallback.showSlide(i, nonNull, nonNull2, slidesCount, i2, storyById.getSlideEventPayload(i2));
        }
    }

    public void sendStoryWidgetEvent(String str, String str2, String str3) {
        String str4;
        if (str2 != null) {
            StatisticManager statisticManager = StatisticManager.getInstance();
            ReaderPageManager readerPageManager = this.pageManager;
            if (readerPageManager != null) {
                str4 = readerPageManager.getFeedId();
            } else {
                str4 = null;
            }
            statisticManager.sendStoryWidgetEvent(str, str2, str4);
        }
        if (str3 != null) {
            this.pageManager.widgetEvent(str, str3);
        }
    }

    public void setAudioManagerMode(String str) {
        Context context = this.context;
        if (context == null) {
            return;
        }
        ((AudioManager) context.getSystemService("audio")).setMode(AudioModes.getModeVal(str));
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPageManager(ReaderPageManager readerPageManager) {
        this.pageManager = readerPageManager;
    }

    public void setProgressBar(GameReaderLoadProgressBar gameReaderLoadProgressBar) {
        this.progressBar = gameReaderLoadProgressBar;
    }

    public void setStoriesView(SimpleStoriesView simpleStoriesView) {
        this.storiesView = simpleStoriesView;
        simpleStoriesView.checkIfClientIsSet();
    }

    public void setStoryId(int i) {
        this.storyId = i;
    }

    void setWebViewSettings(Story story) throws IOException {
        String str = story.pages.get(this.index);
        String layout = story.getLayout();
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null && (simpleStoriesView instanceof SimpleStoriesWebView)) {
            b bVar = new b();
            ((SimpleStoriesWebView) this.storiesView).setLayerType(2, null);
            if (str.contains("<video")) {
                this.isVideo = true;
            } else {
                this.isVideo = false;
            }
            this.converter.replaceDataAndLoad(str, story, this.index, layout, bVar);
        }
    }

    public void share(String str, String str2) {
        Story story;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null && !inAppStoryService.isShareProcess()) {
            inAppStoryService.isShareProcess(true);
            InnerShareData innerShareData = (InnerShareData) JsonParser.fromJson(str2, InnerShareData.class);
            if (Build.VERSION.SDK_INT >= 22) {
                ScreensManager.getInstance().setTempShareId(str);
                ScreensManager.getInstance().setTempShareStoryId(this.storyId);
            } else {
                ScreensManager.getInstance().setOldTempShareId(str);
                ScreensManager.getInstance().setOldTempShareStoryId(this.storyId);
            }
            if (InAppStoryService.getInstance() != null) {
                story = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.pageManager.getStoryType());
            } else {
                story = null;
            }
            if (story != null && innerShareData != null) {
                innerShareData.payload = story.getSlideEventPayload(this.index);
                this.pageManager.parentManager.showShareView(innerShareData, this.storyId, this.index);
                return;
            }
            inAppStoryService.isShareProcess(false);
        }
    }

    public void shareComplete(String str, boolean z) {
        this.storiesView.shareComplete(str, z);
    }

    public void showSingleStory(int i, int i2) {
        this.pageManager.showSingleStory(i, i2);
    }

    public void slideLoadError(int i) {
        clearShowRefresh();
        clearShowLoader();
        setLatestVisibleIndex(-1);
        this.pageManager.slideLoadError(i);
    }

    public void stopStory() {
        this.storiesView.stopVideo();
    }

    public void storyClick(String str) {
        if (str != null && !str.isEmpty() && !str.equals("test")) {
            if (str.equals("forbidden")) {
                this.pageManager.storyClick(null, (int) getClickCoordinate(), true);
                return;
            } else {
                this.pageManager.storyClick(str, (int) getClickCoordinate(), false);
                return;
            }
        }
        this.pageManager.storyClick(null, (int) getClickCoordinate(), false);
    }

    public void storyLoaded(int i, int i2, boolean z) {
        this.index = i2;
        this.loadedIndex = i2;
        this.loadedId = i;
        if (z) {
            return;
        }
        innerLoad(InAppStoryService.getInstance() != null ? InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.pageManager.getStoryType()) : null);
    }

    public void storyResumedEvent(double d2) {
        InAppStoryService.isNull();
    }

    public void storySendData(String str) {
        if (!InAppStoryService.getInstance().getSendStatistic()) {
            return;
        }
        NetworkClient.getApi().sendStoryData(Integer.toString(this.storyId), str, Session.getInstance().id).enqueue(new g());
    }

    public void storySetLocalData(String str, boolean z) {
        KeyValueStorage.saveString("story" + this.storyId + "__" + InAppStoryService.getInstance().getUserId(), str);
        if (InAppStoryService.getInstance().getSendStatistic() && z) {
            NetworkClient.getApi().sendStoryData(Integer.toString(this.storyId), str, Session.getInstance().id).enqueue(new f());
        }
    }

    public void storyShowNext() {
        this.pageManager.nextStory(4);
    }

    public void storyShowPrev() {
        this.pageManager.prevStory(4);
    }

    public void storyShowTextInput(String str, String str2) {
        new ContactDialog(this.storyId, str, str2, new c(), new d()).showDialog((Activity) this.storiesView.getContext());
    }

    public void storyStartedEvent() {
        if (InAppStoryService.isNotNull()) {
            this.pageManager.startStoryTimers();
        }
        ProfilingManager profilingManager = ProfilingManager.getInstance();
        profilingManager.setReady(this.storyId + "_" + this.index);
        logMemory();
    }

    public void swipeUp() {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            simpleStoriesView.swipeUp();
        }
    }

    public void storyLoaded(int i, int i2) {
        storyLoaded(i, i2, false);
    }

    public StoriesViewManager(Context context) {
        this.context = context;
    }

    public void storyLoaded(int i) {
        if (InAppStoryService.isNull()) {
            return;
        }
        clearShowLoader();
        clearShowRefresh();
        this.storyIsLoaded = true;
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.pageManager.getStoryType());
        if (i >= 0 && storyById.lastIndex != i) {
            stopStory();
        } else if (InAppStoryService.getInstance().getCurrentId() != this.storyId) {
            stopStory();
            setLatestVisibleIndex(i);
        } else {
            setLatestVisibleIndex(i);
            this.pageManager.currentSlideIsLoaded = true;
            playStory();
            new Handler().postDelayed(new e(), 200L);
        }
        this.pageManager.host.storyLoadedSuccess();
    }

    public void pageFinished() {
    }

    public void pauseByClick() {
    }

    /* loaded from: classes3.dex */
    class f extends NetworkCallback<Response> {
        f() {
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
    class g extends NetworkCallback<Response> {
        g() {
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

    void setWebViewSettingsAndLoadEmpty(Story story) {
    }

    void loadStoryInner(int i, int i2, Story story) {
    }
}
