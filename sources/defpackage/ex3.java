package defpackage;

import com.google.firebase.perf.session.SessionManager;
/* compiled from: FirebasePerformanceModule_ProvidesSessionManagerFactory.java */
/* renamed from: ex3  reason: default package */
/* loaded from: classes2.dex */
public final class ex3 implements no3<SessionManager> {
    private final yw3 a;

    public ex3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static ex3 a(yw3 yw3Var) {
        return new ex3(yw3Var);
    }

    public static SessionManager c(yw3 yw3Var) {
        return (SessionManager) jh8.c(yw3Var.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SessionManager get() {
        return c(this.a);
    }
}
