package com.inappstory.sdk.stories.cache;

import android.os.Handler;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.ApiInterface;
import com.inappstory.sdk.network.ApiSettings;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.network.SimpleApiCallback;
import com.inappstory.sdk.stories.api.models.Feed;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryListType;
import com.inappstory.sdk.stories.api.models.callbacks.LoadFeedCallback;
import com.inappstory.sdk.stories.api.models.callbacks.LoadListCallback;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.utils.SessionManager;
import com.inappstory.sdk.utils.StringsUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StoryDownloader.java */
/* loaded from: classes3.dex */
public class b {
    StoryDownloadManager a;
    private DownloadStoryCallback b;
    private final ExecutorService c = Executors.newFixedThreadPool(1);
    private final Object d = new Object();
    private HashMap<com.inappstory.sdk.stories.cache.c, com.inappstory.sdk.stories.cache.d> e = new HashMap<>();
    ArrayList<com.inappstory.sdk.stories.cache.c> f = new ArrayList<>();
    ArrayList<com.inappstory.sdk.stories.cache.c> g = new ArrayList<>();
    private Runnable j = new a();
    private Handler h = new Handler();
    private Handler i = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoryDownloader.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        boolean a = false;

        /* compiled from: StoryDownloader.java */
        /* renamed from: com.inappstory.sdk.stories.cache.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0261a implements OpenSessionCallback {
            final /* synthetic */ com.inappstory.sdk.stories.cache.c a;

            C0261a(com.inappstory.sdk.stories.cache.c cVar) {
                this.a = cVar;
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
            public void onError() {
                b.this.q(this.a);
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
            public void onSuccess() {
                a.this.a = false;
            }
        }

        /* compiled from: StoryDownloader.java */
        /* renamed from: com.inappstory.sdk.stories.cache.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class CallableC0262b implements Callable<Void> {
            final /* synthetic */ com.inappstory.sdk.stories.cache.c a;

            CallableC0262b(com.inappstory.sdk.stories.cache.c cVar) {
                this.a = cVar;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                b.this.p(this.a);
                return null;
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.inappstory.sdk.stories.cache.c cVar;
            try {
                cVar = b.this.m();
            } catch (Exception e) {
                e.printStackTrace();
                cVar = null;
            }
            if (cVar != null) {
                synchronized (b.this.d) {
                    try {
                        if (b.this.n(cVar) == 4) {
                            b.this.x(cVar, 5);
                        } else if (b.this.n(cVar) == 1) {
                            b.this.x(cVar, 2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Session.needToUpdate()) {
                    if (!this.a) {
                        this.a = true;
                        if (SessionManager.getInstance() != null) {
                            SessionManager.getInstance().openSession(new C0261a(cVar));
                        }
                    }
                    b.this.h.postDelayed(b.this.j, 100L);
                    return;
                }
                b.this.c.submit(new CallableC0262b(cVar));
                return;
            }
            b.this.h.postDelayed(b.this.j, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoryDownloader.java */
    /* renamed from: com.inappstory.sdk.stories.cache.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0263b implements OpenSessionCallback {
        final /* synthetic */ String a;
        final /* synthetic */ SimpleApiCallback b;

        /* compiled from: StoryDownloader.java */
        /* renamed from: com.inappstory.sdk.stories.cache.b$b$a */
        /* loaded from: classes3.dex */
        class a extends NetworkCallback<List<Story>> {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void error424(String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(null);
                C0263b.this.b.onError(str);
                SessionManager.getInstance().closeSession(true, false);
                C0263b c0263b = C0263b.this;
                b.this.v(c0263b.b, c0263b.a);
            }

            @Override // com.inappstory.sdk.network.Callback
            public Type getType() {
                return new StoryListType();
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l("UGC");
                C0263b.this.b.onError(str);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                ProfilingManager.getInstance().setReady(this.a);
                b.l("UGC");
                C0263b.this.b.onError("");
            }

            @Override // com.inappstory.sdk.network.Callback
            public void onSuccess(List<Story> list) {
                if (!InAppStoryService.isNull() && list != null) {
                    ProfilingManager.getInstance().setReady(this.a);
                    C0263b.this.b.onSuccess(list, new Object[0]);
                    return;
                }
                b.l("UGC");
                C0263b.this.b.onError("");
            }
        }

        C0263b(String str, SimpleApiCallback simpleApiCallback) {
            this.a = str;
            this.b = simpleApiCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            b.l("UGC");
            this.b.onError("");
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            if (InAppStoryService.isNull()) {
                return;
            }
            NetworkClient.getApi().getUgcStories(this.a, null, "slides_count").enqueue(new a(ProfilingManager.getInstance().addTask("api_ugc_story_list")));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoryDownloader.java */
    /* loaded from: classes3.dex */
    public class c implements OpenSessionCallback {
        final /* synthetic */ String a;
        final /* synthetic */ SimpleApiCallback b;

        /* compiled from: StoryDownloader.java */
        /* loaded from: classes3.dex */
        class a extends LoadFeedCallback {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void error424(String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(null);
                c.this.b.onError(str);
                SessionManager.getInstance().closeSession(true, false);
                c cVar = c.this;
                b.this.t(cVar.a, cVar.b);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(c.this.a);
                c.this.b.onError(str);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(c.this.a);
                c.this.b.onError("");
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadFeedCallback, com.inappstory.sdk.network.Callback
            public void onSuccess(Feed feed) {
                if (!InAppStoryService.isNull() && feed != null) {
                    ProfilingManager.getInstance().setReady(this.a);
                    c.this.b.onSuccess(feed.stories, Boolean.valueOf(feed.hasFavorite()), feed.getFeedId());
                    return;
                }
                b.l(c.this.a);
                c.this.b.onError("");
            }
        }

        c(String str, SimpleApiCallback simpleApiCallback) {
            this.a = str;
            this.b = simpleApiCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            b.l(this.a);
            this.b.onError("");
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            if (InAppStoryService.isNull()) {
                return;
            }
            NetworkClient.getApi().getFeed(this.a, ApiSettings.getInstance().getTestKey(), 0, InAppStoryService.getInstance().getTagsString(), null).enqueue(new a(ProfilingManager.getInstance().addTask("api_story_list")));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoryDownloader.java */
    /* loaded from: classes3.dex */
    public class d implements OpenSessionCallback {
        final /* synthetic */ boolean a;
        final /* synthetic */ SimpleApiCallback b;

        /* compiled from: StoryDownloader.java */
        /* loaded from: classes3.dex */
        class a extends LoadListCallback {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadListCallback, com.inappstory.sdk.network.NetworkCallback
            public void error424(String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(null);
                d.this.b.onError(str);
                SessionManager.getInstance().closeSession(true, false);
                d dVar = d.this;
                b.this.s(dVar.b, dVar.a);
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadListCallback, com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(null);
                d.this.b.onError(str);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                ProfilingManager.getInstance().setReady(this.a);
                b.l(null);
                d.this.b.onError("");
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadListCallback, com.inappstory.sdk.network.Callback
            public void onSuccess(List<Story> list) {
                if (InAppStoryService.isNull()) {
                    b.l(null);
                    d.this.b.onError("");
                    return;
                }
                ProfilingManager.getInstance().setReady(this.a);
                d.this.b.onSuccess(list, new Object[0]);
            }
        }

        d(boolean z, SimpleApiCallback simpleApiCallback) {
            this.a = z;
            this.b = simpleApiCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            b.l(null);
            this.b.onError("");
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            String str;
            String tagsString;
            if (InAppStoryService.isNull()) {
                return;
            }
            ProfilingManager profilingManager = ProfilingManager.getInstance();
            if (this.a) {
                str = "api_favorite_list";
            } else {
                str = "api_story_list";
            }
            String addTask = profilingManager.addTask(str);
            ApiInterface api = NetworkClient.getApi();
            String testKey = ApiSettings.getInstance().getTestKey();
            Integer valueOf = Integer.valueOf(this.a ? 1 : 0);
            if (this.a) {
                tagsString = null;
            } else {
                tagsString = InAppStoryService.getInstance().getTagsString();
            }
            api.getStories(testKey, valueOf, tagsString, null).enqueue(new a(addTask));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(DownloadStoryCallback downloadStoryCallback, StoryDownloadManager storyDownloadManager) {
        this.b = downloadStoryCallback;
        this.a = storyDownloadManager;
        this.h.postDelayed(this.j, 100L);
    }

    public static void l(String str) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().loadListError(StringsUtils.getNonNull(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.inappstory.sdk.stories.cache.c m() throws Exception {
        synchronized (this.d) {
            try {
                HashMap<com.inappstory.sdk.stories.cache.c, com.inappstory.sdk.stories.cache.d> hashMap = this.e;
                if (hashMap != null && hashMap.size() != 0) {
                    ArrayList<com.inappstory.sdk.stories.cache.c> arrayList = this.f;
                    if (arrayList != null && this.g != null) {
                        Iterator<com.inappstory.sdk.stories.cache.c> it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.inappstory.sdk.stories.cache.c next = it.next();
                            if (n(next) == 1 || n(next) == 4) {
                                return next;
                            }
                        }
                        Iterator<com.inappstory.sdk.stories.cache.c> it2 = this.g.iterator();
                        while (it2.hasNext()) {
                            com.inappstory.sdk.stories.cache.c next2 = it2.next();
                            if (n(next2) == 1 || n(next2) == 4) {
                                return next2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void q(com.inappstory.sdk.stories.cache.c cVar) {
        if (CallbackManager.getInstance().getErrorCallback() != null) {
            CallbackManager.getInstance().getErrorCallback().cacheError();
        }
        synchronized (this.d) {
            try {
                HashMap<com.inappstory.sdk.stories.cache.c, com.inappstory.sdk.stories.cache.d> hashMap = this.e;
                if (hashMap != null) {
                    hashMap.remove(cVar);
                }
                ArrayList<com.inappstory.sdk.stories.cache.c> arrayList = this.f;
                if (arrayList != null) {
                    arrayList.remove(cVar);
                }
                ArrayList<com.inappstory.sdk.stories.cache.c> arrayList2 = this.g;
                if (arrayList2 != null) {
                    arrayList2.remove(cVar);
                }
                x(cVar, -2);
                this.b.onError(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i, Story.StoryType storyType) {
        synchronized (this.d) {
            this.e.put(new com.inappstory.sdk.stories.cache.c(Integer.valueOf(i), storyType), new com.inappstory.sdk.stories.cache.d(-1, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i, ArrayList<Integer> arrayList, Story.StoryType storyType) {
        int i2;
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    this.e = new HashMap<>();
                }
                for (com.inappstory.sdk.stories.cache.c cVar : this.e.keySet()) {
                    com.inappstory.sdk.stories.cache.d dVar = this.e.get(cVar);
                    if (dVar != null && (i2 = dVar.b) > 0 && i2 != 3 && i2 != 6) {
                        dVar.b = i2 + 3;
                    }
                }
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.inappstory.sdk.stories.cache.c cVar2 = new com.inappstory.sdk.stories.cache.c(it.next(), storyType);
                    com.inappstory.sdk.stories.cache.d dVar2 = this.e.get(cVar2);
                    if (dVar2 != null) {
                        int i3 = dVar2.b;
                        if (i3 != 3 && i3 != 6) {
                            dVar2.b = 4;
                        }
                    } else {
                        this.e.put(cVar2, new com.inappstory.sdk.stories.cache.d(4));
                    }
                }
                com.inappstory.sdk.stories.cache.c cVar3 = new com.inappstory.sdk.stories.cache.c(Integer.valueOf(i), storyType);
                com.inappstory.sdk.stories.cache.d dVar3 = this.e.get(cVar3);
                if (dVar3 != null) {
                    int i4 = dVar3.b;
                    if (i4 != 3) {
                        if (i4 == 6) {
                            dVar3.b = 3;
                            DownloadStoryCallback downloadStoryCallback = this.b;
                            if (downloadStoryCallback != null) {
                                downloadStoryCallback.onDownload(this.a.getStoryById(i, storyType), 3, storyType);
                            }
                        } else if (i4 == 5) {
                            dVar3.b = 2;
                        } else {
                            dVar3.b = 1;
                        }
                    } else {
                        return;
                    }
                } else {
                    this.e.put(cVar3, new com.inappstory.sdk.stories.cache.d(1));
                }
                i(cVar3, arrayList, storyType);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void i(com.inappstory.sdk.stories.cache.c cVar, ArrayList<Integer> arrayList, Story.StoryType storyType) {
        this.g.remove(cVar);
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.remove(new com.inappstory.sdk.stories.cache.c(it.next(), storyType));
        }
        Iterator<com.inappstory.sdk.stories.cache.c> it2 = this.f.iterator();
        while (it2.hasNext()) {
            com.inappstory.sdk.stories.cache.c next = it2.next();
            if (!this.g.contains(next)) {
                this.g.add(next);
            }
        }
        this.f.clear();
        this.f.add(cVar);
        Iterator<Integer> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.f.add(new com.inappstory.sdk.stories.cache.c(it3.next(), storyType));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        synchronized (this.d) {
            this.e.clear();
            this.f.clear();
            this.g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacks(this.j);
        }
    }

    int n(com.inappstory.sdk.stories.cache.c cVar) {
        if (!this.e.containsKey(cVar)) {
            return -5;
        }
        com.inappstory.sdk.stories.cache.d dVar = this.e.get(cVar);
        Objects.requireNonNull(dVar);
        return dVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        try {
            Handler handler = this.h;
            if (handler != null) {
                handler.removeCallbacks(this.j);
            }
        } catch (Exception unused) {
        }
        this.h.postDelayed(this.j, 100L);
    }

    void p(com.inappstory.sdk.stories.cache.c cVar) {
        String addTask;
        Response execute;
        try {
            if (cVar.b == Story.StoryType.UGC) {
                addTask = ProfilingManager.getInstance().addTask("api_story_ugc");
                execute = NetworkClient.getApi().getUgcStoryById(Integer.toString(cVar.a.intValue()), 1, "slides_html,slides_structure,layout,slides_duration,src_list,img_placeholder_src_list,slides_screenshot_share,slides_payload").execute();
            } else {
                addTask = ProfilingManager.getInstance().addTask("api_story");
                execute = NetworkClient.getApi().getStoryById(Integer.toString(cVar.a.intValue()), 1, "slides_html,slides_structure,layout,slides_duration,src_list,img_placeholder_src_list,slides_screenshot_share,slides_payload").execute();
            }
            ProfilingManager.getInstance().setReady(addTask);
            u(cVar, execute);
        } catch (Throwable unused) {
            q(cVar);
            this.h.postDelayed(this.j, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(NetworkCallback<List<Story>> networkCallback) {
        NetworkClient.getApi().getStories(ApiSettings.getInstance().getTestKey(), 1, null, "id, background_color, image").enqueue(networkCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(SimpleApiCallback<List<Story>> simpleApiCallback, boolean z) {
        if (InAppStoryService.isNull()) {
            l(null);
            simpleApiCallback.onError("");
        } else if (InAppStoryService.isConnected()) {
            SessionManager.getInstance().useOrOpenSession(new d(z, simpleApiCallback));
        } else {
            l(null);
            simpleApiCallback.onError("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(String str, SimpleApiCallback<List<Story>> simpleApiCallback) {
        if (InAppStoryService.isNull()) {
            l(str);
            simpleApiCallback.onError("");
        } else if (InAppStoryService.isConnected()) {
            SessionManager.getInstance().useOrOpenSession(new c(str, simpleApiCallback));
        } else {
            l(str);
            simpleApiCallback.onError("");
        }
    }

    void u(com.inappstory.sdk.stories.cache.c cVar, Response response) {
        int i;
        DownloadStoryCallback downloadStoryCallback;
        String str = response.body;
        if (str != null) {
            Story story = (Story) JsonParser.fromJson(str, Story.class);
            synchronized (this.d) {
                if (n(cVar) < 4) {
                    i = 3;
                } else {
                    i = 6;
                }
                x(cVar, i);
                this.f.remove(cVar);
                this.g.remove(cVar);
            }
            if (story != null && (downloadStoryCallback = this.b) != null) {
                downloadStoryCallback.onDownload(story, i, cVar.b);
            }
        } else if (response.errorBody != null) {
            q(cVar);
        }
        this.h.postDelayed(this.j, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(SimpleApiCallback<List<Story>> simpleApiCallback, String str) {
        if (InAppStoryService.isNull()) {
            l("UGC");
            simpleApiCallback.onError("");
        } else if (InAppStoryService.isConnected()) {
            SessionManager.getInstance().useOrOpenSession(new C0263b(str, simpleApiCallback));
        } else {
            l("UGC");
            simpleApiCallback.onError("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i, ArrayList<Integer> arrayList, Story.StoryType storyType) {
        synchronized (this.d) {
            try {
                com.inappstory.sdk.stories.cache.c cVar = new com.inappstory.sdk.stories.cache.c(Integer.valueOf(i), storyType);
                if (this.e == null) {
                    this.e = new HashMap<>();
                }
                this.e.remove(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        h(i, arrayList, storyType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(com.inappstory.sdk.stories.cache.c cVar, int i) {
        if (!this.e.containsKey(cVar)) {
            return;
        }
        com.inappstory.sdk.stories.cache.d dVar = this.e.get(cVar);
        Objects.requireNonNull(dVar);
        dVar.b = i;
    }
}
