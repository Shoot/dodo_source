package defpackage;

import java.util.concurrent.Executor;
/* compiled from: WorkInitializer_Factory.java */
/* renamed from: f7c  reason: default package */
/* loaded from: classes2.dex */
public final class f7c implements oo3<e7c> {
    private final as8<Executor> a;
    private final as8<el3> b;
    private final as8<t7c> c;
    private final as8<t3b> d;

    public f7c(as8<Executor> as8Var, as8<el3> as8Var2, as8<t7c> as8Var3, as8<t3b> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static f7c a(as8<Executor> as8Var, as8<el3> as8Var2, as8<t7c> as8Var3, as8<t3b> as8Var4) {
        return new f7c(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static e7c c(Executor executor, el3 el3Var, t7c t7cVar, t3b t3bVar) {
        return new e7c(executor, el3Var, t7cVar, t3bVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e7c get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
