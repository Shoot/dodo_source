package defpackage;
/* compiled from: CommonModule_ProvideSelectedDeliveryAddressHandlerFactory.java */
/* renamed from: zj1  reason: default package */
/* loaded from: classes2.dex */
public final class zj1 implements no3<k9a> {
    private final as8<re4> a;
    private final as8<jv5> b;
    private final as8<sj1> c;
    private final as8<j9a> d;

    public zj1(as8<re4> as8Var, as8<jv5> as8Var2, as8<sj1> as8Var3, as8<j9a> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static zj1 a(as8<re4> as8Var, as8<jv5> as8Var2, as8<sj1> as8Var3, as8<j9a> as8Var4) {
        return new zj1(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static k9a c(re4 re4Var, jv5 jv5Var, sj1 sj1Var, j9a j9aVar) {
        return (k9a) jh8.e(yj1.a.a(re4Var, jv5Var, sj1Var, j9aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public k9a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
