package im.threads.ui.utils;

import android.graphics.drawable.Drawable;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: ColorFilterKotlinExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"applyColorFilter", "", "Landroid/graphics/drawable/Drawable;", RemoteMessageConst.Notification.COLOR, "", "mode", "Lim/threads/ui/utils/ColorFilterMode;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorFilterKotlinExtKt {
    public static final void applyColorFilter(Drawable drawable, int i, ColorFilterMode colorFilterMode) {
        z65.h(drawable, "<this>");
        z65.h(colorFilterMode, "mode");
        if (Build.VERSION.SDK_INT >= 29) {
            sc0.a();
            drawable.setColorFilter(rc0.a(i, colorFilterMode.getBlendMode$threads_release()));
            return;
        }
        drawable.setColorFilter(i, colorFilterMode.getPorterDuffMode$threads_release());
    }

    public static /* synthetic */ void applyColorFilter$default(Drawable drawable, int i, ColorFilterMode colorFilterMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            colorFilterMode = ColorFilterMode.SRC_ATOP;
        }
        applyColorFilter(drawable, i, colorFilterMode);
    }
}
