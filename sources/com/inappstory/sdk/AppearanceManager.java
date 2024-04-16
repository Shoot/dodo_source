package com.inappstory.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.inappstory.sdk.game.reader.GameReaderLoadProgressBar;
import com.inappstory.sdk.stories.api.models.CachedSessionData;
import com.inappstory.sdk.stories.ui.list.StoryTouchListener;
import com.inappstory.sdk.stories.ui.list.UGCListItemSimpleAppearance;
import com.inappstory.sdk.stories.ui.reader.StoriesGradientObject;
import com.inappstory.sdk.stories.ui.views.IGameLoaderView;
import com.inappstory.sdk.stories.ui.views.IGameReaderLoaderView;
import com.inappstory.sdk.stories.ui.views.IGetFavoriteListItem;
import com.inappstory.sdk.stories.ui.views.ILoaderView;
import com.inappstory.sdk.stories.ui.views.IStoriesListItem;
import com.inappstory.sdk.stories.ui.views.IStoryReaderLoaderView;
import com.inappstory.sdk.stories.ui.views.goodswidget.ICustomGoodsItem;
import com.inappstory.sdk.stories.ui.views.goodswidget.ICustomGoodsWidget;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.ugc.list.IStoriesListUGCItem;
/* loaded from: classes3.dex */
public class AppearanceManager {
    public static final int ANIMATION_COVER = 3;
    public static final int ANIMATION_CUBE = 2;
    public static final int ANIMATION_DEPTH = 1;
    public static final int ANIMATION_FLAT = 4;
    public static final int BOTTOM_END = -4;
    public static final int BOTTOM_LEFT = 3;
    public static final int BOTTOM_RIGHT = 4;
    public static final int BOTTOM_START = -3;
    public static final int CROSS_DISSOLVE = 1;
    public static final String CS_CLOSE_ICON = "iconClose";
    public static final String CS_CLOSE_ON_OVERSCROLL = "closeOnOverscroll";
    public static final String CS_CLOSE_ON_SWIPE = "closeOnSwipe";
    public static final String CS_CLOSE_POSITION = "closePosition";
    public static final String CS_COVER_QUALITY = "coverQuality";
    public static final String CS_DISLIKE_ICON = "iconDislike";
    public static final String CS_FAVORITE_ICON = "iconFavorite";
    public static final String CS_HAS_FAVORITE = "hasFavorite";
    public static final String CS_HAS_LIKE = "hasLike";
    public static final String CS_HAS_SHARE = "hasShare";
    public static final String CS_LIKE_ICON = "iconLike";
    public static final String CS_NAVBAR_COLOR = "navBarColor";
    public static final String CS_READER_BACKGROUND_COLOR = "readerBackgroundColor";
    public static final String CS_READER_PRESENTATION_STYLE = "presentationStyle";
    public static final String CS_READER_RADIUS = "readerRadius";
    public static final String CS_READER_SETTINGS = "readerSettings";
    public static final String CS_REFRESH_ICON = "iconRefresh";
    public static final String CS_SHARE_ICON = "iconShare";
    public static final String CS_SOUND_ICON = "iconSound";
    public static final String CS_STORY_READER_ANIMATION = "storyReaderAnimation";
    public static final String CS_TIMER_GRADIENT = "timerGradient";
    public static final String CS_TIMER_GRADIENT_ENABLE = "timerGradientEnable";
    public static final int MODAL = 2;
    public static final int NONE = -1;
    public static final int TOP_END = -2;
    public static final int TOP_LEFT = 1;
    public static final int TOP_RIGHT = 2;
    public static final int TOP_START = -1;
    public static final int ZOOM = 0;
    private static AppearanceManager commonInstance;
    private static WidgetAppearance csWidgetAppearance;
    private static Object lock = new Object();
    private int csCloseIcon;
    private boolean csCloseOnOverscroll;
    private boolean csCloseOnSwipe;
    private int csClosePosition;
    private Integer csColumnCount;
    private int csCoverQuality;
    private Typeface csCustomBoldFont;
    private Typeface csCustomBoldItalicFont;
    private Typeface csCustomFont;
    private ICustomGoodsItem csCustomGoodsItem;
    private ICustomGoodsWidget csCustomGoodsWidget;
    private Typeface csCustomItalicFont;
    private Typeface csCustomSecondaryBoldFont;
    private Typeface csCustomSecondaryBoldItalicFont;
    private Typeface csCustomSecondaryFont;
    private Typeface csCustomSecondaryItalicFont;
    private int csDislikeIcon;
    private int csFavoriteIcon;
    private IGetFavoriteListItem csFavoriteListItemInterface;
    private IGameLoaderView csGameLoaderView;
    private IGameReaderLoaderView csGameReaderLoaderView;
    private boolean csHasFavorite;
    private boolean csHasLike;
    private boolean csHasShare;
    private boolean csHasUGC;
    private boolean csIsDraggable;
    private int csLikeIcon;
    private int csListItemBorderColor;
    private boolean csListItemBorderVisibility;
    private boolean csListItemGradientEnable;
    private Integer csListItemHeight;
    private IStoriesListItem csListItemInterface;
    private int csListItemMargin;
    private int csListItemRadius;
    private Float csListItemRatio;
    private int csListItemSourceColor;
    private int csListItemSourceSize;
    private boolean csListItemSourceVisibility;
    private int csListItemTitleColor;
    private int csListItemTitleSize;
    private boolean csListItemTitleVisibility;
    private Integer csListItemWidth;
    private int csListOpenedItemBorderColor;
    private boolean csListOpenedItemBorderVisibility;
    private boolean csListOverscroll;
    private IStoriesListUGCItem csListUGCItemInterface;
    private ILoaderView csLoaderView;
    private int csNavBarColor;
    private int csNightNavBarColor;
    private int csReaderBackgroundColor;
    private int csReaderRadius;
    private int csRefreshIcon;
    private int csShareIcon;
    private boolean csShowStatusBar;
    private int csSoundIcon;
    private IStoryReaderLoaderView csStoryLoaderView;
    private int csStoryReaderAnimation;
    private int csStoryReaderPresentationStyle;
    private StoriesGradientObject csTimerGradient;
    private boolean csTimerGradientEnable;
    private UGCListItemSimpleAppearance csUGCListItemSimpleAppearance;
    private StoryTouchListener storyTouchListener;

    public AppearanceManager() {
        this.csListItemTitleVisibility = true;
        this.csListItemTitleSize = -1;
        this.csListItemTitleColor = -1;
        this.csListItemRadius = -1;
        this.csListItemSourceVisibility = false;
        this.csListItemSourceSize = -1;
        this.csListItemSourceColor = -1;
        this.csListItemBorderVisibility = true;
        this.csListItemBorderColor = -16777216;
        this.csListOverscroll = true;
        this.csTimerGradientEnable = true;
        this.csListItemGradientEnable = true;
        this.csNavBarColor = 0;
        this.csNightNavBarColor = 0;
        this.csReaderBackgroundColor = -16777216;
        this.csListItemMargin = -1;
        this.csShowStatusBar = false;
        this.csClosePosition = 4;
        this.csStoryReaderAnimation = 2;
        this.csStoryReaderPresentationStyle = 0;
        this.csIsDraggable = true;
        this.csUGCListItemSimpleAppearance = new UGCListItemSimpleAppearance();
        this.csReaderRadius = -1;
        this.csCoverQuality = 1;
        this.csCloseOnSwipe = true;
        this.csCloseOnOverscroll = true;
        this.csListOpenedItemBorderVisibility = false;
        this.csListOpenedItemBorderColor = -7829368;
    }

    public static WidgetAppearance csWidgetAppearance() {
        if (csWidgetAppearance == null) {
            csWidgetAppearance = new WidgetAppearance();
        }
        return csWidgetAppearance;
    }

    public static AppearanceManager getCommonInstance() {
        if (commonInstance == null) {
            synchronized (lock) {
                try {
                    if (commonInstance == null) {
                        commonInstance = new AppearanceManager();
                    }
                } finally {
                }
            }
        }
        return commonInstance;
    }

    private float getCurrentRatio(Context context) {
        Integer num = this.csListItemHeight;
        if (num != null && this.csListItemWidth != null && num.intValue() > 0 && this.csListItemWidth.intValue() > 0) {
            return (this.csListItemHeight.intValue() * 1.0f) / this.csListItemWidth.intValue();
        }
        Float f = this.csListItemRatio;
        if (f != null && f.floatValue() > 0.0f) {
            return this.csListItemRatio.floatValue();
        }
        CachedSessionData cachedSessionData = CachedSessionData.getInstance(context);
        if (cachedSessionData == null) {
            return 1.0f;
        }
        return cachedSessionData.previewAspectRatio;
    }

    public static View getLoader(Context context) {
        View view;
        AppearanceManager appearanceManager = commonInstance;
        if (appearanceManager != null) {
            if (appearanceManager.csStoryLoaderView() != null) {
                view = commonInstance.csStoryLoaderView().getView(context);
            } else if (commonInstance.csLoaderView() != null) {
                view = commonInstance.csLoaderView().getView();
            } else {
                view = null;
            }
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                view.setLayoutParams(layoutParams);
                return view;
            }
        }
        return new GameReaderLoadProgressBar(context);
    }

    private int getScaledWidth() {
        return (int) ((Sizes.getScreenSize().x - ((this.csColumnCount.intValue() + 1) * this.csListItemMargin)) / this.csColumnCount.intValue());
    }

    public static void setCommonInstance(AppearanceManager appearanceManager) {
        synchronized (lock) {
            commonInstance = appearanceManager;
        }
    }

    @Deprecated
    public static void setInstance(AppearanceManager appearanceManager) {
        synchronized (lock) {
            commonInstance = appearanceManager;
        }
    }

    public int csCloseIcon() {
        int i = this.csCloseIcon;
        return i != 0 ? i : R.drawable.ic_stories_close;
    }

    public AppearanceManager csCloseOnOverscroll(boolean z) {
        this.csCloseOnOverscroll = z;
        return this;
    }

    public AppearanceManager csCloseOnSwipe(boolean z) {
        this.csCloseOnSwipe = z;
        return this;
    }

    public int csClosePosition() {
        return this.csClosePosition;
    }

    public Integer csColumnCount() {
        return this.csColumnCount;
    }

    public int csCoverQuality() {
        return this.csCoverQuality;
    }

    public Typeface csCustomBoldFont() {
        return this.csCustomBoldFont;
    }

    public Typeface csCustomBoldItalicFont() {
        return this.csCustomBoldItalicFont;
    }

    public Typeface csCustomFont() {
        return this.csCustomFont;
    }

    public AppearanceManager csCustomGoodsWidget(ICustomGoodsWidget iCustomGoodsWidget) {
        this.csCustomGoodsWidget = iCustomGoodsWidget;
        return this;
    }

    public Typeface csCustomItalicFont() {
        return this.csCustomItalicFont;
    }

    public Typeface csCustomSecondaryBoldFont() {
        return this.csCustomSecondaryBoldFont;
    }

    public Typeface csCustomSecondaryBoldItalicFont() {
        return this.csCustomSecondaryBoldItalicFont;
    }

    public Typeface csCustomSecondaryFont() {
        return this.csCustomSecondaryFont;
    }

    public Typeface csCustomSecondaryItalicFont() {
        return this.csCustomSecondaryItalicFont;
    }

    public int csDislikeIcon() {
        int i = this.csDislikeIcon;
        return i != 0 ? i : R.drawable.ic_stories_status_dislike;
    }

    public int csFavoriteIcon() {
        int i = this.csFavoriteIcon;
        return i != 0 ? i : R.drawable.ic_stories_status_favorite;
    }

    public AppearanceManager csFavoriteListItemInterface(IGetFavoriteListItem iGetFavoriteListItem) {
        this.csFavoriteListItemInterface = iGetFavoriteListItem;
        return this;
    }

    public AppearanceManager csGameLoaderView(IGameLoaderView iGameLoaderView) {
        this.csGameLoaderView = iGameLoaderView;
        return this;
    }

    public AppearanceManager csGameReaderLoaderView(IGameReaderLoaderView iGameReaderLoaderView) {
        this.csGameReaderLoaderView = iGameReaderLoaderView;
        return this;
    }

    public AppearanceManager csHasFavorite(boolean z) {
        this.csHasFavorite = z;
        return this;
    }

    public AppearanceManager csHasLike(boolean z) {
        this.csHasLike = z;
        return this;
    }

    public AppearanceManager csHasShare(boolean z) {
        this.csHasShare = z;
        return this;
    }

    public AppearanceManager csHasUGC(boolean z) {
        this.csHasUGC = z;
        return this;
    }

    public AppearanceManager csIsDraggable(boolean z) {
        this.csIsDraggable = z;
        return this;
    }

    public int csLikeIcon() {
        int i = this.csLikeIcon;
        return i != 0 ? i : R.drawable.ic_stories_status_like;
    }

    public int csListItemBorderColor() {
        return this.csListItemBorderColor;
    }

    @Deprecated
    public AppearanceManager csListItemBorderVisibility(boolean z) {
        this.csListItemBorderVisibility = z;
        return this;
    }

    public AppearanceManager csListItemGradientEnable(boolean z) {
        this.csListItemGradientEnable = z;
        return this;
    }

    public AppearanceManager csListItemHeight(Integer num) {
        this.csListItemHeight = num;
        return this;
    }

    public AppearanceManager csListItemInterface(IStoriesListItem iStoriesListItem) {
        this.csListItemInterface = iStoriesListItem;
        return this;
    }

    public AppearanceManager csListItemMargin(int i) {
        this.csListItemMargin = i;
        return this;
    }

    public AppearanceManager csListItemRadius(int i) {
        this.csListItemRadius = i;
        return this;
    }

    public AppearanceManager csListItemRatio(Float f) {
        this.csListItemRatio = f;
        return this;
    }

    public int csListItemSourceColor() {
        return this.csListItemSourceColor;
    }

    @Deprecated
    public AppearanceManager csListItemSourceSize(int i) {
        this.csListItemSourceSize = i;
        return this;
    }

    @Deprecated
    public AppearanceManager csListItemSourceVisibility(boolean z) {
        this.csListItemSourceVisibility = z;
        return this;
    }

    public int csListItemTitleColor() {
        return this.csListItemTitleColor;
    }

    public AppearanceManager csListItemTitleSize(int i) {
        this.csListItemTitleSize = i;
        return this;
    }

    @Deprecated
    public AppearanceManager csListItemTitleVisibility(boolean z) {
        this.csListItemTitleVisibility = z;
        return this;
    }

    @Deprecated
    public AppearanceManager csListItemWidth(Integer num) {
        this.csListItemWidth = num;
        return this;
    }

    public int csListOpenedItemBorderColor() {
        return this.csListOpenedItemBorderColor;
    }

    @Deprecated
    public AppearanceManager csListOpenedItemBorderVisibility(boolean z) {
        this.csListOpenedItemBorderVisibility = z;
        return this;
    }

    public AppearanceManager csListOverscroll(boolean z) {
        this.csListOverscroll = z;
        return this;
    }

    public AppearanceManager csListUGCItemInterface(IStoriesListUGCItem iStoriesListUGCItem) {
        this.csListUGCItemInterface = iStoriesListUGCItem;
        return this;
    }

    @Deprecated
    public AppearanceManager csLoaderView(ILoaderView iLoaderView) {
        this.csLoaderView = iLoaderView;
        return this;
    }

    public int csNavBarColor() {
        return this.csNavBarColor;
    }

    public int csNightNavBarColor() {
        int i = this.csNightNavBarColor;
        return i != 0 ? i : this.csNavBarColor;
    }

    public int csReaderBackgroundColor() {
        return this.csReaderBackgroundColor;
    }

    public AppearanceManager csReaderRadius(int i) {
        this.csReaderRadius = i;
        return this;
    }

    public int csRefreshIcon() {
        int i = this.csRefreshIcon;
        return i != 0 ? i : R.drawable.ic_refresh;
    }

    public int csShareIcon() {
        int i = this.csShareIcon;
        return i != 0 ? i : R.drawable.ic_share_status;
    }

    @Deprecated
    public AppearanceManager csShowStatusBar(boolean z) {
        this.csShowStatusBar = z;
        return this;
    }

    public int csSoundIcon() {
        int i = this.csSoundIcon;
        return i != 0 ? i : R.drawable.ic_stories_status_sound;
    }

    public AppearanceManager csStoryLoaderView(IStoryReaderLoaderView iStoryReaderLoaderView) {
        this.csStoryLoaderView = iStoryReaderLoaderView;
        return this;
    }

    public int csStoryReaderAnimation() {
        return this.csStoryReaderAnimation;
    }

    public int csStoryReaderPresentationStyle() {
        return this.csStoryReaderPresentationStyle;
    }

    @Deprecated
    public AppearanceManager csStoryTouchListener(StoryTouchListener storyTouchListener) {
        this.storyTouchListener = storyTouchListener;
        return this;
    }

    public AppearanceManager csTimerGradient(StoriesGradientObject storiesGradientObject) {
        this.csTimerGradient = storiesGradientObject;
        return this;
    }

    public AppearanceManager csTimerGradientEnable(boolean z) {
        this.csTimerGradientEnable = z;
        return this;
    }

    public AppearanceManager csUGCListItemSimpleAppearance(UGCListItemSimpleAppearance uGCListItemSimpleAppearance) {
        this.csUGCListItemSimpleAppearance = uGCListItemSimpleAppearance;
        return this;
    }

    public Typeface getFont(boolean z, boolean z2, boolean z3) {
        if (z) {
            if (z2) {
                if (z3) {
                    Typeface typeface = this.csCustomSecondaryBoldItalicFont;
                    if (typeface == null) {
                        return getFont(z, z2, false);
                    }
                    return typeface;
                }
                Typeface typeface2 = this.csCustomSecondaryBoldFont;
                if (typeface2 == null) {
                    return getFont(z, false, z3);
                }
                return typeface2;
            } else if (z3) {
                Typeface typeface3 = this.csCustomSecondaryItalicFont;
                if (typeface3 == null) {
                    return getFont(z, z2, false);
                }
                return typeface3;
            } else {
                Typeface typeface4 = this.csCustomSecondaryFont;
                if (typeface4 == null) {
                    return getFont(false, z2, z3);
                }
                return typeface4;
            }
        } else if (z2) {
            if (z3) {
                Typeface typeface5 = this.csCustomBoldItalicFont;
                if (typeface5 == null) {
                    return getFont(z, z2, false);
                }
                return typeface5;
            }
            Typeface typeface6 = this.csCustomBoldFont;
            if (typeface6 == null) {
                return getFont(z, false, z3);
            }
            return typeface6;
        } else if (z3) {
            Typeface typeface7 = this.csCustomItalicFont;
            if (typeface7 == null) {
                return getFont(z, z2, false);
            }
            return typeface7;
        } else {
            Typeface typeface8 = this.csCustomFont;
            if (typeface8 == null) {
                return null;
            }
            return typeface8;
        }
    }

    public Integer getRealHeight(Context context) {
        float currentRatio = getCurrentRatio(context);
        Integer num = this.csColumnCount;
        if (num != null && num.intValue() > 0) {
            return Integer.valueOf((int) (getScaledWidth() / currentRatio));
        }
        Integer num2 = this.csListItemHeight;
        if (num2 != null && num2.intValue() > 0) {
            return this.csListItemHeight;
        }
        Integer num3 = this.csListItemWidth;
        if (num3 != null && num3.intValue() > 0) {
            return Integer.valueOf((int) (this.csListItemWidth.intValue() / currentRatio));
        }
        return Integer.valueOf(Sizes.dpToPxExt(120, context));
    }

    public Integer getRealWidth(Context context) {
        Integer num = this.csColumnCount;
        if (num != null && num.intValue() > 0) {
            return Integer.valueOf(getScaledWidth());
        }
        Integer num2 = this.csListItemWidth;
        if (num2 != null && num2.intValue() > 0) {
            return this.csListItemWidth;
        }
        float currentRatio = getCurrentRatio(context);
        Integer num3 = this.csListItemHeight;
        if (num3 != null && num3.intValue() > 0) {
            return Integer.valueOf((int) (this.csListItemHeight.intValue() * currentRatio));
        }
        return Integer.valueOf((int) (Sizes.dpToPxExt(120, context) * currentRatio));
    }

    public static void csWidgetAppearance(@NonNull Context context, @NonNull Class cls, Integer num) {
        csWidgetAppearance();
        WidgetAppearance widgetAppearance = csWidgetAppearance;
        widgetAppearance.widgetClass = cls;
        widgetAppearance.corners = num;
        widgetAppearance.context = context;
        widgetAppearance.sandbox = false;
        widgetAppearance.save();
    }

    /* renamed from: clone */
    public AppearanceManager m8clone() {
        return new AppearanceManager(this);
    }

    public AppearanceManager csCloseIcon(int i) {
        this.csCloseIcon = i;
        return this;
    }

    public boolean csCloseOnOverscroll() {
        return this.csCloseOnOverscroll;
    }

    public boolean csCloseOnSwipe() {
        return this.csCloseOnSwipe;
    }

    public AppearanceManager csClosePosition(int i) {
        this.csClosePosition = i;
        return this;
    }

    public AppearanceManager csColumnCount(int i) {
        this.csColumnCount = Integer.valueOf(i);
        return this;
    }

    public AppearanceManager csCoverQuality(int i) {
        this.csCoverQuality = i;
        return this;
    }

    public AppearanceManager csCustomBoldFont(Typeface typeface) {
        this.csCustomBoldFont = typeface;
        return this;
    }

    public AppearanceManager csCustomBoldItalicFont(Typeface typeface) {
        this.csCustomBoldItalicFont = typeface;
        return this;
    }

    public AppearanceManager csCustomFont(Typeface typeface) {
        this.csCustomFont = typeface;
        return this;
    }

    public ICustomGoodsWidget csCustomGoodsWidget() {
        return this.csCustomGoodsWidget;
    }

    public AppearanceManager csCustomItalicFont(Typeface typeface) {
        this.csCustomItalicFont = typeface;
        return this;
    }

    public AppearanceManager csCustomSecondaryBoldFont(Typeface typeface) {
        this.csCustomSecondaryBoldFont = typeface;
        return this;
    }

    public AppearanceManager csCustomSecondaryBoldItalicFont(Typeface typeface) {
        this.csCustomSecondaryBoldItalicFont = typeface;
        return this;
    }

    public AppearanceManager csCustomSecondaryFont(Typeface typeface) {
        this.csCustomSecondaryFont = typeface;
        return this;
    }

    public AppearanceManager csCustomSecondaryItalicFont(Typeface typeface) {
        this.csCustomSecondaryItalicFont = typeface;
        return this;
    }

    public AppearanceManager csDislikeIcon(int i) {
        this.csDislikeIcon = i;
        return this;
    }

    public AppearanceManager csFavoriteIcon(int i) {
        this.csFavoriteIcon = i;
        return this;
    }

    public IGetFavoriteListItem csFavoriteListItemInterface() {
        return this.csFavoriteListItemInterface;
    }

    public IGameLoaderView csGameLoaderView() {
        return this.csGameLoaderView;
    }

    public IGameReaderLoaderView csGameReaderLoaderView() {
        return this.csGameReaderLoaderView;
    }

    public boolean csHasFavorite() {
        return this.csHasFavorite;
    }

    public boolean csHasLike() {
        return this.csHasLike;
    }

    public boolean csHasShare() {
        return this.csHasShare;
    }

    public boolean csHasUGC() {
        return this.csHasUGC;
    }

    public boolean csIsDraggable() {
        return this.csIsDraggable;
    }

    public AppearanceManager csLikeIcon(int i) {
        this.csLikeIcon = i;
        return this;
    }

    public AppearanceManager csListItemBorderColor(int i) {
        this.csListItemBorderColor = i;
        return this;
    }

    public boolean csListItemBorderVisibility() {
        return this.csListItemBorderVisibility;
    }

    public boolean csListItemGradientEnable() {
        return this.csListItemGradientEnable;
    }

    public Integer csListItemHeight() {
        return this.csListItemHeight;
    }

    public IStoriesListItem csListItemInterface() {
        return this.csListItemInterface;
    }

    public int csListItemMargin(Context context) {
        int i = this.csListItemMargin;
        return i == -1 ? Sizes.dpToPxExt(4, context) : i;
    }

    public int csListItemRadius(Context context) {
        int i = this.csListItemRadius;
        return i == -1 ? Sizes.dpToPxExt(16, context) : i;
    }

    public Float csListItemRatio() {
        return this.csListItemRatio;
    }

    @Deprecated
    public AppearanceManager csListItemSourceColor(int i) {
        this.csListItemSourceColor = i;
        return this;
    }

    public int csListItemSourceSize() {
        int i = this.csListItemSourceSize;
        return i == -1 ? Sizes.dpToPxExt(14) : i;
    }

    public boolean csListItemSourceVisibility() {
        return this.csListItemSourceVisibility;
    }

    public AppearanceManager csListItemTitleColor(int i) {
        this.csListItemTitleColor = i;
        return this;
    }

    public int csListItemTitleSize(Context context) {
        int i = this.csListItemTitleSize;
        return i == -1 ? Sizes.dpToPxExt(14, context) : i;
    }

    public boolean csListItemTitleVisibility() {
        return this.csListItemTitleVisibility;
    }

    @Deprecated
    public Integer csListItemWidth() {
        return this.csListItemWidth;
    }

    public AppearanceManager csListOpenedItemBorderColor(int i) {
        this.csListOpenedItemBorderColor = i;
        return this;
    }

    public boolean csListOpenedItemBorderVisibility() {
        return this.csListOpenedItemBorderVisibility;
    }

    public boolean csListOverscroll() {
        return this.csListOverscroll;
    }

    public IStoriesListUGCItem csListUGCItemInterface() {
        return this.csListUGCItemInterface;
    }

    public ILoaderView csLoaderView() {
        return this.csLoaderView;
    }

    public AppearanceManager csNavBarColor(int i) {
        this.csNavBarColor = i;
        return this;
    }

    public AppearanceManager csNightNavBarColor(int i) {
        this.csNightNavBarColor = i;
        return this;
    }

    public AppearanceManager csReaderBackgroundColor(int i) {
        this.csReaderBackgroundColor = i;
        return this;
    }

    public int csReaderRadius(Context context) {
        int i = this.csReaderRadius;
        return i == -1 ? Sizes.dpToPxExt(4, context) : i;
    }

    public AppearanceManager csRefreshIcon(int i) {
        this.csRefreshIcon = i;
        return this;
    }

    public AppearanceManager csShareIcon(int i) {
        this.csShareIcon = i;
        return this;
    }

    public boolean csShowStatusBar() {
        return this.csShowStatusBar;
    }

    public AppearanceManager csSoundIcon(int i) {
        this.csSoundIcon = i;
        return this;
    }

    public IStoryReaderLoaderView csStoryLoaderView() {
        return this.csStoryLoaderView;
    }

    public AppearanceManager csStoryReaderAnimation(int i) {
        this.csStoryReaderAnimation = i;
        return this;
    }

    public AppearanceManager csStoryReaderPresentationStyle(int i) {
        this.csStoryReaderPresentationStyle = i;
        return this;
    }

    public StoryTouchListener csStoryTouchListener() {
        return this.storyTouchListener;
    }

    public StoriesGradientObject csTimerGradient() {
        return this.csTimerGradient;
    }

    public boolean csTimerGradientEnable() {
        return this.csTimerGradientEnable;
    }

    public UGCListItemSimpleAppearance csUGCListItemSimpleAppearance() {
        return this.csUGCListItemSimpleAppearance;
    }

    public AppearanceManager(AppearanceManager appearanceManager) {
        this.csListItemTitleVisibility = true;
        this.csListItemTitleSize = -1;
        this.csListItemTitleColor = -1;
        this.csListItemRadius = -1;
        this.csListItemSourceVisibility = false;
        this.csListItemSourceSize = -1;
        this.csListItemSourceColor = -1;
        this.csListItemBorderVisibility = true;
        this.csListItemBorderColor = -16777216;
        this.csListOverscroll = true;
        this.csTimerGradientEnable = true;
        this.csListItemGradientEnable = true;
        this.csNavBarColor = 0;
        this.csNightNavBarColor = 0;
        this.csReaderBackgroundColor = -16777216;
        this.csListItemMargin = -1;
        this.csShowStatusBar = false;
        this.csClosePosition = 4;
        this.csStoryReaderAnimation = 2;
        this.csStoryReaderPresentationStyle = 0;
        this.csIsDraggable = true;
        this.csUGCListItemSimpleAppearance = new UGCListItemSimpleAppearance();
        this.csReaderRadius = -1;
        this.csCoverQuality = 1;
        this.csCloseOnSwipe = true;
        this.csCloseOnOverscroll = true;
        this.csListOpenedItemBorderVisibility = false;
        this.csListOpenedItemBorderColor = -7829368;
        this.csListItemTitleVisibility = appearanceManager.csListItemTitleVisibility;
        this.csListItemTitleSize = appearanceManager.csListItemTitleSize;
        this.csListItemTitleColor = appearanceManager.csListItemTitleColor;
        this.csListItemRadius = appearanceManager.csListItemRadius;
        this.csListItemSourceVisibility = appearanceManager.csListItemSourceVisibility;
        this.csListItemSourceSize = appearanceManager.csListItemSourceSize;
        this.csListItemSourceColor = appearanceManager.csListItemSourceColor;
        this.csListItemWidth = appearanceManager.csListItemWidth;
        this.csListItemHeight = appearanceManager.csListItemHeight;
        this.csListItemBorderVisibility = appearanceManager.csListItemBorderVisibility;
        this.csListItemBorderColor = appearanceManager.csListItemBorderColor;
        this.csFavoriteListItemInterface = appearanceManager.csFavoriteListItemInterface;
        this.csListItemInterface = appearanceManager.csListItemInterface;
        this.csListUGCItemInterface = appearanceManager.csListUGCItemInterface;
        this.csLoaderView = appearanceManager.csLoaderView;
        this.csStoryLoaderView = appearanceManager.csStoryLoaderView;
        this.csGameLoaderView = appearanceManager.csGameLoaderView;
        this.csGameReaderLoaderView = appearanceManager.csGameReaderLoaderView;
        this.storyTouchListener = appearanceManager.storyTouchListener;
        this.csCustomGoodsWidget = appearanceManager.csCustomGoodsWidget;
        this.csCustomGoodsItem = appearanceManager.csCustomGoodsItem;
        this.csListOverscroll = appearanceManager.csListOverscroll;
        this.csHasLike = appearanceManager.csHasLike;
        this.csHasFavorite = appearanceManager.csHasFavorite;
        this.csHasUGC = appearanceManager.csHasUGC;
        this.csHasShare = appearanceManager.csHasShare;
        this.csTimerGradientEnable = appearanceManager.csTimerGradientEnable;
        this.csListItemGradientEnable = appearanceManager.csListItemGradientEnable;
        this.csFavoriteIcon = appearanceManager.csFavoriteIcon;
        this.csLikeIcon = appearanceManager.csLikeIcon;
        this.csDislikeIcon = appearanceManager.csDislikeIcon;
        this.csShareIcon = appearanceManager.csShareIcon;
        this.csCloseIcon = appearanceManager.csCloseIcon;
        this.csRefreshIcon = appearanceManager.csRefreshIcon;
        this.csSoundIcon = appearanceManager.csSoundIcon;
        this.csNavBarColor = appearanceManager.csNavBarColor;
        this.csNightNavBarColor = appearanceManager.csNightNavBarColor;
        this.csReaderBackgroundColor = appearanceManager.csReaderBackgroundColor;
        this.csCustomFont = appearanceManager.csCustomFont;
        this.csCustomBoldFont = appearanceManager.csCustomBoldFont;
        this.csCustomItalicFont = appearanceManager.csCustomItalicFont;
        this.csCustomBoldItalicFont = appearanceManager.csCustomBoldItalicFont;
        this.csCustomSecondaryFont = appearanceManager.csCustomSecondaryFont;
        this.csCustomSecondaryBoldFont = appearanceManager.csCustomSecondaryBoldFont;
        this.csCustomSecondaryItalicFont = appearanceManager.csCustomSecondaryItalicFont;
        this.csCustomSecondaryBoldItalicFont = appearanceManager.csCustomSecondaryBoldItalicFont;
        this.csTimerGradient = appearanceManager.csTimerGradient;
        this.csReaderRadius = appearanceManager.csReaderRadius;
        this.csCoverQuality = appearanceManager.csCoverQuality;
        this.csCloseOnSwipe = appearanceManager.csCloseOnSwipe;
        this.csCloseOnOverscroll = appearanceManager.csCloseOnOverscroll;
        this.csListOpenedItemBorderVisibility = appearanceManager.csListOpenedItemBorderVisibility;
        this.csListOpenedItemBorderColor = appearanceManager.csListOpenedItemBorderColor;
        this.csListItemMargin = appearanceManager.csListItemMargin;
        this.csShowStatusBar = appearanceManager.csShowStatusBar;
        this.csClosePosition = appearanceManager.csClosePosition;
        this.csStoryReaderAnimation = appearanceManager.csStoryReaderAnimation;
        this.csIsDraggable = appearanceManager.csIsDraggable;
        this.csListItemRatio = appearanceManager.csListItemRatio;
        this.csColumnCount = appearanceManager.csColumnCount;
        this.csUGCListItemSimpleAppearance = appearanceManager.csUGCListItemSimpleAppearance;
    }
}
