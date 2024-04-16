package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: AeadConfig.java */
/* renamed from: m9  reason: default package */
/* loaded from: classes2.dex */
public final class m9 {
    public static final String a = new ca().d();
    public static final String b = new ra().d();
    public static final String c = new va().d();
    public static final String d = new la().d();
    public static final String e = new bh5().d();
    public static final String f = new hh5().d();
    public static final String g = new pu0().d();
    public static final String h = new sac().d();
    @Deprecated
    public static final lc9 i;
    @Deprecated
    public static final lc9 j;
    @Deprecated
    public static final lc9 k;

    static {
        lc9 M = lc9.M();
        i = M;
        j = M;
        k = M;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        b();
    }

    public static void b() throws GeneralSecurityException {
        n9.e();
        a46.b();
        ca.p(true);
        ra.o(true);
        if (dhb.a()) {
            return;
        }
        la.o(true);
        va.p(true);
        pu0.m(true);
        bh5.m(true);
        hh5.m(true);
        sac.m(true);
    }
}
