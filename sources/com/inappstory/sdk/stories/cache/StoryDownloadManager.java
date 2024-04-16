package com.inappstory.sdk.stories.cache;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.listwidget.StoriesWidgetService;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.ExceptionCache;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryListType;
import com.inappstory.sdk.stories.api.models.callbacks.GetStoryByIdCallback;
import com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import com.inappstory.sdk.stories.ui.list.FavoriteImage;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager;
import com.inappstory.sdk.stories.utils.SessionManager;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class StoryDownloadManager {
    static final String EXPAND_STRING = "slides_html,slides_structure,layout,slides_duration,src_list,img_placeholder_src_list,slides_screenshot_share,slides_payload";
    private Context context;
    public List<Story> favStories;
    public List<FavoriteImage> favoriteImages;
    private com.inappstory.sdk.stories.cache.a slidesDownloader;
    private List<Story> stories;
    private com.inappstory.sdk.stories.cache.b storyDownloader;
    private List<Story> ugcStories;
    private final Object storiesLock = new Object();
    private final Object lock = new Object();
    List<ReaderPageManager> subscribers = new ArrayList();
    HashMap<com.inappstory.sdk.stories.cache.c, Long> storyErrorDelayed = new HashMap<>();
    HashMap<SlideTaskData, Long> slideErrorDelayed = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements OpenSessionCallback {
        final /* synthetic */ GetStoryByIdCallback a;
        final /* synthetic */ String b;
        final /* synthetic */ Story.StoryType c;

        /* renamed from: com.inappstory.sdk.stories.cache.StoryDownloadManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0258a extends NetworkCallback<Story> {
            final /* synthetic */ String a;

            C0258a(String str) {
                this.a = str;
            }

            @Override // com.inappstory.sdk.network.Callback
            /* renamed from: a */
            public void onSuccess(Story story) {
                if (InAppStoryService.isNull()) {
                    a.this.a.loadError(-1);
                    return;
                }
                ProfilingManager.getInstance().setReady(this.a);
                if (CallbackManager.getInstance().getSingleLoadCallback() != null) {
                    CallbackManager.getInstance().getSingleLoadCallback().singleLoad(a.this.b);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(story);
                a aVar = a.this;
                StoryDownloadManager.this.uploadingAdditional(arrayList, aVar.c);
                a aVar2 = a.this;
                StoryDownloadManager.this.setStory(story, story.id, aVar2.c);
                GetStoryByIdCallback getStoryByIdCallback = a.this.a;
                if (getStoryByIdCallback != null) {
                    getStoryByIdCallback.getStory(story);
                }
            }

            @Override // com.inappstory.sdk.network.Callback
            public Type getType() {
                return Story.class;
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                if (CallbackManager.getInstance().getErrorCallback() != null) {
                    CallbackManager.getInstance().getErrorCallback().loadSingleError();
                }
                GetStoryByIdCallback getStoryByIdCallback = a.this.a;
                if (getStoryByIdCallback != null) {
                    getStoryByIdCallback.loadError(-1);
                }
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                onError(-1, "Timeout");
            }
        }

        a(GetStoryByIdCallback getStoryByIdCallback, String str, Story.StoryType storyType) {
            this.a = getStoryByIdCallback;
            this.b = str;
            this.c = storyType;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            if (CallbackManager.getInstance().getErrorCallback() != null) {
                CallbackManager.getInstance().getErrorCallback().loadSingleError();
            }
            GetStoryByIdCallback getStoryByIdCallback = this.a;
            if (getStoryByIdCallback != null) {
                getStoryByIdCallback.loadError(-1);
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            if (InAppStoryService.isNull()) {
                this.a.loadError(-1);
                return;
            }
            NetworkClient.getApi().getStoryById(this.b, 1, StoryDownloadManager.EXPAND_STRING).enqueue(new C0258a(ProfilingManager.getInstance().addTask("api_story")));
        }
    }

    /* loaded from: classes3.dex */
    class b implements DownloadStoryCallback {
        b() {
        }

        @Override // com.inappstory.sdk.stories.cache.DownloadStoryCallback
        public void onDownload(Story story, int i, Story.StoryType storyType) {
            Story storyById = StoryDownloadManager.this.getStoryById(story.id, storyType);
            if (storyById != null) {
                story.isOpened = storyById.isOpened;
                story.lastIndex = storyById.lastIndex;
            }
            StoryDownloadManager.this.setStory(story, story.id, storyType);
            StoryDownloadManager.this.storyLoaded(story.id, storyType);
            try {
                StoryDownloadManager.this.slidesDownloader.g(story, i, storyType);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.inappstory.sdk.stories.cache.DownloadStoryCallback
        public void onError(com.inappstory.sdk.stories.cache.c cVar) {
            StoryDownloadManager.this.storyError(cVar);
        }
    }

    /* loaded from: classes3.dex */
    class c implements DownloadPageCallback {
        c() {
        }

        @Override // com.inappstory.sdk.stories.cache.DownloadPageCallback
        public DownloadPageFileStatus downloadFile(UrlWithAlter urlWithAlter, SlideTaskData slideTaskData) {
            try {
                DownloadFileState downloadOrGetFile = Downloader.downloadOrGetFile(urlWithAlter.getUrl(), true, InAppStoryService.getInstance().getCommonCache(), null, null);
                if (urlWithAlter.getAlter() != null) {
                    if (downloadOrGetFile != null) {
                        if (downloadOrGetFile.getFullFile() == null) {
                        }
                    }
                    downloadOrGetFile = Downloader.downloadOrGetFile(urlWithAlter.getAlter(), true, InAppStoryService.getInstance().getCommonCache(), null, null);
                    if (downloadOrGetFile == null || downloadOrGetFile.getFullFile() == null) {
                        return DownloadPageFileStatus.SKIP;
                    }
                }
                if (downloadOrGetFile != null && downloadOrGetFile.getFullFile() != null) {
                    Log.d("IAS_TAG", "downloadFile: " + slideTaskData.toString() + " " + urlWithAlter.getUrl() + " " + downloadOrGetFile.file.getAbsolutePath());
                    return DownloadPageFileStatus.SUCCESS;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return DownloadPageFileStatus.ERROR;
        }

        @Override // com.inappstory.sdk.stories.cache.DownloadPageCallback
        public void onError(com.inappstory.sdk.stories.cache.c cVar) {
            StoryDownloadManager.this.storyError(cVar);
        }

        @Override // com.inappstory.sdk.stories.cache.DownloadPageCallback
        public void onSlideError(SlideTaskData slideTaskData) {
            StoryDownloadManager.this.slideError(slideTaskData);
            StoryDownloadManager.this.storyDownloader.x(new com.inappstory.sdk.stories.cache.c(slideTaskData.storyId, slideTaskData.storyType), -2);
        }
    }

    /* loaded from: classes3.dex */
    class d extends SimpleListCallback {
        final /* synthetic */ LoadStoriesCallback a;

        d(LoadStoriesCallback loadStoriesCallback) {
            this.a = loadStoriesCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onError(String str) {
            LoadStoriesCallback loadStoriesCallback = this.a;
            if (loadStoriesCallback != null) {
                loadStoriesCallback.onError();
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onSuccess(List<Story> list, Object... objArr) {
            StoryDownloadManager storyDownloadManager = StoryDownloadManager.this;
            Story.StoryType storyType = Story.StoryType.UGC;
            storyDownloadManager.uploadingAdditional(list, storyType);
            StoryDownloadManager.this.setLocalsOpened(StoryDownloadManager.this.getStoriesListByType(storyType), storyType);
            if (this.a != null) {
                ArrayList arrayList = new ArrayList();
                for (Story story : list) {
                    if (story != null) {
                        arrayList.add(Integer.valueOf(story.id));
                    }
                }
                this.a.storiesLoaded(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends SimpleListCallback {
        final /* synthetic */ boolean a;
        final /* synthetic */ LoadStoriesCallback b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                StoriesWidgetService.loadSuccess(StoryDownloadManager.this.context, AppearanceManager.csWidgetAppearance().getWidgetClass());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b extends NetworkCallback<List<Story>> {
            final /* synthetic */ String a;
            final /* synthetic */ List b;
            final /* synthetic */ String c;

            b(String str, List list, String str2) {
                this.a = str;
                this.b = list;
                this.c = str2;
            }

            @Override // com.inappstory.sdk.network.Callback
            public Type getType() {
                return new StoryListType();
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                if (e.this.b != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Story story : this.b) {
                        arrayList.add(Integer.valueOf(story.id));
                    }
                    e.this.b.setFeedId(this.c);
                    e.this.b.storiesLoaded(arrayList);
                }
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                ProfilingManager.getInstance().setReady(this.a);
                super.onTimeout();
            }

            @Override // com.inappstory.sdk.network.Callback
            public void onSuccess(List<Story> list) {
                ProfilingManager.getInstance().setReady(this.a);
                StoryDownloadManager.this.favStories.clear();
                StoryDownloadManager.this.favStories.addAll(list);
                StoryDownloadManager.this.favoriteImages.clear();
                List<Story> storiesListByType = StoryDownloadManager.this.getStoriesListByType(Story.StoryType.COMMON);
                synchronized (StoryDownloadManager.this.storiesLock) {
                    try {
                        for (Story story : storiesListByType) {
                            if (story != null) {
                                Iterator<Story> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Story next = it.next();
                                    if (next != null && next.id == story.id) {
                                        story.isOpened = true;
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (list != null && list.size() > 0) {
                    StoryDownloadManager.this.setLocalsOpened(list, Story.StoryType.COMMON);
                    for (Story story2 : list) {
                        StoryDownloadManager.this.favoriteImages.add(new FavoriteImage(story2.id, story2.image, story2.backgroundColor));
                    }
                    if (e.this.b != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Story story3 : this.b) {
                            arrayList.add(Integer.valueOf(story3.id));
                        }
                        e.this.b.setFeedId(this.c);
                        e.this.b.storiesLoaded(arrayList);
                    }
                } else if (e.this.b != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Story story4 : this.b) {
                        arrayList2.add(Integer.valueOf(story4.id));
                    }
                    e.this.b.setFeedId(this.c);
                    e.this.b.storiesLoaded(arrayList2);
                }
            }
        }

        e(boolean z, LoadStoriesCallback loadStoriesCallback) {
            this.a = z;
            this.b = loadStoriesCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onError(String str) {
            LoadStoriesCallback loadStoriesCallback = this.b;
            if (loadStoriesCallback != null) {
                loadStoriesCallback.onError();
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onSuccess(List<Story> list, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Math.min(list.size(), 4); i++) {
                arrayList.add(list.get(i));
            }
            if (StoriesWidgetService.getInstance() != null) {
                try {
                    SharedPreferencesAPI.saveString("widgetStories", JsonParser.getJson(arrayList));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                StoriesWidgetService.getInstance().refreshFactory();
            }
            if (list.size() == 0) {
                if (AppearanceManager.csWidgetAppearance() != null && AppearanceManager.csWidgetAppearance().getWidgetClass() != null) {
                    StoriesWidgetService.loadEmpty(StoryDownloadManager.this.context, AppearanceManager.csWidgetAppearance().getWidgetClass());
                }
            } else if (AppearanceManager.csWidgetAppearance() != null && AppearanceManager.csWidgetAppearance().getWidgetClass() != null) {
                new Handler().postDelayed(new a(), 500L);
            }
            StoryDownloadManager storyDownloadManager = StoryDownloadManager.this;
            Story.StoryType storyType = Story.StoryType.COMMON;
            storyDownloadManager.setLocalsOpened(list, storyType);
            StoryDownloadManager.this.uploadingAdditional(list, storyType);
            ArrayList arrayList2 = new ArrayList();
            List<Story> storiesListByType = StoryDownloadManager.this.getStoriesListByType(storyType);
            synchronized (StoryDownloadManager.this.storiesLock) {
                try {
                    for (Story story : list) {
                        if (story != null && !storiesListByType.contains(story)) {
                            arrayList2.add(story);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList2.size() > 0) {
                try {
                    StoryDownloadManager.this.uploadingAdditional(arrayList2, Story.StoryType.COMMON);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            boolean z = this.a;
            String str = null;
            if (objArr != null && objArr.length > 0) {
                z &= ((Boolean) objArr[0]).booleanValue();
                if (objArr.length > 1) {
                    str = (String) objArr[1];
                }
            }
            if (z) {
                StoryDownloadManager.this.storyDownloader.r(new b(ProfilingManager.getInstance().addTask("api_favorite_item"), list, str));
            } else if (this.b != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Story story2 : list) {
                    arrayList3.add(Integer.valueOf(story2.id));
                }
                this.b.setFeedId(str);
                this.b.storiesLoaded(arrayList3);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends SimpleListCallback {
        final /* synthetic */ LoadStoriesCallback a;

        f(LoadStoriesCallback loadStoriesCallback) {
            this.a = loadStoriesCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onError(String str) {
            LoadStoriesCallback loadStoriesCallback = this.a;
            if (loadStoriesCallback != null) {
                loadStoriesCallback.onError();
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.SimpleListCallback, com.inappstory.sdk.network.SimpleApiCallback
        public void onSuccess(List<Story> list, Object... objArr) {
            StoryDownloadManager storyDownloadManager = StoryDownloadManager.this;
            Story.StoryType storyType = Story.StoryType.COMMON;
            storyDownloadManager.uploadingAdditional(list, storyType);
            ArrayList arrayList = new ArrayList();
            List<Story> storiesListByType = StoryDownloadManager.this.getStoriesListByType(storyType);
            synchronized (StoryDownloadManager.this.storiesLock) {
                try {
                    for (Story story : list) {
                        if (story != null && !storiesListByType.contains(story)) {
                            arrayList.add(story);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList.size() > 0) {
                try {
                    StoryDownloadManager storyDownloadManager2 = StoryDownloadManager.this;
                    Story.StoryType storyType2 = Story.StoryType.COMMON;
                    storyDownloadManager2.setLocalsOpened(arrayList, storyType2);
                    StoryDownloadManager.this.uploadingAdditional(arrayList, storyType2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.a != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Story story2 : list) {
                    arrayList2.add(Integer.valueOf(story2.id));
                }
                this.a.storiesLoaded(arrayList2);
            }
        }
    }

    public StoryDownloadManager(Context context, ExceptionCache exceptionCache) {
        this.stories = new ArrayList();
        this.ugcStories = new ArrayList();
        this.favStories = new ArrayList();
        this.favoriteImages = new ArrayList();
        this.context = context;
        this.stories = new ArrayList();
        this.ugcStories = new ArrayList();
        this.favStories = new ArrayList();
        this.favoriteImages = new ArrayList();
        if (exceptionCache != null) {
            this.stories.addAll(exceptionCache.getStories());
            this.favStories.addAll(exceptionCache.getFavStories());
            this.favoriteImages.addAll(exceptionCache.getFavoriteImages());
        }
        this.storyDownloader = new com.inappstory.sdk.stories.cache.b(new b(), this);
        this.slidesDownloader = new com.inappstory.sdk.stories.cache.a(new c(), this);
    }

    public void addCompletedStoryTask(Story story, Story.StoryType storyType) {
        List<Story> storiesListByType = getStoriesListByType(storyType);
        synchronized (this.storiesLock) {
            try {
                Iterator<Story> it = storiesListByType.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Story next = it.next();
                        if (next != null && next.id == story.id) {
                            break;
                        }
                    } else {
                        storiesListByType.add(story);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.inappstory.sdk.stories.cache.b bVar = this.storyDownloader;
        if (bVar != null) {
            bVar.g(story.id, storyType);
            Story storyById = getStoryById(story.id, storyType);
            story.isOpened = storyById.isOpened;
            story.lastIndex = storyById.lastIndex;
            storiesListByType.set(storiesListByType.indexOf(storyById), story);
            setStory(story, story.id, storyType);
            storyLoaded(story.id, storyType);
            try {
                this.slidesDownloader.g(story, 3, storyType);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void addStories(List<Story> list, Story.StoryType storyType) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        List<Story> storiesListByType = getStoriesListByType(storyType);
        for (Story story : list) {
            if (story != null) {
                if (!storiesListByType.contains(story)) {
                    storiesListByType.add(story);
                } else {
                    int indexOf = storiesListByType.indexOf(story);
                    if (indexOf >= 0) {
                        boolean z9 = false;
                        if (story.pages == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (storiesListByType.get(indexOf).pages != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z & z2) {
                            ArrayList arrayList = new ArrayList();
                            story.pages = arrayList;
                            arrayList.addAll(storiesListByType.get(indexOf).pages);
                        }
                        if (story.durations == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (storiesListByType.get(indexOf).durations != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 & z4) {
                            ArrayList arrayList2 = new ArrayList();
                            story.durations = arrayList2;
                            arrayList2.addAll(storiesListByType.get(indexOf).durations);
                            story.setSlidesCount(story.durations.size());
                        }
                        if (story.layout == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (storiesListByType.get(indexOf).layout != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5 & z6) {
                            story.layout = storiesListByType.get(indexOf).layout;
                        }
                        if (story.srcList == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (storiesListByType.get(indexOf).srcList != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z7 & z8) {
                            ArrayList arrayList3 = new ArrayList();
                            story.srcList = arrayList3;
                            arrayList3.addAll(storiesListByType.get(indexOf).srcList);
                        }
                        story.isOpened = (story.isOpened || storiesListByType.get(indexOf).isOpened) ? true : true;
                    }
                    storiesListByType.set(indexOf, story);
                }
            }
        }
    }

    public void addStoryTask(int i, ArrayList<Integer> arrayList, Story.StoryType storyType) {
        try {
            this.storyDownloader.h(i, arrayList, storyType);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void addSubscriber(ReaderPageManager readerPageManager) {
        synchronized (this.lock) {
            this.subscribers.add(readerPageManager);
        }
        if (this.storyErrorDelayed.remove(Integer.valueOf(readerPageManager.getStoryId())) != null) {
            readerPageManager.storyLoadError();
        }
    }

    public void changePriority(int i, List<Integer> list, Story.StoryType storyType) {
        com.inappstory.sdk.stories.cache.a aVar = this.slidesDownloader;
        if (aVar != null) {
            aVar.h(Integer.valueOf(i), list, storyType);
        }
    }

    public void changePriorityForSingle(int i, Story.StoryType storyType) {
        com.inappstory.sdk.stories.cache.a aVar = this.slidesDownloader;
        if (aVar != null) {
            aVar.i(Integer.valueOf(i), storyType);
        }
    }

    public int checkIfPageLoaded(int i, int i2, Story.StoryType storyType) {
        try {
            return this.slidesDownloader.j(new SlideTaskData(Integer.valueOf(i), Integer.valueOf(i2), storyType));
        } catch (IOException unused) {
            return 0;
        }
    }

    public void cleanStoriesIndex(Story.StoryType storyType) {
        List<Story> storiesListByType = getStoriesListByType(storyType);
        synchronized (this.storiesLock) {
            try {
                for (Story story : storiesListByType) {
                    if (story != null) {
                        story.lastIndex = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cleanTasks() {
        cleanTasks(true);
    }

    public void clearAllFavoriteStatus(Story.StoryType storyType) {
        for (Story story : getStoriesListByType(storyType)) {
            if (story != null) {
                story.favorite = false;
            }
        }
    }

    public void clearCache() {
        this.storyDownloader.j();
        this.slidesDownloader.k();
        try {
            InAppStoryService inAppStoryService = InAppStoryService.getInstance();
            if (inAppStoryService != null) {
                inAppStoryService.listStoriesIds.clear();
                inAppStoryService.getCommonCache().clearCache();
                inAppStoryService.getFastCache().clearCache();
                inAppStoryService.getInfiniteCache().clearCache();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void destroy() {
        this.storyDownloader.k();
        this.slidesDownloader.l();
        getStoriesListByType(Story.StoryType.UGC).clear();
        getStoriesListByType(Story.StoryType.COMMON).clear();
        this.storyDownloader.j();
        this.slidesDownloader.k();
    }

    public void getFullStoryById(GetStoryByIdCallback getStoryByIdCallback, int i, Story.StoryType storyType) {
        ArrayList<Story> arrayList = new ArrayList();
        List<Story> storiesListByType = getStoriesListByType(storyType);
        synchronized (this.storiesLock) {
            if (storiesListByType != null) {
                try {
                    arrayList.addAll(storiesListByType);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        for (Story story : arrayList) {
            if (story.id == i) {
                getStoryByIdCallback.getStory(story);
                return;
            }
        }
    }

    public void getFullStoryByStringId(GetStoryByIdCallback getStoryByIdCallback, String str, Story.StoryType storyType) {
        if (InAppStoryService.isNull()) {
            getStoryByIdCallback.loadError(-1);
        } else {
            SessionManager.getInstance().useOrOpenSession(new a(getStoryByIdCallback, str, storyType));
        }
    }

    public List<Story> getStories(Story.StoryType storyType) {
        return getStoriesListByType(storyType);
    }

    public List<Story> getStoriesListByType(Story.StoryType storyType) {
        if (storyType == Story.StoryType.COMMON) {
            if (this.stories == null) {
                this.stories = new ArrayList();
            }
            return this.stories;
        }
        if (this.ugcStories == null) {
            this.ugcStories = new ArrayList();
        }
        return this.ugcStories;
    }

    public Story getStoryById(int i, Story.StoryType storyType) {
        List<Story> storiesListByType = getStoriesListByType(storyType);
        synchronized (this.storiesLock) {
            try {
                for (Story story : storiesListByType) {
                    if (story != null && story.id == i) {
                        return story;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initDownloaders() {
        this.storyDownloader.o();
        this.slidesDownloader.n();
    }

    public void loadStories(String str, LoadStoriesCallback loadStoriesCallback, boolean z, boolean z2) {
        SimpleListCallback eVar = new e(z2, loadStoriesCallback);
        SimpleListCallback fVar = new f(loadStoriesCallback);
        if (str != null && !z) {
            this.storyDownloader.t(str, eVar);
            return;
        }
        com.inappstory.sdk.stories.cache.b bVar = this.storyDownloader;
        if (z) {
            eVar = fVar;
        }
        bVar.s(eVar, z);
    }

    public void loadUgcStories(LoadStoriesCallback loadStoriesCallback, String str) {
        this.storyDownloader.v(new d(loadStoriesCallback), str);
    }

    public void putStories(List<Story> list, Story.StoryType storyType) {
        List<Story> storiesListByType = getStoriesListByType(storyType);
        if (list == null) {
            return;
        }
        for (Story story : list) {
            if (story != null) {
                boolean z = true;
                for (int i = 0; i < storiesListByType.size(); i++) {
                    if (storiesListByType.get(i).id == story.id) {
                        storiesListByType.get(i).isOpened = story.isOpened;
                        storiesListByType.set(i, story);
                        z = false;
                    }
                }
                if (z) {
                    storiesListByType.add(story);
                }
            }
        }
    }

    public void refreshLocals(Story.StoryType storyType) {
        ArrayList<Story> arrayList;
        List<Story> storiesListByType = getStoriesListByType(storyType);
        synchronized (this.storiesLock) {
            arrayList = new ArrayList(storiesListByType);
        }
        synchronized (this.storiesLock) {
            try {
                for (Story story : arrayList) {
                    story.isOpened = false;
                }
                setLocalsOpened(arrayList, storyType);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reloadStory(int i, Story.StoryType storyType) {
        this.slidesDownloader.q(new com.inappstory.sdk.stories.cache.c(Integer.valueOf(i), storyType));
        this.storyDownloader.w(i, new ArrayList<>(), storyType);
    }

    public void removeSubscriber(ReaderPageManager readerPageManager) {
        synchronized (this.lock) {
            this.subscribers.remove(readerPageManager);
        }
    }

    public void setCurrentSlide(int i, int i2) {
        this.slidesDownloader.r(i, i2);
    }

    void setLocalsOpened(List<Story> list, Story.StoryType storyType) {
        if (InAppStoryService.isNull()) {
            return;
        }
        InAppStoryService.getInstance().saveStoriesOpened(list, storyType);
    }

    public void setStory(Story story, int i, Story.StoryType storyType) {
        if (story == null) {
            return;
        }
        List<Story> storiesListByType = getStoriesListByType(storyType);
        Story storyById = getStoryById(i, storyType);
        if (storyById == null) {
            storiesListByType.add(story);
            return;
        }
        storyById.loadedPages = new ArrayList();
        storyById.pages = new ArrayList(story.pages);
        for (int i2 = 0; i2 < storyById.pages.size(); i2++) {
            storyById.loadedPages.add(Boolean.FALSE);
        }
        storyById.id = i;
        storyById.layout = story.layout;
        storyById.hasAudio = story.hasAudio;
        storyById.tags = story.tags;
        storyById.hasSwipeUp = Boolean.valueOf(story.hasSwipeUp());
        storyById.title = story.title;
        storyById.statTitle = story.statTitle;
        storyById.srcList = new ArrayList(story.getSrcList());
        storyById.imagePlaceholdersList = new ArrayList(story.getImagePlaceholdersList());
        ArrayList arrayList = new ArrayList(story.durations);
        storyById.durations = arrayList;
        storyById.slidesShare = story.slidesShare;
        storyById.slidesPayload = story.slidesPayload;
        if (!arrayList.isEmpty()) {
            storyById.setSlidesCount(story.durations.size());
        } else {
            storyById.setSlidesCount(story.getSlidesCount());
        }
    }

    void slideError(SlideTaskData slideTaskData) {
        synchronized (this.lock) {
            try {
                if (this.subscribers.isEmpty()) {
                    this.slideErrorDelayed.put(slideTaskData, Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                for (ReaderPageManager readerPageManager : this.subscribers) {
                    if (readerPageManager.getStoryId() == slideTaskData.storyId.intValue()) {
                        readerPageManager.slideLoadError(slideTaskData.index.intValue());
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void slideLoaded(SlideTaskData slideTaskData) {
        synchronized (this.lock) {
            try {
                for (ReaderPageManager readerPageManager : this.subscribers) {
                    if (readerPageManager.getStoryId() == slideTaskData.storyId.intValue() && readerPageManager.getStoryType() == slideTaskData.storyType) {
                        readerPageManager.slideLoadedInCache(slideTaskData.index.intValue());
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void storyError(com.inappstory.sdk.stories.cache.c cVar) {
        synchronized (this.lock) {
            try {
                if (this.subscribers.isEmpty()) {
                    this.storyErrorDelayed.put(cVar, Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                for (ReaderPageManager readerPageManager : this.subscribers) {
                    if (readerPageManager.getStoryId() == cVar.a.intValue()) {
                        readerPageManager.storyLoadError();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void storyLoaded(int i, Story.StoryType storyType) {
        synchronized (this.lock) {
            try {
                for (ReaderPageManager readerPageManager : this.subscribers) {
                    if (readerPageManager.getStoryId() == i && readerPageManager.getStoryType() == storyType) {
                        readerPageManager.storyLoadedInCache();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void uploadingAdditional(List<Story> list, Story.StoryType storyType) {
        addStories(list, storyType);
    }

    public void cleanTasks(boolean z) {
        if (z) {
            getStoriesListByType(Story.StoryType.UGC).clear();
            getStoriesListByType(Story.StoryType.COMMON).clear();
        }
        this.storyDownloader.j();
        this.slidesDownloader.k();
    }
}
