package defpackage;
/* compiled from: ComboProductCardModule_ProvideBuyMoreInfoInteractorFactory.java */
/* renamed from: wh1  reason: default package */
/* loaded from: classes3.dex */
public final class wh1 implements no3<ti0> {
    private final as8<gj0> a;
    private final as8<ava> b;
    private final as8<uja> c;
    private final as8<ah6> d;

    public wh1(as8<gj0> as8Var, as8<ava> as8Var2, as8<uja> as8Var3, as8<ah6> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static wh1 a(as8<gj0> as8Var, as8<ava> as8Var2, as8<uja> as8Var3, as8<ah6> as8Var4) {
        return new wh1(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ti0 c(gj0 gj0Var, ava avaVar, uja ujaVar, ah6 ah6Var) {
        return (ti0) jh8.e(vh1.a.a(gj0Var, avaVar, ujaVar, ah6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ti0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
