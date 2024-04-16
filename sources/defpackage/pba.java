package defpackage;

import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: SendFeedbackInteractor_Factory.java */
/* renamed from: pba  reason: default package */
/* loaded from: classes.dex */
public final class pba implements no3<oba> {
    private final as8<ava> a;
    private final as8<DodopizzaApi> b;
    private final as8<dt5> c;

    public pba(as8<ava> as8Var, as8<DodopizzaApi> as8Var2, as8<dt5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static pba a(as8<ava> as8Var, as8<DodopizzaApi> as8Var2, as8<dt5> as8Var3) {
        return new pba(as8Var, as8Var2, as8Var3);
    }

    public static oba c(ava avaVar, DodopizzaApi dodopizzaApi, dt5 dt5Var) {
        return new oba(avaVar, dodopizzaApi, dt5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public oba get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
