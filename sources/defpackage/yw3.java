package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
/* compiled from: FirebasePerformanceModule.java */
/* renamed from: yw3  reason: default package */
/* loaded from: classes2.dex */
public class yw3 {
    private final qv3 a;
    private final ew3 b;
    private final bs8<c> c;
    private final bs8<xlb> d;

    public yw3(@NonNull qv3 qv3Var, @NonNull ew3 ew3Var, @NonNull bs8<c> bs8Var, @NonNull bs8<xlb> bs8Var2) {
        this.a = qv3Var;
        this.b = ew3Var;
        this.c = bs8Var;
        this.d = bs8Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        return a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qv3 b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ew3 c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bs8<c> d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bs8<xlb> g() {
        return this.d;
    }
}
