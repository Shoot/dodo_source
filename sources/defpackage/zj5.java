package defpackage;
/* compiled from: LandingModule_ProvideLandingInteractorFactory.java */
/* renamed from: zj5  reason: default package */
/* loaded from: classes3.dex */
public final class zj5 implements no3<rj5> {
    private final as8<String> a;
    private final as8<String> b;
    private final as8<ml5> c;
    private final as8<uj5> d;

    public zj5(as8<String> as8Var, as8<String> as8Var2, as8<ml5> as8Var3, as8<uj5> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static zj5 a(as8<String> as8Var, as8<String> as8Var2, as8<ml5> as8Var3, as8<uj5> as8Var4) {
        return new zj5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static rj5 c(String str, String str2, ml5 ml5Var, uj5 uj5Var) {
        return (rj5) jh8.e(vj5.a.a(str, str2, ml5Var, uj5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rj5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
