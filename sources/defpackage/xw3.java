package defpackage;

import defpackage.gp;
/* compiled from: FirebasePerformanceInitializer.java */
/* renamed from: xw3  reason: default package */
/* loaded from: classes2.dex */
public final class xw3 implements gp.a {
    private static final sh a = sh.e();

    @Override // defpackage.gp.a
    public void a() {
        try {
            vw3.c();
        } catch (IllegalStateException e) {
            a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
        }
    }
}
