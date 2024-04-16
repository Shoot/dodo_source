package defpackage;
/* compiled from: TransportRuntime_Factory.java */
/* renamed from: nmb  reason: default package */
/* loaded from: classes2.dex */
public final class nmb implements oo3<lmb> {
    private final as8<x91> a;
    private final as8<x91> b;
    private final as8<wv9> c;
    private final as8<isb> d;
    private final as8<e7c> e;

    public nmb(as8<x91> as8Var, as8<x91> as8Var2, as8<wv9> as8Var3, as8<isb> as8Var4, as8<e7c> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static nmb a(as8<x91> as8Var, as8<x91> as8Var2, as8<wv9> as8Var3, as8<isb> as8Var4, as8<e7c> as8Var5) {
        return new nmb(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static lmb c(x91 x91Var, x91 x91Var2, wv9 wv9Var, isb isbVar, e7c e7cVar) {
        return new lmb(x91Var, x91Var2, wv9Var, isbVar, e7cVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lmb get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
