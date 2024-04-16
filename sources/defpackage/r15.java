package defpackage;

import com.dodopizza.android.applicationstate.AppStateManager;
/* compiled from: InfrastructureModule_ProvideAppStateProviderFactory.java */
/* renamed from: r15  reason: default package */
/* loaded from: classes3.dex */
public final class r15 implements no3<hp> {
    private final m15 a;
    private final as8<AppStateManager> b;

    public r15(m15 m15Var, as8<AppStateManager> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static r15 a(m15 m15Var, as8<AppStateManager> as8Var) {
        return new r15(m15Var, as8Var);
    }

    public static hp c(m15 m15Var, AppStateManager appStateManager) {
        return (hp) jh8.e(m15Var.h(appStateManager));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hp get() {
        return c(this.a, this.b.get());
    }
}
