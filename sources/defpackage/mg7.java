package defpackage;
/* compiled from: OrderMapper_Factory.java */
/* renamed from: mg7  reason: default package */
/* loaded from: classes3.dex */
public final class mg7 implements no3<lg7> {
    private final as8<pgb> a;
    private final as8<a98> b;

    public mg7(as8<pgb> as8Var, as8<a98> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static mg7 a(as8<pgb> as8Var, as8<a98> as8Var2) {
        return new mg7(as8Var, as8Var2);
    }

    public static lg7 c(pgb pgbVar, a98 a98Var) {
        return new lg7(pgbVar, a98Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lg7 get() {
        return c(this.a.get(), this.b.get());
    }
}
