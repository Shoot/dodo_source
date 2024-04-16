package defpackage;
/* compiled from: StateModule_ProvideOrderPizzeriaStateServiceFactory.java */
/* renamed from: xua  reason: default package */
/* loaded from: classes3.dex */
public final class xua implements no3<vg7> {
    private final as8<ug7> a;

    public xua(as8<ug7> as8Var) {
        this.a = as8Var;
    }

    public static xua a(as8<ug7> as8Var) {
        return new xua(as8Var);
    }

    public static vg7 c(ug7 ug7Var) {
        return (vg7) jh8.e(vua.a.b(ug7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vg7 get() {
        return c(this.a.get());
    }
}
