package com.inappstory.sdk.stories.ui.reader;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.p;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.events.GameCompleteEvent;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseReader;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.utils.BackPressHandler;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class StoriesDialogFragment extends c implements BackPressHandler, BaseReaderScreen {
    StoriesFragment storiesFragment;
    boolean cleaned = false;
    i67<GameCompleteEvent> gameCompleteObserver = new a();
    HashSet<String> observerIDs = new HashSet<>();
    Story.StoryType type = Story.StoryType.COMMON;

    /* loaded from: classes3.dex */
    class a implements i67<GameCompleteEvent> {
        a() {
        }

        @Override // defpackage.i67
        /* renamed from: b */
        public void a(GameCompleteEvent gameCompleteEvent) {
            StoriesDialogFragment.this.storiesFragment.readerManager.gameComplete(gameCompleteEvent.getGameState(), gameCompleteEvent.getStoryId(), gameCompleteEvent.getSlideIndex());
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            qq6<GameCompleteEvent> gameObserver = ScreensManager.getInstance().getGameObserver(this.a);
            if (gameObserver == null) {
                return;
            }
            gameObserver.h(StoriesDialogFragment.this.getViewLifecycleOwner(), StoriesDialogFragment.this.gameCompleteObserver);
            StoriesDialogFragment.this.observerIDs.add(this.a);
        }
    }

    private void removeGameObservables() {
        Iterator<String> it = this.observerIDs.iterator();
        while (it.hasNext()) {
            qq6<GameCompleteEvent> gameObserver = ScreensManager.getInstance().getGameObserver(it.next());
            if (gameObserver != null) {
                gameObserver.m(this.gameCompleteObserver);
            }
        }
    }

    private void setAppearanceSettings(Bundle bundle) {
        try {
            Bundle requireArguments = requireArguments();
            StoriesReaderSettings storiesReaderSettings = new StoriesReaderSettings(requireArguments);
            bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, requireArguments.getSerializable(AppearanceManager.CS_TIMER_GRADIENT));
            bundle.putInt(AppearanceManager.CS_STORY_READER_ANIMATION, requireArguments.getInt(AppearanceManager.CS_STORY_READER_ANIMATION, 2));
            bundle.putString(AppearanceManager.CS_READER_SETTINGS, JsonParser.getJson(storiesReaderSettings));
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            e.printStackTrace();
        }
    }

    public void changeStory(int i) {
        getArguments().putInt("index", i);
    }

    public void cleanReader() {
        if (InAppStoryService.isNull() || this.cleaned) {
            return;
        }
        OldStatisticManager.getInstance().closeStatisticEvent();
        InAppStoryService.getInstance().setCurrentIndex(0);
        InAppStoryService.getInstance().setCurrentId(0);
        for (Story story : InAppStoryService.getInstance().getDownloadManager().getStories(this.type)) {
            story.lastIndex = 0;
        }
        this.cleaned = true;
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void closeStoryReader(int i) {
        InAppStoryService.getInstance().getListReaderConnector().closeReader();
        dismissAllowingStateLoss();
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void forceFinish() {
        dismissAllowingStateLoss();
    }

    @Override // com.inappstory.sdk.stories.ui.reader.BaseReaderScreen
    public void observeGameReader(String str) {
        new Handler(Looper.getMainLooper()).post(new b(str));
    }

    @Override // com.inappstory.sdk.stories.utils.BackPressHandler
    public boolean onBackPressed() {
        Fragment k0 = getChildFragmentManager().k0(R.id.dialog_fragment);
        if (k0 != null && (k0 instanceof BackPressHandler) && ((BackPressHandler) k0).onBackPressed()) {
            return true;
        }
        dismissAllowingStateLoss();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.cs_stories_dialog_fragment, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        OldStatisticManager.getInstance().sendStatistic();
        ScreensManager.created = System.currentTimeMillis();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ScreensManager.getInstance().hideGoods();
        ScreensManager.getInstance().closeGameReader();
        if (InAppStoryService.isNotNull()) {
            OldStatisticManager.getInstance().sendStatistic();
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(InAppStoryService.getInstance().getCurrentId(), this.type);
            if (storyById != null) {
                if (CallbackManager.getInstance().getCloseStoryCallback() != null) {
                    CallbackManager.getInstance().getCloseStoryCallback().closeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, CloseReader.CLICK, CallbackManager.getInstance().getSourceFromInt(getArguments().getInt(KustoStorage.KustoTable.COLUMN_SOURCE, 0)));
                }
                StatisticManager.getInstance().sendCloseStory(storyById.id, StatisticManager.CLICK, Integer.valueOf(storyById.lastIndex), Integer.valueOf(storyById.getSlidesCount()), getArguments().getString("feedId"));
            }
        }
        cleanReader();
        removeGameObservables();
        super.onDismiss(dialogInterface);
        if (ScreensManager.getInstance().currentScreen == this) {
            ScreensManager.getInstance().currentScreen = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Fragment k0 = getChildFragmentManager().k0(R.id.dialog_fragment);
        if (k0 != null && k0.onOptionsItemSelected(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        dismissAllowingStateLoss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        r2 = ((android.app.Activity) getContext()).getWindow().getDecorView().getRootWindowInsets();
     */
    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            r5 = this;
            super.onStart()
            android.app.Dialog r0 = r5.getDialog()
            if (r0 != 0) goto La
            return
        La:
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.inappstory.sdk.R.dimen.cs_tablet_height
            int r0 = r0.getDimensionPixelSize(r1)
            android.graphics.Point r1 = com.inappstory.sdk.stories.utils.Sizes.getScreenSize()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L48
            android.content.Context r2 = r5.getContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L48
            android.content.Context r2 = r5.getContext()
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            android.view.WindowInsets r2 = defpackage.mc4.a(r2)
            if (r2 == 0) goto L48
            int r3 = r1.y
            int r4 = r2.getSystemWindowInsetTop()
            int r2 = r2.getSystemWindowInsetBottom()
            int r4 = r4 + r2
            int r3 = r3 - r4
            r1.y = r3
        L48:
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            float r1 = (float) r0
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            android.app.Dialog r2 = r5.getDialog()
            android.view.Window r2 = r2.getWindow()
            r2.setLayout(r1, r0)
            android.app.Dialog r0 = r5.getDialog()
            android.view.Window r0 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.stories.ui.reader.StoriesDialogFragment.onStart():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cleaned = false;
        view.setBackgroundColor(getArguments().getInt(AppearanceManager.CS_READER_BACKGROUND_COLOR, -16777216));
        String string = getArguments().getString("storiesType", Story.StoryType.COMMON.name());
        if (string != null) {
            Story.StoryType storyType = Story.StoryType.UGC;
            if (string.equals(storyType.name())) {
                this.type = storyType;
            }
        }
        if (bundle == null) {
            this.storiesFragment = new StoriesFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isDialogFragment", true);
            bundle2.putInt("index", getArguments().getInt("index", 0));
            bundle2.putInt(KustoStorage.KustoTable.COLUMN_SOURCE, getArguments().getInt(KustoStorage.KustoTable.COLUMN_SOURCE, 0));
            bundle2.putInt("firstAction", getArguments().getInt("firstAction", 0));
            bundle2.putString("storiesType", getArguments().getString("storiesType"));
            bundle2.putInt("slideIndex", getArguments().getInt("slideIndex", 0));
            setAppearanceSettings(bundle2);
            bundle2.putIntegerArrayList("stories_ids", getArguments().getIntegerArrayList("stories_ids"));
            this.storiesFragment.setArguments(bundle2);
        } else {
            this.storiesFragment = (StoriesFragment) getChildFragmentManager().l0("STORIES_FRAGMENT");
        }
        if (this.storiesFragment != null) {
            p u = getChildFragmentManager().p().u(R.id.dialog_fragment, this.storiesFragment);
            u.i("STORIES_FRAGMENT");
            u.l();
            return;
        }
        dismissAllowingStateLoss();
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
}
