package defpackage;

import com.dodopizza.auth.features.legaldocuments.presentation.LegalDocumentsPresenter;
/* compiled from: LegalDocumentsPresenter_Factory.java */
/* renamed from: to5  reason: default package */
/* loaded from: classes.dex */
public final class to5 implements no3<LegalDocumentsPresenter> {
    private final as8<qo5> a;
    private final as8<f63> b;
    private final as8<hq3> c;

    public to5(as8<qo5> as8Var, as8<f63> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static to5 a(as8<qo5> as8Var, as8<f63> as8Var2, as8<hq3> as8Var3) {
        return new to5(as8Var, as8Var2, as8Var3);
    }

    public static LegalDocumentsPresenter c(qo5 qo5Var, f63 f63Var, hq3 hq3Var) {
        return new LegalDocumentsPresenter(qo5Var, f63Var, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LegalDocumentsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
