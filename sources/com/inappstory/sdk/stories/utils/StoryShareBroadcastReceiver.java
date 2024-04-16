package com.inappstory.sdk.stories.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.inappstory.sdk.stories.ui.ScreensManager;
/* loaded from: classes3.dex */
public class StoryShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (ScreensManager.getInstance().getTempShareId() != null) {
            str = ScreensManager.getInstance().getTempShareId();
        } else if (ScreensManager.getInstance().getOldTempShareId() != null) {
            str = ScreensManager.getInstance().getOldTempShareId();
        } else {
            str = null;
        }
        if (str != null) {
            if (ScreensManager.getInstance().currentGameActivity != null) {
                ScreensManager.getInstance().currentGameActivity.shareComplete(str, true);
            } else if (ScreensManager.getInstance().currentScreen != null) {
                ScreensManager.getInstance().currentScreen.shareComplete(true);
            }
        }
    }
}
