package defpackage;
/* compiled from: OrderStateVOConverterImpl_Factory.java */
/* renamed from: si7  reason: default package */
/* loaded from: classes.dex */
public final class si7 implements no3<ri7> {
    private final as8<jgb> a;
    private final as8<f5b> b;
    private final as8<hq3> c;

    public si7(as8<jgb> as8Var, as8<f5b> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static si7 a(as8<jgb> as8Var, as8<f5b> as8Var2, as8<hq3> as8Var3) {
        return new si7(as8Var, as8Var2, as8Var3);
    }

    public static ri7 c(jgb jgbVar, f5b f5bVar, hq3 hq3Var) {
        return new ri7(jgbVar, f5bVar, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ri7 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
