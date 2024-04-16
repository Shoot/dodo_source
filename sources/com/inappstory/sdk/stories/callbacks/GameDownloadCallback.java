package com.inappstory.sdk.stories.callbacks;

import com.inappstory.sdk.stories.api.models.GameCenterData;
/* loaded from: classes3.dex */
public interface GameDownloadCallback {
    void complete(GameCenterData gameCenterData);

    void error(String str);
}
