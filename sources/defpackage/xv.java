package defpackage;
/* compiled from: AssistantSettingsInteractor_Factory.java */
/* renamed from: xv  reason: default package */
/* loaded from: classes2.dex */
public final class xv implements no3<wv> {
    private final as8<yv> a;
    private final as8<kx1> b;

    public xv(as8<yv> as8Var, as8<kx1> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static xv a(as8<yv> as8Var, as8<kx1> as8Var2) {
        return new xv(as8Var, as8Var2);
    }

    public static wv c(yv yvVar, kx1 kx1Var) {
        return new wv(yvVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wv get() {
        return c(this.a.get(), this.b.get());
    }
}
