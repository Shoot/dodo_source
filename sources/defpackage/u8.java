package defpackage;
/* compiled from: AddressListModule_ProvideAddressListRouterFactory.java */
/* renamed from: u8  reason: default package */
/* loaded from: classes3.dex */
public final class u8 implements no3<y8> {
    private final as8<f63> a;
    private final as8<s8> b;
    private final as8<dt5> c;
    private final as8<fq0> d;

    public u8(as8<f63> as8Var, as8<s8> as8Var2, as8<dt5> as8Var3, as8<fq0> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static u8 a(as8<f63> as8Var, as8<s8> as8Var2, as8<dt5> as8Var3, as8<fq0> as8Var4) {
        return new u8(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static y8 c(f63 f63Var, s8 s8Var, dt5 dt5Var, fq0 fq0Var) {
        return (y8) jh8.e(t8.a.a(f63Var, s8Var, dt5Var, fq0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public y8 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
