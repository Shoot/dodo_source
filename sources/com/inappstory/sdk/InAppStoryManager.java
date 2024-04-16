package com.inappstory.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.network.ApiInterface;
import com.inappstory.sdk.network.ApiSettings;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.network.utils.KeyConverter;
import com.inappstory.sdk.stories.api.models.ExceptionCache;
import com.inappstory.sdk.stories.api.models.Feed;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderValue;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryPlaceholder;
import com.inappstory.sdk.stories.api.models.callbacks.GetStoryByIdCallback;
import com.inappstory.sdk.stories.api.models.callbacks.LoadFeedCallback;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequest;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import com.inappstory.sdk.stories.api.models.logs.ExceptionLog;
import com.inappstory.sdk.stories.api.models.logs.WebConsoleLog;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.callbacks.AppClickCallback;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.callbacks.ExceptionCallback;
import com.inappstory.sdk.stories.callbacks.IShowStoryCallback;
import com.inappstory.sdk.stories.callbacks.ShareCallback;
import com.inappstory.sdk.stories.callbacks.UrlClickCallback;
import com.inappstory.sdk.stories.exceptions.ExceptionManager;
import com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback;
import com.inappstory.sdk.stories.outercallbacks.common.gamereader.GameCallback;
import com.inappstory.sdk.stories.outercallbacks.common.gamereader.GameReaderCallback;
import com.inappstory.sdk.stories.outercallbacks.common.onboarding.OnboardingLoadCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CallToActionCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickOnShareStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CustomActionCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.FavoriteStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.LikeDislikeStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowSlideCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryWidgetCallback;
import com.inappstory.sdk.stories.outercallbacks.common.single.SingleLoadCallback;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.reader.StoriesReaderSettings;
import com.inappstory.sdk.stories.utils.KeyValueStorage;
import com.inappstory.sdk.stories.utils.SessionManager;
import com.inappstory.sdk.utils.StringsUtils;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class InAppStoryManager {
    static final String DEBUG_API = "IAS debug api";
    public static final String IAS_ERROR_TAG = "InAppStory_SDK_error";
    private static InAppStoryManager INSTANCE = null;
    private static final String ONBOARDING_FEED = "onboarding";
    private static final String PRODUCT_DOMAIN = "https://api.inappstory.ru/";
    private static final int TAG_LIMIT = 4000;
    private static final String TEST_DOMAIN = "https://api.test.inappstory.com/";
    @SuppressLint({DEBUG_API})
    public static IAS_QA_Log iasQaLog = null;
    @SuppressLint({DEBUG_API})
    public static IASLogger logger = null;
    public static boolean testGenerated = false;
    String API_KEY;
    String TEST_KEY;
    public int actionBarColor;
    Context context;
    Map<String, ImagePlaceholderValue> defaultImagePlaceholders;
    Map<String, String> defaultPlaceholders;
    private ExceptionCache exceptionCache;
    private ExceptionCallback exceptionCallback;
    private Object handlerToken;
    Map<String, ImagePlaceholderValue> imagePlaceholders;
    private boolean isSandbox;
    private String lastSingleOpen;
    private Handler localHandler;
    private String localOpensKey;
    Map<String, String> placeholders;
    private final Object placeholdersLock;
    private boolean sendStatistic;
    InAppStoryService service;
    Thread serviceThread;
    private boolean soundOn;
    ArrayList<String> tags;
    private Object tagsLock;
    private String userId;
    private static final IASLogger defaultLogger = new e();
    private static final Object lock = new Object();

    /* loaded from: classes3.dex */
    public static class Builder {
        String apiKey;
        int cacheSize;
        Context context;
        Map<String, ImagePlaceholderValue> imagePlaceholders;
        Map<String, String> placeholders;
        boolean sandbox;
        ArrayList<String> tags;
        String testKey;
        String userId;

        public Builder apiKey(String str) {
            this.apiKey = str;
            return this;
        }

        public Builder cacheSize(int i) {
            this.cacheSize = i;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public InAppStoryManager create() {
            return new InAppStoryManager(this, null);
        }

        public int getCacheSize() {
            return this.cacheSize;
        }

        public Builder imagePlaceholders(Map<String, ImagePlaceholderValue> map) {
            this.imagePlaceholders = map;
            return this;
        }

        public Builder placeholders(Map<String, String> map) {
            this.placeholders = map;
            return this;
        }

        @Deprecated
        public Builder sandbox(boolean z) {
            this.sandbox = z;
            return this;
        }

        public Builder tags(ArrayList<String> arrayList) {
            this.tags = arrayList;
            return this;
        }

        public Builder testKey(String str) {
            this.testKey = str;
            return this;
        }

        public Builder userId(@NonNull String str) {
            this.userId = str;
            return this;
        }

        public String apiKey() {
            return this.apiKey;
        }

        public Map<String, String> placeholders() {
            return this.placeholders;
        }

        public boolean sandbox() {
            return this.sandbox;
        }

        public ArrayList<String> tags() {
            return this.tags;
        }

        public String testKey() {
            return this.testKey;
        }

        public String userId() {
            return this.userId;
        }

        public Builder tags(String... strArr) {
            this.tags = new ArrayList<>();
            for (String str : strArr) {
                this.tags.add(str);
            }
            return this;
        }
    }

    @SuppressLint({InAppStoryManager.DEBUG_API})
    /* loaded from: classes3.dex */
    public interface IASLogger {
        void showDLog(String str, String str2);

        void showELog(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ Integer a;
        final /* synthetic */ String b;
        final /* synthetic */ List c;
        final /* synthetic */ Context d;
        final /* synthetic */ AppearanceManager e;

        a(Integer num, String str, List list, Context context, AppearanceManager appearanceManager) {
            this.a = num;
            this.b = str;
            this.c = list;
            this.d = context;
            this.e = appearanceManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryManager.this.showOnboardingStoriesInner(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements OpenSessionCallback {
        final /* synthetic */ List a;
        final /* synthetic */ String b;
        final /* synthetic */ Integer c;
        final /* synthetic */ Context d;
        final /* synthetic */ AppearanceManager e;

        /* loaded from: classes3.dex */
        class a extends LoadFeedCallback {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                InAppStoryManager.this.loadOnboardingError(this.b);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                ProfilingManager.getInstance().setReady(this.a);
                InAppStoryManager.this.loadOnboardingError(this.b);
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadFeedCallback, com.inappstory.sdk.network.Callback
            public void onSuccess(Feed feed) {
                if (InAppStoryManager.isNull()) {
                    return;
                }
                ProfilingManager.getInstance().setReady(this.a);
                ArrayList arrayList = new ArrayList();
                Set<String> stringSet = SharedPreferencesAPI.getStringSet(InAppStoryManager.getInstance().getLocalOpensKey());
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                List<Story> list = feed.stories;
                if (list != null) {
                    for (Story story : list) {
                        boolean z = true;
                        for (String str : stringSet) {
                            if (Integer.toString(story.id).equals(str)) {
                                z = false;
                            }
                        }
                        if (z) {
                            arrayList.add(story);
                        }
                    }
                }
                b bVar = b.this;
                InAppStoryManager.this.showLoadedOnboardings(arrayList, bVar.d, bVar.e, this.b, feed.getFeedId());
            }
        }

        b(List list, String str, Integer num, Context context, AppearanceManager appearanceManager) {
            this.a = list;
            this.b = str;
            this.c = num;
            this.d = context;
            this.e = appearanceManager;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            InAppStoryManager.this.loadOnboardingError(this.b);
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            String str;
            List list = this.a;
            if (list != null) {
                str = TextUtils.join(",", list);
            } else if (InAppStoryManager.this.getTags() != null) {
                str = TextUtils.join(",", InAppStoryManager.this.getTags());
            } else {
                str = null;
            }
            String addTask = ProfilingManager.getInstance().addTask("api_onboarding");
            String str2 = this.b;
            if (str2 == null) {
                str2 = "onboarding";
            }
            ApiInterface api = NetworkClient.getApi();
            Integer num = this.c;
            if (str == null) {
                str = InAppStoryManager.this.getTagsString();
            }
            api.getOnboardingFeed(str2, num, str).enqueue(new a(addTask, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ AppearanceManager c;
        final /* synthetic */ IShowStoryCallback d;
        final /* synthetic */ Integer e;
        final /* synthetic */ Story.StoryType f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        c(String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback, Integer num, Story.StoryType storyType, int i, int i2) {
            this.a = str;
            this.b = context;
            this.c = appearanceManager;
            this.d = iShowStoryCallback;
            this.e = num;
            this.f = storyType;
            this.g = i;
            this.h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryManager.this.showStoryInner(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements GetStoryByIdCallback {
        final /* synthetic */ InAppStoryService a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;
        final /* synthetic */ AppearanceManager d;
        final /* synthetic */ IShowStoryCallback e;
        final /* synthetic */ Integer f;
        final /* synthetic */ Story.StoryType g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InAppStoryManager.this.lastSingleOpen = null;
                d dVar = d.this;
                InAppStoryManager.this.showStoryInner(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                InAppStoryManager.this.showStoryInner(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i);
                ScreensManager.created = 0L;
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InAppStoryManager.this.lastSingleOpen = null;
            }
        }

        d(InAppStoryService inAppStoryService, String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback, Integer num, Story.StoryType storyType, int i, int i2) {
            this.a = inAppStoryService;
            this.b = str;
            this.c = context;
            this.d = appearanceManager;
            this.e = iShowStoryCallback;
            this.f = num;
            this.g = storyType;
            this.h = i;
            this.i = i2;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.GetStoryByIdCallback
        public void getStory(Story story) {
            if (story != null) {
                this.a.getDownloadManager().addCompletedStoryTask(story, Story.StoryType.COMMON);
                if (ScreensManager.created == -1) {
                    InAppStoryManager.closeStoryReader(0);
                    InAppStoryManager.this.localHandler.postDelayed(new a(), 500L);
                    return;
                } else if (System.currentTimeMillis() - ScreensManager.created < 1000) {
                    InAppStoryManager.this.localHandler.postDelayed(new b(), 350L);
                    return;
                } else {
                    try {
                        if (Integer.parseInt(InAppStoryManager.this.lastSingleOpen) != story.id) {
                            return;
                        }
                    } catch (Exception unused) {
                    }
                    IShowStoryCallback iShowStoryCallback = this.e;
                    if (iShowStoryCallback != null) {
                        iShowStoryCallback.onShow();
                    }
                    StoryDownloadManager downloadManager = this.a.getDownloadManager();
                    StoryDownloadManager downloadManager2 = InAppStoryService.getInstance().getDownloadManager();
                    Story.StoryType storyType = Story.StoryType.COMMON;
                    downloadManager.putStories(downloadManager2.getStories(storyType), this.g);
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(Integer.valueOf(story.id));
                    ScreensManager.getInstance().openStoriesReader(this.c, null, this.d, arrayList, 0, this.h, this.i, this.f, null, null, storyType);
                    InAppStoryManager.this.localHandler.postDelayed(new c(), 1000L);
                    return;
                }
            }
            IShowStoryCallback iShowStoryCallback2 = this.e;
            if (iShowStoryCallback2 != null) {
                iShowStoryCallback2.onError();
            }
            InAppStoryManager.this.lastSingleOpen = null;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.GetStoryByIdCallback
        public void loadError(int i) {
            IShowStoryCallback iShowStoryCallback = this.e;
            if (iShowStoryCallback != null) {
                iShowStoryCallback.onError();
            }
            InAppStoryManager.this.lastSingleOpen = null;
        }
    }

    /* loaded from: classes3.dex */
    static class e implements IASLogger {
        e() {
        }

        @Override // com.inappstory.sdk.InAppStoryManager.IASLogger
        public void showDLog(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // com.inappstory.sdk.InAppStoryManager.IASLogger
        public void showELog(String str, String str2) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class f implements Runnable {
        final /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreensManager.getInstance().closeStoryReader(this.a);
            ScreensManager.getInstance().hideGoods();
            ScreensManager.getInstance().closeGameReader();
            ScreensManager.getInstance().closeUGCEditor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;

        g(String str, Context context) {
            this.a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            InAppStoryManager.this.service = new InAppStoryService(this.a);
            InAppStoryManager inAppStoryManager = InAppStoryManager.this;
            inAppStoryManager.service.onCreate(this.b, inAppStoryManager.exceptionCache);
            Looper.loop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends NetworkCallback<Response> {
        final /* synthetic */ String a;

        j(String str) {
            this.a = str;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
            ProfilingManager.getInstance().setReady(this.a);
            if (InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().getDownloadManager().clearAllFavoriteStatus(Story.StoryType.COMMON);
                InAppStoryService.getInstance().getDownloadManager().clearAllFavoriteStatus(Story.StoryType.UGC);
                InAppStoryService.getInstance().getFavoriteImages().clear();
                InAppStoryService.getInstance().getListReaderConnector().clearAllFavorites();
            }
            if (ScreensManager.getInstance().currentScreen != null) {
                ScreensManager.getInstance().currentScreen.removeAllStoriesFromFavorite();
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            super.onError(i, str);
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k extends NetworkCallback<Response> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        k(String str, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
            ProfilingManager.getInstance().setReady(this.a);
            if (InAppStoryService.isNotNull()) {
                Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.b, Story.StoryType.COMMON);
                if (storyById != null) {
                    storyById.favorite = this.c;
                }
                InAppStoryService.getInstance().getListReaderConnector().storyFavorite(this.b, this.c);
            }
            if (ScreensManager.getInstance().currentScreen != null) {
                ScreensManager.getInstance().currentScreen.removeStoryFromFavorite(this.b);
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            super.onError(i, str);
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ Context b;
        final /* synthetic */ AppearanceManager c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        l(List list, Context context, AppearanceManager appearanceManager, String str, String str2) {
            this.a = list;
            this.b = context;
            this.c = appearanceManager;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryManager.this.showLoadedOnboardings(this.a, this.b, this.c, this.d, this.e);
            ScreensManager.created = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class m implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ Context b;
        final /* synthetic */ AppearanceManager c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        m(List list, Context context, AppearanceManager appearanceManager, String str, String str2) {
            this.a = list;
            this.b = context;
            this.c = appearanceManager;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryManager.this.showLoadedOnboardings(this.a, this.b, this.c, this.d, this.e);
            ScreensManager.created = 0L;
        }
    }

    /* synthetic */ InAppStoryManager(Builder builder, e eVar) {
        this(builder);
    }

    private void addTag(String str) {
        if (!this.tags.contains(str)) {
            this.tags.add(str);
        }
    }

    public static void closeStoryReader() {
        closeStoryReader(3);
    }

    @SuppressLint({DEBUG_API})
    public static void debugSDKCalls(String str, String str2) {
        Log.d("InAppStory_SDKCalls", System.currentTimeMillis() + " " + str + " " + str2);
    }

    @Deprecated
    public static void destroy() {
        logout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void favoriteOrRemoveStory(int i2, boolean z) {
        if (InAppStoryService.isNull()) {
            return;
        }
        NetworkClient.getApi().storyFavorite(Integer.toString(i2), Integer.valueOf(z ? 1 : 0)).enqueue(new k(ProfilingManager.getInstance().addTask("api_favorite"), i2, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void favoriteRemoveAll() {
        if (InAppStoryService.isNull()) {
            return;
        }
        NetworkClient.getApi().removeAllFavorites().enqueue(new j(ProfilingManager.getInstance().addTask("api_favorite_remove_all")));
    }

    private static void generateException() {
        if (InAppStoryService.getInstance() != null) {
            InAppStoryService.getInstance().genException = true;
        }
    }

    private int getBytesLength(String str) {
        if (str == null) {
            return 0;
        }
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    private String getErrorStringFromContext(Context context, int i2) {
        if (context != null) {
            return context.getResources().getString(i2);
        }
        return "";
    }

    public static InAppStoryManager getInstance() {
        InAppStoryManager inAppStoryManager;
        synchronized (lock) {
            inAppStoryManager = INSTANCE;
        }
        return inAppStoryManager;
    }

    public static Pair<String, Integer> getLibraryVersion() {
        return new Pair<>(BuildConfig.VERSION_NAME, Integer.valueOf((int) BuildConfig.VERSION_CODE));
    }

    private void initManager(Context context, String str, String str2, String str3, String str4, ArrayList<String> arrayList, Map<String, String> map, Map<String, ImagePlaceholderValue> map2) {
        this.context = context;
        this.soundOn = !context.getResources().getBoolean(R.bool.defaultMuted);
        synchronized (this.tagsLock) {
            this.tags = arrayList;
        }
        if (map != null) {
            setPlaceholders(map);
        }
        if (map2 != null) {
            setImagePlaceholders(map2);
        }
        this.API_KEY = str2;
        this.TEST_KEY = str3;
        NetworkClient.setContext(context);
        this.userId = str4;
        if (!isNull()) {
            this.localHandler.removeCallbacksAndMessages(null);
            localDestroy();
        }
        OldStatisticManager.getInstance().statistic = new ArrayList();
        setInstance(this);
        ApiSettings.getInstance().cacheDirPath(context.getCacheDir().getAbsolutePath()).apiKey(this.API_KEY).testKey(this.TEST_KEY).setWebUrl(str).cmsUrl(str);
        if (InAppStoryService.isNotNull()) {
            InAppStoryService.getInstance().getDownloadManager().initDownloaders();
        }
    }

    public static boolean isNull() {
        boolean z;
        synchronized (lock) {
            if (INSTANCE == null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadOnboardingError(String str) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().loadOnboardingError(StringsUtils.getNonNull(str));
        }
    }

    private static void localDestroy() {
        logout();
        synchronized (lock) {
            INSTANCE = null;
        }
    }

    public static void logout() {
        if (!isNull() && InAppStoryService.isNotNull()) {
            InAppStoryService.getInstance().listStoriesIds.clear();
            InAppStoryService.getInstance().getListSubscribers().clear();
            InAppStoryService.getInstance().getDownloadManager().cleanTasks();
            InAppStoryService.getInstance().logout();
        }
    }

    private void removeTag(String str) {
        if (this.tags.contains(str)) {
            this.tags.remove(str);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void sendApiRequestLog(ApiLogRequest apiLogRequest) {
        IAS_QA_Log iAS_QA_Log = iasQaLog;
        if (iAS_QA_Log != null) {
            iAS_QA_Log.getApiRequestLog(apiLogRequest);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void sendApiRequestResponseLog(ApiLogRequest apiLogRequest, ApiLogResponse apiLogResponse) {
        IAS_QA_Log iAS_QA_Log = iasQaLog;
        if (iAS_QA_Log != null) {
            iAS_QA_Log.getApiRequestResponseLog(apiLogRequest, apiLogResponse);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void sendApiResponseLog(ApiLogResponse apiLogResponse) {
        IAS_QA_Log iAS_QA_Log = iasQaLog;
        if (iAS_QA_Log != null) {
            iAS_QA_Log.getApiResponseLog(apiLogResponse);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void sendExceptionLog(ExceptionLog exceptionLog) {
        IAS_QA_Log iAS_QA_Log = iasQaLog;
        if (iAS_QA_Log != null) {
            iAS_QA_Log.getExceptionLog(exceptionLog);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void sendWebConsoleLog(WebConsoleLog webConsoleLog) {
        IAS_QA_Log iAS_QA_Log = iasQaLog;
        if (iAS_QA_Log != null) {
            iAS_QA_Log.getWebConsoleLog(webConsoleLog);
        }
    }

    private void setCustomActionCallback(CustomActionCallback customActionCallback) {
        CallbackManager.getInstance().setCustomActionCallback(customActionCallback);
    }

    public static void setInstance(InAppStoryManager inAppStoryManager) {
        synchronized (lock) {
            INSTANCE = inAppStoryManager;
        }
    }

    private void setUserIdInner(String str) {
        if (InAppStoryService.isNull()) {
            return;
        }
        if (str != null && getBytesLength(str) <= 255) {
            if (this.userId.equals(str)) {
                return;
            }
            this.localOpensKey = null;
            this.userId = str;
            if (InAppStoryService.getInstance().getFavoriteImages() != null) {
                InAppStoryService.getInstance().getFavoriteImages().clear();
            }
            InAppStoryService.getInstance().getDownloadManager().refreshLocals(Story.StoryType.COMMON);
            InAppStoryService.getInstance().getDownloadManager().refreshLocals(Story.StoryType.UGC);
            closeStoryReader(0);
            SessionManager.getInstance().closeSession(this.sendStatistic, true);
            OldStatisticManager.getInstance().eventCount = 0;
            InAppStoryService.getInstance().getDownloadManager().cleanTasks(false);
            InAppStoryService.getInstance().setUserId(str);
            return;
        }
        showELog(IAS_ERROR_TAG, getErrorStringFromContext(this.context, R.string.ias_setter_user_length_error));
    }

    @SuppressLint({DEBUG_API})
    public static void showDLog(String str, String str2) {
        IASLogger iASLogger = logger;
        if (iASLogger != null) {
            iASLogger.showDLog(str, str2);
        }
    }

    @SuppressLint({DEBUG_API})
    public static void showELog(String str, String str2) {
        IASLogger iASLogger = logger;
        if (iASLogger == null) {
            iASLogger = defaultLogger;
        }
        if (iASLogger != null) {
            iASLogger.showELog(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLoadedOnboardings(List<Story> list, Context context, AppearanceManager appearanceManager, String str, String str2) {
        Story.StoryType storyType = Story.StoryType.COMMON;
        if (list != null && list.size() != 0) {
            if (InAppStoryService.isNull()) {
                return;
            }
            if (ScreensManager.created == -1) {
                closeStoryReader(0);
                this.localHandler.postDelayed(new l(list, context, appearanceManager, str, str2), 350L);
            } else if (System.currentTimeMillis() - ScreensManager.created < 1000) {
                this.localHandler.postDelayed(new m(list, context, appearanceManager, str, str2), 350L);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                arrayList.addAll(list);
                for (Story story : list) {
                    arrayList2.add(Integer.valueOf(story.id));
                }
                InAppStoryService.getInstance().getDownloadManager().uploadingAdditional(arrayList, storyType);
                ScreensManager.getInstance().openStoriesReader(context, null, appearanceManager, arrayList2, 0, 1, str, str2, Story.StoryType.COMMON);
                if (CallbackManager.getInstance().getOnboardingLoadCallback() != null) {
                    CallbackManager.getInstance().getOnboardingLoadCallback().onboardingLoad(list.size(), StringsUtils.getNonNull(str));
                }
            }
        } else if (CallbackManager.getInstance().getOnboardingLoadCallback() != null) {
            CallbackManager.getInstance().getOnboardingLoadCallback().onboardingLoad(0, StringsUtils.getNonNull(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOnboardingStoriesInner(Integer num, String str, List<String> list, Context context, AppearanceManager appearanceManager) {
        if (InAppStoryService.isNull()) {
            this.localHandler.postDelayed(new a(num, str, list, context, appearanceManager), 1000L);
        } else if (list != null && getBytesLength(TextUtils.join(",", list)) > TAG_LIMIT) {
            showELog(IAS_ERROR_TAG, getErrorStringFromContext(this.context, R.string.ias_setter_user_length_error));
        } else {
            SessionManager.getInstance().useOrOpenSession(new b(list, str, num, context, appearanceManager));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showStoryInner(String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback, Integer num, Story.StoryType storyType, int i2, int i3) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null) {
            this.localHandler.postDelayed(new c(str, context, appearanceManager, iShowStoryCallback, num, storyType, i2, i3), 1000L);
            return;
        }
        String str2 = this.userId;
        if (str2 != null && getBytesLength(str2) <= 255) {
            String str3 = this.lastSingleOpen;
            if (str3 == null || !str3.equals(str)) {
                this.lastSingleOpen = str;
                inAppStoryService.getDownloadManager().getFullStoryByStringId(new d(inAppStoryService, str, context, appearanceManager, iShowStoryCallback, num, storyType, i2, i3), str, storyType);
                return;
            }
            return;
        }
        showELog(IAS_ERROR_TAG, getErrorStringFromContext(context, R.string.ias_setter_user_length_error));
    }

    public void addTags(ArrayList<String> arrayList) {
        synchronized (this.tagsLock) {
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        if (this.tags == null) {
                            this.tags = new ArrayList<>();
                        }
                        String join = TextUtils.join(",", this.tags);
                        String join2 = TextUtils.join(",", arrayList);
                        if (getBytesLength(join + join2) > 3999) {
                            showELog(IAS_ERROR_TAG, getErrorStringFromContext(this.context, R.string.ias_setter_tags_length_error));
                            return;
                        }
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            addTag(it.next());
                        }
                        clearCachedLists();
                    }
                } finally {
                }
            }
        }
    }

    public void clearCache() {
        if (InAppStoryService.isNull()) {
            return;
        }
        InAppStoryService.getInstance().getDownloadManager().clearCache();
    }

    public void clearCachedList(String str) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.listStoriesIds.remove(str);
        }
    }

    public void clearCachedLists() {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.listStoriesIds.clear();
        }
    }

    public void closeGame() {
        ScreensManager.getInstance().closeGameReader();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createServiceThread(Context context, String str) {
        if (InAppStoryService.isNotNull()) {
            InAppStoryService.getInstance().onDestroy();
        }
        Thread thread = this.serviceThread;
        if (thread != null) {
            thread.interrupt();
            this.serviceThread = null;
        }
        Thread thread2 = new Thread(new g(str, context));
        this.serviceThread = thread2;
        thread2.start();
    }

    public String getApiKey() {
        return this.API_KEY;
    }

    public Context getContext() {
        return this.context;
    }

    public Map<String, String> getDefaultPlaceholders() {
        Map<String, String> map;
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultPlaceholders == null) {
                    this.defaultPlaceholders = new HashMap();
                }
                if (this.placeholders == null) {
                    this.placeholders = new HashMap();
                }
                map = this.defaultPlaceholders;
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public ExceptionCallback getExceptionCallback() {
        return this.exceptionCallback;
    }

    public Map<String, ImagePlaceholderValue> getImagePlaceholdersValues() {
        HashMap hashMap;
        synchronized (this.placeholdersLock) {
            try {
                hashMap = new HashMap();
                if (this.defaultImagePlaceholders == null) {
                    this.defaultImagePlaceholders = new HashMap();
                }
                if (this.imagePlaceholders == null) {
                    this.imagePlaceholders = new HashMap();
                }
                hashMap.putAll(this.defaultImagePlaceholders);
                hashMap.putAll(this.imagePlaceholders);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public Map<String, Pair<ImagePlaceholderValue, ImagePlaceholderValue>> getImagePlaceholdersValuesWithDefaults() {
        HashMap hashMap;
        synchronized (this.placeholdersLock) {
            try {
                hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                if (this.defaultImagePlaceholders == null) {
                    this.defaultImagePlaceholders = new HashMap();
                }
                if (this.imagePlaceholders == null) {
                    this.imagePlaceholders = new HashMap();
                }
                hashMap2.putAll(this.defaultImagePlaceholders);
                hashMap2.putAll(this.imagePlaceholders);
                for (Map.Entry entry : hashMap2.entrySet()) {
                    if (this.defaultImagePlaceholders.containsKey(entry.getKey())) {
                        hashMap.put(entry.getKey(), new Pair(entry.getValue(), this.defaultImagePlaceholders.get(entry.getKey())));
                    } else {
                        hashMap.put(entry.getKey(), new Pair(entry.getValue(), entry.getValue()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public String getLocalOpensKey(Story.StoryType storyType) {
        if (this.localOpensKey == null && this.userId != null) {
            this.localOpensKey = "opened" + this.userId;
        }
        if (storyType == Story.StoryType.COMMON) {
            return this.localOpensKey;
        }
        return storyType.name() + this.localOpensKey;
    }

    public Map<String, String> getPlaceholders() {
        Map<String, String> map;
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultPlaceholders == null) {
                    this.defaultPlaceholders = new HashMap();
                }
                if (this.placeholders == null) {
                    this.placeholders = new HashMap();
                }
                map = this.placeholders;
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public Map<String, String> getPlaceholdersCopy() {
        synchronized (this.placeholdersLock) {
            try {
                if (this.placeholders == null) {
                    return new HashMap();
                }
                return new HashMap(this.placeholders);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList<String> getTags() {
        ArrayList<String> arrayList;
        synchronized (this.tagsLock) {
            arrayList = this.tags;
        }
        return arrayList;
    }

    public String getTagsString() {
        synchronized (this.tagsLock) {
            try {
                ArrayList<String> arrayList = this.tags;
                if (arrayList == null) {
                    return null;
                }
                return TextUtils.join(",", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getTestKey() {
        return this.TEST_KEY;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isSandbox() {
        return this.isSandbox;
    }

    public boolean isSendStatistic() {
        return this.sendStatistic;
    }

    @Deprecated
    public void openGame(String str) {
        Context context;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null || (context = this.context) == null) {
            return;
        }
        inAppStoryService.openGameReaderWithGC(context, null, str);
    }

    public void removeAllFavorites() {
        if (InAppStoryService.isNull()) {
            return;
        }
        SessionManager.getInstance().useOrOpenSession(new i());
    }

    public void removeFromFavorite(int i2) {
        if (InAppStoryService.isNull()) {
            return;
        }
        SessionManager.getInstance().useOrOpenSession(new h(i2));
    }

    public void removeTags(ArrayList<String> arrayList) {
        synchronized (this.tagsLock) {
            try {
                if (this.tags != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        removeTag(it.next());
                    }
                    clearCachedLists();
                }
            } finally {
            }
        }
    }

    public void setActionBarColor(int i2) {
        this.actionBarColor = i2;
    }

    public void setAppClickCallback(AppClickCallback appClickCallback) {
        CallbackManager.getInstance().setAppClickCallback(appClickCallback);
    }

    public void setCallToActionCallback(CallToActionCallback callToActionCallback) {
        CallbackManager.getInstance().setCallToActionCallback(callToActionCallback);
    }

    public void setCallback(ExceptionCallback exceptionCallback) {
        this.exceptionCallback = exceptionCallback;
    }

    public void setClickOnShareStoryCallback(ClickOnShareStoryCallback clickOnShareStoryCallback) {
        CallbackManager.getInstance().setClickOnShareStoryCallback(clickOnShareStoryCallback);
    }

    public void setCloseStoryCallback(CloseStoryCallback closeStoryCallback) {
        CallbackManager.getInstance().setCloseStoryCallback(closeStoryCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultImagePlaceholder(@NonNull String str, @NonNull ImagePlaceholderValue imagePlaceholderValue) {
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultImagePlaceholders == null) {
                    this.defaultImagePlaceholders = new HashMap();
                }
                this.defaultImagePlaceholders.put(str, imagePlaceholderValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void setDefaultImagePlaceholders(@NonNull Map<String, ImagePlaceholderValue> map) {
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultImagePlaceholders == null) {
                    this.defaultImagePlaceholders = new HashMap();
                }
                this.defaultImagePlaceholders.clear();
                this.defaultImagePlaceholders.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultPlaceholders(@NonNull List<StoryPlaceholder> list) {
        synchronized (this.placeholdersLock) {
            try {
                for (StoryPlaceholder storyPlaceholder : list) {
                    String str = storyPlaceholder.name;
                    this.defaultPlaceholders.put(str, storyPlaceholder.defaultVal);
                    if (!this.placeholders.containsKey(str)) {
                        getInstance().placeholders.put(str, storyPlaceholder.defaultVal);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        CallbackManager.getInstance().setErrorCallback(errorCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExceptionCache(ExceptionCache exceptionCache) {
        this.exceptionCache = exceptionCache;
    }

    public void setFavoriteStoryCallback(FavoriteStoryCallback favoriteStoryCallback) {
        CallbackManager.getInstance().setFavoriteStoryCallback(favoriteStoryCallback);
    }

    @Deprecated
    public void setGameCallback(GameCallback gameCallback) {
        CallbackManager.getInstance().setGameCallback(gameCallback);
    }

    public void setGameReaderCallback(GameReaderCallback gameReaderCallback) {
        CallbackManager.getInstance().setGameReaderCallback(gameReaderCallback);
    }

    public void setImagePlaceholder(@NonNull String str, ImagePlaceholderValue imagePlaceholderValue) {
        synchronized (this.placeholdersLock) {
            try {
                if (this.imagePlaceholders == null) {
                    this.imagePlaceholders = new HashMap();
                }
                if (imagePlaceholderValue == null) {
                    this.imagePlaceholders.remove(str);
                } else {
                    this.imagePlaceholders.put(str, imagePlaceholderValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setImagePlaceholders(@NonNull Map<String, ImagePlaceholderValue> map) {
        synchronized (this.placeholdersLock) {
            try {
                this.imagePlaceholders.clear();
                Map<String, ImagePlaceholderValue> map2 = this.imagePlaceholders;
                if (map2 == null) {
                    this.imagePlaceholders = new HashMap();
                } else {
                    map2.clear();
                }
                this.imagePlaceholders.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLikeDislikeStoryCallback(LikeDislikeStoryCallback likeDislikeStoryCallback) {
        CallbackManager.getInstance().setLikeDislikeStoryCallback(likeDislikeStoryCallback);
    }

    public void setOnboardingLoadCallback(OnboardingLoadCallback onboardingLoadCallback) {
        CallbackManager.getInstance().setOnboardingLoadCallback(onboardingLoadCallback);
    }

    public void setPlaceholder(String str, String str2) {
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultPlaceholders == null) {
                    this.defaultPlaceholders = new HashMap();
                }
                if (this.placeholders == null) {
                    this.placeholders = new HashMap();
                }
                if (str2 == null) {
                    if (this.defaultPlaceholders.containsKey(str)) {
                        this.placeholders.put(str, this.defaultPlaceholders.get(str));
                    } else {
                        this.placeholders.remove(str);
                    }
                } else {
                    this.placeholders.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlaceholders(@NonNull Map<String, String> map) {
        synchronized (this.placeholdersLock) {
            try {
                if (this.defaultPlaceholders == null) {
                    this.defaultPlaceholders = new HashMap();
                }
                Map<String, String> map2 = this.placeholders;
                if (map2 == null) {
                    this.placeholders = new HashMap();
                } else {
                    map2.clear();
                }
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    if (str2 == null) {
                        if (this.defaultPlaceholders.containsKey(str)) {
                            this.placeholders.put(str, this.defaultPlaceholders.get(str));
                        } else {
                            this.placeholders.remove(str);
                        }
                    } else {
                        this.placeholders.put(str, str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setShareCallback(ShareCallback shareCallback) {
        CallbackManager.getInstance().setShareCallback(shareCallback);
    }

    public void setShowSlideCallback(ShowSlideCallback showSlideCallback) {
        CallbackManager.getInstance().setShowSlideCallback(showSlideCallback);
    }

    public void setShowStoryCallback(ShowStoryCallback showStoryCallback) {
        CallbackManager.getInstance().setShowStoryCallback(showStoryCallback);
    }

    public void setSingleLoadCallback(SingleLoadCallback singleLoadCallback) {
        CallbackManager.getInstance().setSingleLoadCallback(singleLoadCallback);
    }

    public void setStoryWidgetCallback(StoryWidgetCallback storyWidgetCallback) {
        CallbackManager.getInstance().setStoryWidgetCallback(storyWidgetCallback);
    }

    public void setTags(ArrayList<String> arrayList) {
        if (arrayList != null && getBytesLength(TextUtils.join(",", arrayList)) > TAG_LIMIT) {
            showELog(IAS_ERROR_TAG, getErrorStringFromContext(this.context, R.string.ias_setter_tags_length_error));
            return;
        }
        synchronized (this.tagsLock) {
            this.tags = arrayList;
            clearCachedLists();
        }
    }

    @Deprecated
    public void setUrlClickCallback(UrlClickCallback urlClickCallback) {
        CallbackManager.getInstance().setUrlClickCallback(urlClickCallback);
    }

    public void setUserId(@NonNull String str) {
        setUserIdInner(str);
    }

    public void showOnboardingStories(String str, List<String> list, Context context, AppearanceManager appearanceManager) {
        showOnboardingStoriesInner(null, (str == null || str.isEmpty()) ? "onboarding" : "onboarding", list, context, appearanceManager);
    }

    public void showStory(String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback) {
        showStoryInner(str, context, appearanceManager, iShowStoryCallback, Story.StoryType.COMMON, 0, 0);
    }

    public void showStoryCustom(String str, Context context, AppearanceManager appearanceManager) {
        showStoryInner(str, context, appearanceManager, null, Story.StoryType.COMMON, 0, 4);
    }

    public void showStoryWithSlide(String str, Context context, Integer num, String str2, Story.StoryType storyType, int i2, int i3) {
        AppearanceManager appearanceManager = new AppearanceManager();
        if (str2 != null) {
            StoriesReaderSettings storiesReaderSettings = (StoriesReaderSettings) JsonParser.fromJson(str2, StoriesReaderSettings.class);
            appearanceManager.csHasLike(storiesReaderSettings.hasLike);
            appearanceManager.csHasFavorite(storiesReaderSettings.hasFavorite);
            appearanceManager.csHasShare(storiesReaderSettings.hasShare);
            appearanceManager.csClosePosition(storiesReaderSettings.closePosition);
            appearanceManager.csCloseOnOverscroll(storiesReaderSettings.closeOnOverscroll);
            appearanceManager.csCloseOnSwipe(storiesReaderSettings.closeOnSwipe);
            appearanceManager.csIsDraggable(true);
            appearanceManager.csTimerGradientEnable(storiesReaderSettings.timerGradientEnable);
            appearanceManager.csStoryReaderAnimation(storiesReaderSettings.readerAnimation);
            appearanceManager.csCloseIcon(storiesReaderSettings.closeIcon);
            appearanceManager.csDislikeIcon(storiesReaderSettings.dislikeIcon);
            appearanceManager.csLikeIcon(storiesReaderSettings.likeIcon);
            appearanceManager.csRefreshIcon(storiesReaderSettings.refreshIcon);
            appearanceManager.csFavoriteIcon(storiesReaderSettings.favoriteIcon);
            appearanceManager.csShareIcon(storiesReaderSettings.shareIcon);
            appearanceManager.csSoundIcon(storiesReaderSettings.soundIcon);
        }
        showStoryInner(str, context, appearanceManager, null, num, storyType, i2, i3);
    }

    public void soundOn(boolean z) {
        this.soundOn = z;
    }

    public InAppStoryManager() {
        this.tagsLock = new Object();
        this.placeholdersLock = new Object();
        this.placeholders = new HashMap();
        this.imagePlaceholders = new HashMap();
        this.defaultPlaceholders = new HashMap();
        this.defaultImagePlaceholders = new HashMap();
        this.API_KEY = "";
        this.TEST_KEY = null;
        this.isSandbox = false;
        this.actionBarColor = -1;
        this.sendStatistic = true;
        this.soundOn = false;
        this.localHandler = new Handler();
        this.handlerToken = new Object();
        this.lastSingleOpen = null;
    }

    public static void closeStoryReader(int i2) {
        new Handler(Looper.getMainLooper()).post(new f(i2));
    }

    public void showStory(String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback, Integer num) {
        showStoryInner(str, context, appearanceManager, iShowStoryCallback, num, Story.StoryType.COMMON, 0, 0);
    }

    public boolean soundOn() {
        return this.soundOn;
    }

    public void clearCache(Context context) {
        if (InAppStoryService.isNull()) {
            return;
        }
        InAppStoryService.getInstance().getDownloadManager().clearCache();
    }

    public String getLocalOpensKey() {
        return getLocalOpensKey(Story.StoryType.COMMON);
    }

    public void openGame(String str, @NonNull Context context) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.openGameReaderWithGC(context, null, str);
        }
    }

    public void showOnboardingStories(String str, Context context, AppearanceManager appearanceManager) {
        showOnboardingStories((str == null || str.isEmpty()) ? "onboarding" : "onboarding", getTags(), context, appearanceManager);
    }

    public void showStory(String str, Context context, AppearanceManager appearanceManager) {
        showStoryInner(str, context, appearanceManager, null, Story.StoryType.COMMON, 0, 0);
    }

    public void showOnboardingStories(List<String> list, Context context, AppearanceManager appearanceManager) {
        showOnboardingStoriesInner(null, "onboarding", list, context, appearanceManager);
    }

    public void showOnboardingStories(Context context, AppearanceManager appearanceManager) {
        showOnboardingStories("onboarding", getTags(), context, appearanceManager);
    }

    private void showStoryInner(String str, Context context, AppearanceManager appearanceManager, IShowStoryCallback iShowStoryCallback, Story.StoryType storyType, int i2, int i3) {
        showStoryInner(str, context, appearanceManager, iShowStoryCallback, null, storyType, i2, i3);
    }

    public void showOnboardingStories(int i2, String str, List<String> list, Context context, AppearanceManager appearanceManager) {
        showOnboardingStoriesInner(Integer.valueOf(i2), (str == null || str.isEmpty()) ? "onboarding" : "onboarding", list, context, appearanceManager);
    }

    public void showOnboardingStories(int i2, String str, Context context, AppearanceManager appearanceManager) {
        showOnboardingStories(i2, (str == null || str.isEmpty()) ? "onboarding" : "onboarding", getTags(), context, appearanceManager);
    }

    private InAppStoryManager(Builder builder) {
        long j2;
        this.tagsLock = new Object();
        this.placeholdersLock = new Object();
        this.placeholders = new HashMap();
        this.imagePlaceholders = new HashMap();
        this.defaultPlaceholders = new HashMap();
        this.defaultImagePlaceholders = new HashMap();
        this.API_KEY = "";
        this.TEST_KEY = null;
        this.isSandbox = false;
        this.actionBarColor = -1;
        this.sendStatistic = true;
        this.soundOn = false;
        this.localHandler = new Handler();
        this.handlerToken = new Object();
        this.lastSingleOpen = null;
        Context context = builder.context;
        if (context == null) {
            showELog(IAS_ERROR_TAG, "InAppStoryManager.Builder data is not valid. 'context' can't be null");
        } else if (builder.apiKey == null && context.getResources().getString(R.string.csApiKey).isEmpty()) {
            showELog(IAS_ERROR_TAG, getErrorStringFromContext(builder.context, R.string.ias_api_key_error));
        } else if (getBytesLength(builder.userId) > 255) {
            showELog(IAS_ERROR_TAG, getErrorStringFromContext(builder.context, R.string.ias_builder_user_length_error));
        } else {
            ArrayList<String> arrayList = builder.tags;
            if (arrayList != null && getBytesLength(TextUtils.join(",", arrayList)) > TAG_LIMIT) {
                showELog(IAS_ERROR_TAG, getErrorStringFromContext(builder.context, R.string.ias_builder_tags_length_error));
            } else if (builder.context.getCacheDir().getFreeSpace() < 26214400) {
                showELog(IAS_ERROR_TAG, getErrorStringFromContext(builder.context, R.string.ias_min_free_space_error));
            } else {
                KeyValueStorage.setContext(builder.context);
                SharedPreferencesAPI.setContext(builder.context);
                createServiceThread(builder.context, builder.userId);
                if (InAppStoryService.isNotNull()) {
                    int i2 = builder.cacheSize;
                    long j3 = 10485760;
                    if (i2 != -1) {
                        j2 = i2 != 1 ? LruDiskCache.MB_100 : LruDiskCache.MB_200;
                    } else {
                        j2 = 10485760;
                        j3 = 5242880;
                    }
                    InAppStoryService.getInstance().getFastCache().setCacheSize(j3);
                    InAppStoryService.getInstance().getCommonCache().setCacheSize(j2);
                }
                String str = builder.apiKey;
                String stringFromKey = KeyConverter.getStringFromKey(str == null ? builder.context.getResources().getString(R.string.csApiKey) : str);
                boolean z = builder.sandbox;
                this.isSandbox = z;
                Context context2 = builder.context;
                String str2 = stringFromKey == null ? z ? TEST_DOMAIN : PRODUCT_DOMAIN : stringFromKey;
                String str3 = builder.apiKey;
                String string = str3 == null ? context2.getResources().getString(R.string.csApiKey) : str3;
                String str4 = builder.testKey;
                String str5 = str4 != null ? str4 : null;
                String str6 = builder.userId;
                ArrayList<String> arrayList2 = builder.tags;
                ArrayList<String> arrayList3 = arrayList2 != null ? arrayList2 : null;
                Map<String, String> map = builder.placeholders;
                Map<String, String> map2 = map != null ? map : null;
                Map<String, ImagePlaceholderValue> map3 = builder.imagePlaceholders;
                initManager(context2, str2, string, str5, str6, arrayList3, map2, map3 != null ? map3 : null);
                new ExceptionManager().sendSavedException();
            }
        }
    }

    public void showOnboardingStories(int i2, List<String> list, Context context, AppearanceManager appearanceManager) {
        showOnboardingStoriesInner(Integer.valueOf(i2), "onboarding", list, context, appearanceManager);
    }

    public void showOnboardingStories(int i2, Context context, AppearanceManager appearanceManager) {
        showOnboardingStories(i2, "onboarding", getTags(), context, appearanceManager);
    }

    /* loaded from: classes3.dex */
    class h implements OpenSessionCallback {
        final /* synthetic */ int a;

        h(int i) {
            this.a = i;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            InAppStoryManager.this.favoriteOrRemoveStory(this.a, false);
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
        }
    }

    /* loaded from: classes3.dex */
    class i implements OpenSessionCallback {
        i() {
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            InAppStoryManager.this.favoriteRemoveAll();
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
        }
    }
}
