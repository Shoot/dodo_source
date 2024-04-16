package com.inappstory.sdk.stories.ui.reader;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.inner.share.InnerShareFilesPrepare;
import com.inappstory.sdk.inner.share.ShareFilesPrepareCallback;
import com.inappstory.sdk.share.IASShareData;
import com.inappstory.sdk.share.IASShareManager;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.callbacks.ShareCallback;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.ui.OverlapFragmentObserver;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPagerAdapter;
import com.inappstory.sdk.stories.utils.BackPressHandler;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.stories.utils.StoryShareBroadcastReceiver;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesFragment extends Fragment implements BackPressHandler, ViewPager.j, OverlapFragmentObserver {
    List<Integer> currentIds;
    int ind;
    View invMask;
    ReaderPagerAdapter outerViewPagerAdapter;
    int readerAnimation;
    public ReaderManager readerManager;
    String readerSettings;
    ReaderPager storiesViewPager;
    Serializable timerGradient;
    boolean isDestroyed = false;
    boolean created = false;
    boolean closeOnSwipe = true;
    boolean closeOnOverscroll = true;
    int source = 0;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesFragment.this.invMask.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ShareFilesPrepareCallback {
        final /* synthetic */ InnerShareData a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        b(InnerShareData innerShareData, int i, int i2) {
            this.a = innerShareData;
            this.b = i;
            this.c = i2;
        }

        @Override // com.inappstory.sdk.inner.share.ShareFilesPrepareCallback
        public void onPrepared(List<String> list) {
            StoriesFragment.this.shareCustomOrDefault(this.a.getPayload(), new IASShareData(this.a.getText(), list, this.a.getPayload()), this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesFragment.this.invMask.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesFragment.this.invMask.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StoriesFragment.this.storiesViewPager.getAdapter() != null && StoriesFragment.this.storiesViewPager.getCurrentItem() < StoriesFragment.this.storiesViewPager.getAdapter().getCount() - 1) {
                ReaderPager readerPager = StoriesFragment.this.storiesViewPager;
                readerPager.cubeAnimation = true;
                readerPager.setCurrentItem(readerPager.getCurrentItem() + 1, true);
                return;
            }
            InAppStoryManager.closeStoryReader(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StoriesFragment.this.storiesViewPager.getCurrentItem() > 0) {
                ReaderPager readerPager = StoriesFragment.this.storiesViewPager;
                readerPager.setCurrentItem(readerPager.getCurrentItem() - 1, true);
                StoriesFragment.this.storiesViewPager.cubeAnimation = true;
                return;
            }
            StoriesFragment.this.readerManager.restartCurrentStory();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        final /* synthetic */ HashMap a;

        g(HashMap hashMap) {
            this.a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderManager readerManager = StoriesFragment.this.readerManager;
            if (readerManager != null) {
                readerManager.resumeWithShareId();
            }
            if (!this.a.containsKey("shared") || !((Boolean) this.a.get("shared")).booleanValue()) {
                StoriesFragment.this.resume();
            }
        }
    }

    private void closeFragment() {
        if (ScreensManager.getInstance() != null && ScreensManager.getInstance().currentScreen != null) {
            ScreensManager.getInstance().currentScreen.forceFinish();
        } else if (!Sizes.isTablet()) {
            androidx.fragment.app.d activity = getActivity();
            if (activity instanceof BaseReaderScreen) {
                ((BaseReaderScreen) activity).forceFinish();
            }
        }
    }

    private int getCurIndexById(int i) {
        Story storyById;
        if (InAppStoryService.getInstance().getDownloadManager() == null || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(i, this.readerManager.storyType)) == null) {
            return 0;
        }
        return storyById.lastIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareCustomOrDefault(String str, IASShareData iASShareData, int i, int i2) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.isShareProcess(false);
        }
        Context context = getContext();
        ShareCallback shareCallback = CallbackManager.getInstance().getShareCallback();
        if (context == null) {
            return;
        }
        if (shareCallback != null) {
            ScreensManager.getInstance().openOverlapContainerForShare(context, this, str, i, i2, iASShareData);
        } else {
            new IASShareManager().shareDefault(StoryShareBroadcastReceiver.class, context, iASShareData);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.OverlapFragmentObserver
    public void closeView(HashMap<String, Object> hashMap) {
        new Handler(Looper.getMainLooper()).post(new g(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defaultUrlClick(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        try {
            getActivity().startActivity(intent);
            getActivity().overridePendingTransition(R.anim.popup_show, R.anim.empty_animation);
        } catch (Exception unused) {
        }
    }

    public void nextStory(int i) {
        this.readerManager.latestShowStoryAction = i;
        new Handler(Looper.getMainLooper()).post(new e());
    }

    @Override // com.inappstory.sdk.stories.utils.BackPressHandler
    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        try {
            requireArguments();
            Bundle arguments = getArguments();
            this.currentIds = arguments.getIntegerArrayList("stories_ids");
            this.readerSettings = arguments.getString(AppearanceManager.CS_READER_SETTINGS);
            this.timerGradient = arguments.getSerializable(AppearanceManager.CS_TIMER_GRADIENT);
            this.ind = arguments.getInt("index", 0);
            this.readerAnimation = arguments.getInt(AppearanceManager.CS_STORY_READER_ANIMATION, 2);
            this.readerManager = new ReaderManager(arguments.getString("listID", null), arguments.getString("feedId", null), arguments.getString("feedSlug", null), Story.StoryType.valueOf(getArguments().getString("storiesType", Story.StoryType.COMMON.name())), arguments.getInt(KustoStorage.KustoTable.COLUMN_SOURCE, 0), arguments.getInt("firstAction", 0));
            List<Integer> list = this.currentIds;
            if (list != null && !list.isEmpty()) {
                this.readerManager.setStoriesIds(this.currentIds);
                this.readerManager.firstStoryId = this.currentIds.get(this.ind).intValue();
                this.readerManager.startedSlideInd = arguments.getInt("slideIndex", 0);
            }
            this.closeOnSwipe = arguments.getBoolean(AppearanceManager.CS_CLOSE_ON_SWIPE, true);
            this.closeOnOverscroll = arguments.getBoolean(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, true);
            this.created = true;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ReaderPager readerPager = new ReaderPager(context);
            this.storiesViewPager = readerPager;
            readerPager.setHost(this);
            this.storiesViewPager.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            View view = new View(context);
            this.invMask = view;
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.invMask.setVisibility(8);
            this.storiesViewPager.setId(R.id.ias_stories_pager);
            this.invMask.setId(R.id.ias_inv_mask);
            this.invMask.setClickable(true);
            this.storiesViewPager.setElevation(4.0f);
            this.invMask.setElevation(10.0f);
            relativeLayout.addView(this.storiesViewPager);
            relativeLayout.addView(this.invMask);
            return relativeLayout;
        } catch (IllegalStateException unused) {
            closeFragment();
            return new View(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        OldStatisticManager.getInstance().currentEvent = null;
        super.onDestroyView();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
        if (InAppStoryService.isNull()) {
            return;
        }
        if (i == 1) {
            this.readerManager.latestShowStoryAction = 2;
        }
        if (i == 0 && getCurIndexById(this.readerManager.getCurrentStoryId()) == this.readerManager.getCurrentSlideIndex()) {
            this.readerManager.resumeCurrent(false);
        }
        ReaderManager readerManager = this.readerManager;
        readerManager.setCurrentSlideIndex(getCurIndexById(readerManager.getCurrentStoryId()));
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f2, int i2) {
        if (this.isDestroyed) {
            return;
        }
        if (f2 == 0.0f) {
            new Handler().postDelayed(new a(), 400L);
        } else if (this.invMask.getVisibility() != 0) {
            this.invMask.setVisibility(0);
        }
        this.storiesViewPager.pageScrolled(f2);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        if (this.isDestroyed) {
            return;
        }
        this.readerManager.onPageSelected(this.source, i);
        if (getArguments() != null) {
            getArguments().putInt("index", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        pause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        resume();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List<Integer> list;
        int i;
        super.onViewCreated(view, bundle);
        if (!InAppStoryService.isNull() && (list = this.currentIds) != null && !list.isEmpty()) {
            this.readerManager.setParentFragment(this);
            getActivity().getWindow().addFlags(128);
            this.storiesViewPager.setParameters(this.readerAnimation);
            if (getArguments() != null) {
                i = getArguments().getInt(KustoStorage.KustoTable.COLUMN_SOURCE, 0);
            } else {
                i = 0;
            }
            this.source = i;
            ReaderPagerAdapter readerPagerAdapter = new ReaderPagerAdapter(getChildFragmentManager(), this.source, this.readerSettings, this.timerGradient, this.currentIds, this.readerManager);
            this.outerViewPagerAdapter = readerPagerAdapter;
            this.storiesViewPager.setAdapter(readerPagerAdapter);
            this.storiesViewPager.addOnPageChangeListener(this);
            int i2 = this.ind;
            if (i2 > 0) {
                this.storiesViewPager.setCurrentItem(i2);
                return;
            }
            try {
                onPageSelected(0);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        closeFragment();
    }

    public void pause() {
        this.readerManager.pauseCurrent(true);
    }

    public void prevStory(int i) {
        this.readerManager.latestShowStoryAction = i;
        new Handler(Looper.getMainLooper()).post(new f());
    }

    public void removeAllStoriesFromFavorite() {
        ReaderManager readerManager = this.readerManager;
        if (readerManager != null) {
            readerManager.removeAllStoriesFromFavorite();
        }
    }

    public void removeStoryFromFavorite(int i) {
        ReaderManager readerManager = this.readerManager;
        if (readerManager != null) {
            readerManager.removeStoryFromFavorite(i);
        }
    }

    public void resume() {
        if (!this.created) {
            this.readerManager.resumeCurrent(true);
            this.readerManager.resumeWithShareId();
        }
        this.created = false;
    }

    public void setCurrentItem(int i) {
        if (this.storiesViewPager.getAdapter() != null && this.storiesViewPager.getAdapter().getCount() > i) {
            this.storiesViewPager.setCurrentItem(i);
        }
    }

    public void showGuardMask(int i) {
        new Handler(Looper.getMainLooper()).post(new c());
        new Handler(Looper.getMainLooper()).postDelayed(new d(), i);
    }

    public void showShareView(InnerShareData innerShareData, int i, int i2) {
        Context context = getContext();
        if (innerShareData.getFiles().isEmpty()) {
            shareCustomOrDefault(innerShareData.getPayload(), new IASShareData(innerShareData.getText(), innerShareData.getPayload()), i, i2);
        } else {
            new InnerShareFilesPrepare().prepareFiles(context, new b(innerShareData, i, i2), innerShareData.getFiles());
        }
    }

    public void swipeCloseEvent(int i, boolean z) {
        Story storyById;
        if (z && (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.currentIds.get(i).intValue(), this.readerManager.storyType)) != null && !storyById.disableClose) {
            InAppStoryManager.closeStoryReader(2);
        }
    }

    public void swipeDownEvent() {
        swipeDownEvent(this.storiesViewPager.getCurrentItem());
    }

    public void swipeLeftEvent(int i) {
        swipeCloseEvent(i, this.closeOnOverscroll);
    }

    public void swipeRightEvent(int i) {
        swipeCloseEvent(i, this.closeOnOverscroll);
    }

    public void swipeUpEvent() {
        swipeUpEvent(this.storiesViewPager.getCurrentItem());
    }

    public void swipeDownEvent(int i) {
        swipeCloseEvent(i, this.closeOnSwipe);
    }

    public void swipeUpEvent(int i) {
        this.readerManager.swipeUp(i);
    }

    @Override // com.inappstory.sdk.stories.ui.OverlapFragmentObserver
    public void viewIsOpened() {
    }
}
