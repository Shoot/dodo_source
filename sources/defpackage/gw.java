package defpackage;
/* compiled from: AssistantSharingInteractor_Factory.java */
/* renamed from: gw  reason: default package */
/* loaded from: classes2.dex */
public final class gw implements no3<fw> {
    private final as8<bw> a;
    private final as8<hq3> b;
    private final as8<kx1> c;

    public gw(as8<bw> as8Var, as8<hq3> as8Var2, as8<kx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static gw a(as8<bw> as8Var, as8<hq3> as8Var2, as8<kx1> as8Var3) {
        return new gw(as8Var, as8Var2, as8Var3);
    }

    public static fw c(bw bwVar, hq3 hq3Var, kx1 kx1Var) {
        return new fw(bwVar, hq3Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fw get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
