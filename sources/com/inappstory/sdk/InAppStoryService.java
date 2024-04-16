package com.inappstory.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.webkit.URLUtil;
import com.inappstory.sdk.game.cache.GameCacheManager;
import com.inappstory.sdk.game.reader.GameStoryData;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.lrudiskcache.CacheType;
import com.inappstory.sdk.lrudiskcache.FileManager;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.api.models.ExceptionCache;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderValue;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryPlaceholder;
import com.inappstory.sdk.stories.api.models.logs.ExceptionLog;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.exceptions.ExceptionManager;
import com.inappstory.sdk.stories.managers.TimerManager;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.list.FavoriteImage;
import com.inappstory.sdk.stories.ui.list.ListManager;
import com.inappstory.sdk.stories.utils.SessionManager;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class InAppStoryService {
    public static final String IAS_PREFIX;
    public static InAppStoryService INSTANCE;
    private static Object lock;
    private static final Object shareLock = new Object();
    public static Set<ListManager> tempListSubscribers;
    private LruDiskCache commonCache;
    private Context context;
    private int currentId;
    private int currentIndex;
    StoryDownloadManager downloadManager;
    private LruDiskCache fastCache;
    private LruDiskCache infiniteCache;
    Set<ListManager> listSubscribers;
    TimerManager timerManager;
    private String userId;
    private boolean sharingProcess = false;
    public HashMap<String, List<Integer>> listStoriesIds = new HashMap<>();
    public boolean genException = false;
    Handler exHandler = new Handler();
    public Runnable exHandlerThread = new b();
    GameCacheManager gameCacheManager = new GameCacheManager();
    private Object cacheLock = new Object();
    boolean backPaused = false;
    ListReaderConnector connector = new ListReaderConnector();
    Runnable checkFreeSpace = new c();
    Handler spaceHandler = new Handler();

    /* loaded from: classes3.dex */
    public static class DefaultExceptionHandler implements Thread.UncaughtExceptionHandler {
        Thread.UncaughtExceptionHandler oldHandler = Thread.getDefaultUncaughtExceptionHandler();

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            InAppStoryService.createExceptionLog(th);
            Log.d(InAppStoryManager.IAS_ERROR_TAG, th.getCause() + "\n" + th.getMessage());
            if (InAppStoryManager.getInstance() != null) {
                if (thread != InAppStoryManager.getInstance().serviceThread) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.oldHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                }
                InAppStoryManager.getInstance().setExceptionCache(new ExceptionCache(InAppStoryService.getInstance().getDownloadManager().getStories(Story.StoryType.COMMON), InAppStoryService.getInstance().getDownloadManager().favStories, InAppStoryService.getInstance().getDownloadManager().favoriteImages));
            }
            try {
                synchronized (InAppStoryService.lock) {
                    if (InAppStoryService.getInstance() != null) {
                        InAppStoryService.getInstance().onDestroy();
                    }
                }
                if (InAppStoryManager.getInstance() != null) {
                    InAppStoryManager.getInstance().createServiceThread(InAppStoryManager.getInstance().context, InAppStoryManager.getInstance().getUserId());
                    if (InAppStoryManager.getInstance().getExceptionCallback() != null) {
                        InAppStoryManager.getInstance().getExceptionCallback().onException(th);
                    }
                }
            } catch (Exception unused) {
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.oldHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class ListReaderConnector {
        public ListReaderConnector() {
        }

        public void changeStory(int i, String str) {
            if (InAppStoryService.isNull()) {
                return;
            }
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.changeStory(i, str);
            }
        }

        public void changeUserId() {
            if (InAppStoryService.isNull()) {
                return;
            }
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.changeUserId();
            }
        }

        public void clearAllFavorites() {
            if (InAppStoryService.isNull()) {
                return;
            }
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.clearAllFavorites();
            }
        }

        public void closeReader() {
            if (InAppStoryService.isNull()) {
                return;
            }
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.closeReader();
            }
        }

        public void openReader() {
            if (InAppStoryService.isNull()) {
                return;
            }
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.openReader();
            }
        }

        public void storyFavorite(int i, boolean z) {
            if (InAppStoryService.isNull()) {
                return;
            }
            boolean isEmpty = InAppStoryService.getInstance().getFavoriteImages().isEmpty();
            for (ListManager listManager : InAppStoryService.getInstance().getListSubscribers()) {
                listManager.storyFavorite(i, z, isEmpty);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("test exception");
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryService inAppStoryService = InAppStoryService.this;
            if (inAppStoryService.genException) {
                inAppStoryService.genException = false;
                inAppStoryService.generateException();
            }
            InAppStoryService inAppStoryService2 = InAppStoryService.this;
            inAppStoryService2.exHandler.postDelayed(inAppStoryService2.exHandlerThread, 3000L);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LruDiskCache commonCache = InAppStoryService.this.getCommonCache();
            LruDiskCache fastCache = InAppStoryService.this.getFastCache();
            if (commonCache != null && fastCache != null) {
                long freeSpace = commonCache.getCacheDir().getFreeSpace();
                if (freeSpace < commonCache.getCacheSize() + fastCache.getCacheSize() + 10485760) {
                    commonCache.setCacheSize(LruDiskCache.MB_50);
                    if (freeSpace < commonCache.getCacheSize() + fastCache.getCacheSize() + 10485760) {
                        commonCache.setCacheSize(10485760L);
                        fastCache.setCacheSize(LruDiskCache.MB_5);
                        if (freeSpace < commonCache.getCacheSize() + fastCache.getCacheSize() + 10485760) {
                            commonCache.setCacheSize(10485760L);
                            fastCache.setCacheSize(LruDiskCache.MB_5);
                        }
                    }
                }
            }
            InAppStoryService inAppStoryService = InAppStoryService.this;
            inAppStoryService.spaceHandler.postDelayed(inAppStoryService.checkFreeSpace, 60000L);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppStoryService.this.clearOldFiles();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("ias");
        sb.append(str);
        IAS_PREFIX = sb.toString();
        lock = new Object();
    }

    public InAppStoryService() {
    }

    public static void checkAndAddListSubscriber(ListManager listManager) {
        if (isNotNull()) {
            getInstance().addListSubscriber(listManager);
            return;
        }
        if (tempListSubscribers == null) {
            tempListSubscribers = new HashSet();
        }
        tempListSubscribers.add(listManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldFiles() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.context.getFilesDir());
        String str = File.separator;
        sb.append(str);
        sb.append("Stories");
        FileManager.deleteRecursive(new File(sb.toString()));
        FileManager.deleteRecursive(new File(this.context.getFilesDir() + str + "temp"));
    }

    public static void createExceptionLog(Throwable th) {
        ExceptionManager exceptionManager = new ExceptionManager();
        ExceptionLog generateExceptionLog = exceptionManager.generateExceptionLog(th);
        exceptionManager.saveException(generateExceptionLog);
        exceptionManager.sendException(generateExceptionLog);
    }

    public static InAppStoryService getInstance() {
        synchronized (lock) {
            try {
                if (InAppStoryManager.getInstance() == null) {
                    return null;
                }
                return INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isConnected() {
        Context context;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        InAppStoryService inAppStoryService = getInstance();
        if (inAppStoryService == null || (context = inAppStoryService.getContext()) == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 23) {
                activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                    return false;
                }
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2)) {
                    return false;
                }
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            createExceptionLog(e);
            return true;
        }
    }

    public static boolean isNotNull() {
        if (getInstance() != null) {
            return true;
        }
        return false;
    }

    public static boolean isNull() {
        if (getInstance() == null) {
            return true;
        }
        return false;
    }

    public void addListSubscriber(ListManager listManager) {
        if (this.listSubscribers == null) {
            this.listSubscribers = new HashSet();
        }
        this.listSubscribers.add(listManager);
    }

    public void changeSoundStatus() {
        if (InAppStoryManager.getInstance() != null) {
            InAppStoryManager.getInstance().soundOn(!InAppStoryManager.getInstance().soundOn());
        }
    }

    public void clearGames() {
        gameCacheManager().clearGames();
    }

    public void clearSubscribers() {
        for (ListManager listManager : this.listSubscribers) {
            listManager.clear();
        }
        tempListSubscribers.clear();
        this.listSubscribers.clear();
    }

    public void createDownloadManager(ExceptionCache exceptionCache) {
        if (this.downloadManager == null) {
            this.downloadManager = new StoryDownloadManager(this.context, exceptionCache);
        }
    }

    public GameCacheManager gameCacheManager() {
        if (this.gameCacheManager == null) {
            this.gameCacheManager = new GameCacheManager();
        }
        return this.gameCacheManager;
    }

    public void generateException() {
        new Thread(new a()).start();
    }

    public LruDiskCache getCommonCache() {
        long j;
        LruDiskCache lruDiskCache;
        synchronized (this.cacheLock) {
            if (this.commonCache == null) {
                try {
                    long freeSpace = this.context.getCacheDir().getFreeSpace();
                    if (freeSpace < 125829120) {
                        if (freeSpace < 73400320) {
                            if (freeSpace < 26214400) {
                                j = 0;
                            } else {
                                j = 10485760;
                            }
                        } else {
                            j = LruDiskCache.MB_50;
                        }
                    } else {
                        j = LruDiskCache.MB_100;
                    }
                    if (j > 0) {
                        this.commonCache = LruDiskCache.create(this.context.getCacheDir(), IAS_PREFIX, j, CacheType.COMMON);
                    }
                } catch (IOException e) {
                    createExceptionLog(e);
                }
            }
            lruDiskCache = this.commonCache;
        }
        return lruDiskCache;
    }

    public Context getContext() {
        return this.context;
    }

    public int getCurrentId() {
        return this.currentId;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public StoryDownloadManager getDownloadManager() {
        return this.downloadManager;
    }

    public LruDiskCache getFastCache() {
        LruDiskCache lruDiskCache;
        synchronized (this.cacheLock) {
            if (this.fastCache == null) {
                try {
                    this.fastCache = LruDiskCache.create(this.context.getCacheDir(), IAS_PREFIX, 10485760L, CacheType.FAST);
                } catch (IOException e) {
                    createExceptionLog(e);
                }
            }
            lruDiskCache = this.fastCache;
        }
        return lruDiskCache;
    }

    public List<FavoriteImage> getFavoriteImages() {
        StoryDownloadManager storyDownloadManager = this.downloadManager;
        if (storyDownloadManager == null) {
            return new ArrayList();
        }
        if (storyDownloadManager.favoriteImages == null) {
            storyDownloadManager.favoriteImages = new ArrayList();
        }
        return this.downloadManager.favoriteImages;
    }

    public Map<String, ImagePlaceholderValue> getImagePlaceholdersValues() {
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            return inAppStoryManager.getImagePlaceholdersValues();
        }
        return new HashMap();
    }

    public Map<String, Pair<ImagePlaceholderValue, ImagePlaceholderValue>> getImagePlaceholdersValuesWithDefaults() {
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            return inAppStoryManager.getImagePlaceholdersValuesWithDefaults();
        }
        return new HashMap();
    }

    public LruDiskCache getInfiniteCache() {
        LruDiskCache lruDiskCache;
        synchronized (this.cacheLock) {
            if (this.infiniteCache == null) {
                try {
                    long freeSpace = this.context.getCacheDir().getFreeSpace();
                    if (freeSpace > 0) {
                        this.infiniteCache = LruDiskCache.create(this.context.getFilesDir(), IAS_PREFIX, freeSpace, CacheType.INFINITE);
                    }
                } catch (IOException e) {
                    createExceptionLog(e);
                }
            }
            lruDiskCache = this.infiniteCache;
        }
        return lruDiskCache;
    }

    public ListReaderConnector getListReaderConnector() {
        if (this.connector == null) {
            this.connector = new ListReaderConnector();
        }
        return this.connector;
    }

    public Set<ListManager> getListSubscribers() {
        if (this.listSubscribers == null) {
            this.listSubscribers = new HashSet();
        }
        return this.listSubscribers;
    }

    public Map<String, String> getPlaceholders() {
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        if (inAppStoryManager != null) {
            return inAppStoryManager.getPlaceholdersCopy();
        }
        return new HashMap();
    }

    public boolean getSendNewStatistic() {
        if (InAppStoryManager.getInstance() == null || Session.needToUpdate() || Session.getInstance().statisticPermissions == null || !InAppStoryManager.getInstance().isSendStatistic() || !Session.getInstance().statisticPermissions.allowStatV2) {
            return false;
        }
        return true;
    }

    public boolean getSendStatistic() {
        if (InAppStoryManager.getInstance() == null || Session.needToUpdate() || Session.getInstance().statisticPermissions == null || !InAppStoryManager.getInstance().isSendStatistic() || !Session.getInstance().statisticPermissions.allowStatV1) {
            return false;
        }
        return true;
    }

    public String getTagsString() {
        if (InAppStoryManager.getInstance() != null) {
            return InAppStoryManager.getInstance().getTagsString();
        }
        return null;
    }

    public TimerManager getTimerManager() {
        return this.timerManager;
    }

    public String getUserId() {
        if (this.userId == null && !InAppStoryManager.isNull()) {
            return InAppStoryManager.getInstance().getUserId();
        }
        return this.userId;
    }

    public boolean isShareProcess() {
        boolean z;
        synchronized (shareLock) {
            z = this.sharingProcess;
        }
        return z;
    }

    public boolean isSoundOn() {
        if (InAppStoryManager.getInstance() != null) {
            return InAppStoryManager.getInstance().soundOn();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void logout() {
        OldStatisticManager.getInstance().closeStatisticEvent(null, true);
        SessionManager.getInstance().closeSession(true, false);
        OldStatisticManager.getInstance().clear();
    }

    public void onCreate(Context context, ExceptionCache exceptionCache) {
        this.context = context;
        new Handler().post(new d());
        Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler());
        new ImageLoader(context);
        OldStatisticManager.getInstance().statistic = new ArrayList();
        createDownloadManager(exceptionCache);
        this.timerManager = new TimerManager();
        if (tempListSubscribers != null) {
            if (this.listSubscribers == null) {
                this.listSubscribers = new HashSet();
            }
            InAppStoryManager.debugSDKCalls("IASService_subscribers", "temp size:" + tempListSubscribers.size() + " / size:" + this.listSubscribers.size());
            this.listSubscribers.addAll(tempListSubscribers);
            tempListSubscribers.clear();
        }
        synchronized (lock) {
            INSTANCE = this;
        }
        this.spaceHandler.postDelayed(this.checkFreeSpace, 60000L);
        if (this.exHandler == null) {
            this.exHandler = new Handler();
        }
        this.exHandler.postDelayed(this.exHandlerThread, 100L);
    }

    public void onDestroy() {
        this.spaceHandler.removeCallbacksAndMessages(null);
        getDownloadManager().destroy();
        if (INSTANCE == this) {
            INSTANCE = null;
        }
    }

    public void openGameReaderWithGC(Context context, GameStoryData gameStoryData, String str) {
        ScreensManager.getInstance().openGameReader(context, gameStoryData, str, null, null, null, null, null);
    }

    public void removeListSubscriber(ListManager listManager) {
        if (this.listSubscribers == null) {
            return;
        }
        listManager.clear();
        Set<ListManager> set = tempListSubscribers;
        if (set != null) {
            set.remove(listManager);
        }
        this.listSubscribers.remove(listManager);
    }

    public void runStatisticThread() {
        OldStatisticManager.getInstance().refreshCallbacks();
    }

    public void saveSessionImagePlaceholders(List<StoryPlaceholder> list) {
        if (list == null || InAppStoryManager.getInstance() == null) {
            return;
        }
        for (StoryPlaceholder storyPlaceholder : list) {
            if (URLUtil.isNetworkUrl(storyPlaceholder.defaultVal)) {
                InAppStoryManager.getInstance().setDefaultImagePlaceholder(storyPlaceholder.name, ImagePlaceholderValue.createByUrl(storyPlaceholder.defaultVal));
            }
        }
    }

    public void saveSessionPlaceholders(List<StoryPlaceholder> list) {
        InAppStoryManager inAppStoryManager;
        if (list == null || (inAppStoryManager = InAppStoryManager.getInstance()) == null) {
            return;
        }
        inAppStoryManager.setDefaultPlaceholders(list);
    }

    public void saveStoriesOpened(List<Story> list, Story.StoryType storyType) {
        Set stringSet = SharedPreferencesAPI.getStringSet(InAppStoryManager.getInstance().getLocalOpensKey(storyType));
        if (stringSet == null) {
            stringSet = new HashSet();
        }
        for (Story story : list) {
            if (story.isOpened) {
                stringSet.add(Integer.toString(story.id));
            } else if (stringSet.contains(Integer.toString(story.id))) {
                story.isOpened = true;
            }
        }
        SharedPreferencesAPI.saveStringSet(InAppStoryManager.getInstance().getLocalOpensKey(storyType), stringSet);
    }

    public void saveStoryOpened(int i, Story.StoryType storyType) {
        if (InAppStoryManager.getInstance() == null) {
            return;
        }
        Set stringSet = SharedPreferencesAPI.getStringSet(InAppStoryManager.getInstance().getLocalOpensKey(storyType));
        if (stringSet == null) {
            stringSet = new HashSet();
        }
        stringSet.add(Integer.toString(i));
        SharedPreferencesAPI.saveStringSet(InAppStoryManager.getInstance().getLocalOpensKey(storyType), stringSet);
    }

    public void sendPageOpenStatistic(int i, int i2, String str) {
        OldStatisticManager.getInstance().addStatisticBlock(i, i2);
        StatisticManager.getInstance().createCurrentState(i, i2, str);
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void isShareProcess(boolean z) {
        synchronized (shareLock) {
            this.sharingProcess = z;
        }
    }

    public InAppStoryService(String str) {
        this.userId = str;
    }
}
