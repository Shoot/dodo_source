package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
/* compiled from: FirebasePerformance_Factory.java */
/* renamed from: gx3  reason: default package */
/* loaded from: classes2.dex */
public final class gx3 implements no3<vw3> {
    private final as8<qv3> a;
    private final as8<bs8<c>> b;
    private final as8<ew3> c;
    private final as8<bs8<xlb>> d;
    private final as8<RemoteConfigManager> e;
    private final as8<a> f;
    private final as8<SessionManager> g;

    public gx3(as8<qv3> as8Var, as8<bs8<c>> as8Var2, as8<ew3> as8Var3, as8<bs8<xlb>> as8Var4, as8<RemoteConfigManager> as8Var5, as8<a> as8Var6, as8<SessionManager> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static gx3 a(as8<qv3> as8Var, as8<bs8<c>> as8Var2, as8<ew3> as8Var3, as8<bs8<xlb>> as8Var4, as8<RemoteConfigManager> as8Var5, as8<a> as8Var6, as8<SessionManager> as8Var7) {
        return new gx3(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static vw3 c(qv3 qv3Var, bs8<c> bs8Var, ew3 ew3Var, bs8<xlb> bs8Var2, RemoteConfigManager remoteConfigManager, a aVar, SessionManager sessionManager) {
        return new vw3(qv3Var, bs8Var, ew3Var, bs8Var2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vw3 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
