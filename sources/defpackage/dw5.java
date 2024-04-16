package defpackage;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: dw5  reason: default package */
/* loaded from: classes2.dex */
public class dw5 {
    @RecentlyNonNull
    public static final a<a.d.c> a;
    @RecentlyNonNull
    @Deprecated
    public static final o94 b;
    @RecentlyNonNull
    @Deprecated
    public static final te4 c;
    @RecentlyNonNull
    @Deprecated
    public static final xfa d;
    private static final a.g<ypc> e;
    private static final a.AbstractC0215a<ypc, a.d.c> f;

    static {
        a.g<ypc> gVar = new a.g<>();
        e = gVar;
        orc orcVar = new orc();
        f = orcVar;
        a = new a<>("LocationServices.API", orcVar, gVar);
        b = new ncd();
        c = new pnc();
        d = new rrc();
    }

    @RecentlyNonNull
    public static p94 a(@RecentlyNonNull Context context) {
        return new p94(context);
    }

    @RecentlyNonNull
    public static aga b(@RecentlyNonNull Context context) {
        return new aga(context);
    }
}
