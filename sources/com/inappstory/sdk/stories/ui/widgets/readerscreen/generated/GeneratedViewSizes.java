package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.graphics.Point;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class GeneratedViewSizes {
    public static int fixedDrop;

    public static int getEMInDp() {
        return Sizes.pxToDpExt(getEMInPx());
    }

    public static int getEMInPx() {
        return getSizes().x / 20;
    }

    public static Point getSizes() {
        Point screenSize = Sizes.getScreenSize();
        screenSize.y = (screenSize.y - Sizes.dpToPxExt(60)) - fixedDrop;
        return screenSize;
    }
}
