package defpackage;

import android.content.Context;
/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* renamed from: iw9  reason: default package */
/* loaded from: classes2.dex */
public final class iw9 implements oo3<t7c> {
    private final as8<Context> a;
    private final as8<el3> b;
    private final as8<zv9> c;
    private final as8<x91> d;

    public iw9(as8<Context> as8Var, as8<el3> as8Var2, as8<zv9> as8Var3, as8<x91> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static iw9 a(as8<Context> as8Var, as8<el3> as8Var2, as8<zv9> as8Var3, as8<x91> as8Var4) {
        return new iw9(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static t7c c(Context context, el3 el3Var, zv9 zv9Var, x91 x91Var) {
        return (t7c) fh8.c(hw9.a(context, el3Var, zv9Var, x91Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t7c get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
