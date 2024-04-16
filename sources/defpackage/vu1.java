package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: ContextModule_ProvideResourcesFactory.java */
/* renamed from: vu1  reason: default package */
/* loaded from: classes3.dex */
public final class vu1 implements no3<Resources> {
    private final as8<Context> a;

    public vu1(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static vu1 a(as8<Context> as8Var) {
        return new vu1(as8Var);
    }

    public static Resources c(Context context) {
        return (Resources) jh8.e(lu1.a.j(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Resources get() {
        return c(this.a.get());
    }
}
