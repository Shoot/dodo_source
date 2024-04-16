package com.inappstory.sdk.stories.ui.list;

import android.os.Handler;
import android.os.Looper;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesListManager implements ListManager {
    Handler handler = new Handler(Looper.getMainLooper());
    StoriesList list;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null || storiesList.getVisibility() != 0) {
                return;
            }
            StoriesListManager.this.list.changeStoryEvent(this.a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null) {
                return;
            }
            storiesList.closeReader();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null) {
                return;
            }
            storiesList.openReader();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null) {
                return;
            }
            storiesList.refreshList();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null || storiesList.getVisibility() != 0) {
                return;
            }
            StoriesListManager.this.list.clearAllFavorites();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        f(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<FavoriteImage> favoriteImages = InAppStoryService.getInstance().getFavoriteImages();
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.a, Story.StoryType.COMMON);
            if (storyById == null) {
                return;
            }
            if (this.b) {
                FavoriteImage favoriteImage = new FavoriteImage(this.a, storyById.getImage(), storyById.getBackgroundColor());
                if (!favoriteImages.contains(favoriteImage)) {
                    favoriteImages.add(0, favoriteImage);
                }
            } else {
                Iterator<FavoriteImage> it = favoriteImages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FavoriteImage next = it.next();
                    if (next.getId() == this.a) {
                        favoriteImages.remove(next);
                        break;
                    }
                }
            }
            StoriesList storiesList = StoriesListManager.this.list;
            if (storiesList == null || storiesList.getVisibility() != 0) {
                return;
            }
            StoriesListManager.this.list.favStory(this.a, this.b, favoriteImages, this.c);
        }
    }

    private void checkHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
    }

    private void post(Runnable runnable) {
        checkHandler();
        this.handler.post(runnable);
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void changeStory(int i, String str) {
        if (InAppStoryService.isNull()) {
            return;
        }
        StoryDownloadManager downloadManager = InAppStoryService.getInstance().getDownloadManager();
        Story.StoryType storyType = Story.StoryType.COMMON;
        Story storyById = downloadManager.getStoryById(i, storyType);
        if (storyById == null) {
            return;
        }
        storyById.isOpened = true;
        storyById.saveStoryOpened(storyType);
        checkHandler();
        post(new a(i, str));
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void changeUserId() {
        post(new d());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void clear() {
        this.list = null;
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void clearAllFavorites() {
        post(new e());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void closeReader() {
        post(new b());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void openReader() {
        post(new c());
    }

    @Override // com.inappstory.sdk.stories.ui.list.ListManager
    public void storyFavorite(int i, boolean z, boolean z2) {
        if (InAppStoryService.isNull()) {
            return;
        }
        post(new f(i, z, z2));
    }
}
