package defpackage;
/* compiled from: UnexpectedLogoutInteractor_Factory.java */
/* renamed from: nqb  reason: default package */
/* loaded from: classes.dex */
public final class nqb implements no3<mqb> {
    private final as8<i00> a;
    private final as8<gy5> b;
    private final as8<kx1> c;

    public nqb(as8<i00> as8Var, as8<gy5> as8Var2, as8<kx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static nqb a(as8<i00> as8Var, as8<gy5> as8Var2, as8<kx1> as8Var3) {
        return new nqb(as8Var, as8Var2, as8Var3);
    }

    public static mqb c(i00 i00Var, gy5 gy5Var, kx1 kx1Var) {
        return new mqb(i00Var, gy5Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mqb get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
