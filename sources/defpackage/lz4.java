package defpackage;

import android.content.Context;
/* compiled from: InAppStoryNavigator_Factory.java */
/* renamed from: lz4  reason: default package */
/* loaded from: classes2.dex */
public final class lz4 implements no3<kz4> {
    private final as8<Context> a;
    private final as8<hq3> b;
    private final as8<qx1> c;
    private final as8<nz4> d;
    private final as8<kx1> e;

    public lz4(as8<Context> as8Var, as8<hq3> as8Var2, as8<qx1> as8Var3, as8<nz4> as8Var4, as8<kx1> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static lz4 a(as8<Context> as8Var, as8<hq3> as8Var2, as8<qx1> as8Var3, as8<nz4> as8Var4, as8<kx1> as8Var5) {
        return new lz4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static kz4 c(Context context, hq3 hq3Var, qx1 qx1Var, nz4 nz4Var, kx1 kx1Var) {
        return new kz4(context, hq3Var, qx1Var, nz4Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kz4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
