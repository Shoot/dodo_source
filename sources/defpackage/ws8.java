package defpackage;

import android.content.Context;
/* compiled from: PushModule_ProvideFCMServicePushProviderFactory.java */
/* renamed from: ws8  reason: default package */
/* loaded from: classes3.dex */
public final class ws8 implements no3<ut8> {
    private final as8<Context> a;

    public ws8(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static ws8 a(as8<Context> as8Var) {
        return new ws8(as8Var);
    }

    public static ut8 c(Context context) {
        return (ut8) jh8.e(vs8.a.a(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ut8 get() {
        return c(this.a.get());
    }
}
