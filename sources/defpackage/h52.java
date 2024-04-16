package defpackage;
/* compiled from: CustomerModule_ProvideAddressFormatterFactory.java */
/* renamed from: h52  reason: default package */
/* loaded from: classes3.dex */
public final class h52 implements no3<h8> {
    private final as8<i8> a;
    private final as8<dt5> b;

    public h52(as8<i8> as8Var, as8<dt5> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static h52 a(as8<i8> as8Var, as8<dt5> as8Var2) {
        return new h52(as8Var, as8Var2);
    }

    public static h8 c(i8 i8Var, dt5 dt5Var) {
        return (h8) jh8.e(g52.a.a(i8Var, dt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h8 get() {
        return c(this.a.get(), this.b.get());
    }
}
