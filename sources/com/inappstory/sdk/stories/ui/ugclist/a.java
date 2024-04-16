package com.inappstory.sdk.stories.ui.ugclist;

import android.os.Handler;
import android.os.Looper;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.ui.list.ListManager;
/* compiled from: UgcStoriesListManager.java */
/* loaded from: classes3.dex */
class a implements ListManager {
    UgcStoriesList a;
    Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: UgcStoriesListManager.java */
    /* renamed from: com.inappstory.sdk.stories.ui.ugclist.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0267a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        RunnableC0267a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UgcStoriesList ugcStoriesList = a.this.a;
            if (ugcStoriesList == null || ugcStoriesList.getVisibility() != 0) {
                return;
            }
            a.this.a.changeStoryEvent(this.a, this.b);
        }
    }

    /* compiled from: UgcStoriesListManager.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UgcStoriesList ugcStoriesList = a.this.a;
            if (ugcStoriesList == null) {
                return;
            }
            ugcStoriesList.closeReader();
        }
    }

    /* compiled from: UgcStoriesListManager.java */
    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UgcStoriesList ugcStoriesList = a.this.a;
            if (ugcStoriesList == null) {
                return;
            }
            ugcStoriesList.openReader();
        }
    }

    /* compiled from: UgcStoriesListManager.java */
    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UgcStoriesList ugcStoriesList = a.this.a;
            if (ugcStoriesList == null) {
                return;
            }
            ugcStoriesList.refreshList();
        }
    }

    private void a() {
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper());
        }
    }

    private void b(Runnable runnable) {
        a();
        this.b.post(runnable);
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void changeStory(int i, String str) {
        if (InAppStoryService.isNull()) {
            return;
        }
        StoryDownloadManager downloadManager = InAppStoryService.getInstance().getDownloadManager();
        Story.StoryType storyType = Story.StoryType.UGC;
        Story storyById = downloadManager.getStoryById(i, storyType);
        if (storyById == null) {
            return;
        }
        storyById.isOpened = true;
        storyById.saveStoryOpened(storyType);
        a();
        b(new RunnableC0267a(i, str));
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void changeUserId() {
        b(new d());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void clear() {
        this.a = null;
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void closeReader() {
        b(new b());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void openReader() {
        b(new c());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void clearAllFavorites() {
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void storyFavorite(int i, boolean z, boolean z2) {
    }
}
