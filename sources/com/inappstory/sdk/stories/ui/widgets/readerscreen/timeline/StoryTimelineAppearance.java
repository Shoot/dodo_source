package com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline;

import android.content.Context;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class StoryTimelineAppearance {
    float height = 3.0f;
    float gapWidth = 4.0f;
    float cornerRadius = 1.5f;
    int backgroundColor = -2130706433;
    int fillColor = -1;

    public StoryTimelineAppearance backgroundColor(int i) {
        this.backgroundColor = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StoryTimelineAppearance convertDpToPx(Context context) {
        this.height = Sizes.dpFloatToPxExt(this.height, context);
        this.gapWidth = Sizes.dpFloatToPxExt(this.gapWidth, context);
        this.cornerRadius = Sizes.dpFloatToPxExt(this.cornerRadius, context);
        return this;
    }

    public StoryTimelineAppearance cornerRadius(float f) {
        this.cornerRadius = f;
        return this;
    }

    public StoryTimelineAppearance fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public StoryTimelineAppearance gapWidth(float f) {
        this.gapWidth = f;
        return this;
    }

    public StoryTimelineAppearance height(float f) {
        this.height = f;
        return this;
    }
}
