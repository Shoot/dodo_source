package defpackage;
/* compiled from: HeadersFillerInterceptor_Factory.java */
/* renamed from: in4  reason: default package */
/* loaded from: classes3.dex */
public final class in4 implements no3<hn4> {
    private final as8<f89> a;
    private final as8<e00> b;
    private final as8<jv5> c;
    private final as8<s13> d;
    private final as8<mh0> e;
    private final as8<i32> f;

    public in4(as8<f89> as8Var, as8<e00> as8Var2, as8<jv5> as8Var3, as8<s13> as8Var4, as8<mh0> as8Var5, as8<i32> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static in4 a(as8<f89> as8Var, as8<e00> as8Var2, as8<jv5> as8Var3, as8<s13> as8Var4, as8<mh0> as8Var5, as8<i32> as8Var6) {
        return new in4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static hn4 c(f89 f89Var, e00 e00Var, jv5 jv5Var, s13 s13Var, mh0 mh0Var, i32 i32Var) {
        return new hn4(f89Var, e00Var, jv5Var, s13Var, mh0Var, i32Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hn4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
