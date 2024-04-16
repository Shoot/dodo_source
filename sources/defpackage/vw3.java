package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: FirebasePerformance.java */
/* renamed from: vw3  reason: default package */
/* loaded from: classes2.dex */
public class vw3 {
    private static final sh i = sh.e();
    private final Map<String, String> a = new ConcurrentHashMap();
    private final a b;
    private final tw4 c;
    private Boolean d;
    private final qv3 e;
    private final bs8<c> f;
    private final ew3 g;
    private final bs8<xlb> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vw3(qv3 qv3Var, bs8<c> bs8Var, ew3 ew3Var, bs8<xlb> bs8Var2, RemoteConfigManager remoteConfigManager, a aVar, SessionManager sessionManager) {
        this.d = null;
        this.e = qv3Var;
        this.f = bs8Var;
        this.g = ew3Var;
        this.h = bs8Var2;
        if (qv3Var == null) {
            this.d = Boolean.FALSE;
            this.b = aVar;
            this.c = new tw4(new Bundle());
            return;
        }
        jmb.k().r(qv3Var, ew3Var, bs8Var2);
        Context k = qv3Var.k();
        tw4 a = a(k);
        this.c = a;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bs8Var);
        this.b = aVar;
        aVar.P(a);
        aVar.O(k);
        sessionManager.setApplicationContext(k);
        this.d = aVar.j();
        sh shVar = i;
        if (shVar.h() && d()) {
            shVar.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", cr1.b(qv3Var.n().e(), k.getPackageName())));
        }
    }

    private static tw4 a(Context context) {
        Bundle bundle;
        tw4 tw4Var;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            tw4Var = new tw4(bundle);
        } else {
            tw4Var = new tw4();
        }
        return tw4Var;
    }

    @NonNull
    public static vw3 c() {
        return (vw3) qv3.l().j(vw3.class);
    }

    @NonNull
    public Map<String, String> b() {
        return new HashMap(this.a);
    }

    public boolean d() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return qv3.l().t();
    }

    @NonNull
    public Trace e(@NonNull String str) {
        return Trace.c(str);
    }
}
