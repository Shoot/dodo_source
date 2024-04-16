package defpackage;
/* compiled from: ProcessLifecycleModule_GetCoroutineScopeFactory.java */
/* renamed from: rk8  reason: default package */
/* loaded from: classes3.dex */
public final class rk8 implements no3<qx1> {
    private final qk8 a;

    public rk8(qk8 qk8Var) {
        this.a = qk8Var;
    }

    public static rk8 a(qk8 qk8Var) {
        return new rk8(qk8Var);
    }

    public static qx1 c(qk8 qk8Var) {
        return (qx1) jh8.e(qk8Var.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qx1 get() {
        return c(this.a);
    }
}
