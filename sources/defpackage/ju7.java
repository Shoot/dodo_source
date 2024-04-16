package defpackage;

import defpackage.xb;
/* compiled from: PaymentModule_ProvideAllSecureApiFactory.java */
/* renamed from: ju7  reason: default package */
/* loaded from: classes3.dex */
public final class ju7 implements no3<xb.a> {
    private final as8<b77> a;

    public ju7(as8<b77> as8Var) {
        this.a = as8Var;
    }

    public static ju7 a(as8<b77> as8Var) {
        return new ju7(as8Var);
    }

    public static xb.a c(b77 b77Var) {
        return (xb.a) jh8.e(gu7.a.c(b77Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xb.a get() {
        return c(this.a.get());
    }
}
