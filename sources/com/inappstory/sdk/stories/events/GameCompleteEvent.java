package com.inappstory.sdk.stories.events;
/* loaded from: classes3.dex */
public class GameCompleteEvent {
    String gameState;
    int slideIndex;
    int storyId;

    public GameCompleteEvent(String str, int i, int i2) {
        this.gameState = str;
        this.storyId = i;
        this.slideIndex = i2;
    }

    public String getGameState() {
        return this.gameState;
    }

    public int getSlideIndex() {
        return this.slideIndex;
    }

    public int getStoryId() {
        return this.storyId;
    }
}
