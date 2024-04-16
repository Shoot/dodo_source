package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: Uploader_Factory.java */
/* renamed from: jsb  reason: default package */
/* loaded from: classes2.dex */
public final class jsb implements oo3<isb> {
    private final as8<Context> a;
    private final as8<a60> b;
    private final as8<el3> c;
    private final as8<t7c> d;
    private final as8<Executor> e;
    private final as8<t3b> f;
    private final as8<x91> g;
    private final as8<x91> h;
    private final as8<k91> i;

    public jsb(as8<Context> as8Var, as8<a60> as8Var2, as8<el3> as8Var3, as8<t7c> as8Var4, as8<Executor> as8Var5, as8<t3b> as8Var6, as8<x91> as8Var7, as8<x91> as8Var8, as8<k91> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static jsb a(as8<Context> as8Var, as8<a60> as8Var2, as8<el3> as8Var3, as8<t7c> as8Var4, as8<Executor> as8Var5, as8<t3b> as8Var6, as8<x91> as8Var7, as8<x91> as8Var8, as8<k91> as8Var9) {
        return new jsb(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static isb c(Context context, a60 a60Var, el3 el3Var, t7c t7cVar, Executor executor, t3b t3bVar, x91 x91Var, x91 x91Var2, k91 k91Var) {
        return new isb(context, a60Var, el3Var, t7cVar, executor, t3bVar, x91Var, x91Var2, k91Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public isb get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
