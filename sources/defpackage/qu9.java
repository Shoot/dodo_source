package defpackage;

import com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter;
/* compiled from: SbpBankListModule_ProvideSbpBankListPresenterFactory.java */
/* renamed from: qu9  reason: default package */
/* loaded from: classes2.dex */
public final class qu9 implements no3<SbpBankListPresenter> {
    private final as8<cl2<ou9>> a;
    private final as8<lu9> b;
    private final as8<su9> c;
    private final as8<gc> d;
    private final as8<String> e;
    private final as8<j2c> f;

    public qu9(as8<cl2<ou9>> as8Var, as8<lu9> as8Var2, as8<su9> as8Var3, as8<gc> as8Var4, as8<String> as8Var5, as8<j2c> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static qu9 a(as8<cl2<ou9>> as8Var, as8<lu9> as8Var2, as8<su9> as8Var3, as8<gc> as8Var4, as8<String> as8Var5, as8<j2c> as8Var6) {
        return new qu9(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static SbpBankListPresenter c(cl2<ou9> cl2Var, lu9 lu9Var, su9 su9Var, gc gcVar, String str, j2c j2cVar) {
        return (SbpBankListPresenter) jh8.e(pu9.a.a(cl2Var, lu9Var, su9Var, gcVar, str, j2cVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SbpBankListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
