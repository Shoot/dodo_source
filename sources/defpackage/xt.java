package defpackage;
/* compiled from: AssistantGeneratorResultInteractor_Factory.java */
/* renamed from: xt  reason: default package */
/* loaded from: classes2.dex */
public final class xt implements no3<wt> {
    private final as8<st> a;
    private final as8<gc> b;
    private final as8<ns> c;
    private final as8<kx1> d;

    public xt(as8<st> as8Var, as8<gc> as8Var2, as8<ns> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static xt a(as8<st> as8Var, as8<gc> as8Var2, as8<ns> as8Var3, as8<kx1> as8Var4) {
        return new xt(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static wt c(st stVar, gc gcVar, ns nsVar, kx1 kx1Var) {
        return new wt(stVar, gcVar, nsVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wt get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
