package com.inappstory.sdk.stories.utils;

import android.app.Activity;
import android.view.View;
/* loaded from: classes3.dex */
public class StatusBarController {
    public static int systemUiFlags = -1;

    public static void hideStatusBar(Activity activity, boolean z) {
        int i;
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        systemUiFlags = decorView.getSystemUiVisibility();
        if (z) {
            i = 1028;
        } else {
            i = 1024;
        }
        decorView.setSystemUiVisibility(i);
    }

    public static void showStatusBar(Activity activity) {
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int i = systemUiFlags;
        if (i != -1) {
            decorView.setSystemUiVisibility(i);
        } else {
            decorView.setSystemUiVisibility(0);
        }
    }
}
