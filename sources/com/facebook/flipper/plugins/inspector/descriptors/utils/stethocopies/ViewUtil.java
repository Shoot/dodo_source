package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes2.dex */
final class ViewUtil {
    private ViewUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity tryGetActivity(View view) {
        if (view == null) {
            return null;
        }
        Activity tryGetActivity = tryGetActivity(view.getContext());
        if (tryGetActivity != null) {
            return tryGetActivity;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return tryGetActivity((View) parent);
        }
        return null;
    }

    private static Activity tryGetActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
