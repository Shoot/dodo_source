package com.inappstory.sdk.stories.outercallbacks.common.gamereader;

import com.inappstory.sdk.game.reader.GameStoryData;
/* loaded from: classes3.dex */
public interface GameReaderCallback {
    void closeGame(GameStoryData gameStoryData, String str);

    void finishGame(GameStoryData gameStoryData, String str, String str2);

    void gameLoadError(GameStoryData gameStoryData, String str);

    void startGame(GameStoryData gameStoryData, String str);
}
