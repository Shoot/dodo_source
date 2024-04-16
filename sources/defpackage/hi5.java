package defpackage;

import android.content.Context;
/* compiled from: KustoModule_ProvideKustoRepositoryFactory.java */
/* renamed from: hi5  reason: default package */
/* loaded from: classes3.dex */
public final class hi5 implements no3<ji5> {
    private final as8<Context> a;

    public hi5(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static hi5 a(as8<Context> as8Var) {
        return new hi5(as8Var);
    }

    public static ji5 c(Context context) {
        return (ji5) jh8.e(bi5.a.f(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ji5 get() {
        return c(this.a.get());
    }
}
