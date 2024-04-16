package defpackage;

import android.content.Context;
/* compiled from: ContextModule_ProvideDefaultTimeFormatterFactory.java */
/* renamed from: nu1  reason: default package */
/* loaded from: classes3.dex */
public final class nu1 implements no3<jgb> {
    private final as8<Context> a;

    public nu1(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static nu1 a(as8<Context> as8Var) {
        return new nu1(as8Var);
    }

    public static jgb c(Context context) {
        return (jgb) jh8.e(lu1.a.b(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jgb get() {
        return c(this.a.get());
    }
}
