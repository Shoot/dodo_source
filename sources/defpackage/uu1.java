package defpackage;

import android.content.Context;
/* compiled from: ContextModule_ProvideResFactory.java */
/* renamed from: uu1  reason: default package */
/* loaded from: classes3.dex */
public final class uu1 implements no3<c63> {
    private final as8<Context> a;

    public uu1(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static uu1 a(as8<Context> as8Var) {
        return new uu1(as8Var);
    }

    public static c63 c(Context context) {
        return (c63) jh8.e(lu1.a.i(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c63 get() {
        return c(this.a.get());
    }
}
