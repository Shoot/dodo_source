package com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline;

import java.util.List;
/* loaded from: classes3.dex */
public interface IStoryTimelineManager {
    void active(boolean z);

    void clear();

    void next();

    void pause();

    void prev();

    void resetDurations();

    void resume();

    void setDurations(List<Integer> list, boolean z);

    void setSegment(int i);

    void setSlidesCount(int i);

    void startSegment(int i);

    void stop();
}
