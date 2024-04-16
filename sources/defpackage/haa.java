package defpackage;
/* compiled from: SelectionMapModule_ProvideMapperFactory.java */
/* renamed from: haa  reason: default package */
/* loaded from: classes2.dex */
public final class haa implements no3<x88> {
    private final as8<pv9> a;
    private final as8<r43> b;
    private final as8<n43> c;

    public haa(as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static haa a(as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        return new haa(as8Var, as8Var2, as8Var3);
    }

    public static x88 c(pv9 pv9Var, r43 r43Var, n43 n43Var) {
        return (x88) jh8.e(gaa.a.a(pv9Var, r43Var, n43Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x88 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
