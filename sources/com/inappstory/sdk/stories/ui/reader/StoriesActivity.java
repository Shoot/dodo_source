package com.inappstory.sdk.stories.ui.reader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseReader;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.stories.utils.StatusBarController;
import com.inappstory.sdk.utils.StringsUtils;
/* loaded from: classes3.dex */
public class StoriesActivity extends androidx.appcompat.app.c implements BaseReaderScreen {
    View backTintView;
    View blockView;
    private ElasticDragDismissFrameLayout.SystemChromeFader chromeFader;
    ElasticDragDismissFrameLayout draggableFrame;
    StoriesFragment storiesFragment;
    StoriesReaderSettings storiesReaderSettings;
    public boolean pauseDestroyed = false;
    public boolean isFakeActivity = false;
    boolean animateFirst = true;
    boolean isAnimation = false;
    boolean closeOnSwipe = true;
    boolean closeOnOverscroll = true;
    Story.StoryType type = Story.StoryType.COMMON;
    boolean closing = false;
    boolean cleaned = false;

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesActivity.this.finishAfterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createStoriesFragment(Bundle bundle) {
        if (bundle == null) {
            this.storiesFragment = new StoriesFragment();
            if (getIntent().getExtras() != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt(KustoStorage.KustoTable.COLUMN_SOURCE, getIntent().getIntExtra(KustoStorage.KustoTable.COLUMN_SOURCE, 0));
                bundle2.putInt("firstAction", getIntent().getIntExtra("firstAction", 0));
                bundle2.putString("listID", getIntent().getStringExtra("listID"));
                bundle2.putString("feedId", getIntent().getStringExtra("feedId"));
                bundle2.putInt("slideIndex", getIntent().getIntExtra("slideIndex", 0));
                bundle2.putInt("index", getIntent().getIntExtra("index", 0));
                bundle2.putString("storiesType", getIntent().getStringExtra("storiesType"));
                setAppearanceSettings(bundle2);
                bundle2.putIntegerArrayList("stories_ids", getIntent().getIntegerArrayListExtra("stories_ids"));
                this.storiesFragment.setArguments(bundle2);
                return;
            }
            return;
        }
        this.storiesFragment = (StoriesFragment) getSupportFragmentManager().l0("STORIES_FRAGMENT");
    }

    private void setAppearanceSettings(Bundle bundle) {
        this.backTintView.setBackgroundColor(getIntent().getIntExtra(AppearanceManager.CS_READER_BACKGROUND_COLOR, getResources().getColor(R.color.black)));
        this.storiesReaderSettings = new StoriesReaderSettings(getIntent().getExtras());
        try {
            bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, getIntent().getSerializableExtra(AppearanceManager.CS_TIMER_GRADIENT));
            bundle.putInt(AppearanceManager.CS_STORY_READER_ANIMATION, getIntent().getIntExtra(AppearanceManager.CS_STORY_READER_ANIMATION, 2));
            bundle.putString(AppearanceManager.CS_READER_SETTINGS, JsonParser.getJson(this.storiesReaderSettings));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setLoaderFragment() {
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            StoriesLoaderFragment storiesLoaderFragment = new StoriesLoaderFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("storyId", getIntent().getIntegerArrayListExtra("stories_ids").get(getIntent().getIntExtra("index", 0)).intValue());
            bundle.putString("storiesType", getIntent().getStringExtra("storiesType"));
            setAppearanceSettings(bundle);
            storiesLoaderFragment.setArguments(bundle);
            p u = supportFragmentManager.p().z(17432576, 17432577, 17432576, 17432577).u(R.id.fragments_layout, storiesLoaderFragment);
            u.i("TEST");
            u.k();
        } catch (IllegalStateException e) {
            InAppStoryService.createExceptionLog(e);
            finishWithoutAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoriesFragment() {
        if (this.storiesFragment != null) {
            try {
                p u = getSupportFragmentManager().p().z(17432576, 17432577, 17432576, 17432577).u(R.id.fragments_layout, this.storiesFragment);
                u.i("STORIES_FRAGMENT");
                u.k();
                return;
            } catch (IllegalStateException e) {
                InAppStoryService.createExceptionLog(e);
                finishWithoutAnimation();
                return;
            }
        }
        finishWithoutAnimation();
    }

    public void cleanReader() {
        if (InAppStoryService.isNull() || this.cleaned) {
            return;
        }
        InAppStoryService.getInstance().setCurrentIndex(0);
        InAppStoryService.getInstance().setCurrentId(0);
        if (InAppStoryService.getInstance().getDownloadManager() != null) {
            InAppStoryService.getInstance().getDownloadManager().cleanStoriesIndex(this.type);
        }
        this.cleaned = true;
    }

    public void closeAnim() {
        try {
            this.isAnimation = true;
            Point screenSize = Sizes.getScreenSize(this);
            float x = (screenSize.x - this.draggableFrame.getX()) / 2.0f;
            float y = (screenSize.y - this.draggableFrame.getY()) / 2.0f;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(200L);
            animationSet.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            Point point = ScreensManager.getInstance().coordinates;
            ScreensManager.getInstance().coordinates = null;
            if (point != null) {
                x = point.x - this.draggableFrame.getX();
                y = point.y - this.draggableFrame.getY();
            }
            animationSet.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, x, y));
            animationSet.setAnimationListener(new b());
            this.backTintView.setVisibility(8);
            this.draggableFrame.startAnimation(animationSet);
        } catch (Exception unused) {
            finishWithoutAnimation();
        }
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void closeStoryReader(int i) {
        Story storyById;
        String str;
        if (this.closing) {
            return;
        }
        this.backTintView.setVisibility(8);
        this.closing = true;
        InAppStoryService.getInstance().getListReaderConnector().closeReader();
        getWindow().setFlags(16, 16);
        this.blockView.setVisibility(0);
        if (InAppStoryService.isNotNull() && (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type)) != null) {
            if (CallbackManager.getInstance().getCloseStoryCallback() != null) {
                CallbackManager.getInstance().getCloseStoryCallback().closeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, CallbackManager.getInstance().getCloseTypeFromInt(i), CallbackManager.getInstance().getSourceFromInt(getIntent().getIntExtra(KustoStorage.KustoTable.COLUMN_SOURCE, 0)));
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = StatisticManager.AUTO;
                    } else {
                        str = StatisticManager.CUSTOM;
                    }
                } else {
                    str = StatisticManager.SWIPE;
                }
            } else {
                str = StatisticManager.CLICK;
            }
            StatisticManager.getInstance().sendCloseStory(storyById.id, str, Integer.valueOf(storyById.lastIndex), Integer.valueOf(storyById.getSlidesCount()), getIntent().getStringExtra("feedId"));
        }
        cleanReader();
        this.animateFirst = true;
        new Handler(Looper.getMainLooper()).post(new d());
    }

    @Override // android.app.Activity
    public void finish() {
        ScreensManager.getInstance().hideGoods();
        ScreensManager.getInstance().closeGameReader();
        if (this.animateFirst && Build.VERSION.SDK_INT != 26) {
            this.animateFirst = false;
            closeAnim();
            return;
        }
        super.finish();
    }

    public void finishWithCustomAnimation(int i, int i2) {
        super.finish();
        getWindow().clearFlags(16);
        overridePendingTransition(i, i2);
    }

    public void finishWithoutAnimation() {
        super.finish();
        getWindow().clearFlags(16);
        overridePendingTransition(0, 0);
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void forceFinish() {
        finishWithoutAnimation();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        StoriesFragment storiesFragment;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 878 && i2 == -1 && (storiesFragment = this.storiesFragment) != null && storiesFragment.readerManager != null && intent != null) {
            String stringExtra = intent.getStringExtra("storyId");
            ReaderManager readerManager = this.storiesFragment.readerManager;
            String stringExtra2 = intent.getStringExtra("gameState");
            if (stringExtra != null) {
                i3 = Integer.parseInt(stringExtra);
            } else {
                i3 = 0;
            }
            readerManager.gameComplete(stringExtra2, i3, intent.getIntExtra("slideIndex", 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isAnimation) {
            return;
        }
        this.blockView.setVisibility(0);
        this.animateFirst = true;
        if (InAppStoryService.isNotNull()) {
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
            if (storyById != null && CallbackManager.getInstance().getCloseStoryCallback() != null) {
                CallbackManager.getInstance().getCloseStoryCallback().closeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, CloseReader.CUSTOM, CallbackManager.getInstance().getSourceFromInt(getIntent().getIntExtra(KustoStorage.KustoTable.COLUMN_SOURCE, 0)));
            }
            if (storyById != null) {
                StatisticManager.getInstance().sendCloseStory(storyById.id, StatisticManager.BACK, Integer.valueOf(storyById.lastIndex), Integer.valueOf(storyById.getSlidesCount()), getIntent().getStringExtra("feedId"));
            }
        }
        finishAfterTransition();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.cleaned = false;
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_activity_stories_draggable);
        if (!InAppStoryManager.isNull() && !InAppStoryService.isNull()) {
            int intExtra = getIntent().getIntExtra(AppearanceManager.CS_NAVBAR_COLOR, 0);
            if (intExtra != 0) {
                getWindow().setNavigationBarColor(intExtra);
            }
            ScreensManager.getInstance().currentScreen = this;
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            this.closeOnSwipe = getIntent().getBooleanExtra(AppearanceManager.CS_CLOSE_ON_SWIPE, true);
            this.closeOnOverscroll = getIntent().getBooleanExtra(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, true);
            this.draggableFrame = (ElasticDragDismissFrameLayout) findViewById(R.id.draggable_frame);
            this.blockView = findViewById(R.id.blockView);
            this.backTintView = findViewById(R.id.background);
            this.chromeFader = new c(this);
            try {
                if (!getIntent().getBooleanExtra("statusBarVisibility", false)) {
                    StatusBarController.hideStatusBar(this, true);
                }
                InAppStoryService.getInstance().getListReaderConnector().openReader();
                String stringExtra = getIntent().getStringExtra("storiesType");
                if (stringExtra != null) {
                    Story.StoryType storyType = Story.StoryType.UGC;
                    if (stringExtra.equals(storyType.name())) {
                        this.type = storyType;
                    }
                    this.draggableFrame.type = this.type;
                }
                if (i != 26) {
                    if (this.storiesFragment == null) {
                        setLoaderFragment();
                        startAnim(bundle);
                        return;
                    }
                    setStoriesFragment();
                    return;
                }
                createStoriesFragment(bundle);
                setStoriesFragment();
                return;
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
                finish();
                return;
            }
        }
        finish();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        if (ScreensManager.getInstance().currentScreen == this) {
            ScreensManager.getInstance().currentScreen = null;
        }
        if (!this.pauseDestroyed) {
            StatusBarController.showStatusBar(this);
            OldStatisticManager.getInstance().sendStatistic();
            ScreensManager.created = 0L;
            cleanReader();
            System.gc();
            this.pauseDestroyed = true;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        unsubscribeClicks();
        if (isFinishing()) {
            ScreensManager.getInstance().hideGoods();
            ScreensManager.getInstance().closeGameReader();
            StatusBarController.showStatusBar(this);
            OldStatisticManager.getInstance().sendStatistic();
            ScreensManager.created = 0L;
            cleanReader();
            System.gc();
            this.pauseDestroyed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        subscribeClicks();
        StatusBarController.hideStatusBar(this, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void removeAllStoriesFromFavorite() {
        StoriesFragment storiesFragment = this.storiesFragment;
        if (storiesFragment != null) {
            storiesFragment.removeAllStoriesFromFavorite();
        }
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void removeStoryFromFavorite(int i) {
        StoriesFragment storiesFragment = this.storiesFragment;
        if (storiesFragment != null) {
            storiesFragment.removeStoryFromFavorite(i);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void shareComplete(boolean z) {
        this.storiesFragment.readerManager.shareComplete(z);
    }

    public void startAnim(Bundle bundle) {
        getWindow().setFlags(16, 16);
        this.backTintView.setVisibility(8);
        try {
            this.isAnimation = true;
            this.draggableFrame.setVisibility(4);
            AnimationSet animationSet = new AnimationSet(true);
            Point point = ScreensManager.getInstance().coordinates;
            Point screenSize = Sizes.getScreenSize(this);
            float f = screenSize.x / 2.0f;
            float f2 = screenSize.y / 2.0f;
            animationSet.setStartOffset(100L);
            animationSet.setDuration(200L);
            animationSet.setInterpolator(new LinearInterpolator());
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            if (point != null) {
                f2 = this.draggableFrame.getY();
                animationSet.addAnimation(new TranslateAnimation(point.x - f, 0.0f, point.y - f2, 0.0f));
            }
            animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, f, f2));
            animationSet.setAnimationListener(new a(bundle));
            this.draggableFrame.startAnimation(animationSet);
        } catch (Exception unused) {
            finishWithoutAnimation();
        }
    }

    public void subscribeClicks() {
        this.draggableFrame.addListener(this.chromeFader);
    }

    public void unsubscribeClicks() {
        this.draggableFrame.removeListener(this.chromeFader);
    }

    /* loaded from: classes3.dex */
    class c extends ElasticDragDismissFrameLayout.SystemChromeFader {
        c(Activity activity) {
            super(activity);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void onDrag(float f, float f2, float f3, float f4) {
            super.onDrag(f, f2, f3, f4);
            StoriesActivity.this.backTintView.setAlpha(Math.min(1.0f, Math.max(0.0f, 1.0f - f3)));
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void onDragDismissed() {
            StoriesActivity.this.animateFirst = true;
            InAppStoryManager.closeStoryReader(2);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void swipeDown() {
            StoriesFragment storiesFragment = StoriesActivity.this.storiesFragment;
            if (storiesFragment != null) {
                storiesFragment.swipeDownEvent();
            }
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void swipeUp() {
            StoriesFragment storiesFragment = StoriesActivity.this.storiesFragment;
            if (storiesFragment != null) {
                storiesFragment.swipeUpEvent();
            }
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void touchPause() {
            ReaderManager readerManager;
            StoriesFragment storiesFragment = StoriesActivity.this.storiesFragment;
            if (storiesFragment != null && (readerManager = storiesFragment.readerManager) != null) {
                readerManager.pauseCurrent(false);
            }
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void touchResume() {
            ReaderManager readerManager;
            StoriesFragment storiesFragment = StoriesActivity.this.storiesFragment;
            if (storiesFragment != null && (readerManager = storiesFragment.readerManager) != null) {
                readerManager.resumeCurrent(false);
            }
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.elasticview.ElasticDragDismissFrameLayout.SystemChromeFader
        public void onDragDropped() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Animation.AnimationListener {
        final /* synthetic */ Bundle a;

        a(Bundle bundle) {
            this.a = bundle;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StoriesActivity.this.getWindow().clearFlags(16);
            StoriesActivity.this.draggableFrame.setVisibility(0);
            StoriesActivity.this.backTintView.setVisibility(0);
            StoriesActivity storiesActivity = StoriesActivity.this;
            storiesActivity.isAnimation = false;
            storiesActivity.createStoriesFragment(this.a);
            StoriesActivity.this.setStoriesFragment();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            StoriesActivity.this.draggableFrame.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StoriesActivity.this.draggableFrame.setVisibility(8);
            StoriesActivity.super.finish();
            StoriesActivity.this.getWindow().clearFlags(16);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void observeGameReader(String str) {
    }
}
