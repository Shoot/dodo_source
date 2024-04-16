package defpackage;

import android.content.Context;
/* compiled from: KustoModule_ProvideKustoAnalyticsFactory.java */
/* renamed from: di5  reason: default package */
/* loaded from: classes3.dex */
public final class di5 implements no3<oh5> {
    private final as8<Context> a;
    private final as8<ai5> b;

    public di5(as8<Context> as8Var, as8<ai5> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static di5 a(as8<Context> as8Var, as8<ai5> as8Var2) {
        return new di5(as8Var, as8Var2);
    }

    public static oh5 c(Context context, ai5 ai5Var) {
        return (oh5) jh8.e(bi5.a.b(context, ai5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public oh5 get() {
        return c(this.a.get(), this.b.get());
    }
}
