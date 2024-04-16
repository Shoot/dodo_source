package defpackage;

import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: CommonAddressModule_ProvideStreetAutocompleteInteractorFactory.java */
/* renamed from: qj1  reason: default package */
/* loaded from: classes3.dex */
public final class qj1 implements no3<dza> {
    private final as8<DodopizzaApi> a;
    private final as8<jv5> b;
    private final as8<dt5> c;

    public qj1(as8<DodopizzaApi> as8Var, as8<jv5> as8Var2, as8<dt5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static qj1 a(as8<DodopizzaApi> as8Var, as8<jv5> as8Var2, as8<dt5> as8Var3) {
        return new qj1(as8Var, as8Var2, as8Var3);
    }

    public static dza c(DodopizzaApi dodopizzaApi, jv5 jv5Var, dt5 dt5Var) {
        return (dza) jh8.e(mj1.a.d(dodopizzaApi, jv5Var, dt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dza get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
