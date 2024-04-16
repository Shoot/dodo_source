package defpackage;

import android.content.Context;
/* compiled from: InAppStoryInitializerImpl_Factory.java */
/* renamed from: jz4  reason: default package */
/* loaded from: classes2.dex */
public final class jz4 implements no3<iz4> {
    private final as8<Context> a;
    private final as8<nz4> b;
    private final as8<t52> c;
    private final as8<i32> d;
    private final as8<cz4> e;

    public jz4(as8<Context> as8Var, as8<nz4> as8Var2, as8<t52> as8Var3, as8<i32> as8Var4, as8<cz4> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static jz4 a(as8<Context> as8Var, as8<nz4> as8Var2, as8<t52> as8Var3, as8<i32> as8Var4, as8<cz4> as8Var5) {
        return new jz4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static iz4 c(Context context, nz4 nz4Var, t52 t52Var, i32 i32Var, cz4 cz4Var) {
        return new iz4(context, nz4Var, t52Var, i32Var, cz4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public iz4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
