package com.inappstory.sdk.stories.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.game.reader.GameActivity;
import com.inappstory.sdk.game.reader.GameStoryData;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.share.IASShareData;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.events.GameCompleteEvent;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.reader.BaseReaderScreen;
import com.inappstory.sdk.stories.ui.reader.OverlapFragment;
import com.inappstory.sdk.stories.ui.reader.StoriesActivity;
import com.inappstory.sdk.stories.ui.reader.StoriesDialogFragment;
import com.inappstory.sdk.stories.ui.reader.StoriesFixedActivity;
import com.inappstory.sdk.stories.ui.reader.StoriesGradientObject;
import com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback;
import com.inappstory.sdk.stories.ui.views.goodswidget.GoodsItemData;
import com.inappstory.sdk.stories.ui.views.goodswidget.GoodsWidget;
import com.inappstory.sdk.stories.ui.views.goodswidget.GoodsWidgetAppearanceAdapter;
import com.inappstory.sdk.stories.ui.views.goodswidget.IGoodsWidgetAppearance;
import com.inappstory.sdk.stories.utils.ShowGoodsCallback;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
/* loaded from: classes3.dex */
public class ScreensManager {
    private static ScreensManager INSTANCE;
    public static long created;
    private static final Object lock = new Object();
    public GameActivity currentGameActivity;
    public BaseReaderScreen currentScreen;
    public Dialog goodsDialog;
    String oldTempShareId;
    int oldTempShareStoryId;
    public OverlapFragmentObserver overlapFragmentObserver;
    String tempShareId;
    int tempShareStoryId;
    public CloseUgcReaderCallback ugcCloseCallback;
    boolean tempShareStatus = false;
    public Point coordinates = null;
    HashMap<String, qq6<GameCompleteEvent>> gameObservables = new HashMap<>();
    private Long lastOpenTry = -1L;

    /* loaded from: classes3.dex */
    public interface CloseUgcReaderCallback {
        void onClose();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ AppearanceManager a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ Story.StoryType f;
        final /* synthetic */ String g;
        final /* synthetic */ Integer h;
        final /* synthetic */ ArrayList i;
        final /* synthetic */ String j;

        a(AppearanceManager appearanceManager, Context context, int i, int i2, int i3, Story.StoryType storyType, String str, Integer num, ArrayList arrayList, String str2) {
            this.a = appearanceManager;
            this.b = context;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = storyType;
            this.g = str;
            this.h = num;
            this.i = arrayList;
            this.j = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            Class cls;
            int csNavBarColor;
            int i;
            if (System.currentTimeMillis() - ScreensManager.this.lastOpenTry.longValue() < 1000) {
                return;
            }
            ScreensManager.this.lastOpenTry = Long.valueOf(System.currentTimeMillis());
            ScreensManager.this.closeGameReader();
            ScreensManager.this.closeUGCEditor();
            AppearanceManager appearanceManager = this.a;
            if (appearanceManager == null) {
                appearanceManager = AppearanceManager.getCommonInstance();
            }
            if (Sizes.isTablet() && (this.b instanceof androidx.fragment.app.d)) {
                ScreensManager.this.closeStoryReader(3);
                StoriesDialogFragment storiesDialogFragment = new StoriesDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("index", this.c);
                bundle.putInt(KustoStorage.KustoTable.COLUMN_SOURCE, this.d);
                bundle.putInt("firstAction", this.e);
                bundle.putString("storiesType", this.f.name());
                bundle.putString("feedId", this.g);
                Integer num = this.h;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                bundle.putInt("slideIndex", i);
                bundle.putIntegerArrayList("stories_ids", this.i);
                if (appearanceManager != null) {
                    bundle.putInt(AppearanceManager.CS_CLOSE_POSITION, appearanceManager.csClosePosition());
                    bundle.putInt(AppearanceManager.CS_STORY_READER_ANIMATION, appearanceManager.csStoryReaderAnimation());
                    bundle.putBoolean(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, appearanceManager.csCloseOnOverscroll());
                    bundle.putBoolean(AppearanceManager.CS_CLOSE_ON_SWIPE, appearanceManager.csCloseOnSwipe());
                    bundle.putBoolean(AppearanceManager.CS_HAS_LIKE, appearanceManager.csHasLike());
                    bundle.putBoolean(AppearanceManager.CS_HAS_FAVORITE, appearanceManager.csHasFavorite());
                    bundle.putBoolean(AppearanceManager.CS_HAS_SHARE, appearanceManager.csHasShare());
                    bundle.putInt(AppearanceManager.CS_CLOSE_ICON, appearanceManager.csCloseIcon());
                    bundle.putInt(AppearanceManager.CS_REFRESH_ICON, appearanceManager.csRefreshIcon());
                    bundle.putInt(AppearanceManager.CS_SOUND_ICON, appearanceManager.csSoundIcon());
                    bundle.putInt(AppearanceManager.CS_FAVORITE_ICON, appearanceManager.csFavoriteIcon());
                    bundle.putInt(AppearanceManager.CS_LIKE_ICON, appearanceManager.csLikeIcon());
                    bundle.putInt(AppearanceManager.CS_DISLIKE_ICON, appearanceManager.csDislikeIcon());
                    bundle.putInt(AppearanceManager.CS_SHARE_ICON, appearanceManager.csShareIcon());
                    bundle.putInt(AppearanceManager.CS_READER_RADIUS, appearanceManager.csReaderRadius(this.b));
                    bundle.putBoolean(AppearanceManager.CS_TIMER_GRADIENT_ENABLE, appearanceManager.csTimerGradientEnable());
                    bundle.putInt(AppearanceManager.CS_READER_BACKGROUND_COLOR, appearanceManager.csReaderBackgroundColor());
                    if (appearanceManager.csTimerGradient() != null) {
                        try {
                            bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, appearanceManager.csTimerGradient());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        bundle.putSerializable(AppearanceManager.CS_TIMER_GRADIENT, new StoriesGradientObject().csGradientHeight(Integer.valueOf(Sizes.getScreenSize(this.b).y)));
                    }
                }
                storiesDialogFragment.setArguments(bundle);
                BaseReaderScreen baseReaderScreen = ScreensManager.this.currentScreen;
                if (baseReaderScreen != null) {
                    baseReaderScreen.forceFinish();
                }
                try {
                    storiesDialogFragment.show(((androidx.fragment.app.d) this.b).getSupportFragmentManager(), "DialogFragment");
                    ScreensManager.this.currentScreen = storiesDialogFragment;
                    return;
                } catch (IllegalStateException e2) {
                    InAppStoryService.createExceptionLog(e2);
                    return;
                }
            }
            BaseReaderScreen baseReaderScreen2 = ScreensManager.this.currentScreen;
            if (baseReaderScreen2 != null) {
                baseReaderScreen2.forceFinish();
            }
            if (InAppStoryService.isNotNull()) {
                context = InAppStoryService.getInstance().getContext();
            } else {
                context = this.b;
            }
            if (appearanceManager != null && !appearanceManager.csIsDraggable()) {
                cls = StoriesFixedActivity.class;
            } else {
                cls = StoriesActivity.class;
            }
            Intent intent = new Intent(context, cls);
            intent.putExtra("index", this.c);
            intent.putExtra(KustoStorage.KustoTable.COLUMN_SOURCE, this.d);
            intent.putExtra("firstAction", this.e);
            intent.putExtra("storiesType", this.f.name());
            String str = this.j;
            if (str != null) {
                intent.putExtra("listID", str);
            }
            String str2 = this.g;
            if (str2 != null) {
                intent.putExtra("feedId", str2);
            }
            intent.putIntegerArrayListExtra("stories_ids", this.i);
            intent.putExtra("slideIndex", this.h);
            if (appearanceManager != null) {
                int i2 = context.getResources().getConfiguration().uiMode & 48;
                intent.putExtra(AppearanceManager.CS_CLOSE_POSITION, appearanceManager.csClosePosition());
                intent.putExtra(AppearanceManager.CS_STORY_READER_ANIMATION, appearanceManager.csStoryReaderAnimation());
                intent.putExtra(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, appearanceManager.csCloseOnOverscroll());
                intent.putExtra(AppearanceManager.CS_CLOSE_ON_SWIPE, appearanceManager.csCloseOnSwipe());
                if (i2 == 32) {
                    csNavBarColor = appearanceManager.csNightNavBarColor();
                } else {
                    csNavBarColor = appearanceManager.csNavBarColor();
                }
                intent.putExtra(AppearanceManager.CS_NAVBAR_COLOR, csNavBarColor);
                intent.putExtra(AppearanceManager.CS_HAS_LIKE, appearanceManager.csHasLike());
                intent.putExtra(AppearanceManager.CS_HAS_FAVORITE, appearanceManager.csHasFavorite());
                intent.putExtra(AppearanceManager.CS_HAS_SHARE, appearanceManager.csHasShare());
                intent.putExtra(AppearanceManager.CS_CLOSE_ICON, appearanceManager.csCloseIcon());
                intent.putExtra(AppearanceManager.CS_REFRESH_ICON, appearanceManager.csRefreshIcon());
                intent.putExtra(AppearanceManager.CS_SOUND_ICON, appearanceManager.csSoundIcon());
                intent.putExtra(AppearanceManager.CS_FAVORITE_ICON, appearanceManager.csFavoriteIcon());
                intent.putExtra(AppearanceManager.CS_LIKE_ICON, appearanceManager.csLikeIcon());
                intent.putExtra(AppearanceManager.CS_DISLIKE_ICON, appearanceManager.csDislikeIcon());
                intent.putExtra(AppearanceManager.CS_SHARE_ICON, appearanceManager.csShareIcon());
                intent.putExtra(AppearanceManager.CS_TIMER_GRADIENT_ENABLE, appearanceManager.csTimerGradientEnable());
                intent.putExtra(AppearanceManager.CS_READER_RADIUS, appearanceManager.csReaderRadius(this.b));
                intent.putExtra(AppearanceManager.CS_READER_BACKGROUND_COLOR, appearanceManager.csReaderBackgroundColor());
                if (appearanceManager.csTimerGradient() != null) {
                    try {
                        intent.putExtra(AppearanceManager.CS_TIMER_GRADIENT, appearanceManager.csTimerGradient());
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } else {
                    intent.putExtra(AppearanceManager.CS_TIMER_GRADIENT, new StoriesGradientObject().csGradientHeight(Integer.valueOf(Sizes.getScreenSize(this.b).y)));
                }
            }
            Context context2 = this.b;
            if (context2 == null) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            this.b.startActivity(intent);
        }
    }

    /* loaded from: classes3.dex */
    class c implements DialogInterface.OnDismissListener {
        final /* synthetic */ ShowGoodsCallback a;
        final /* synthetic */ String b;

        c(ShowGoodsCallback showGoodsCallback, String str) {
            this.a = showGoodsCallback;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.a.onResume(this.b);
            ScreensManager.this.goodsDialog = null;
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ScreensManager.this.hideGoods();
        }
    }

    /* loaded from: classes3.dex */
    class f implements DialogInterface.OnDismissListener {
        final /* synthetic */ ShowGoodsCallback a;
        final /* synthetic */ String b;

        f(ShowGoodsCallback showGoodsCallback, String str) {
            this.a = showGoodsCallback;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            ScreensManager.this.goodsDialog = null;
            this.a.onResume(this.b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ScreensManager.this.hideGoods();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        final /* synthetic */ ImageView a;
        final /* synthetic */ FrameLayout b;
        final /* synthetic */ String c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ GetGoodsDataCallback e;

        h(ImageView imageView, FrameLayout frameLayout, String str, ArrayList arrayList, GetGoodsDataCallback getGoodsDataCallback) {
            this.a = imageView;
            this.b = frameLayout;
            this.c = str;
            this.d = arrayList;
            this.e = getGoodsDataCallback;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
            ProfilingManager.getInstance().addTask("goods_resources", this.c);
            AppearanceManager.getCommonInstance().csCustomGoodsWidget().getSkus(this.d, this.e);
        }
    }

    private ScreensManager() {
    }

    public static ScreensManager getInstance() {
        ScreensManager screensManager;
        synchronized (lock) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new ScreensManager();
                }
                screensManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return screensManager;
    }

    public void cleanOverlapFragmentObserver() {
        this.overlapFragmentObserver = null;
    }

    public void clearCurrentActivity(androidx.fragment.app.d dVar) {
        if (dVar == this.currentScreen) {
            this.currentScreen = null;
        }
    }

    public void clearCurrentFragment(StoriesDialogFragment storiesDialogFragment) {
        if (this.currentScreen == storiesDialogFragment) {
            this.currentScreen = null;
        }
    }

    public void clearShareIds() {
        setTempShareStatus(false);
        setTempShareStoryId(0);
        setTempShareId(null);
        setOldTempShareStoryId(0);
        setOldTempShareId(null);
    }

    public void closeGameReader() {
        GameActivity gameActivity = this.currentGameActivity;
        if (gameActivity != null) {
            gameActivity.close();
            this.currentGameActivity = null;
        }
    }

    public void closeStoryReader(int i) {
        BaseReaderScreen baseReaderScreen = this.currentScreen;
        if (baseReaderScreen != null) {
            baseReaderScreen.closeStoryReader(i);
        }
    }

    public void closeUGCEditor() {
        CloseUgcReaderCallback closeUgcReaderCallback = this.ugcCloseCallback;
        if (closeUgcReaderCallback != null) {
            closeUgcReaderCallback.onClose();
        }
    }

    public qq6<GameCompleteEvent> getGameObserver(String str) {
        return this.gameObservables.get(str);
    }

    public String getOldTempShareId() {
        return this.oldTempShareId;
    }

    public int getOldTempShareStoryId() {
        return this.oldTempShareStoryId;
    }

    public String getTempShareId() {
        return this.tempShareId;
    }

    public boolean getTempShareStatus() {
        return this.tempShareStatus;
    }

    public int getTempShareStoryId() {
        return this.tempShareStoryId;
    }

    public void hideGoods() {
        Dialog dialog = this.goodsDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.goodsDialog = null;
        }
    }

    public void openGameReader(Context context, GameStoryData gameStoryData, String str, String str2, String str3, String str4, String str5, String str6) {
        if (InAppStoryService.isNull()) {
            return;
        }
        Intent intent = new Intent(context, GameActivity.class);
        intent.putExtra("gameUrl", str2);
        if (gameStoryData != null) {
            intent.putExtra("storyId", Integer.toString(gameStoryData.storyId));
            intent.putExtra("slideIndex", gameStoryData.slideIndex);
            intent.putExtra("slidesCount", gameStoryData.slidesCount);
            intent.putExtra("feedId", gameStoryData.feedId);
            intent.putExtra("storyType", Story.nameFromStoryType(gameStoryData.type));
            intent.putExtra("tags", gameStoryData.tags);
            intent.putExtra("title", gameStoryData.title);
            if (CallbackManager.getInstance().getGameCallback() != null) {
                CallbackManager.getInstance().getGameCallback().startGame(gameStoryData.storyId, StringsUtils.getNonNull(gameStoryData.title), StringsUtils.getNonNull(gameStoryData.tags), gameStoryData.slidesCount, gameStoryData.slideIndex);
            }
        }
        if (CallbackManager.getInstance().getGameReaderCallback() != null) {
            CallbackManager.getInstance().getGameReaderCallback().startGame(gameStoryData, str);
        }
        intent.putExtra("options", str6);
        intent.putExtra("gameId", str);
        intent.putExtra("gameConfig", str4);
        intent.putExtra("gameResources", str5);
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("splashImagePath", str3);
        if (Sizes.isTablet() && this.currentScreen != null) {
            String uuid = UUID.randomUUID().toString();
            intent.putExtra("observableUID", uuid);
            this.gameObservables.put(uuid, new qq6<>());
            this.currentScreen.observeGameReader(uuid);
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.startActivityForResult(intent, GameActivity.GAME_READER_REQUEST);
            activity.overridePendingTransition(0, 0);
            return;
        }
        try {
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void openOverlapContainerForShare(Context context, OverlapFragmentObserver overlapFragmentObserver, String str, int i, int i2, IASShareData iASShareData) {
        try {
            if (!(context instanceof androidx.fragment.app.d)) {
                return;
            }
            this.overlapFragmentObserver = overlapFragmentObserver;
            OverlapFragment overlapFragment = new OverlapFragment();
            overlapFragment.setCancelable(false);
            Bundle bundle = new Bundle();
            bundle.putString("slidePayload", str);
            bundle.putInt("storyId", i);
            bundle.putInt("slideIndex", i2);
            bundle.putString("shareData", JsonParser.getJson(iASShareData));
            overlapFragment.setArguments(bundle);
            overlapFragment.show(((androidx.fragment.app.d) context).getSupportFragmentManager(), "OverlapFragment");
        } catch (IllegalStateException e2) {
            InAppStoryService.createExceptionLog(e2);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void openStoriesReader(Context context, String str, AppearanceManager appearanceManager, ArrayList<Integer> arrayList, int i, int i2, int i3, Integer num, String str2, String str3, Story.StoryType storyType) {
        new Handler(Looper.getMainLooper()).post(new a(appearanceManager, context, i, i2, i3, storyType, str3, num, arrayList, str));
    }

    public void setOldTempShareId(String str) {
        this.oldTempShareId = str;
    }

    public void setOldTempShareStoryId(int i) {
        this.oldTempShareStoryId = i;
    }

    public void setTempShareId(String str) {
        this.tempShareStatus = false;
        this.tempShareId = str;
    }

    public void setTempShareStatus(boolean z) {
        this.tempShareStatus = z;
    }

    public void setTempShareStoryId(int i) {
        this.tempShareStoryId = i;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void showGoods(String str, Activity activity, ShowGoodsCallback showGoodsCallback, boolean z, String str2, int i, int i2, String str3) {
        String uuid;
        b.a aVar;
        if (AppearanceManager.getCommonInstance().csCustomGoodsWidget() == null) {
            showGoodsCallback.onEmptyResume(str2);
            Log.d(InAppStoryManager.IAS_ERROR_TAG, "Empty goods widget");
        } else if (this.goodsDialog != null) {
        } else {
            showGoodsCallback.onPause();
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            ArrayList<String> listFromJson = JsonParser.listFromJson(str, String.class);
            if (str2 != null) {
                uuid = str2;
            } else {
                uuid = UUID.randomUUID().toString();
            }
            String str4 = uuid;
            b bVar = new b(i, i2, str2, str3);
            if (AppearanceManager.getCommonInstance().csCustomGoodsWidget().getWidgetView(activity) != null) {
                b.a aVar2 = new b.a(activity, R.style.StoriesSDKAppTheme_GoodsDialog);
                aVar2.t(layoutInflater.inflate(R.layout.cs_goods_custom, (ViewGroup) null));
                androidx.appcompat.app.b a2 = aVar2.a();
                this.goodsDialog = a2;
                a2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                this.goodsDialog.setOnDismissListener(new c(showGoodsCallback, str2));
                this.goodsDialog.show();
                if (StatisticManager.getInstance() != null) {
                    StatisticManager.getInstance().sendGoodsOpen(i, i2, str2, str3);
                }
                ((RelativeLayout) this.goodsDialog.findViewById(R.id.cs_widget_container)).addView(AppearanceManager.getCommonInstance().csCustomGoodsWidget().getWidgetView(activity));
                AppearanceManager.getCommonInstance().csCustomGoodsWidget().getSkus(listFromJson, bVar);
                return;
            }
            if (Sizes.isTablet() && !z) {
                aVar = new b.a(activity);
            } else {
                aVar = new b.a(activity, R.style.StoriesSDKAppTheme_GoodsDialog);
            }
            aVar.t(layoutInflater.inflate(R.layout.cs_goods_recycler, (ViewGroup) null));
            androidx.appcompat.app.b a3 = aVar.a();
            this.goodsDialog = a3;
            a3.requestWindowFeature(1);
            this.goodsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.goodsDialog.getWindow().setLayout(-1, -1);
            WindowManager.LayoutParams attributes = this.goodsDialog.getWindow().getAttributes();
            attributes.flags &= -1025;
            this.goodsDialog.getWindow().setAttributes(attributes);
            this.goodsDialog.getWindow().getDecorView().setSystemUiVisibility(1028);
            this.goodsDialog.show();
            if (StatisticManager.getInstance() != null) {
                StatisticManager.getInstance().sendGoodsOpen(i, i2, str2, str3);
            }
            GoodsWidget goodsWidget = (GoodsWidget) this.goodsDialog.findViewById(R.id.goods_list);
            goodsWidget.setConfig(new GoodsWidget.GoodsWidgetConfig(str2, i, i2, str3));
            FrameLayout frameLayout = (FrameLayout) this.goodsDialog.findViewById(R.id.loader_container);
            IGoodsWidgetAppearance widgetAppearance = AppearanceManager.getCommonInstance().csCustomGoodsWidget().getWidgetAppearance();
            if (widgetAppearance == null) {
                widgetAppearance = new GoodsWidgetAppearanceAdapter();
            }
            IGoodsWidgetAppearance iGoodsWidgetAppearance = widgetAppearance;
            if (iGoodsWidgetAppearance instanceof GoodsWidgetAppearanceAdapter) {
                ((GoodsWidgetAppearanceAdapter) iGoodsWidgetAppearance).context = activity;
            }
            View findViewById = this.goodsDialog.findViewById(R.id.bottom_line);
            View findViewById2 = this.goodsDialog.findViewById(R.id.hide_goods_container);
            findViewById.setBackgroundColor(iGoodsWidgetAppearance.getBackgroundColor());
            findViewById2.setBackgroundColor(iGoodsWidgetAppearance.getBackgroundColor());
            findViewById.getLayoutParams().height = iGoodsWidgetAppearance.getBackgroundHeight();
            findViewById.requestLayout();
            ImageView imageView = (ImageView) this.goodsDialog.findViewById(R.id.refresh_button);
            imageView.setImageDrawable(activity.getResources().getDrawable(AppearanceManager.getCommonInstance().csRefreshIcon()));
            d dVar = new d(str4, findViewById, frameLayout, goodsWidget, imageView);
            Dialog dialog = this.goodsDialog;
            int i3 = R.id.close_area;
            dialog.findViewById(i3).setOnClickListener(new e());
            this.goodsDialog.findViewById(i3).setBackgroundColor(iGoodsWidgetAppearance.getDimColor());
            frameLayout.addView(AppearanceManager.getLoader(this.goodsDialog.getContext()));
            frameLayout.setVisibility(0);
            this.goodsDialog.setOnDismissListener(new f(showGoodsCallback, str2));
            ProfilingManager.getInstance().addTask("goods_resources", str4);
            AppearanceManager.getCommonInstance().csCustomGoodsWidget().getSkus(listFromJson, dVar);
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.goodsDialog.findViewById(R.id.hide_goods);
            appCompatImageView.setImageDrawable(iGoodsWidgetAppearance.getCloseButtonImage());
            appCompatImageView.setColorFilter(new PorterDuffColorFilter(iGoodsWidgetAppearance.getCloseButtonColor(), PorterDuff.Mode.SRC_ATOP));
            appCompatImageView.setOnClickListener(new g());
            imageView.setOnClickListener(new h(imageView, frameLayout, str4, listFromJson, dVar));
        }
    }

    public void openStoriesReader(Context context, String str, AppearanceManager appearanceManager, ArrayList<Integer> arrayList, int i, int i2, String str2, String str3, Story.StoryType storyType) {
        openStoriesReader(context, str, appearanceManager, arrayList, i, i2, 0, 0, str2, str3, storyType);
    }

    /* loaded from: classes3.dex */
    class b implements GetGoodsDataCallback {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void itemClick(String str) {
            if (StatisticManager.getInstance() != null) {
                StatisticManager.getInstance().sendGoodsClick(this.a, this.b, this.c, str, this.d);
            }
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onClose() {
            ScreensManager.this.hideGoods();
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onSuccess(ArrayList<GoodsItemData> arrayList) {
            if (arrayList != null) {
                arrayList.isEmpty();
            }
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onError() {
        }
    }

    /* loaded from: classes3.dex */
    class d implements GetGoodsDataCallback {
        final /* synthetic */ String a;
        final /* synthetic */ View b;
        final /* synthetic */ FrameLayout c;
        final /* synthetic */ GoodsWidget d;
        final /* synthetic */ ImageView e;

        d(String str, View view, FrameLayout frameLayout, GoodsWidget goodsWidget, ImageView imageView) {
            this.a = str;
            this.b = view;
            this.c = frameLayout;
            this.d = goodsWidget;
            this.e = imageView;
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onClose() {
            ScreensManager.this.hideGoods();
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onError() {
            ProfilingManager.getInstance().setReady(this.a);
            this.c.setVisibility(8);
            this.e.setVisibility(0);
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void onSuccess(ArrayList<GoodsItemData> arrayList) {
            GoodsWidget goodsWidget;
            ProfilingManager.getInstance().setReady(this.a);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            if (arrayList != null && !arrayList.isEmpty() && (goodsWidget = this.d) != null) {
                goodsWidget.setItems(arrayList, this);
            }
        }

        @Override // com.inappstory.sdk.stories.ui.views.goodswidget.GetGoodsDataCallback
        public void itemClick(String str) {
        }
    }
}
