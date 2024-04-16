package defpackage;
/* compiled from: PizzeriasModule_ProvidePizzeriaServiceFactory.java */
/* renamed from: ab8  reason: default package */
/* loaded from: classes3.dex */
public final class ab8 implements no3<e98> {
    private final as8<f98> a;

    public ab8(as8<f98> as8Var) {
        this.a = as8Var;
    }

    public static ab8 a(as8<f98> as8Var) {
        return new ab8(as8Var);
    }

    public static e98 c(f98 f98Var) {
        return (e98) jh8.e(ya8.a.b(f98Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e98 get() {
        return c(this.a.get());
    }
}
