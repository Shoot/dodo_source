package defpackage;
/* compiled from: CustomerModule_ProvideDeliverablePlaceFormatterFactory.java */
/* renamed from: j52  reason: default package */
/* loaded from: classes3.dex */
public final class j52 implements no3<pu2> {
    private final as8<h8> a;
    private final as8<ly2> b;

    public j52(as8<h8> as8Var, as8<ly2> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static j52 a(as8<h8> as8Var, as8<ly2> as8Var2) {
        return new j52(as8Var, as8Var2);
    }

    public static pu2 c(h8 h8Var, ly2 ly2Var) {
        return (pu2) jh8.e(g52.a.c(h8Var, ly2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pu2 get() {
        return c(this.a.get(), this.b.get());
    }
}
