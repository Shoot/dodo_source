package com.inappstory.sdk.game.cache;

import com.inappstory.sdk.stories.api.models.GameCenterData;
/* loaded from: classes3.dex */
public interface GameLoadCallback {
    void onError(String str);

    void onSuccess(GameCenterData gameCenterData);
}
