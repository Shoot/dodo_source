package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
/* compiled from: FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.java */
/* renamed from: dx3  reason: default package */
/* loaded from: classes2.dex */
public final class dx3 implements no3<RemoteConfigManager> {
    private final yw3 a;

    public dx3(yw3 yw3Var) {
        this.a = yw3Var;
    }

    public static dx3 a(yw3 yw3Var) {
        return new dx3(yw3Var);
    }

    public static RemoteConfigManager c(yw3 yw3Var) {
        return (RemoteConfigManager) jh8.c(yw3Var.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.a);
    }
}
