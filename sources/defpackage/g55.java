package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: g55  reason: default package */
/* loaded from: classes2.dex */
public final class g55 {
    private static final a.g<inc> a;
    private static final a.AbstractC0215a<inc, a.d.c> b;
    @NonNull
    @Deprecated
    public static final a<a.d.c> c;
    @Deprecated
    public static final cnc d;

    static {
        a.g<inc> gVar = new a.g<>();
        a = gVar;
        ftc ftcVar = new ftc();
        b = ftcVar;
        c = new a<>("InstantApps.API", ftcVar, gVar);
        d = new cnc();
    }

    private g55() {
    }

    @NonNull
    public static i55 a(@NonNull Context context) {
        return new i55(context);
    }
}
