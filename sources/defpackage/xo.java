package defpackage;

import com.dodopizza.android.applicationstate.AppStateManager;
/* compiled from: AppScopeLifecycleHandler_Factory.java */
/* renamed from: xo  reason: default package */
/* loaded from: classes3.dex */
public final class xo implements no3<wo> {
    private final as8<AppStateManager> a;
    private final as8<kq> b;
    private final as8<Cdo> c;
    private final as8<qx1> d;

    public xo(as8<AppStateManager> as8Var, as8<kq> as8Var2, as8<Cdo> as8Var3, as8<qx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static xo a(as8<AppStateManager> as8Var, as8<kq> as8Var2, as8<Cdo> as8Var3, as8<qx1> as8Var4) {
        return new xo(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static wo c(AppStateManager appStateManager, kq kqVar, Cdo cdo, qx1 qx1Var) {
        return new wo(appStateManager, kqVar, cdo, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wo get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
