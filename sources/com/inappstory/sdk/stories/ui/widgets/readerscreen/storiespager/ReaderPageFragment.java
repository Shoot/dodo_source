package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.managers.TimerManager;
import com.inappstory.sdk.stories.ui.reader.ReaderManager;
import com.inappstory.sdk.stories.ui.reader.StoriesFragment;
import com.inappstory.sdk.stories.ui.reader.StoriesGradientObject;
import com.inappstory.sdk.stories.ui.reader.StoriesReaderSettings;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonsPanel;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.StoryTimeline;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.webview.SimpleStoriesWebView;
import com.inappstory.sdk.stories.utils.Sizes;
import java.util.List;
/* loaded from: classes3.dex */
public class ReaderPageFragment extends Fragment {
    View aboveButtonsPanel;
    View blackBottom;
    View blackTop;
    ButtonsPanel buttonsPanel;
    AppCompatImageView close;
    LinearLayout linearLayout;
    View loader;
    RelativeLayout loaderContainer;
    ReaderPageManager manager;
    ReaderManager parentManager;
    View refresh;
    SimpleStoriesView storiesView;
    int storyId;
    StoryTimeline timeline;
    StoriesReaderSettings readerSettings = null;
    StoriesGradientObject timerGradient = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InAppStoryManager.closeStoryReader(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setVisibility(8);
            View view2 = ReaderPageFragment.this.loader;
            if (view2 == null) {
                return;
            }
            view2.setAlpha(1.0f);
            ReaderPageFragment.this.loader.setVisibility(0);
            ReaderPageFragment.this.manager.reloadStory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageFragment readerPageFragment = ReaderPageFragment.this;
            if (readerPageFragment.loaderContainer == null) {
                return;
            }
            readerPageFragment.refresh.setVisibility(8);
            ReaderPageFragment.this.loader.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageFragment readerPageFragment = ReaderPageFragment.this;
            if (readerPageFragment.loaderContainer == null) {
                return;
            }
            readerPageFragment.refresh.setVisibility(8);
            ReaderPageFragment.this.loader.setVisibility(0);
            ReaderPageFragment.this.showLoaderContainerAnimated();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageFragment.this.hideLoaderContainerAnimated();
            ReaderPageFragment.this.refresh.setVisibility(8);
            ReaderPageFragment.this.loader.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageFragment.this.loader.setVisibility(8);
            ReaderPageFragment.this.refresh.setVisibility(0);
            ReaderPageFragment.this.close.setVisibility(0);
            ReaderPageFragment.this.showLoaderContainerAnimated();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageFragment.this.loader.setVisibility(8);
            ReaderPageFragment.this.refresh.setVisibility(0);
            ReaderPageFragment.this.close.setVisibility(0);
            ReaderPageFragment.this.showLoaderContainerAnimated();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends ShapeDrawable.ShaderFactory {
        final /* synthetic */ int[] a;
        final /* synthetic */ float[] b;

        h(int[] iArr, float[] fArr) {
            this.a = iArr;
            this.b = fArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, i2 * 1.0f, this.a, this.b, Shader.TileMode.REPEAT);
        }
    }

    private void addGradient(Context context, RelativeLayout relativeLayout) {
        View view = new View(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        view.setElevation(8.0f);
        view.setOutlineProvider(null);
        int i = 0;
        view.setClickable(false);
        StoriesGradientObject storiesGradientObject = this.timerGradient;
        if (storiesGradientObject != null) {
            List<Integer> list = storiesGradientObject.csColors;
            List<Float> list2 = storiesGradientObject.csLocations;
            int[] iArr = new int[list.size()];
            float[] fArr = new float[this.timerGradient.csColors.size()];
            if (list == null || list.isEmpty() || list.size() != list2.size()) {
                return;
            }
            int i2 = 0;
            for (Integer num : list) {
                iArr[i2] = num.intValue();
                i2++;
            }
            for (Float f2 : list2) {
                fArr[i] = f2.floatValue();
                i++;
            }
            if (this.timerGradient.csGradientHeight.intValue() > 0) {
                layoutParams.height = Sizes.dpToPxExt(this.timerGradient.csGradientHeight.intValue(), context);
            }
            h hVar = new h(iArr, fArr);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(hVar);
            view.setBackground(paintDrawable);
        } else {
            view.setBackground(getResources().getDrawable(R.drawable.story_gradient));
        }
        view.setLayoutParams(layoutParams);
        relativeLayout.addView(view);
    }

    private void createButtonsPanel(Context context) {
        this.buttonsPanel = new ButtonsPanel(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Sizes.dpToPxExt(60, context));
        layoutParams.addRule(12, -1);
        this.buttonsPanel.setVisibility(8);
        this.buttonsPanel.setId(R.id.ias_buttons_panel);
        this.buttonsPanel.setOrientation(0);
        this.buttonsPanel.setBackgroundColor(-16777216);
        this.buttonsPanel.setLayoutParams(layoutParams);
        this.buttonsPanel.setIcons(this.readerSettings);
    }

    private void createLoader() {
        Context context = getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.loader = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.loader.setElevation(8.0f);
        ((ViewGroup) this.loader).addView(AppearanceManager.getLoader(context));
    }

    private View createProgressContainer(Context context) {
        return null;
    }

    private RelativeLayout createReaderContainer(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setElevation(9.0f);
        relativeLayout.addView(createWebViewContainer(context));
        if (this.readerSettings.timerGradientEnable) {
            addGradient(context, relativeLayout);
        }
        createLoader();
        createRefreshButton(context);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.loaderContainer = relativeLayout2;
        relativeLayout2.setElevation(28.0f);
        this.loaderContainer.setAlpha(0.99f);
        this.loaderContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.loaderContainer.setBackgroundColor(-16777216);
        this.loaderContainer.addView(this.loader);
        this.loaderContainer.addView(this.refresh);
        relativeLayout.addView(this.loaderContainer);
        return relativeLayout;
    }

    private void createRefreshButton(Context context) {
        ImageView imageView = new ImageView(context);
        this.refresh = imageView;
        imageView.setId(R.id.ias_refresh_button);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Sizes.dpToPxExt(40, getContext()), Sizes.dpToPxExt(40, getContext()));
        layoutParams.addRule(13, -1);
        this.refresh.setElevation(18.0f);
        ((ImageView) this.refresh).setScaleType(ImageView.ScaleType.FIT_XY);
        this.refresh.setVisibility(8);
        ((ImageView) this.refresh).setImageDrawable(getResources().getDrawable(this.readerSettings.refreshIcon));
        this.refresh.setLayoutParams(layoutParams);
    }

    private RelativeLayout createTimelineContainer(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int dpToPxExt = Sizes.dpToPxExt(Math.max(0, this.readerSettings.radius - 16), getContext()) / 2;
        layoutParams.setMargins(dpToPxExt, dpToPxExt, dpToPxExt, 0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setId(R.id.ias_timeline_container);
        relativeLayout.setMinimumHeight(Sizes.dpToPxExt(30, getContext()));
        relativeLayout.setElevation(20.0f);
        StoryTimeline storyTimeline = new StoryTimeline(context);
        this.timeline = storyTimeline;
        storyTimeline.setId(R.id.ias_timeline);
        this.timeline.setLayoutParams(new RelativeLayout.LayoutParams(-1, Sizes.dpToPxExt(3, getContext())));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.close = appCompatImageView;
        appCompatImageView.setId(R.id.ias_close_button);
        this.close.setLayoutParams(new RelativeLayout.LayoutParams(Sizes.dpToPxExt(30, getContext()), Sizes.dpToPxExt(30, getContext())));
        this.close.setBackground(null);
        this.close.setImageDrawable(getResources().getDrawable(this.readerSettings.closeIcon));
        relativeLayout.addView(this.timeline);
        relativeLayout.addView(this.close);
        return relativeLayout;
    }

    private View createWebViewContainer(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        linearLayout.setElevation(4.0f);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        SimpleStoriesWebView simpleStoriesWebView = new SimpleStoriesWebView(context);
        this.storiesView = simpleStoriesWebView;
        simpleStoriesWebView.setId(R.id.ias_stories_view);
        ((SimpleStoriesWebView) this.storiesView).setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView((SimpleStoriesWebView) this.storiesView);
        return linearLayout;
    }

    private void hideLoaderContainer() {
        runOnUIThread(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoaderContainerAnimated() {
        this.loaderContainer.setVisibility(4);
    }

    private void runOnUIThread(Runnable runnable) {
        androidx.fragment.app.d activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    private void setCutout(View view, int i) {
        WindowInsets rootWindowInsets;
        WindowInsets rootWindowInsets2;
        DisplayCutout displayCutout;
        View findViewById;
        int safeInsetTop;
        if (Build.VERSION.SDK_INT >= 28 && getActivity() != null && getActivity().getWindow() != null && getActivity().getWindow().getDecorView() != null) {
            rootWindowInsets = getActivity().getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                rootWindowInsets2 = getActivity().getWindow().getDecorView().getRootWindowInsets();
                displayCutout = rootWindowInsets2.getDisplayCutout();
                if (displayCutout != null && (findViewById = view.findViewById(R.id.ias_timeline_container)) != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                    int i2 = layoutParams.topMargin;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    layoutParams.topMargin = i2 + Math.max(safeInsetTop - i, 0);
                    findViewById.setLayoutParams(layoutParams);
                }
            }
        }
    }

    private void setLinearContainer(Context context, LinearLayout linearLayout) {
        View view = new View(context);
        this.blackTop = view;
        view.setId(R.id.ias_black_top);
        this.blackTop.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        this.blackTop.setBackgroundColor(0);
        View view2 = new View(context);
        this.blackBottom = view2;
        view2.setId(R.id.ias_black_bottom);
        this.blackBottom.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        this.blackBottom.setBackgroundColor(0);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        int i = R.id.ias_buttons_panel;
        layoutParams.addRule(2, i);
        View view3 = new View(context);
        this.aboveButtonsPanel = view3;
        view3.setBackgroundColor(-16777216);
        this.aboveButtonsPanel.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Sizes.dpToPxExt(this.readerSettings.radius, context));
        layoutParams2.addRule(2, i);
        this.aboveButtonsPanel.setLayoutParams(layoutParams2);
        CardView cardView = new CardView(context);
        cardView.setLayoutParams(layoutParams);
        cardView.setRadius(Sizes.dpToPxExt(this.readerSettings.radius, getContext()));
        cardView.setCardBackgroundColor(0);
        cardView.setElevation(0.0f);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout2.addView(createReaderContainer(context));
        relativeLayout2.addView(createTimelineContainer(context));
        cardView.addView(relativeLayout2);
        createButtonsPanel(context);
        relativeLayout.addView(this.buttonsPanel);
        relativeLayout.addView(this.aboveButtonsPanel);
        relativeLayout.addView(cardView);
        linearLayout.addView(this.blackTop);
        linearLayout.addView(relativeLayout);
        linearLayout.addView(this.blackBottom);
    }

    private void setOffsets(View view) {
        if (!Sizes.isTablet() && this.blackBottom != null) {
            Point screenSize = Sizes.getScreenSize(getContext());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.blackBottom.getLayoutParams();
            int i = screenSize.y;
            int i2 = screenSize.x;
            if (i / i2 > 1.85f) {
                int i3 = ((int) (i - (i2 * 1.85f))) / 2;
                layoutParams.height = i3;
                setCutout(view, i3);
            } else {
                setCutout(view, 0);
            }
            this.blackBottom.setLayoutParams(layoutParams);
            this.blackTop.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLoaderContainerAnimated() {
        this.loaderContainer.setVisibility(0);
    }

    void bindViews(View view) {
        this.close = (AppCompatImageView) view.findViewById(R.id.ias_close_button);
        this.refresh = view.findViewById(R.id.ias_refresh_button);
        this.blackBottom = view.findViewById(R.id.ias_black_bottom);
        this.blackTop = view.findViewById(R.id.ias_black_top);
        this.buttonsPanel = (ButtonsPanel) view.findViewById(R.id.ias_buttons_panel);
        this.storiesView = (SimpleStoriesView) view.findViewById(R.id.ias_stories_view);
        this.timeline = (StoryTimeline) view.findViewById(R.id.ias_timeline);
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.close.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.timeline.getLayoutParams();
            int i = this.readerSettings.closePosition;
            int dpToPxExt = Sizes.dpToPxExt(8, getContext());
            layoutParams.rightMargin = dpToPxExt;
            layoutParams2.rightMargin = dpToPxExt;
            layoutParams2.leftMargin = dpToPxExt;
            switch (i) {
                case -4:
                    layoutParams2.topMargin = dpToPxExt;
                    layoutParams.topMargin = dpToPxExt;
                    layoutParams.addRule(21);
                    layoutParams.addRule(3, this.timeline.getId());
                    break;
                case -3:
                    layoutParams.addRule(20);
                    layoutParams.addRule(3, this.timeline.getId());
                    layoutParams2.topMargin = dpToPxExt;
                    layoutParams.topMargin = dpToPxExt;
                    break;
                case -2:
                    layoutParams.addRule(21);
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(16, this.close.getId());
                    break;
                case -1:
                    layoutParams.addRule(20);
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(17, this.close.getId());
                    break;
                case 1:
                    layoutParams.addRule(9);
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(1, this.close.getId());
                    break;
                case 2:
                    layoutParams.addRule(11);
                    layoutParams2.addRule(15);
                    layoutParams2.addRule(0, this.close.getId());
                    break;
                case 3:
                    layoutParams2.topMargin = dpToPxExt;
                    layoutParams.topMargin = dpToPxExt;
                    layoutParams.addRule(9);
                    layoutParams.addRule(3, this.timeline.getId());
                    break;
                case 4:
                    layoutParams.addRule(11);
                    layoutParams.addRule(3, this.timeline.getId());
                    layoutParams2.topMargin = dpToPxExt;
                    layoutParams.topMargin = dpToPxExt;
                    break;
            }
            this.close.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            InAppStoryService.createExceptionLog(e2);
        }
    }

    View createFragmentView(ViewGroup viewGroup) {
        Context context = getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!Sizes.isTablet() && this.readerSettings.backgroundColor != -16777216) {
            this.linearLayout.setBackgroundColor(-16777216);
        }
        setLinearContainer(context, this.linearLayout);
        relativeLayout.addView(this.linearLayout);
        return relativeLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.readerSettings = (StoriesReaderSettings) JsonParser.fromJson(getArguments().getString(AppearanceManager.CS_READER_SETTINGS), StoriesReaderSettings.class);
        this.timerGradient = (StoriesGradientObject) getArguments().getSerializable(AppearanceManager.CS_TIMER_GRADIENT);
        try {
            return createFragmentView(viewGroup);
        } catch (Exception e2) {
            InAppStoryService.createExceptionLog(e2);
            return new View(getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            simpleStoriesView.destroyView();
        }
        ReaderPageManager readerPageManager = this.manager;
        if (readerPageManager != null) {
            ReaderManager readerManager = this.parentManager;
            if (readerManager != null) {
                readerManager.removeSubscriber(readerPageManager);
            }
            if (InAppStoryService.getInstance() != null) {
                InAppStoryService.getInstance().getDownloadManager().removeSubscriber(this.manager);
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.manager = new ReaderPageManager();
        setStoryId();
        this.manager.host = this;
        if (this.parentManager == null && (getParentFragment() instanceof StoriesFragment)) {
            this.parentManager = ((StoriesFragment) getParentFragment()).readerManager;
        }
        ReaderPageManager readerPageManager = this.manager;
        readerPageManager.parentManager = this.parentManager;
        readerPageManager.setStoryId(this.storyId);
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            readerManager.addSubscriber(this.manager);
        }
        bindViews(view);
        setActions();
        if (setManagers() && InAppStoryService.getInstance() != null && InAppStoryService.getInstance().getDownloadManager() != null) {
            if (InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.manager.getStoryType()) != null) {
                this.manager.setSlideIndex(InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.manager.getStoryType()).lastIndex);
            }
            setViews(view);
            InAppStoryService.getInstance().getDownloadManager().addSubscriber(this.manager);
            this.manager.storyLoadedInCache();
            return;
        }
        InAppStoryManager.closeStoryReader();
    }

    void setActions() {
        AppCompatImageView appCompatImageView = this.close;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new a());
        }
        View view = this.refresh;
        if (view != null) {
            view.setOnClickListener(new b());
        }
    }

    boolean setManagers() {
        boolean z;
        ButtonsPanel buttonsPanel = this.buttonsPanel;
        boolean z2 = false;
        if (buttonsPanel != null) {
            this.manager.setButtonsPanelManager(buttonsPanel.getManager(), this.storyId);
            z = true;
        } else {
            z = false;
        }
        StoryTimeline storyTimeline = this.timeline;
        if (storyTimeline != null) {
            this.manager.setTimelineManager(storyTimeline.getTimelineManager(), this.storyId);
        } else {
            z = false;
        }
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            this.manager.setWebViewManager(simpleStoriesView.getManager(), this.storyId);
            z2 = z;
        }
        this.manager.setTimerManager(new TimerManager());
        return z2;
    }

    void setStoryId() {
        this.storyId = getArguments().getInt("story_id");
    }

    void setViews(View view) {
        Story storyById;
        if (InAppStoryService.getInstance() == null || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.manager.getStoryType())) == null) {
            return;
        }
        if (storyById.disableClose) {
            this.close.setVisibility(8);
        }
        ButtonsPanel buttonsPanel = this.buttonsPanel;
        if (buttonsPanel != null) {
            buttonsPanel.setButtonsVisibility(this.readerSettings, storyById.hasLike().booleanValue(), storyById.hasFavorite().booleanValue(), storyById.hasShare().booleanValue(), storyById.hasAudio().booleanValue());
            this.buttonsPanel.setButtonsStatus(storyById.getLike(), storyById.favorite ? 1 : 0);
            this.aboveButtonsPanel.setVisibility(this.buttonsPanel.getVisibility());
        }
        setOffsets(view);
        SimpleStoriesView simpleStoriesView = this.storiesView;
        if (simpleStoriesView != null) {
            simpleStoriesView.getManager().setIndex(storyById.lastIndex);
        }
    }

    public void showLoader() {
        runOnUIThread(new c());
    }

    public void showLoaderContainer() {
        runOnUIThread(new d());
    }

    public void slideLoadError() {
        runOnUIThread(new g());
    }

    public void storyLoadError() {
        runOnUIThread(new f());
    }

    public void storyLoadStart() {
        showLoaderContainer();
    }

    public void storyLoadedSuccess() {
        hideLoaderContainer();
    }
}
