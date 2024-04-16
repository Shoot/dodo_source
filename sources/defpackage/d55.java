package defpackage;

import android.content.Context;
/* compiled from: InstantAppStatusDetector_Factory.java */
/* renamed from: d55  reason: default package */
/* loaded from: classes.dex */
public final class d55 implements no3<c55> {
    private final as8<Context> a;

    public d55(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static d55 a(as8<Context> as8Var) {
        return new d55(as8Var);
    }

    public static c55 c(Context context) {
        return new c55(context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c55 get() {
        return c(this.a.get());
    }
}
