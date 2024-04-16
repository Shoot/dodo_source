package com.facebook.flipper.plugins.uidebugger.stetho;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ViewUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/ViewUtil;", "", "()V", "tryGetActivity", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "view", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewUtil {
    public static final ViewUtil INSTANCE = new ViewUtil();

    private ViewUtil() {
    }

    public final Activity tryGetActivity(View view) {
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Activity tryGetActivity = tryGetActivity(context);
        if (tryGetActivity != null) {
            return tryGetActivity;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return tryGetActivity((View) parent);
        }
        return null;
    }

    private final Activity tryGetActivity(Context context) {
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
