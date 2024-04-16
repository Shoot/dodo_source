package com.inappstory.sdk.stories.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
/* loaded from: classes3.dex */
public class Sizes {
    public static int dpFloatToPxExt(float f, Context context) {
        return Math.round(f * getPixelScaleFactorExt(context));
    }

    public static int dpToPxExt(int i) {
        return Math.round(i * getPixelScaleFactorExt());
    }

    public static float getPixelScaleFactorExt() {
        Context context;
        if (InAppStoryService.isNull() || (context = InAppStoryService.getInstance().getContext()) == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Point getScreenSize() {
        Context context = InAppStoryService.isNotNull() ? InAppStoryService.getInstance().getContext() : null;
        if (context == null) {
            return new Point(0, 0);
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static int getStatusBarHeight(Context context) {
        int i;
        if (context == null) {
            return 60;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            i = 24;
        } else {
            i = 25;
        }
        return (int) Math.ceil(i * context.getResources().getDisplayMetrics().density);
    }

    public static boolean isTablet() {
        if (InAppStoryService.isNotNull() && InAppStoryService.getInstance().getContext() != null) {
            return InAppStoryService.getInstance().getContext().getResources().getBoolean(R.bool.isTablet);
        }
        return false;
    }

    public static int pxToDpExt(int i) {
        return Math.round(i / getPixelScaleFactorExt());
    }

    public static int dpToPxExt(int i, Context context) {
        return Math.round(i * getPixelScaleFactorExt(context));
    }

    public static int pxToDpExt(int i, Context context) {
        return Math.round(i / getPixelScaleFactorExt(context));
    }

    public static float getPixelScaleFactorExt(Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Point getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
}
