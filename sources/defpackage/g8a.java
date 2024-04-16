package defpackage;
/* compiled from: SelectPizzeriaModule_ProvideMapperFactory.java */
/* renamed from: g8a  reason: default package */
/* loaded from: classes3.dex */
public final class g8a implements no3<x88> {
    private final d8a a;
    private final as8<pv9> b;
    private final as8<r43> c;
    private final as8<n43> d;

    public g8a(d8a d8aVar, as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        this.a = d8aVar;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
    }

    public static g8a a(d8a d8aVar, as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        return new g8a(d8aVar, as8Var, as8Var2, as8Var3);
    }

    public static x88 c(d8a d8aVar, pv9 pv9Var, r43 r43Var, n43 n43Var) {
        return (x88) jh8.e(d8aVar.c(pv9Var, r43Var, n43Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x88 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
