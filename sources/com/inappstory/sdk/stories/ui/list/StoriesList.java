package com.inappstory.sdk.stories.ui.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.callbacks.OnFavoriteItemClick;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListCallback;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListScrollCallback;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.ugc.list.OnUGCItemClick;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes3.dex */
public class StoriesList extends RecyclerView {
    public static String DEFAULT_FEED = "default";
    StoriesAdapter adapter;
    AppearanceManager appearanceManager;
    private String cacheId;
    ListCallback callback;
    private RecyclerView.p defaultLayoutManager;
    OnFavoriteItemClick favoriteItemClick;
    private String feed;
    private String feedId;
    public Object feedLock;
    boolean isFavoriteList;
    RecyclerView.t itemTouchListener;
    RecyclerView.p layoutManager;
    LoadStoriesCallback lcallback;
    private float mPrevX;
    private float mPrevY;
    private int mTouchSlop;
    StoriesListManager manager;
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
            final /* synthetic */ StoriesList a;

            a(StoriesList storiesList) {
                this.a = storiesList;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        }

        public RecyclerTouchListener(StoriesList storiesList, Context context) {
            this(null, context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            View view;
            View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            StoriesList.this.checkAppearanceManager();
            if (this.touchListener == null) {
                this.touchListener = StoriesList.this.appearanceManager.csStoryTouchListener();
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
            this.gestureDetector = new GestureDetector(context, new a(StoriesList.this));
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
            StoriesList storiesList = StoriesList.this;
            if (!storiesList.readerIsOpened) {
                storiesList.sendIndexes();
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
            View M = StoriesList.this.layoutManager.M(this.a);
            if (M == null) {
                return;
            }
            M.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            ScreensManager.getInstance().coordinates = new Point((i + (M.getWidth() / 2)) - Sizes.dpToPxExt(8, StoriesList.this.getContext()), i2 + (M.getHeight() / 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.o {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            StoriesList storiesList = StoriesList.this;
            rect.bottom = storiesList.appearanceManager.csListItemMargin(storiesList.getContext());
            StoriesList storiesList2 = StoriesList.this;
            rect.top = storiesList2.appearanceManager.csListItemMargin(storiesList2.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements LoadStoriesCallback {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void onError() {
            StoriesList storiesList = StoriesList.this;
            ListCallback listCallback = storiesList.callback;
            if (listCallback != null) {
                listCallback.loadError(StringsUtils.getNonNull(storiesList.getFeed()));
            }
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void setFeedId(String str) {
            StoriesList.this.setListFeedId(str);
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
        public void storiesLoaded(List<Integer> list) {
            if (StoriesList.this.cacheId != null && !StoriesList.this.cacheId.isEmpty() && InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().listStoriesIds.put(StoriesList.this.cacheId, list);
            }
            StoriesList.this.setOrRefreshAdapter(list);
            ProfilingManager.getInstance().setReady(this.a);
            ListCallback listCallback = StoriesList.this.callback;
            if (listCallback != null) {
                listCallback.storiesLoaded(list.size(), StringsUtils.getNonNull(StoriesList.this.getFeed()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        final /* synthetic */ String a;

        /* loaded from: classes3.dex */
        class a implements LoadStoriesCallback {
            a() {
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void onError() {
                StoriesList storiesList = StoriesList.this;
                ListCallback listCallback = storiesList.callback;
                if (listCallback != null) {
                    listCallback.loadError(StringsUtils.getNonNull(storiesList.getFeed()));
                }
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void setFeedId(String str) {
                StoriesList.this.setListFeedId(str);
            }

            @Override // com.inappstory.sdk.stories.api.models.callbacks.LoadStoriesCallback
            public void storiesLoaded(List<Integer> list) {
                StoriesList.this.setOrRefreshAdapter(list);
                ProfilingManager.getInstance().setReady(e.this.a);
                ListCallback listCallback = StoriesList.this.callback;
                if (listCallback != null) {
                    listCallback.storiesLoaded(list.size(), StringsUtils.getNonNull(StoriesList.this.getFeed()));
                }
            }
        }

        e(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (InAppStoryService.isNotNull()) {
                StoriesList storiesList = StoriesList.this;
                AppearanceManager appearanceManager = storiesList.appearanceManager;
                if (appearanceManager != null && !storiesList.isFavoriteList && appearanceManager.csHasFavorite()) {
                    z = true;
                } else {
                    z = false;
                }
                StoriesList.this.lcallback = new a();
                StoryDownloadManager downloadManager = InAppStoryService.getInstance().getDownloadManager();
                String feed = StoriesList.this.getFeed();
                StoriesList storiesList2 = StoriesList.this;
                downloadManager.loadStories(feed, storiesList2.lcallback, storiesList2.isFavoriteList, z);
            }
        }
    }

    public StoriesList(@NonNull Context context) {
        super(context);
        this.feedLock = new Object();
        this.feed = DEFAULT_FEED;
        this.feedId = null;
        this.isFavoriteList = false;
        this.storyTouchListener = null;
        this.mTouchSlop = 0;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.defaultLayoutManager = linearLayoutManager;
        this.layoutManager = linearLayoutManager;
        this.readerIsOpened = false;
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
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.manager = new StoriesListManager();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.StoriesList);
            this.isFavoriteList = obtainStyledAttributes.getBoolean(R.styleable.StoriesList_cs_listIsFavorite, false);
            synchronized (this.feedLock) {
                try {
                    if (!this.isFavoriteList) {
                        String string = obtainStyledAttributes.getString(R.styleable.StoriesList_cs_feed);
                        this.feed = string;
                        if (string != null) {
                            if (string.isEmpty()) {
                            }
                        }
                        this.feed = DEFAULT_FEED;
                    } else {
                        this.feed = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obtainStyledAttributes.recycle();
        }
        addOnScrollListener(new a());
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(this, getContext());
        this.itemTouchListener = recyclerTouchListener;
        addOnItemTouchListener(recyclerTouchListener);
    }

    private void loadStoriesLocal() {
        String str;
        if (!InAppStoryService.isNull() && (str = this.cacheId) != null && !str.isEmpty()) {
            List<Integer> list = InAppStoryService.getInstance().listStoriesIds.get(this.cacheId);
            if (list == null) {
                loadStoriesInner();
                return;
            }
            checkAppearanceManager();
            setOrRefreshAdapter(list);
            ListCallback listCallback = this.callback;
            if (listCallback != null) {
                listCallback.storiesLoaded(list.size(), StringsUtils.getNonNull(getFeed()));
                return;
            }
            return;
        }
        loadStoriesInner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrRefreshAdapter(List<Integer> list) {
        int i;
        boolean z;
        OnFavoriteItemClick onFavoriteItemClick;
        OnUGCItemClick onUGCItemClick;
        checkAppearanceManager();
        boolean z2 = false;
        if (getAppearanceManager().csListOverscroll()) {
            i = 0;
        } else {
            i = 2;
        }
        setOverScrollMode(i);
        Context context = getContext();
        String str = this.uniqueID;
        AppearanceManager appearanceManager = this.appearanceManager;
        boolean z3 = this.isFavoriteList;
        ListCallback listCallback = this.callback;
        String feed = getFeed();
        String feedId = getFeedId();
        if (this.appearanceManager.csHasFavorite() && !this.isFavoriteList) {
            z = true;
        } else {
            z = false;
        }
        if (!this.isFavoriteList) {
            onFavoriteItemClick = this.favoriteItemClick;
        } else {
            onFavoriteItemClick = null;
        }
        if (hasSessionUGC() && this.appearanceManager.csHasUGC() && !this.isFavoriteList) {
            z2 = true;
        }
        if (!this.isFavoriteList) {
            onUGCItemClick = this.ugcItemClick;
        } else {
            onUGCItemClick = null;
        }
        this.adapter = new StoriesAdapter(context, str, list, appearanceManager, z3, listCallback, feed, feedId, z, onFavoriteItemClick, z2, onUGCItemClick);
        if (this.layoutManager == this.defaultLayoutManager && this.appearanceManager.csColumnCount() != null) {
            setLayoutManager(new GridLayoutManager(getContext(), this.appearanceManager.csColumnCount().intValue()));
            addItemDecoration(new c());
        } else {
            setLayoutManager(this.layoutManager);
        }
        setAdapter(this.adapter);
    }

    public void changeStoryEvent(int i, String str) {
        int indexById;
        String str2;
        StoriesAdapter storiesAdapter = this.adapter;
        if (storiesAdapter != null && storiesAdapter.getStoriesIds() != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.adapter.getStoriesIds().size()) {
                    break;
                } else if (this.adapter.getStoriesIds().get(i2).intValue() == i) {
                    this.adapter.notifyItemChanged(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (this.layoutManager == null || (indexById = this.adapter.getIndexById(i)) == -1) {
                return;
            }
            RecyclerView.p pVar = this.layoutManager;
            if (pVar instanceof LinearLayoutManager) {
                ((LinearLayoutManager) pVar).I2(Math.max(indexById, 0), 0);
            }
            if (indexById >= 0 && str != null && (str2 = this.uniqueID) != null && str2.equals(str)) {
                new Handler().postDelayed(new b(indexById), 950L);
            }
        }
    }

    public void clearAllFavorites() {
        StoriesAdapter storiesAdapter;
        if (InAppStoryService.isNull() || (storiesAdapter = this.adapter) == null) {
            return;
        }
        if (this.isFavoriteList) {
            storiesAdapter.hasFavItem = false;
            storiesAdapter.getStoriesIds().clear();
        } else {
            storiesAdapter.hasFavItem = false;
        }
        this.adapter.notifyDataSetChanged();
        this.adapter.notifyChanges();
    }

    public void closeReader() {
        this.readerIsOpened = false;
        sendIndexes();
    }

    public void favStory(int i, boolean z, List<FavoriteImage> list, boolean z2) {
        if (InAppStoryService.isNull() || this.adapter == null) {
            return;
        }
        checkAppearanceManager();
        boolean z3 = false;
        if (this.isFavoriteList) {
            StoriesAdapter storiesAdapter = this.adapter;
            storiesAdapter.hasFavItem = false;
            if (z) {
                if (!storiesAdapter.getStoriesIds().contains(Integer.valueOf(i))) {
                    this.adapter.getStoriesIds().add(0, Integer.valueOf(i));
                }
            } else if (storiesAdapter.getStoriesIds().contains(Integer.valueOf(i))) {
                this.adapter.getStoriesIds().remove(new Integer(i));
            }
            this.adapter.notifyDataSetChanged();
        } else if (z2 && !list.isEmpty()) {
            StoriesAdapter storiesAdapter2 = this.adapter;
            AppearanceManager appearanceManager = this.appearanceManager;
            if (appearanceManager != null && appearanceManager.csHasFavorite()) {
                z3 = true;
            }
            storiesAdapter2.hasFavItem = z3;
            this.adapter.notifyDataSetChanged();
        } else if ((!z2 && list.isEmpty()) || (this.adapter.hasFavItem && list.isEmpty())) {
            StoriesAdapter storiesAdapter3 = this.adapter;
            storiesAdapter3.hasFavItem = false;
            storiesAdapter3.notifyDataSetChanged();
        } else {
            this.adapter.notifyItemChanged(getAdapter().getItemCount() - 1);
        }
        this.adapter.notifyChanges();
    }

    public AppearanceManager getAppearanceManager() {
        return this.appearanceManager;
    }

    public String getFeed() {
        synchronized (this.feedLock) {
            try {
                if (this.isFavoriteList) {
                    return null;
                }
                return this.feed;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }

    public void loadStories() {
        InAppStoryManager.debugSDKCalls("StoriesList_loadStories", "");
        loadStoriesLocal();
    }

    public void loadStoriesInner() {
        boolean z;
        if (InAppStoryManager.getInstance() == null) {
            InAppStoryManager.showELog(InAppStoryManager.IAS_ERROR_TAG, "'InAppStoryManager' cannot be null");
        } else if (InAppStoryManager.getInstance().getUserId() == null) {
            InAppStoryManager.showELog(InAppStoryManager.IAS_ERROR_TAG, "Parameter 'userId' cannot be null");
        } else {
            checkAppearanceManager();
            InAppStoryManager.debugSDKCalls("StoriesList_loadStoriesInner", "");
            String addTask = ProfilingManager.getInstance().addTask("widget_init");
            AppearanceManager appearanceManager = this.appearanceManager;
            if (appearanceManager != null && !this.isFavoriteList && appearanceManager.csHasFavorite()) {
                z = true;
            } else {
                z = false;
            }
            if (InAppStoryService.isNotNull()) {
                this.lcallback = new d(addTask);
                InAppStoryService.getInstance().getDownloadManager().loadStories(getFeed(), this.lcallback, this.isFavoriteList, z);
                return;
            }
            new Handler().postDelayed(new e(addTask), 1000L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.manager.list = this;
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
        loadStoriesInner();
    }

    void sendIndexes() {
        int i;
        String str;
        checkAppearanceManager();
        if (hasSessionUGC() && !this.isFavoriteList && this.appearanceManager.csHasUGC()) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        RecyclerView.p pVar = this.layoutManager;
        if (pVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
            for (int h2 = linearLayoutManager.h2(); h2 <= linearLayoutManager.k2(); h2++) {
                int i2 = h2 - i;
                StoriesAdapter storiesAdapter = this.adapter;
                if (storiesAdapter != null && storiesAdapter.getStoriesIds().size() > i2 && i2 >= 0) {
                    arrayList.add(this.adapter.getStoriesIds().get(i2));
                }
            }
        }
        ArrayList<Integer> newStatisticPreviews = OldStatisticManager.getInstance().newStatisticPreviews(arrayList);
        try {
            if (StatisticManager.getInstance() != null) {
                StatisticManager statisticManager = StatisticManager.getInstance();
                if (this.isFavoriteList) {
                    str = StatisticManager.FAVORITE;
                } else {
                    str = StatisticManager.LIST;
                }
                statisticManager.sendViewStory(newStatisticPreviews, str, this.feedId);
            }
        } catch (Exception unused) {
        }
        OldStatisticManager.getInstance().previewStatisticEvent(arrayList);
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

    public void setFeed(String str) {
        synchronized (this.feedLock) {
            try {
                if (!this.isFavoriteList && str != null && !str.isEmpty()) {
                    this.feed = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.p pVar) {
        this.layoutManager = pVar;
        super.setLayoutManager(pVar);
    }

    void setListFeedId(String str) {
        this.feedId = str;
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

    public StoriesList(@NonNull Context context, boolean z) {
        super(context);
        this.feedLock = new Object();
        this.feed = DEFAULT_FEED;
        this.feedId = null;
        this.isFavoriteList = false;
        this.storyTouchListener = null;
        this.mTouchSlop = 0;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.defaultLayoutManager = linearLayoutManager;
        this.layoutManager = linearLayoutManager;
        this.readerIsOpened = false;
        init(null);
        this.isFavoriteList = z;
    }

    public StoriesList(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.feedLock = new Object();
        this.feed = DEFAULT_FEED;
        this.feedId = null;
        this.isFavoriteList = false;
        this.storyTouchListener = null;
        this.mTouchSlop = 0;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.defaultLayoutManager = linearLayoutManager;
        this.layoutManager = linearLayoutManager;
        this.readerIsOpened = false;
        init(attributeSet);
    }

    public StoriesList(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.feedLock = new Object();
        this.feed = DEFAULT_FEED;
        this.feedId = null;
        this.isFavoriteList = false;
        this.storyTouchListener = null;
        this.mTouchSlop = 0;
        this.mPrevX = 0.0f;
        this.mPrevY = 0.0f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.defaultLayoutManager = linearLayoutManager;
        this.layoutManager = linearLayoutManager;
        this.readerIsOpened = false;
        init(attributeSet);
    }
}
