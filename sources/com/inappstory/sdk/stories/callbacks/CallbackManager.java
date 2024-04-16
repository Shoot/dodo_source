package com.inappstory.sdk.stories.callbacks;

import com.inappstory.sdk.stories.outercallbacks.common.errors.ErrorCallback;
import com.inappstory.sdk.stories.outercallbacks.common.gamereader.GameCallback;
import com.inappstory.sdk.stories.outercallbacks.common.gamereader.GameReaderCallback;
import com.inappstory.sdk.stories.outercallbacks.common.onboarding.OnboardingLoadCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CallToActionCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickOnShareStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseReader;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CloseStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CustomActionCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.FavoriteStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.LikeDislikeStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowSlideCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SourceType;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryWidgetCallback;
import com.inappstory.sdk.stories.outercallbacks.common.single.SingleLoadCallback;
/* loaded from: classes3.dex */
public class CallbackManager {
    private static CallbackManager INSTANCE;
    private static final Object lock = new Object();
    private AppClickCallback appClickCallback;
    private CallToActionCallback callToActionCallback;
    private ClickOnShareStoryCallback clickOnShareStoryCallback;
    private CloseStoryCallback closeStoryCallback;
    private CustomActionCallback customActionCallback;
    private ErrorCallback errorCallback;
    private FavoriteStoryCallback favoriteStoryCallback;
    private GameCallback gameCallback;
    private GameReaderCallback gameReaderCallback;
    private LikeDislikeStoryCallback likeDislikeStoryCallback;
    private OnboardingLoadCallback onboardingLoadCallback;
    private ShareCallback shareCallback;
    private ShowSlideCallback showSlideCallback;
    private ShowStoryCallback showStoryCallback;
    private SingleLoadCallback singleLoadCallback;
    private StoryWidgetCallback storyWidgetCallback;
    private UrlClickCallback urlClickCallback;

    private CallbackManager() {
    }

    public static CallbackManager getInstance() {
        CallbackManager callbackManager;
        synchronized (lock) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new CallbackManager();
                }
                callbackManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return callbackManager;
    }

    public AppClickCallback getAppClickCallback() {
        return this.appClickCallback;
    }

    public CallToActionCallback getCallToActionCallback() {
        return this.callToActionCallback;
    }

    public ClickOnShareStoryCallback getClickOnShareStoryCallback() {
        return this.clickOnShareStoryCallback;
    }

    public CloseStoryCallback getCloseStoryCallback() {
        return this.closeStoryCallback;
    }

    public CloseReader getCloseTypeFromInt(int i) {
        CloseReader closeReader = CloseReader.CLICK;
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    return CloseReader.CUSTOM;
                }
                return closeReader;
            }
            return CloseReader.SWIPE;
        }
        return CloseReader.AUTO;
    }

    public CustomActionCallback getCustomActionCallback() {
        return this.customActionCallback;
    }

    public ErrorCallback getErrorCallback() {
        return this.errorCallback;
    }

    public FavoriteStoryCallback getFavoriteStoryCallback() {
        return this.favoriteStoryCallback;
    }

    @Deprecated
    public GameCallback getGameCallback() {
        return this.gameCallback;
    }

    public GameReaderCallback getGameReaderCallback() {
        return this.gameReaderCallback;
    }

    public LikeDislikeStoryCallback getLikeDislikeStoryCallback() {
        return this.likeDislikeStoryCallback;
    }

    public OnboardingLoadCallback getOnboardingLoadCallback() {
        return this.onboardingLoadCallback;
    }

    public ShareCallback getShareCallback() {
        return this.shareCallback;
    }

    public ShowSlideCallback getShowSlideCallback() {
        return this.showSlideCallback;
    }

    public ShowStoryAction getShowStoryActionTypeFromInt(int i) {
        ShowStoryAction showStoryAction = ShowStoryAction.OPEN;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return ShowStoryAction.CUSTOM;
                    }
                    return showStoryAction;
                }
                return ShowStoryAction.AUTO;
            }
            return ShowStoryAction.SWIPE;
        }
        return ShowStoryAction.TAP;
    }

    public ShowStoryCallback getShowStoryCallback() {
        return this.showStoryCallback;
    }

    public SingleLoadCallback getSingleLoadCallback() {
        return this.singleLoadCallback;
    }

    public SourceType getSourceFromInt(int i) {
        SourceType sourceType = SourceType.LIST;
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    return SourceType.FAVORITE;
                }
                return sourceType;
            }
            return SourceType.ONBOARDING;
        }
        return SourceType.SINGLE;
    }

    public StoryWidgetCallback getStoryWidgetCallback() {
        return this.storyWidgetCallback;
    }

    @Deprecated
    public UrlClickCallback getUrlClickCallback() {
        return this.urlClickCallback;
    }

    public void setAppClickCallback(AppClickCallback appClickCallback) {
        this.appClickCallback = appClickCallback;
    }

    public void setCallToActionCallback(CallToActionCallback callToActionCallback) {
        this.callToActionCallback = callToActionCallback;
    }

    public void setClickOnShareStoryCallback(ClickOnShareStoryCallback clickOnShareStoryCallback) {
        this.clickOnShareStoryCallback = clickOnShareStoryCallback;
    }

    public void setCloseStoryCallback(CloseStoryCallback closeStoryCallback) {
        this.closeStoryCallback = closeStoryCallback;
    }

    public void setCustomActionCallback(CustomActionCallback customActionCallback) {
        this.customActionCallback = customActionCallback;
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFavoriteStoryCallback(FavoriteStoryCallback favoriteStoryCallback) {
        this.favoriteStoryCallback = favoriteStoryCallback;
    }

    public void setGameCallback(GameCallback gameCallback) {
        this.gameCallback = gameCallback;
    }

    public void setGameReaderCallback(GameReaderCallback gameReaderCallback) {
        this.gameReaderCallback = gameReaderCallback;
    }

    public void setLikeDislikeStoryCallback(LikeDislikeStoryCallback likeDislikeStoryCallback) {
        this.likeDislikeStoryCallback = likeDislikeStoryCallback;
    }

    public void setOnboardingLoadCallback(OnboardingLoadCallback onboardingLoadCallback) {
        this.onboardingLoadCallback = onboardingLoadCallback;
    }

    public void setShareCallback(ShareCallback shareCallback) {
        this.shareCallback = shareCallback;
    }

    public void setShowSlideCallback(ShowSlideCallback showSlideCallback) {
        this.showSlideCallback = showSlideCallback;
    }

    public void setShowStoryCallback(ShowStoryCallback showStoryCallback) {
        this.showStoryCallback = showStoryCallback;
    }

    public void setSingleLoadCallback(SingleLoadCallback singleLoadCallback) {
        this.singleLoadCallback = singleLoadCallback;
    }

    public void setStoryWidgetCallback(StoryWidgetCallback storyWidgetCallback) {
        this.storyWidgetCallback = storyWidgetCallback;
    }

    @Deprecated
    public void setUrlClickCallback(UrlClickCallback urlClickCallback) {
        this.urlClickCallback = urlClickCallback;
    }
}
