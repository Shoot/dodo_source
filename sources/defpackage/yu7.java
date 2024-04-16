package defpackage;
/* compiled from: PaymentModule_ProvideGooglePaymentServiceFactory.java */
/* renamed from: yu7  reason: default package */
/* loaded from: classes3.dex */
public final class yu7 implements no3<dh4> {
    private final as8<fh4> a;
    private final as8<kh4> b;
    private final as8<zg4> c;

    public yu7(as8<fh4> as8Var, as8<kh4> as8Var2, as8<zg4> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static yu7 a(as8<fh4> as8Var, as8<kh4> as8Var2, as8<zg4> as8Var3) {
        return new yu7(as8Var, as8Var2, as8Var3);
    }

    public static dh4 c(fh4 fh4Var, kh4 kh4Var, zg4 zg4Var) {
        return (dh4) jh8.e(gu7.a.r(fh4Var, kh4Var, zg4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dh4 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
