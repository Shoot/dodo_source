package defpackage;

import android.content.Context;
import com.google.android.gms.common.a;
import kotlin.Metadata;
/* compiled from: PlatformUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Z", "isGmsAvailable", "location-gms_release"}, k = 2, mv = {1, 4, 2})
/* renamed from: zc8  reason: default package */
/* loaded from: classes2.dex */
public final class zc8 {
    public static final boolean a(Context context) {
        z65.h(context, "$this$isGmsAvailable");
        int g = a.m().g(context);
        if (g == 0) {
            return true;
        }
        if (g == 1 || g == 2 || g != 3) {
        }
        return false;
    }
}
