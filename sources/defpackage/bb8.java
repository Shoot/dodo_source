package defpackage;
/* compiled from: PizzeriasModule_ProvideScheduleHelperFactory.java */
/* renamed from: bb8  reason: default package */
/* loaded from: classes3.dex */
public final class bb8 implements no3<pv9> {
    private final as8<f5b> a;

    public bb8(as8<f5b> as8Var) {
        this.a = as8Var;
    }

    public static bb8 a(as8<f5b> as8Var) {
        return new bb8(as8Var);
    }

    public static pv9 c(f5b f5bVar) {
        return (pv9) jh8.e(ya8.a.c(f5bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pv9 get() {
        return c(this.a.get());
    }
}
