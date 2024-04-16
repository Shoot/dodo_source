package com.inappstory.sdk.stories.cache;

import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderType;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderValue;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlidesDownloader.java */
/* loaded from: classes3.dex */
public class a {
    StoryDownloadManager a;
    DownloadPageCallback f;
    private final Object b = new Object();
    private final ExecutorService c = Executors.newFixedThreadPool(1);
    List<SlideTaskData> d = new ArrayList();
    List<SlideTaskData> e = new ArrayList();
    private Runnable i = new RunnableC0259a();
    private HashMap<SlideTaskData, SlideTask> j = new HashMap<>();
    private Handler g = new Handler();
    private Handler h = new Handler();

    /* compiled from: SlidesDownloader.java */
    /* renamed from: com.inappstory.sdk.stories.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0259a implements Runnable {
        boolean a = false;

        /* compiled from: SlidesDownloader.java */
        /* renamed from: com.inappstory.sdk.stories.cache.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class CallableC0260a implements Callable {
            final /* synthetic */ SlideTaskData a;

            CallableC0260a(SlideTaskData slideTaskData) {
                this.a = slideTaskData;
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                return a.this.p(this.a);
            }
        }

        RunnableC0259a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SlideTaskData m = a.this.m();
            if (m != null) {
                synchronized (a.this.b) {
                    Object obj = a.this.j.get(m);
                    Objects.requireNonNull(obj);
                    ((SlideTask) obj).loadType = 1;
                }
                a.this.c.submit(new CallableC0260a(m));
                return;
            }
            a.this.g.postDelayed(a.this.i, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(DownloadPageCallback downloadPageCallback, StoryDownloadManager storyDownloadManager) {
        this.f = downloadPageCallback;
        this.a = storyDownloadManager;
        this.g.postDelayed(this.i, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SlideTaskData m() {
        synchronized (this.b) {
            try {
                HashMap<SlideTaskData, SlideTask> hashMap = this.j;
                if (hashMap != null && hashMap.size() != 0) {
                    List<SlideTaskData> list = this.d;
                    if (list != null && this.e != null) {
                        for (SlideTaskData slideTaskData : list) {
                            if (this.j.containsKey(slideTaskData)) {
                                SlideTask slideTask = this.j.get(slideTaskData);
                                Objects.requireNonNull(slideTask);
                                if (slideTask.loadType == 0) {
                                    return slideTaskData;
                                }
                            }
                        }
                        for (SlideTaskData slideTaskData2 : this.e) {
                            if (this.j.containsKey(slideTaskData2)) {
                                SlideTask slideTask2 = this.j.get(slideTaskData2);
                                Objects.requireNonNull(slideTask2);
                                if (slideTask2.loadType == 0) {
                                    return slideTaskData2;
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    private void o(SlideTaskData slideTaskData) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().cacheError();
        }
        synchronized (this.b) {
            SlideTask slideTask = this.j.get(slideTaskData);
            Objects.requireNonNull(slideTask);
            slideTask.loadType = -1;
            this.f.onSlideError(slideTaskData);
        }
        this.g.postDelayed(this.i, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Story story, int i, Story.StoryType storyType) throws Exception {
        int i2;
        Object obj;
        HashMap hashMap = new HashMap();
        if (InAppStoryService.isNotNull()) {
            hashMap.putAll(InAppStoryService.getInstance().getImagePlaceholdersValuesWithDefaults());
        }
        synchronized (this.b) {
            try {
                int i3 = story.id;
                if (i == 3) {
                    i2 = story.pages.size();
                } else {
                    i2 = 2;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    if (this.j.get(new SlideTaskData(Integer.valueOf(i3), Integer.valueOf(i4), storyType)) == null) {
                        SlideTask slideTask = new SlideTask();
                        slideTask.loadType = 0;
                        slideTask.urls = story.getSrcListUrls(i4, null);
                        slideTask.videoUrls = story.getSrcListUrls(i4, ElementGenerator.TYPE_VIDEO);
                        for (String str : story.getPlaceholdersListNames(i4)) {
                            Pair pair = (Pair) hashMap.get(str);
                            if (pair != null && (obj = pair.first) != null) {
                                ImagePlaceholderType type = ((ImagePlaceholderValue) obj).getType();
                                ImagePlaceholderType imagePlaceholderType = ImagePlaceholderType.URL;
                                if (type == imagePlaceholderType) {
                                    Object obj2 = pair.second;
                                    if (obj2 != null && ((ImagePlaceholderValue) obj2).getType() == imagePlaceholderType) {
                                        slideTask.urlsWithAlter.add(new UrlWithAlter(((ImagePlaceholderValue) pair.first).getUrl(), ((ImagePlaceholderValue) pair.second).getUrl()));
                                    } else {
                                        slideTask.urlsWithAlter.add(new UrlWithAlter(((ImagePlaceholderValue) pair.first).getUrl()));
                                    }
                                }
                            }
                        }
                        this.j.put(new SlideTaskData(Integer.valueOf(i3), Integer.valueOf(i4), storyType), slideTask);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Integer num, List<Integer> list, Story.StoryType storyType) {
        synchronized (this.b) {
            try {
                for (int size = this.d.size() - 1; size >= 0; size--) {
                    if (!this.e.contains(this.d.get(size))) {
                        this.e.add(0, this.d.get(size));
                    }
                }
                this.d.clear();
                Story storyById = this.a.getStoryById(num.intValue(), storyType);
                if (storyById == null) {
                    return;
                }
                int slidesCount = storyById.getSlidesCount();
                for (int i = 0; i < slidesCount; i++) {
                    SlideTaskData slideTaskData = new SlideTaskData(num, Integer.valueOf(i), storyType);
                    this.e.remove(slideTaskData);
                    int i2 = storyById.lastIndex;
                    if (i != i2 && i != i2 + 1) {
                        this.d.add(slideTaskData);
                    }
                }
                int i3 = storyById.lastIndex;
                if (slidesCount > i3) {
                    this.d.add(0, new SlideTaskData(num, Integer.valueOf(i3), storyType));
                    int i4 = storyById.lastIndex;
                    if (slidesCount > i4 + 1) {
                        this.d.add(1, new SlideTaskData(num, Integer.valueOf(i4 + 1), storyType));
                    }
                }
                int min = Math.min(this.d.size(), 2);
                for (Integer num2 : list) {
                    Story storyById2 = this.a.getStoryById(num2.intValue(), storyType);
                    if (storyById2.lastIndex < storyById2.getSlidesCount() - 1) {
                        SlideTaskData slideTaskData2 = new SlideTaskData(num2, Integer.valueOf(storyById2.lastIndex + 1), storyType);
                        this.e.remove(slideTaskData2);
                        this.d.add(min, slideTaskData2);
                    }
                    SlideTaskData slideTaskData3 = new SlideTaskData(num2, Integer.valueOf(storyById2.lastIndex), storyType);
                    this.e.remove(slideTaskData3);
                    this.d.add(min, slideTaskData3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Integer num, Story.StoryType storyType) {
        synchronized (this.b) {
            try {
                Story storyById = this.a.getStoryById(num.intValue(), storyType);
                int slidesCount = storyById.getSlidesCount();
                for (int i = 0; i < slidesCount; i++) {
                    this.d.remove(new SlideTaskData(num, Integer.valueOf(i), storyType));
                }
                for (int i2 = 0; i2 < slidesCount; i2++) {
                    SlideTaskData slideTaskData = new SlideTaskData(num, Integer.valueOf(i2), storyType);
                    int i3 = storyById.lastIndex;
                    if (i2 != i3 && i2 != i3 + 1) {
                        this.d.add(slideTaskData);
                    }
                }
                int i4 = storyById.lastIndex;
                if (slidesCount > i4) {
                    this.d.add(0, new SlideTaskData(num, Integer.valueOf(i4), storyType));
                    int i5 = storyById.lastIndex;
                    if (slidesCount > i5 + 1) {
                        this.d.add(1, new SlideTaskData(num, Integer.valueOf(i5 + 1), storyType));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(SlideTaskData slideTaskData) throws IOException {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null) {
            return 0;
        }
        LruDiskCache commonCache = inAppStoryService.getCommonCache();
        SlideTask slideTask = this.j.get(slideTaskData);
        if (slideTask != null) {
            int i = slideTask.loadType;
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(slideTask.urls);
                arrayList.addAll(slideTask.videoUrls);
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    String cropUrlOld = Downloader.cropUrlOld((String) it.next(), true);
                    if (!commonCache.hasKey(cropUrlOld)) {
                        z = true;
                    } else if (commonCache.getFullFile(cropUrlOld) == null) {
                        synchronized (this.b) {
                            slideTask.loadType = 0;
                        }
                        return 0;
                    }
                }
                if (!z) {
                    return 1;
                }
                this.j.remove(slideTaskData);
            } else if (i == -1) {
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        synchronized (this.b) {
            this.j.clear();
            this.d.clear();
            this.e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacks(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.removeCallbacks(this.i);
            }
        } catch (Exception unused) {
        }
        this.g.postDelayed(this.i, 100L);
    }

    Object p(SlideTaskData slideTaskData) {
        try {
            ArrayList arrayList = new ArrayList();
            SlideTask slideTask = this.j.get(slideTaskData);
            if (slideTask == null) {
                return null;
            }
            synchronized (this.b) {
                arrayList.addAll(slideTask.videoUrls);
                arrayList.addAll(slideTask.urls);
            }
            DownloadPageFileStatus downloadPageFileStatus = DownloadPageFileStatus.SUCCESS;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                DownloadPageCallback downloadPageCallback = this.f;
                if (downloadPageCallback != null && (downloadPageFileStatus = downloadPageCallback.downloadFile(new UrlWithAlter(str), slideTaskData)) != DownloadPageFileStatus.SUCCESS) {
                    break;
                }
            }
            if (downloadPageFileStatus != DownloadPageFileStatus.SUCCESS) {
                o(slideTaskData);
                return null;
            }
            for (UrlWithAlter urlWithAlter : slideTask.urlsWithAlter) {
                DownloadPageCallback downloadPageCallback2 = this.f;
                if (downloadPageCallback2 != null) {
                    downloadPageCallback2.downloadFile(urlWithAlter, slideTaskData);
                    Log.d("IAS_TAG", "download placeholder: " + slideTaskData.toString() + " " + urlWithAlter.getUrl());
                }
            }
            synchronized (this.b) {
                this.j.get(slideTaskData).loadType = 2;
            }
            this.a.slideLoaded(slideTaskData);
            this.g.postDelayed(this.i, 200L);
            return null;
        } catch (Throwable unused) {
            o(slideTaskData);
            return null;
        }
    }

    public void q(c cVar) {
        synchronized (this.b) {
            try {
                Iterator<Map.Entry<SlideTaskData, SlideTask>> it = this.j.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<SlideTaskData, SlideTask> next = it.next();
                    if (Objects.equals(next.getKey().storyId, cVar.a) && next.getKey().storyType == cVar.b) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i, int i2) {
        synchronized (this.b) {
        }
    }
}
