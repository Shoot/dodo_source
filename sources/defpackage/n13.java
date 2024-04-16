package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: DeterministicAeadConfig.java */
/* renamed from: n13  reason: default package */
/* loaded from: classes2.dex */
public final class n13 {
    public static final String a = new za().d();
    @Deprecated
    public static final lc9 b = lc9.M();
    @Deprecated
    public static final lc9 c = lc9.M();

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        o13.e();
        if (dhb.a()) {
            return;
        }
        za.m(true);
    }
}
