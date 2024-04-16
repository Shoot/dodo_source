package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: MacConfig.java */
/* renamed from: a46  reason: default package */
/* loaded from: classes2.dex */
public final class a46 {
    public static final String a = new uo4().d();
    @Deprecated
    public static final lc9 b;
    @Deprecated
    public static final lc9 c;
    @Deprecated
    public static final lc9 d;

    static {
        lc9 M = lc9.M();
        b = M;
        c = M;
        d = M;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        b();
    }

    public static void b() throws GeneralSecurityException {
        g46.f();
        uo4.p(true);
        if (dhb.a()) {
            return;
        }
        s9.o(true);
    }
}
