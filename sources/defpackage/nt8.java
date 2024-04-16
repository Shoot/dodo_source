package defpackage;

import android.content.Context;
/* compiled from: PushNotificationManager_Factory.java */
/* renamed from: nt8  reason: default package */
/* loaded from: classes3.dex */
public final class nt8 implements no3<mt8> {
    private final as8<Context> a;
    private final as8<ih> b;

    public nt8(as8<Context> as8Var, as8<ih> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static nt8 a(as8<Context> as8Var, as8<ih> as8Var2) {
        return new nt8(as8Var, as8Var2);
    }

    public static mt8 c(Context context, ih ihVar) {
        return new mt8(context, ihVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mt8 get() {
        return c(this.a.get(), this.b.get());
    }
}
