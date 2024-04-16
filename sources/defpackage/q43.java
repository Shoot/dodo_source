package defpackage;

import android.content.Context;
/* compiled from: DistanceFormatterModule_ProvideDistanceFormatterFactory.java */
/* renamed from: q43  reason: default package */
/* loaded from: classes3.dex */
public final class q43 implements no3<n43> {
    private final p43 a;
    private final as8<Context> b;

    public q43(p43 p43Var, as8<Context> as8Var) {
        this.a = p43Var;
        this.b = as8Var;
    }

    public static q43 a(p43 p43Var, as8<Context> as8Var) {
        return new q43(p43Var, as8Var);
    }

    public static n43 c(p43 p43Var, Context context) {
        return (n43) jh8.e(p43Var.a(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public n43 get() {
        return c(this.a, this.b.get());
    }
}
