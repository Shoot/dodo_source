package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ScreenUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\u0015"}, d2 = {"Ljx9;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, e.a, "Landroid/view/View;", "targetView", "b", c.a, "f", "dp", "a", "Landroid/app/Activity;", "activity", "", Image.TYPE_HIGH, "g", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jx9  reason: default package */
/* loaded from: classes.dex */
public final class jx9 {
    public static final jx9 a = new jx9();

    private jx9() {
    }

    public final int a(int i) {
        return Math.round(i * (Resources.getSystem().getDisplayMetrics().densityDpi / ((float) SyslogConstants.LOG_LOCAL4)));
    }

    public final int b(View view) {
        z65.h(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public final int c(View view) {
        z65.h(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public final int d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = context.getSystemService("window");
        z65.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public final int e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = context.getSystemService("window");
        z65.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.x;
    }

    public final int f(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final boolean g(Activity activity, View view) {
        z65.h(activity, "activity");
        z65.h(view, "targetView");
        if (e(activity) / 2 > b(view)) {
            return true;
        }
        return false;
    }

    public final boolean h(Activity activity, View view) {
        z65.h(activity, "activity");
        z65.h(view, "targetView");
        if (d(activity) / 2 > c(view)) {
            return true;
        }
        return false;
    }
}
