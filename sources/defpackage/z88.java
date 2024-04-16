package defpackage;
/* compiled from: PizzeriaMapperImpl_Factory.java */
/* renamed from: z88  reason: default package */
/* loaded from: classes2.dex */
public final class z88 implements no3<y88> {
    private final as8<pv9> a;
    private final as8<r43> b;
    private final as8<n43> c;

    public z88(as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static z88 a(as8<pv9> as8Var, as8<r43> as8Var2, as8<n43> as8Var3) {
        return new z88(as8Var, as8Var2, as8Var3);
    }

    public static y88 c(pv9 pv9Var, r43 r43Var, n43 n43Var) {
        return new y88(pv9Var, r43Var, n43Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public y88 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
