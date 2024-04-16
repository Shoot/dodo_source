package com.inappstory.sdk.stories.ui.reader;

import android.os.Bundle;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.R;
/* loaded from: classes3.dex */
public class StoriesReaderSettings {
    public int backgroundColor;
    public int closeIcon;
    public boolean closeOnOverscroll;
    public boolean closeOnSwipe;
    public int closePosition;
    public int dislikeIcon;
    public int favoriteIcon;
    public boolean hasFavorite;
    public boolean hasLike;
    public boolean hasShare;
    public int likeIcon;
    public int panelColor;
    public int radius;
    public int readerAnimation;
    public int refreshIcon;
    public int shareIcon;
    public int soundIcon;
    public boolean timerGradientEnable;

    public StoriesReaderSettings() {
    }

    public StoriesReaderSettings(Bundle bundle) {
        this.closeOnSwipe = bundle.getBoolean(AppearanceManager.CS_CLOSE_ON_SWIPE, true);
        this.closeOnOverscroll = bundle.getBoolean(AppearanceManager.CS_CLOSE_ON_OVERSCROLL, true);
        this.closePosition = bundle.getInt(AppearanceManager.CS_CLOSE_POSITION, 1);
        this.hasLike = bundle.getBoolean(AppearanceManager.CS_HAS_LIKE, false);
        this.hasFavorite = bundle.getBoolean(AppearanceManager.CS_HAS_FAVORITE, false);
        this.hasShare = bundle.getBoolean(AppearanceManager.CS_HAS_SHARE, false);
        this.favoriteIcon = bundle.getInt(AppearanceManager.CS_FAVORITE_ICON, R.drawable.ic_stories_status_favorite);
        this.likeIcon = bundle.getInt(AppearanceManager.CS_LIKE_ICON, R.drawable.ic_stories_status_like);
        this.dislikeIcon = bundle.getInt(AppearanceManager.CS_DISLIKE_ICON, R.drawable.ic_stories_status_dislike);
        this.shareIcon = bundle.getInt(AppearanceManager.CS_SHARE_ICON, R.drawable.ic_share_status);
        this.closeIcon = bundle.getInt(AppearanceManager.CS_CLOSE_ICON, R.drawable.ic_stories_close);
        this.refreshIcon = bundle.getInt(AppearanceManager.CS_REFRESH_ICON, R.drawable.ic_refresh);
        this.soundIcon = bundle.getInt(AppearanceManager.CS_SOUND_ICON, R.drawable.ic_stories_status_sound);
        this.timerGradientEnable = bundle.getBoolean(AppearanceManager.CS_TIMER_GRADIENT_ENABLE, true);
        this.radius = bundle.getInt(AppearanceManager.CS_READER_RADIUS, 0);
        this.backgroundColor = bundle.getInt(AppearanceManager.CS_READER_BACKGROUND_COLOR, -16777216);
    }
}
