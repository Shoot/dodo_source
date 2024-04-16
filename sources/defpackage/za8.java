package defpackage;
/* compiled from: PizzeriasModule_ProvidePizzeriaRepositoryFactory.java */
/* renamed from: za8  reason: default package */
/* loaded from: classes3.dex */
public final class za8 implements no3<a98> {
    private final as8<ml0> a;

    public za8(as8<ml0> as8Var) {
        this.a = as8Var;
    }

    public static za8 a(as8<ml0> as8Var) {
        return new za8(as8Var);
    }

    public static a98 c(ml0 ml0Var) {
        return (a98) jh8.e(ya8.a.a(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a98 get() {
        return c(this.a.get());
    }
}
