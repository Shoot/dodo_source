package com.inappstory.sdk.stories.ui.reader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
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
public class StoriesFixedActivity extends androidx.appcompat.app.c implements BaseReaderScreen {
    ElasticDragDismissFrameLayout draggableFrame;
    StoriesFragment storiesFragment;
    public boolean pauseDestroyed = false;
    boolean isAnimation = false;
    boolean animateFirst = true;
    Story.StoryType type = Story.StoryType.COMMON;
    boolean cleaned = false;
    boolean closeOnSwipe = true;
    boolean closeOnOverscroll = true;

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesFixedActivity storiesFixedActivity = StoriesFixedActivity.this;
            if (storiesFixedActivity.storiesFragment != null) {
                try {
                    p u = storiesFixedActivity.getSupportFragmentManager().p().u(R.id.fragments_layout, StoriesFixedActivity.this.storiesFragment);
                    u.i("STORIES_FRAGMENT");
                    u.k();
                    return;
                } catch (IllegalStateException e) {
                    InAppStoryService.createExceptionLog(e);
                    StoriesFixedActivity.this.finishWithoutAnimation();
                    return;
                }
            }
            storiesFixedActivity.finishWithoutAnimation();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StoriesFixedActivity.this.finishAfterTransition();
        }
    }

    private void setAppearanceSettings(Bundle bundle) {
        try {
            this.draggableFrame.setBackgroundColor(getIntent().getIntExtra(AppearanceManager.CS_READER_BACKGROUND_COLOR, getResources().getColor(R.color.black)));
            bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, getIntent().getSerializableExtra(AppearanceManager.CS_TIMER_GRADIENT));
            bundle.putInt(AppearanceManager.CS_STORY_READER_ANIMATION, getIntent().getIntExtra(AppearanceManager.CS_STORY_READER_ANIMATION, 2));
            bundle.putString(AppearanceManager.CS_READER_SETTINGS, JsonParser.getJson(new StoriesReaderSettings(getIntent().getExtras())));
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            e.printStackTrace();
        }
    }

    public static void setWindowFlag(Activity activity, int i, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags = i | attributes.flags;
        } else {
            attributes.flags = (~i) & attributes.flags;
        }
        window.setAttributes(attributes);
    }

    public void cleanReader() {
        if (InAppStoryService.isNull() || this.cleaned) {
            return;
        }
        OldStatisticManager.getInstance().closeStatisticEvent();
        InAppStoryService.getInstance().setCurrentIndex(0);
        InAppStoryService.getInstance().setCurrentId(0);
        if (InAppStoryService.getInstance().getDownloadManager() != null) {
            InAppStoryService.getInstance().getDownloadManager().cleanStoriesIndex(this.type);
        }
        this.cleaned = true;
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void closeStoryReader(int i) {
        String str;
        if (InAppStoryService.isNotNull()) {
            InAppStoryService.getInstance().getListReaderConnector().closeReader();
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
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
        if (ScreensManager.getInstance().coordinates != null) {
            this.animateFirst = true;
        } else {
            this.animateFirst = false;
        }
        new Handler(Looper.getMainLooper()).post(new c());
    }

    @Override // android.app.Activity
    public void finish() {
        ScreensManager.getInstance().hideGoods();
        ScreensManager.getInstance().closeGameReader();
        if (this.animateFirst && Build.VERSION.SDK_INT != 26) {
            this.animateFirst = false;
            loadAnim();
            return;
        }
        int intExtra = getIntent().getIntExtra(AppearanceManager.CS_READER_PRESENTATION_STYLE, 1);
        if (intExtra != 0) {
            if (intExtra != 2) {
                super.finish();
                return;
            } else {
                finishWithCustomAnimation(R.anim.empty_animation, R.anim.popup_hide);
                return;
            }
        }
        finishWithCustomAnimation(R.anim.empty_animation, R.anim.alpha_fade_out);
    }

    public void finishWithCustomAnimation(int i, int i2) {
        super.finish();
        overridePendingTransition(i, i2);
    }

    public void finishWithoutAnimation() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void forceFinish() {
        finishWithoutAnimation();
    }

    public void loadAnim() {
        try {
            this.isAnimation = true;
            float x = this.draggableFrame.getX() + (this.draggableFrame.getRight() / 2);
            float y = this.draggableFrame.getY();
            AnimationSet animationSet = new AnimationSet(true);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, x, y);
            scaleAnimation.setDuration(200L);
            animationSet.addAnimation(scaleAnimation);
            Point point = ScreensManager.getInstance().coordinates;
            if (point != null) {
                TranslateAnimation translateAnimation = new TranslateAnimation(this.draggableFrame.getX(), point.x - (Sizes.getScreenSize(this).x / 2), 0.0f, point.y - this.draggableFrame.getY());
                translateAnimation.setDuration(200L);
                animationSet.addAnimation(translateAnimation);
            }
            animationSet.setAnimationListener(new a());
            this.draggableFrame.startAnimation(animationSet);
        } catch (Exception unused) {
            finishWithoutAnimation();
        }
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
        Story storyById;
        if (this.isAnimation) {
            return;
        }
        if (ScreensManager.getInstance().coordinates != null) {
            this.animateFirst = true;
        } else {
            this.animateFirst = false;
        }
        if (InAppStoryService.isNotNull() && (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type)) != null) {
            if (CallbackManager.getInstance().getCloseStoryCallback() != null) {
                CallbackManager.getInstance().getCloseStoryCallback().closeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, CloseReader.CUSTOM, CallbackManager.getInstance().getSourceFromInt(getIntent().getIntExtra(KustoStorage.KustoTable.COLUMN_SOURCE, 0)));
            }
            StatisticManager.getInstance().sendCloseStory(storyById.id, StatisticManager.BACK, Integer.valueOf(storyById.lastIndex), Integer.valueOf(storyById.getSlidesCount()), getIntent().getStringExtra("feedId"));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.cleaned = false;
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_activity_stories);
        if (!InAppStoryManager.isNull() && !InAppStoryService.isNull()) {
            int intExtra = getIntent().getIntExtra(AppearanceManager.CS_NAVBAR_COLOR, 0);
            if (intExtra != 0) {
                getWindow().setNavigationBarColor(intExtra);
            }
            ScreensManager.getInstance().currentScreen = this;
            getWindow().getDecorView().setSystemUiVisibility(1280);
            int intExtra2 = getIntent().getIntExtra(AppearanceManager.CS_NAVBAR_COLOR, 0);
            setWindowFlag(this, 67108864, false);
            getWindow().setStatusBarColor(0);
            if (intExtra2 != 0) {
                getWindow().setNavigationBarColor(intExtra2);
            }
            this.closeOnSwipe = getIntent().getBooleanExtra(AppearanceManager.CS_CLOSE_ON_SWIPE, true);
            this.closeOnOverscroll = getIntent().getBooleanExtra(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, true);
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            this.draggableFrame = (ElasticDragDismissFrameLayout) findViewById(R.id.draggable_frame);
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
                if (bundle == null) {
                    this.storiesFragment = new StoriesFragment();
                    if (getIntent().getExtras() != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("listID", getIntent().getStringExtra("listID"));
                        bundle2.putString("feedId", getIntent().getStringExtra("feedId"));
                        bundle2.putString("storiesType", getIntent().getStringExtra("storiesType"));
                        bundle2.putInt(KustoStorage.KustoTable.COLUMN_SOURCE, getIntent().getIntExtra(KustoStorage.KustoTable.COLUMN_SOURCE, 0));
                        bundle2.putInt("firstAction", getIntent().getIntExtra("firstAction", 0));
                        bundle2.putInt("index", getIntent().getIntExtra("index", 0));
                        bundle2.putInt("slideIndex", getIntent().getIntExtra("slideIndex", 0));
                        setAppearanceSettings(bundle2);
                        bundle2.putIntegerArrayList("stories_ids", getIntent().getIntegerArrayListExtra("stories_ids"));
                        this.storiesFragment.setArguments(bundle2);
                    }
                } else {
                    this.storiesFragment = (StoriesFragment) getSupportFragmentManager().l0("STORIES_FRAGMENT");
                }
                new Handler().postDelayed(new b(), 300L);
                return;
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
                finish();
                return;
            }
        }
        finishWithoutAnimation();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StoriesFixedActivity.this.draggableFrame.setVisibility(8);
            StoriesFixedActivity.super.finish();
            StoriesFixedActivity.this.getWindow().clearFlags(16);
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
