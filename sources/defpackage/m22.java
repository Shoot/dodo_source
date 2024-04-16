package defpackage;

import android.content.Context;
/* compiled from: CreationContextFactory_Factory.java */
/* renamed from: m22  reason: default package */
/* loaded from: classes2.dex */
public final class m22 implements oo3<l22> {
    private final as8<Context> a;
    private final as8<x91> b;
    private final as8<x91> c;

    public m22(as8<Context> as8Var, as8<x91> as8Var2, as8<x91> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static m22 a(as8<Context> as8Var, as8<x91> as8Var2, as8<x91> as8Var3) {
        return new m22(as8Var, as8Var2, as8Var3);
    }

    public static l22 c(Context context, x91 x91Var, x91 x91Var2) {
        return new l22(context, x91Var, x91Var2);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public l22 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
