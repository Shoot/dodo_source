package defpackage;

import java.util.concurrent.Executor;
/* compiled from: DefaultScheduler_Factory.java */
/* renamed from: rr2  reason: default package */
/* loaded from: classes2.dex */
public final class rr2 implements oo3<qr2> {
    private final as8<Executor> a;
    private final as8<a60> b;
    private final as8<t7c> c;
    private final as8<el3> d;
    private final as8<t3b> e;

    public rr2(as8<Executor> as8Var, as8<a60> as8Var2, as8<t7c> as8Var3, as8<el3> as8Var4, as8<t3b> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static rr2 a(as8<Executor> as8Var, as8<a60> as8Var2, as8<t7c> as8Var3, as8<el3> as8Var4, as8<t3b> as8Var5) {
        return new rr2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static qr2 c(Executor executor, a60 a60Var, t7c t7cVar, el3 el3Var, t3b t3bVar) {
        return new qr2(executor, a60Var, t7cVar, el3Var, t3bVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qr2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
