package com.inappstory.sdk.game.cache;

import com.inappstory.sdk.stories.api.models.GameCenterData;
/* loaded from: classes3.dex */
public class CachedGame {
    GameCenterData data;
    boolean isResourcesCached;
    boolean isSplashCached;

    public CachedGame(GameCenterData gameCenterData) {
        this.data = gameCenterData;
    }

    public GameCenterData getData() {
        return this.data;
    }

    public boolean isResourcesCached() {
        return this.isResourcesCached;
    }

    public boolean isSplashCached() {
        return this.isSplashCached;
    }

    public void setData(GameCenterData gameCenterData) {
        this.data = gameCenterData;
    }

    public void setResourcesCached(boolean z) {
        this.isResourcesCached = z;
    }

    public void setSplashCached(boolean z) {
        this.isSplashCached = z;
    }

    public CachedGame() {
    }
}
