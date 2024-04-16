package defpackage;

import android.content.Context;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: ApiCheckService_Factory.java */
/* renamed from: hm  reason: default package */
/* loaded from: classes4.dex */
public final class hm implements no3<fm> {
    private final as8<bo> a;
    private final as8<vc6> b;
    private final as8<Context> c;
    private final as8<mh0> d;
    private final as8<DodopizzaApi> e;

    public hm(as8<bo> as8Var, as8<vc6> as8Var2, as8<Context> as8Var3, as8<mh0> as8Var4, as8<DodopizzaApi> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static hm a(as8<bo> as8Var, as8<vc6> as8Var2, as8<Context> as8Var3, as8<mh0> as8Var4, as8<DodopizzaApi> as8Var5) {
        return new hm(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static fm c(bo boVar, vc6 vc6Var, Context context, mh0 mh0Var, as8<DodopizzaApi> as8Var) {
        return new fm(boVar, vc6Var, context, mh0Var, as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fm get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
