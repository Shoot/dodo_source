package defpackage;

import java.util.Collection;
/* compiled from: PaymentModule_ProvidePaymentWayAcquirerFilterFactory.java */
/* renamed from: mv7  reason: default package */
/* loaded from: classes3.dex */
public final class mv7 implements no3<kw7> {
    private final as8<Collection<String>> a;

    public mv7(as8<Collection<String>> as8Var) {
        this.a = as8Var;
    }

    public static mv7 a(as8<Collection<String>> as8Var) {
        return new mv7(as8Var);
    }

    public static kw7 c(Collection<String> collection) {
        return (kw7) jh8.e(gu7.a.F(collection));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kw7 get() {
        return c(this.a.get());
    }
}
