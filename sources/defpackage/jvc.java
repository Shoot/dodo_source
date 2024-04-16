package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: jvc  reason: default package */
/* loaded from: classes2.dex */
public class jvc {
    private static volatile jvc j;
    private final String a;
    protected final t91 b;
    private final ExecutorService c;
    private final fo d;
    private final List<Pair<h1d, b>> e;
    private int f;
    private boolean g;
    private String h;
    private volatile guc i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    /* renamed from: jvc$a */
    /* loaded from: classes2.dex */
    public abstract class a implements Runnable {
        final long a;
        final long b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(jvc jvcVar) {
            this(true);
        }

        abstract void a() throws RemoteException;

        @Override // java.lang.Runnable
        public void run() {
            if (jvc.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                jvc.this.l(e, false, this.c);
                b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z) {
            this.a = jvc.this.b.currentTimeMillis();
            this.b = jvc.this.b.b();
            this.c = z;
        }

        protected void b() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    /* renamed from: jvc$b */
    /* loaded from: classes2.dex */
    static class b extends luc {
        private final h1d a;

        b(h1d h1dVar) {
            this.a = h1dVar;
        }

        @Override // defpackage.fvc
        public final void u1(String str, String str2, Bundle bundle, long j) {
            this.a.a(str, str2, bundle, j);
        }

        @Override // defpackage.fvc
        public final int zza() {
            return System.identityHashCode(this.a);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    /* renamed from: jvc$c */
    /* loaded from: classes2.dex */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jvc.this.q(new pwc(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jvc.this.q(new uwc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jvc.this.q(new twc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jvc.this.q(new qwc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            euc eucVar = new euc();
            jvc.this.q(new vwc(this, activity, eucVar));
            Bundle C = eucVar.C(50L);
            if (C != null) {
                bundle.putAll(C);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jvc.this.q(new rwc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jvc.this.q(new swc(this, activity));
        }
    }

    private jvc(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str != null && D(str2, str3)) {
            this.a = str;
        } else {
            this.a = "FA";
        }
        this.b = jp2.c();
        this.c = utc.a().a(new qvc(this), duc.a);
        this.d = new fo(this);
        this.e = new ArrayList();
        if (B(context) && !J()) {
            this.h = null;
            this.g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!D(str2, str3)) {
            this.h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.h = str2;
        }
        q(new mvc(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean B(Context context) {
        if (new kzc(context, kzc.a(context)).b("google_app_id") == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(String str, String str2) {
        if (str2 != null && str != null && !J()) {
            return true;
        }
        return false;
    }

    private final boolean J() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static jvc g(@NonNull Context context) {
        return h(context, null, null, null, null);
    }

    public static jvc h(Context context, String str, String str2, String str3, Bundle bundle) {
        gh8.j(context);
        if (j == null) {
            synchronized (jvc.class) {
                try {
                    if (j == null) {
                        j = new jvc(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    private final void o(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        q(new nwc(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(a aVar) {
        this.c.execute(aVar);
    }

    public final void A(String str, String str2, Bundle bundle) {
        o(str, str2, bundle, true, true, null);
    }

    public final void C(String str) {
        q(new rvc(this, str));
    }

    public final String F() {
        euc eucVar = new euc();
        q(new tvc(this, eucVar));
        return eucVar.V1(50L);
    }

    public final String G() {
        euc eucVar = new euc();
        q(new iwc(this, eucVar));
        return eucVar.V1(500L);
    }

    public final String H() {
        euc eucVar = new euc();
        q(new vvc(this, eucVar));
        return eucVar.V1(500L);
    }

    public final String I() {
        euc eucVar = new euc();
        q(new uvc(this, eucVar));
        return eucVar.V1(500L);
    }

    public final int a(String str) {
        euc eucVar = new euc();
        q(new kwc(this, str, eucVar));
        Integer num = (Integer) euc.T1(eucVar.C(AbstractComponentTracker.LINGERING_TIMEOUT), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        euc eucVar = new euc();
        q(new wvc(this, eucVar));
        Long U1 = eucVar.U1(500L);
        if (U1 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.b.currentTimeMillis()).nextLong();
            int i = this.f + 1;
            this.f = i;
            return nextLong + i;
        }
        return U1.longValue();
    }

    public final List<Bundle> c(String str, String str2) {
        euc eucVar = new euc();
        q(new nvc(this, str, str2, eucVar));
        List<Bundle> list = (List) euc.T1(eucVar.C(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map<String, Object> d(String str, String str2, boolean z) {
        euc eucVar = new euc();
        q(new xvc(this, str, str2, z, eucVar));
        Bundle C = eucVar.C(5000L);
        if (C != null && C.size() != 0) {
            HashMap hashMap = new HashMap(C.size());
            for (String str3 : C.keySet()) {
                Object obj = C.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final guc e(Context context, boolean z) {
        try {
            return fuc.asInterface(DynamiteModule.e(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            l(e, true, false);
            return null;
        }
    }

    public final void i(int i, String str, Object obj, Object obj2, Object obj3) {
        q(new jwc(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        q(new pvc(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        q(new lvc(this, bundle));
    }

    public final void m(@NonNull String str, Bundle bundle) {
        o(null, str, bundle, false, true, null);
    }

    public final void n(String str, String str2, Bundle bundle) {
        q(new ovc(this, str, str2, bundle));
    }

    public final void p(String str, String str2, Object obj, boolean z) {
        q(new owc(this, str, str2, obj, z));
    }

    public final void u(h1d h1dVar) {
        gh8.j(h1dVar);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    if (h1dVar.equals(this.e.get(i).first)) {
                        Log.w(this.a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(h1dVar);
            this.e.add(new Pair<>(h1dVar, bVar));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            q(new mwc(this, bVar));
        }
    }

    public final void v(boolean z) {
        q(new lwc(this, z));
    }

    public final fo x() {
        return this.d;
    }

    public final void z(String str) {
        q(new svc(this, str));
    }
}
