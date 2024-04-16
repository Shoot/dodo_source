package defpackage;

import android.content.Context;
/* compiled from: ProfileModule_ProvideProfileSubscriptionDataSourceFactory.java */
/* renamed from: bo8  reason: default package */
/* loaded from: classes3.dex */
public final class bo8 implements no3<ro8> {
    private final as8<Context> a;

    public bo8(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static bo8 a(as8<Context> as8Var) {
        return new bo8(as8Var);
    }

    public static ro8 c(Context context) {
        return (ro8) jh8.e(xn8.a.d(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ro8 get() {
        return c(this.a.get());
    }
}
