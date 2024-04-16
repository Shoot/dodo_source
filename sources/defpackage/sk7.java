package defpackage;
/* compiled from: OrderTypeDiscountModule_ProvideOrderTypeDiscountServiceFactory.java */
/* renamed from: sk7  reason: default package */
/* loaded from: classes3.dex */
public final class sk7 implements no3<tk7> {
    private final as8<dt5> a;
    private final as8<rt5> b;

    public sk7(as8<dt5> as8Var, as8<rt5> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static sk7 a(as8<dt5> as8Var, as8<rt5> as8Var2) {
        return new sk7(as8Var, as8Var2);
    }

    public static tk7 c(dt5 dt5Var, rt5 rt5Var) {
        return (tk7) jh8.e(qk7.a.b(dt5Var, rt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tk7 get() {
        return c(this.a.get(), this.b.get());
    }
}
