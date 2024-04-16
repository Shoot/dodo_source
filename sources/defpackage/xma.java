package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.eg4;
import defpackage.wq1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: SingletonConnectivityReceiver.java */
/* renamed from: xma  reason: default package */
/* loaded from: classes.dex */
final class xma {
    private static volatile xma d;
    private final c a;
    final Set<wq1.a> b = new HashSet();
    private boolean c;

    /* compiled from: SingletonConnectivityReceiver.java */
    /* renamed from: xma$a */
    /* loaded from: classes.dex */
    class a implements eg4.b<ConnectivityManager> {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // defpackage.eg4.b
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* renamed from: xma$b */
    /* loaded from: classes.dex */
    class b implements wq1.a {
        b() {
        }

        @Override // defpackage.wq1.a
        public void a(boolean z) {
            ArrayList<wq1.a> arrayList;
            vub.b();
            synchronized (xma.this) {
                arrayList = new ArrayList(xma.this.b);
            }
            for (wq1.a aVar : arrayList) {
                aVar.a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingletonConnectivityReceiver.java */
    /* renamed from: xma$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingletonConnectivityReceiver.java */
    /* renamed from: xma$d */
    /* loaded from: classes.dex */
    public static final class d implements c {
        boolean a;
        final wq1.a b;
        private final eg4.b<ConnectivityManager> c;
        private final ConnectivityManager.NetworkCallback d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$d$a */
        /* loaded from: classes.dex */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SingletonConnectivityReceiver.java */
            /* renamed from: xma$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0744a implements Runnable {
                final /* synthetic */ boolean a;

                RunnableC0744a(boolean z) {
                    this.a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.a);
                }
            }

            a() {
            }

            private void b(boolean z) {
                vub.w(new RunnableC0744a(z));
            }

            void a(boolean z) {
                vub.b();
                d dVar = d.this;
                boolean z2 = dVar.a;
                dVar.a = z;
                if (z2 != z) {
                    dVar.b.a(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        d(eg4.b<ConnectivityManager> bVar, wq1.a aVar) {
            this.c = bVar;
            this.b = aVar;
        }

        @Override // defpackage.xma.c
        @SuppressLint({"MissingPermission"})
        public boolean a() {
            Network activeNetwork;
            boolean z;
            activeNetwork = this.c.get().getActiveNetwork();
            if (activeNetwork != null) {
                z = true;
            } else {
                z = false;
            }
            this.a = z;
            try {
                this.c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // defpackage.xma.c
        public void b() {
            this.c.get().unregisterNetworkCallback(this.d);
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* renamed from: xma$e */
    /* loaded from: classes.dex */
    private static final class e implements c {
        static final Executor g = AsyncTask.SERIAL_EXECUTOR;
        final Context a;
        final wq1.a b;
        private final eg4.b<ConnectivityManager> c;
        volatile boolean d;
        volatile boolean e;
        final BroadcastReceiver f = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$e$a */
        /* loaded from: classes.dex */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NonNull Context context, Intent intent) {
                e.this.e();
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$e$b */
        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.a.registerReceiver(eVar2.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    e.this.e = false;
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$e$c */
        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!e.this.e) {
                    return;
                }
                e.this.e = false;
                e eVar = e.this;
                eVar.a.unregisterReceiver(eVar.f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$e$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = e.this.d;
                e eVar = e.this;
                eVar.d = eVar.c();
                if (z != e.this.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.d);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: xma$e$e  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0745e implements Runnable {
            final /* synthetic */ boolean a;

            RunnableC0745e(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.a(this.a);
            }
        }

        e(Context context, eg4.b<ConnectivityManager> bVar, wq1.a aVar) {
            this.a = context.getApplicationContext();
            this.c = bVar;
            this.b = aVar;
        }

        @Override // defpackage.xma.c
        public boolean a() {
            g.execute(new b());
            return true;
        }

        @Override // defpackage.xma.c
        public void b() {
            g.execute(new c());
        }

        @SuppressLint({"MissingPermission"})
        boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.c.get().getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        void d(boolean z) {
            vub.w(new RunnableC0745e(z));
        }

        void e() {
            g.execute(new d());
        }
    }

    private xma(@NonNull Context context) {
        c eVar;
        eg4.b a2 = eg4.a(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new d(a2, bVar);
        } else {
            eVar = new e(context, a2, bVar);
        }
        this.a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xma a(@NonNull Context context) {
        if (d == null) {
            synchronized (xma.class) {
                try {
                    if (d == null) {
                        d = new xma(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    private void b() {
        if (!this.c && !this.b.isEmpty()) {
            this.c = this.a.a();
        }
    }

    private void c() {
        if (this.c && this.b.isEmpty()) {
            this.a.b();
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(wq1.a aVar) {
        this.b.add(aVar);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(wq1.a aVar) {
        this.b.remove(aVar);
        c();
    }
}
