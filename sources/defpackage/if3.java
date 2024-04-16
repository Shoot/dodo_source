package defpackage;

import ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter;
/* compiled from: EmailForChecksModule_ProvidePresenterFactory.java */
/* renamed from: if3  reason: default package */
/* loaded from: classes3.dex */
public final class if3 implements no3<EmailForChecksPresenter> {
    private final as8<String> a;
    private final as8<Boolean> b;
    private final as8<f63> c;

    public if3(as8<String> as8Var, as8<Boolean> as8Var2, as8<f63> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static if3 a(as8<String> as8Var, as8<Boolean> as8Var2, as8<f63> as8Var3) {
        return new if3(as8Var, as8Var2, as8Var3);
    }

    public static EmailForChecksPresenter c(String str, boolean z, f63 f63Var) {
        return (EmailForChecksPresenter) jh8.e(hf3.a.a(str, z, f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public EmailForChecksPresenter get() {
        return c(this.a.get(), this.b.get().booleanValue(), this.c.get());
    }
}
