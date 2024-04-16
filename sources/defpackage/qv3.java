package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import defpackage.bn1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
/* compiled from: FirebaseApp.java */
/* renamed from: qv3  reason: default package */
/* loaded from: classes2.dex */
public class qv3 {
    private static final Object k = new Object();
    static final Map<String, qv3> l = new lr();
    private final Context a;
    private final String b;
    private final nw3 c;
    private final bn1 d;
    private final qn5<pk2> g;
    private final bs8<eq2> h;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<a> i = new CopyOnWriteArrayList();
    private final List<rv3> j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    /* renamed from: qv3$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* renamed from: qv3$b */
    /* loaded from: classes2.dex */
    public static class b implements a.InterfaceC0219a {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (ad8.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (ho1.a(a, null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0219a
        public void a(boolean z) {
            synchronized (qv3.k) {
                try {
                    Iterator it = new ArrayList(qv3.l.values()).iterator();
                    while (it.hasNext()) {
                        qv3 qv3Var = (qv3) it.next();
                        if (qv3Var.e.get()) {
                            qv3Var.y(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* renamed from: qv3$c */
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {
        private static AtomicReference<c> b = new AtomicReference<>();
        private final Context a;

        public c(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (ho1.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (qv3.k) {
                try {
                    for (qv3 qv3Var : qv3.l.values()) {
                        qv3Var.p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected qv3(final Context context, String str, nw3 nw3Var) {
        this.a = (Context) gh8.j(context);
        this.b = gh8.f(str);
        this.c = (nw3) gh8.j(nw3Var);
        xta b2 = FirebaseInitProvider.b();
        jy3.b("Firebase");
        jy3.b("ComponentDiscovery");
        List<bs8<ComponentRegistrar>> b3 = qm1.c(context, ComponentDiscoveryService.class).b();
        jy3.a();
        jy3.b("Runtime");
        bn1.b g = bn1.m(zpb.INSTANCE).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(bm1.s(context, Context.class, new Class[0])).b(bm1.s(this, qv3.class, new Class[0])).b(bm1.s(nw3Var, nw3.class, new Class[0])).g(new um1());
        if (jub.a(context) && FirebaseInitProvider.c()) {
            g.b(bm1.s(b2, xta.class, new Class[0]));
        }
        bn1 e = g.e();
        this.d = e;
        jy3.a();
        this.g = new qn5<>(new bs8() { // from class: ov3
            @Override // defpackage.bs8
            public final Object get() {
                pk2 v;
                v = qv3.this.v(context);
                return v;
            }
        });
        this.h = e.g(eq2.class);
        g(new a() { // from class: pv3
            @Override // defpackage.qv3.a
            public final void a(boolean z) {
                qv3.this.w(z);
            }
        });
        jy3.a();
    }

    private void i() {
        gh8.n(!this.f.get(), "FirebaseApp was deleted");
    }

    @NonNull
    public static qv3 l() {
        qv3 qv3Var;
        synchronized (k) {
            try {
                qv3Var = l.get("[DEFAULT]");
                if (qv3Var != null) {
                    qv3Var.h.get().l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + xk8.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qv3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!jub.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.d.p(u());
        this.h.get().l();
    }

    public static qv3 q(@NonNull Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return l();
                }
                nw3 a2 = nw3.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static qv3 r(@NonNull Context context, @NonNull nw3 nw3Var) {
        return s(context, nw3Var, "[DEFAULT]");
    }

    @NonNull
    public static qv3 s(@NonNull Context context, @NonNull nw3 nw3Var, @NonNull String str) {
        qv3 qv3Var;
        b.c(context);
        String x = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map<String, qv3> map = l;
            gh8.n(!map.containsKey(x), "FirebaseApp name " + x + " already exists!");
            gh8.k(context, "Application context cannot be null.");
            qv3Var = new qv3(context, x, nw3Var);
            map.put(x, qv3Var);
        }
        qv3Var.p();
        return qv3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ pk2 v(Context context) {
        return new pk2(context, o(), (ms8) this.d.a(ms8.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z) {
        if (!z) {
            this.h.get().l();
        }
    }

    private static String x(@NonNull String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a aVar : this.i) {
            aVar.a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qv3)) {
            return false;
        }
        return this.b.equals(((qv3) obj).m());
    }

    public void g(a aVar) {
        i();
        if (this.e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public void h(@NonNull rv3 rv3Var) {
        i();
        gh8.j(rv3Var);
        this.j.add(rv3Var);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T j(Class<T> cls) {
        i();
        return (T) this.d.a(cls);
    }

    @NonNull
    public Context k() {
        i();
        return this.a;
    }

    @NonNull
    public String m() {
        i();
        return this.b;
    }

    @NonNull
    public nw3 n() {
        i();
        return this.c;
    }

    public String o() {
        return u60.a(m().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + u60.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return this.g.get().b();
    }

    public String toString() {
        return m57.c(this).a(Action.NAME_ATTRIBUTE, this.b).a("options", this.c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
