package defpackage;
/* compiled from: HalvesConstructorInteractor_Factory.java */
/* renamed from: mk4  reason: default package */
/* loaded from: classes2.dex */
public final class mk4 implements no3<lk4> {
    private final as8<ah6> a;
    private final as8<e78> b;
    private final as8<qm8> c;

    public mk4(as8<ah6> as8Var, as8<e78> as8Var2, as8<qm8> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static mk4 a(as8<ah6> as8Var, as8<e78> as8Var2, as8<qm8> as8Var3) {
        return new mk4(as8Var, as8Var2, as8Var3);
    }

    public static lk4 c(ah6 ah6Var, e78 e78Var, qm8 qm8Var) {
        return new lk4(ah6Var, e78Var, qm8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lk4 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
