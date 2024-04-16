package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import defpackage.gs2;
import defpackage.jc;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: AnalyticsDeferredProxy.java */
/* renamed from: pc  reason: default package */
/* loaded from: classes2.dex */
public class pc {
    private final gs2<jc> a;
    private volatile sc b;
    private volatile tf0 c;
    private final List<sf0> d;

    public pc(gs2<jc> gs2Var) {
        this(gs2Var, new u23(), new eqb());
    }

    private void f() {
        this.a.a(new gs2.a() { // from class: oc
            @Override // defpackage.gs2.a
            public final void a(bs8 bs8Var) {
                pc.this.i(bs8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(sf0 sf0Var) {
        synchronized (this) {
            try {
                if (this.c instanceof u23) {
                    this.d.add(sf0Var);
                }
                this.c.a(sf0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(bs8 bs8Var) {
        rx5.f().b("AnalyticsConnector now available.");
        jc jcVar = (jc) bs8Var.get();
        g12 g12Var = new g12(jcVar);
        r02 r02Var = new r02();
        if (j(jcVar, r02Var) != null) {
            rx5.f().b("Registered Firebase Analytics listener.");
            rf0 rf0Var = new rf0();
            sd0 sd0Var = new sd0(g12Var, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    for (sf0 sf0Var : this.d) {
                        rf0Var.a(sf0Var);
                    }
                    r02Var.d(rf0Var);
                    r02Var.e(sd0Var);
                    this.c = rf0Var;
                    this.b = sd0Var;
                } finally {
                }
            }
            return;
        }
        rx5.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static jc.a j(@NonNull jc jcVar, @NonNull r02 r02Var) {
        jc.a e = jcVar.e("clx", r02Var);
        if (e == null) {
            rx5.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            e = jcVar.e(CrashHianalyticsData.EVENT_ID_CRASH, r02Var);
            if (e != null) {
                rx5.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return e;
    }

    public sc d() {
        return new sc() { // from class: nc
            @Override // defpackage.sc
            public final void a(String str, Bundle bundle) {
                pc.this.g(str, bundle);
            }
        };
    }

    public tf0 e() {
        return new tf0() { // from class: mc
            @Override // defpackage.tf0
            public final void a(sf0 sf0Var) {
                pc.this.h(sf0Var);
            }
        };
    }

    public pc(gs2<jc> gs2Var, @NonNull tf0 tf0Var, @NonNull sc scVar) {
        this.a = gs2Var;
        this.c = tf0Var;
        this.d = new ArrayList();
        this.b = scVar;
        f();
    }
}
