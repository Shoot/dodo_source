package defpackage;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: zjc  reason: default package */
/* loaded from: classes2.dex */
public final class zjc {
    public static final a.g a;
    public static final a.g b;
    public static final a.AbstractC0215a c;
    static final a.AbstractC0215a d;
    public static final Scope e;
    public static final Scope f;
    public static final a g;
    public static final a h;

    static {
        a.g gVar = new a.g();
        a = gVar;
        a.g gVar2 = new a.g();
        b = gVar2;
        nic nicVar = new nic();
        c = nicVar;
        vic vicVar = new vic();
        d = vicVar;
        e = new Scope("profile");
        f = new Scope("email");
        g = new a("SignIn.API", nicVar, gVar);
        h = new a("SignIn.INTERNAL_API", vicVar, gVar2);
    }
}
