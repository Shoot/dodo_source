package defpackage;
/* compiled from: StateConverterImpl_Factory.java */
/* renamed from: iua  reason: default package */
/* loaded from: classes4.dex */
public final class iua implements no3<hua> {
    private final as8<hq0> a;
    private final as8<fda> b;

    public iua(as8<hq0> as8Var, as8<fda> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static iua a(as8<hq0> as8Var, as8<fda> as8Var2) {
        return new iua(as8Var, as8Var2);
    }

    public static hua c(hq0 hq0Var, fda fdaVar) {
        return new hua(hq0Var, fdaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hua get() {
        return c(this.a.get(), this.b.get());
    }
}
