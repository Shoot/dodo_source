package im.threads.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ScreenSizeGetter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lim/threads/ui/utils/ScreenSizeGetter;", "", "()V", "api", "Lim/threads/ui/utils/ScreenSizeGetter$Api;", "getScreenSize", "Landroid/util/Size;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Api", "ApiLevel23", "ApiLevel30", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenSizeGetter {
    private final Api api;

    /* compiled from: ScreenSizeGetter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lim/threads/ui/utils/ScreenSizeGetter$Api;", "", "()V", "getScreenSize", "Landroid/util/Size;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static class Api {
        public Size getScreenSize(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            z65.g(defaultDisplay, "context as Activity).windowManager.defaultDisplay");
            defaultDisplay.getSize(new Point());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
    }

    /* compiled from: ScreenSizeGetter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lim/threads/ui/utils/ScreenSizeGetter$ApiLevel23;", "Lim/threads/ui/utils/ScreenSizeGetter$Api;", "()V", "getScreenSize", "Landroid/util/Size;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static class ApiLevel23 extends Api {
        @Override // im.threads.ui.utils.ScreenSizeGetter.Api
        public Size getScreenSize(Context context) {
            Object systemService;
            DisplayMetrics displayMetrics;
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            systemService = context.getSystemService(WindowManager.class);
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                displayMetrics = Resources.getSystem().getDisplayMetrics();
            }
            return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
    }

    /* compiled from: ScreenSizeGetter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lim/threads/ui/utils/ScreenSizeGetter$ApiLevel30;", "Lim/threads/ui/utils/ScreenSizeGetter$ApiLevel23;", "()V", "getScreenSize", "Landroid/util/Size;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class ApiLevel30 extends ApiLevel23 {
        @Override // im.threads.ui.utils.ScreenSizeGetter.ApiLevel23, im.threads.ui.utils.ScreenSizeGetter.Api
        public Size getScreenSize(Context context) {
            Object systemService;
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            Rect bounds2;
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            systemService = context.getSystemService(WindowManager.class);
            currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            z65.g(currentWindowMetrics, "context.getSystemService…ava).currentWindowMetrics");
            bounds = currentWindowMetrics.getBounds();
            int width = bounds.width();
            bounds2 = currentWindowMetrics.getBounds();
            return new Size(width, bounds2.height());
        }
    }

    public ScreenSizeGetter() {
        Api api;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            api = new ApiLevel30();
        } else if (i >= 23) {
            api = new ApiLevel23();
        } else {
            api = new Api();
        }
        this.api = api;
    }

    public final Size getScreenSize(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return this.api.getScreenSize(context);
    }
}
