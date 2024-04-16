package defpackage;
/* compiled from: OrderHistoryDetailsRouter_Factory.java */
/* renamed from: qe7  reason: default package */
/* loaded from: classes2.dex */
public final class qe7 implements no3<pe7> {
    private final as8<fe7> a;
    private final as8<f63> b;

    public qe7(as8<fe7> as8Var, as8<f63> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static qe7 a(as8<fe7> as8Var, as8<f63> as8Var2) {
        return new qe7(as8Var, as8Var2);
    }

    public static pe7 c(fe7 fe7Var, f63 f63Var) {
        return new pe7(fe7Var, f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pe7 get() {
        return c(this.a.get(), this.b.get());
    }
}
