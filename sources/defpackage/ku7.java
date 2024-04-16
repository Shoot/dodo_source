package defpackage;
/* compiled from: PaymentModule_ProvideAllSecureOkHttpClientFactory.java */
/* renamed from: ku7  reason: default package */
/* loaded from: classes3.dex */
public final class ku7 implements no3<b77> {
    private final as8<rn2> a;

    public ku7(as8<rn2> as8Var) {
        this.a = as8Var;
    }

    public static ku7 a(as8<rn2> as8Var) {
        return new ku7(as8Var);
    }

    public static b77 c(rn2 rn2Var) {
        return (b77) jh8.e(gu7.a.d(rn2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b77 get() {
        return c(this.a.get());
    }
}
