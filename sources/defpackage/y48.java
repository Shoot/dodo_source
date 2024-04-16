package defpackage;

import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter;
/* compiled from: PhonePrefixModule_ProvidePresenterFactory.java */
/* renamed from: y48  reason: default package */
/* loaded from: classes3.dex */
public final class y48 implements no3<PhonePrefixListPresenter> {
    private final as8<b7a> a;
    private final as8<r48> b;
    private final as8<f63> c;

    public y48(as8<b7a> as8Var, as8<r48> as8Var2, as8<f63> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static y48 a(as8<b7a> as8Var, as8<r48> as8Var2, as8<f63> as8Var3) {
        return new y48(as8Var, as8Var2, as8Var3);
    }

    public static PhonePrefixListPresenter c(b7a b7aVar, r48 r48Var, f63 f63Var) {
        return (PhonePrefixListPresenter) jh8.e(v48.a.c(b7aVar, r48Var, f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PhonePrefixListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
