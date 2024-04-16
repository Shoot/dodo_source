package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a%\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b*\f\b\u0000\u0010\t\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lwc1;", "Landroid/graphics/ColorFilter;", "b", "Luc1;", RemoteMessageConst.Notification.COLOR, "Lpc0;", "blendMode", "a", "(JI)Lwc1;", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: yf  reason: default package */
/* loaded from: classes.dex */
public final class yf {
    public static final wc1 a(long j, int i) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = tc0.a.a(j, i);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(yc1.f(j), rf.b(i));
        }
        return new wc1(porterDuffColorFilter);
    }

    public static final ColorFilter b(wc1 wc1Var) {
        z65.h(wc1Var, "<this>");
        return wc1Var.a();
    }
}
