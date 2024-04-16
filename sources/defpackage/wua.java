package defpackage;
/* compiled from: StateModule_ProvideOrderPizzeriaDebugStateServiceFactory.java */
/* renamed from: wua  reason: default package */
/* loaded from: classes3.dex */
public final class wua implements no3<ug7> {
    private final as8<k63> a;
    private final as8<a98> b;

    public wua(as8<k63> as8Var, as8<a98> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static wua a(as8<k63> as8Var, as8<a98> as8Var2) {
        return new wua(as8Var, as8Var2);
    }

    public static ug7 c(k63 k63Var, a98 a98Var) {
        return (ug7) jh8.e(vua.a.a(k63Var, a98Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ug7 get() {
        return c(this.a.get(), this.b.get());
    }
}
