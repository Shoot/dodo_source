package defpackage;

import android.content.Context;
/* compiled from: ContextModule_ProvideLocationSettingsCheckerFactory.java */
/* renamed from: pu1  reason: default package */
/* loaded from: classes3.dex */
public final class pu1 implements no3<ew5> {
    private final as8<Context> a;

    public pu1(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static pu1 a(as8<Context> as8Var) {
        return new pu1(as8Var);
    }

    public static ew5 c(Context context) {
        return (ew5) jh8.e(lu1.a.d(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ew5 get() {
        return c(this.a.get());
    }
}
