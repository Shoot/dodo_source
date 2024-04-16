package com.inappstory.sdk.stories.ui.reader;

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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonsPanel;
import com.inappstory.sdk.stories.utils.Sizes;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesLoaderFragment extends Fragment {
    View aboveButtonsPanel;
    View blackBottom;
    View blackTop;
    ButtonsPanel buttonsPanel;
    LinearLayout linearLayout;
    View loader;
    RelativeLayout loaderContainer;
    View refresh;
    StoriesReaderSettings readerSettings = null;
    StoriesGradientObject timerGradient = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ShapeDrawable.ShaderFactory {
        final /* synthetic */ int[] a;
        final /* synthetic */ float[] b;

        a(int[] iArr, float[] fArr) {
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
            for (Float f : list2) {
                fArr[i] = f.floatValue();
                i++;
            }
            if (this.timerGradient.csGradientHeight.intValue() > 0) {
                layoutParams.height = Sizes.dpToPxExt(this.timerGradient.csGradientHeight.intValue(), context);
            }
            a aVar = new a(iArr, fArr);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(aVar);
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

    private RelativeLayout createReaderContainer(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setElevation(9.0f);
        if (this.readerSettings.timerGradientEnable) {
            addGradient(context, relativeLayout);
        }
        createLoader();
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.loaderContainer = relativeLayout2;
        relativeLayout2.setElevation(28.0f);
        this.loaderContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.loaderContainer.setBackgroundColor(-16777216);
        this.loaderContainer.addView(this.loader);
        relativeLayout.addView(this.loaderContainer);
        return relativeLayout;
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
        cardView.setCardBackgroundColor(-16777216);
        cardView.setElevation(0.0f);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
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

    void bindViews(View view) {
        this.refresh = view.findViewById(R.id.ias_refresh_button);
        this.blackBottom = view.findViewById(R.id.ias_black_bottom);
        this.blackTop = view.findViewById(R.id.ias_black_top);
        this.buttonsPanel = (ButtonsPanel) view.findViewById(R.id.ias_buttons_panel);
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
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setClickable(true);
        relativeLayout.addView(view);
        return relativeLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.readerSettings = (StoriesReaderSettings) JsonParser.fromJson(getArguments().getString(AppearanceManager.CS_READER_SETTINGS), StoriesReaderSettings.class);
        this.timerGradient = (StoriesGradientObject) getArguments().getSerializable(AppearanceManager.CS_TIMER_GRADIENT);
        try {
            return createFragmentView(viewGroup);
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            return new View(getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setViews(view);
    }

    void setViews(View view) {
        Story storyById;
        if (InAppStoryService.getInstance() == null || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(getArguments().getInt("storyId"), Story.StoryType.valueOf(getArguments().getString("storiesType", Story.StoryType.COMMON.name())))) == null) {
            return;
        }
        ButtonsPanel buttonsPanel = this.buttonsPanel;
        if (buttonsPanel != null) {
            buttonsPanel.setButtonsVisibility(this.readerSettings, storyById.hasLike().booleanValue(), storyById.hasFavorite().booleanValue(), storyById.hasShare().booleanValue(), storyById.hasAudio().booleanValue());
            this.buttonsPanel.setButtonsStatus(storyById.getLike(), storyById.favorite ? 1 : 0);
            this.aboveButtonsPanel.setVisibility(this.buttonsPanel.getVisibility());
        }
        setOffsets(view);
    }
}
