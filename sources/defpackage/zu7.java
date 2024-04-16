package defpackage;

import android.content.Context;
/* compiled from: PaymentModule_ProvideGooglePaymentsClientWrapperFactory.java */
/* renamed from: zu7  reason: default package */
/* loaded from: classes3.dex */
public final class zu7 implements no3<fh4> {
    private final as8<Context> a;

    public zu7(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static zu7 a(as8<Context> as8Var) {
        return new zu7(as8Var);
    }

    public static fh4 c(Context context) {
        return (fh4) jh8.e(gu7.a.s(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fh4 get() {
        return c(this.a.get());
    }
}
