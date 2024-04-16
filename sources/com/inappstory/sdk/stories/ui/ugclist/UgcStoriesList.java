package com.inappstory.sdk.stories.ui.ugclist;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback;
import com.inappstory.sdk.stories.callbacks.OnFavoriteItemClick;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListCallback;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListScrollCallback;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.list.StoryTouchListener;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.ugc.list.OnUGCItemClick;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
/* loaded from: classes3.dex */
public class UgcStoriesList extends RecyclerView {
    UgcStoriesAdapter adapter;
    AppearanceManager appearanceManager;
    public String cacheId;
    ListCallback callback;
    OnFavoriteItemClick favoriteItemClick;
    RecyclerView.t itemTouchListener;
    String lastPayload;
    RecyclerView.p layoutManager;
    LoadStoriesCallback lcallback;
    private float mPrevX;
    private float mPrevY;
    com.inappstory.sdk.stories.ui.ugclist.a manager;
    boolean readerIsOpened;
    ListScrollCallback scrollCallback;
    StoryTouchListener storyTouchListener;
    OnUGCItemClick ugcItemClick;
    private String uniqueID;

    /* loaded from: classes3.dex */
    public class RecyclerTouchListener implements RecyclerView.t {
        private GestureDetector gestureDetector;
        View lastChild;
        private StoryTouchListener touchListener;

        /* loaded from: classes3.dex */
        class a extends GestureDetector.SimpleOnGestureListener {
            final /* synthetic */ UgcStoriesList a;

            a(UgcStoriesList ugcStoriesList) {
                this.a = ugcStoriesList;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        }

        public RecyclerTouchListener(UgcStoriesList ugcStoriesList, Context context) {
            this(null, context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            View view;
            View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            UgcStoriesList.this.checkAppearanceManager();
            if (this.touchListener == null) {
                this.touchListener = UgcStoriesList.this.appearanceManager.csStoryTouchListener();
            }
            if (this.touchListener != null) {
                if (findChildViewUnder != null && motionEvent.getAction() == 0) {
                    this.touchListener.touchDown(findChildViewUnder, recyclerView.getChildPosition(findChildViewUnder));
                    this.lastChild = findChildViewUnder;
                    return false;
                } else if (this.lastChild != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                    StoryTouchListener storyTouchListener = this.touchListener;
                    View view2 = this.lastChild;
                    storyTouchListener.touchUp(view2, recyclerView.getChildPosition(view2));
                    return false;
                } else if (motionEvent.getAction() == 2 && (view = this.lastChild) != null) {
                    if (findChildViewUnder == null || findChildViewUnder != view) {
                        this.touchListener.touchUp(view, recyclerView.getChildPosition(view));
                        this.lastChild = null;
                        return false;
                    }
                    return false;
                } else {
                    return false;
                }
            }
            return false;
        }

        public RecyclerTouchListener(StoryTouchListener storyTouchListener, Context context) {
            this.lastChild = null;
            this.touchListener = storyTouchListener;
            this.gestureDetector = new GestureDetector(context, new a(UgcStoriesList.this));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.u {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            UgcStoriesList ugcStoriesList = UgcStoriesList.this;
            if (!ugcStoriesList.readerIsOpened) {
                ugcStoriesList.sendIndexes();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            View M = UgcStoriesList.this.layoutManager.M(this.a);
            if (M == null) {
                return;
            }
            M.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            ScreensManager.getInstance().coordinates = new Point((i + (M.getWidth() / 2)) - Sizes.dpToPxExt(8, UgcStoriesList.this.getContext()), i2 + (M.getHeight() / 2));
        }
    }

    public UgcStoriesList(@NonNull Context context) {
        super(context);
        this.storyTouchListener = null;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        this.layoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.readerIsOpened = false;
        this.lastPayload = "";
        init(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAppearanceManager() {
        if (this.appearanceManager == null) {
            this.appearanceManager = AppearanceManager.getCommonInstance();
        }
        if (this.appearanceManager == null) {
            this.appearanceManager = new AppearanceManager();
        }
        this.appearanceManager.csHasFavorite(false).csHasLike(false).csHasShare(false);
    }

    private boolean hasSessionUGC() {
        boolean z;
        synchronized (Session.class) {
            try {
                if (!Session.needToUpdate() && Session.getInstance().editor != null && Session.getInstance().editor.url != null && !Session.getInstance().editor.url.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    private void init(AttributeSet attributeSet) {
        this.uniqueID = UUID.randomUUID().toString();
        this.manager = new com.inappstory.sdk.stories.ui.ugclist.a();
        addOnScrollListener(new a());
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(this, getContext());
        this.itemTouchListener = recyclerTouchListener;
        addOnItemTouchListener(recyclerTouchListener);
    }

    private void loadStoriesInner(String str) {
        this.lastPayload = str;
        if (InAppStoryManager.getInstance() == null) {
            InAppStoryManager.showELog(InAppStoryManager.IAS_ERROR_TAG, "'InAppStoryManager' cannot be null");
        } else if (InAppStoryManager.getInstance().getUserId() == null) {
            InAppStoryManager.showELog(InAppStoryManager.IAS_ERROR_TAG, "Parameter 'userId' cannot be null");
        } else {
            checkAppearanceManager();
            String addTask = ProfilingManager.getInstance().addTask("widget_init");
            if (InAppStoryService.isNotNull()) {
                this.lcallback = new c(addTask);
                InAppStoryService.getInstance().getDownloadManager().loadUgcStories(this.lcallback, str);
                return;
            }
            new Handler().postDelayed(new d(addTask, str), 1000L);
        }
    }

    private void loadStoriesLocal(String str) {
        String str2;
        if (!InAppStoryService.isNull() && (str2 = this.cacheId) != null && !str2.isEmpty()) {
            List<Integer> list = InAppStoryService.getInstance().listStoriesIds.get(this.cacheId);
            if (list == null) {
                loadStoriesInner(str);
                return;
            }
            checkAppearanceManager();
            setOrRefreshAdapter(list);
            ListCallback listCallback = this.callback;
            if (listCallback != null) {
                listCallback.storiesLoaded(list.size(), "");
                return;
            }
            return;
        }
        loadStoriesInner(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrRefreshAdapter(List<Integer> list) {
        int i;
        boolean z;
        checkAppearanceManager();
        if (getAppearanceManager().csListOverscroll()) {
            i = 0;
        } else {
            i = 2;
        }
        setOverScrollMode(i);
        Context context = getContext();
        String str = this.uniqueID;
        AppearanceManager appearanceManager = this.appearanceManager;
        ListCallback listCallback = this.callback;
        if (hasSessionUGC() && this.appearanceManager.csHasUGC()) {
            z = true;
        } else {
            z = false;
        }
        this.adapter = new UgcStoriesAdapter(context, str, list, appearanceManager, listCallback, z, this.ugcItemClick);
        setLayoutManager(this.layoutManager);
        setAdapter(this.adapter);
    }

    public void changeStoryEvent(int i, String str) {
        int indexById;
        int i2;
        String str2;
        int i3;
        UgcStoriesAdapter ugcStoriesAdapter = this.adapter;
        if (ugcStoriesAdapter != null && ugcStoriesAdapter.getStoriesIds() != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.adapter.getStoriesIds().size()) {
                    break;
                } else if (this.adapter.getStoriesIds().get(i4).intValue() == i) {
                    this.adapter.notifyItemChanged(i4);
                    break;
                } else {
                    i4++;
                }
            }
            if (this.layoutManager == null || (indexById = this.adapter.getIndexById(i)) == -1) {
                return;
            }
            RecyclerView.p pVar = this.layoutManager;
            if (pVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
                if (indexById > 0) {
                    i3 = indexById;
                } else {
                    i3 = 0;
                }
                linearLayoutManager.I2(i3, 0);
            } else if (pVar instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) pVar;
                if (indexById > 0) {
                    i2 = indexById;
                } else {
                    i2 = 0;
                }
                gridLayoutManager.I2(i2, 0);
            }
            if (indexById >= 0 && str != null && (str2 = this.uniqueID) != null && str2.equals(str)) {
                new Handler().postDelayed(new b(indexById), 950L);
            }
        }
    }

    public void closeReader() {
        this.readerIsOpened = false;
        sendIndexes();
    }

    public AppearanceManager getAppearanceManager() {
        return this.appearanceManager;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }

    public void loadStories(@NonNull String str) {
        if (str.isEmpty()) {
            loadStories();
        } else {
            loadStoriesLocal(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.manager.a = this;
        InAppStoryManager.debugSDKCalls("StoriesList_onAttachedToWindow", "" + InAppStoryService.isNotNull());
        InAppStoryService.checkAndAddListSubscriber(this.manager);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (InAppStoryService.getInstance() != null) {
            InAppStoryService.getInstance().removeListSubscriber(this.manager);
        } else {
            this.manager.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ListScrollCallback listScrollCallback;
        if (motionEvent.getAction() == 0) {
            this.mPrevX = motionEvent.getX();
            this.mPrevY = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.mPrevX) > Math.abs(motionEvent.getY() - this.mPrevY) && (listScrollCallback = this.scrollCallback) != null) {
            listScrollCallback.scrollStart();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ListScrollCallback listScrollCallback;
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (listScrollCallback = this.scrollCallback) != null) {
            listScrollCallback.scrollEnd();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            OldStatisticManager.getInstance().sendStatistic();
        }
    }

    public void openReader() {
        this.readerIsOpened = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshList() {
        this.adapter = null;
        loadStoriesInner(this.lastPayload);
    }

    public void setAppearanceManager(AppearanceManager appearanceManager) {
        this.appearanceManager = appearanceManager;
    }

    public void setCacheId(String str) {
        this.cacheId = str;
    }

    public void setCallback(ListCallback listCallback) {
        this.callback = listCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.p pVar) {
        this.layoutManager = pVar;
        super.setLayoutManager(pVar);
    }

    public void setOnFavoriteItemClick(OnFavoriteItemClick onFavoriteItemClick) {
        this.favoriteItemClick = onFavoriteItemClick;
    }

    public void setOnUGCItemClick(OnUGCItemClick onUGCItemClick) {
        this.ugcItemClick = onUGCItemClick;
    }

    public void setScrollCallback(ListScrollCallback listScrollCallback) {
        this.scrollCallback = listScrollCallback;
    }

    public void setStoryTouchListener(StoryTouchListener storyTouchListener) {
        this.storyTouchListener = storyTouchListener;
        try {
            removeOnItemTouchListener(this.itemTouchListener);
        } catch (Exception unused) {
        }
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(storyTouchListener, getContext());
        this.itemTouchListener = recyclerTouchListener;
        addOnItemTouchListener(recyclerTouchListener);
    }

    public UgcStoriesList(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.storyTouchListener = null;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        this.layoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.readerIsOpened = false;
        this.lastPayload = "";
        init(attributeSet);
    }

    public void loadStories() {
        loadStories(new HashMap<>());
    }

    public void loadStories(@NonNull HashMap<String, Object> hashMap) {
        loadStoriesLocal(JsonParser.mapToJsonString(hashMap));
    }

    public UgcStoriesList(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.storyTouchListener = null;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        this.layoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.readerIsOpened = false;
        this.lastPayload = "";
        init(attributeSet);
    }

    void sendIndexes() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (InAppStoryService.isNotNull()) {
                UgcStoriesList.this.lcallback = new a();
                InAppStoryService.getInstance().getDownloadManager().loadUgcStories(UgcStoriesList.this.lcallback, this.b);
            }
        }

        /* loaded from: classes3.dex */
        class a implements LoadStoriesCallback {
            a() {
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void onError() {
                ListCallback listCallback = UgcStoriesList.this.callback;
                if (listCallback != null) {
                    listCallback.loadError("");
                }
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void storiesLoaded(List<Integer> list) {
                UgcStoriesList.this.setOrRefreshAdapter(list);
                ProfilingManager.getInstance().setReady(d.this.a);
                ListCallback listCallback = UgcStoriesList.this.callback;
                if (listCallback != null) {
                    listCallback.storiesLoaded(list.size(), "");
                }
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void setFeedId(String str) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements LoadStoriesCallback {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void onError() {
            ListCallback listCallback = UgcStoriesList.this.callback;
            if (listCallback != null) {
                listCallback.loadError("");
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void storiesLoaded(List<Integer> list) {
            String str = UgcStoriesList.this.cacheId;
            if (str != null && !str.isEmpty() && InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().listStoriesIds.put(UgcStoriesList.this.cacheId, list);
            }
            UgcStoriesList.this.setOrRefreshAdapter(list);
            ProfilingManager.getInstance().setReady(this.a);
            ListCallback listCallback = UgcStoriesList.this.callback;
            if (listCallback != null) {
                listCallback.storiesLoaded(list.size(), "");
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void setFeedId(String str) {
        }
    }
}
