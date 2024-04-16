package defpackage;

import androidx.lifecycle.d;
/* compiled from: ProcessLifecycleModule_GetLifecycleFactory.java */
/* renamed from: sk8  reason: default package */
/* loaded from: classes3.dex */
public final class sk8 implements no3<d> {
    private final qk8 a;

    public sk8(qk8 qk8Var) {
        this.a = qk8Var;
    }

    public static sk8 a(qk8 qk8Var) {
        return new sk8(qk8Var);
    }

    public static d c(qk8 qk8Var) {
        return (d) jh8.e(qk8Var.b());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public d get() {
        return c(this.a);
    }
}
