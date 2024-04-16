package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.ew6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Dispatcher.java */
/* renamed from: s33  reason: default package */
/* loaded from: classes3.dex */
public class s33 {
    final b a;
    final Context b;
    final ExecutorService c;
    final z63 d;
    final Map<String, zb0> e;
    final Map<Object, s4> f;
    final Map<Object, s4> g;
    final Set<Object> h;
    final Handler i;
    final Handler j;
    final jl0 k;
    final pwa l;
    final List<zb0> m;
    final c n;
    final boolean o;
    boolean p;

    /* compiled from: Dispatcher.java */
    /* renamed from: s33$a */
    /* loaded from: classes3.dex */
    private static class a extends Handler {
        private final s33 a;

        /* compiled from: Dispatcher.java */
        /* renamed from: s33$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0645a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0645a(Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.a.what);
            }
        }

        a(Looper looper, s33 s33Var) {
            super(looper);
            this.a = s33Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.a.v((s4) message.obj);
                    return;
                case 2:
                    this.a.o((s4) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    s58.o.post(new RunnableC0645a(message));
                    return;
                case 4:
                    this.a.p((zb0) message.obj);
                    return;
                case 5:
                    this.a.u((zb0) message.obj);
                    return;
                case 6:
                    this.a.q((zb0) message.obj, false);
                    return;
                case 7:
                    this.a.n();
                    return;
                case 9:
                    this.a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    s33 s33Var = this.a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    s33Var.m(z);
                    return;
                case 11:
                    this.a.s(message.obj);
                    return;
                case 12:
                    this.a.t(message.obj);
                    return;
            }
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: s33$b */
    /* loaded from: classes3.dex */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: s33$c */
    /* loaded from: classes3.dex */
    static class c extends BroadcastReceiver {
        private final s33 a;

        c(s33 s33Var) {
            this.a = s33Var;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra("state")) {
                    return;
                }
                this.a.b(intent.getBooleanExtra("state", false));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.a.f(((ConnectivityManager) evb.o(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s33(Context context, ExecutorService executorService, Handler handler, z63 z63Var, jl0 jl0Var, pwa pwaVar) {
        b bVar = new b();
        this.a = bVar;
        bVar.start();
        evb.i(bVar.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new a(bVar.getLooper(), this);
        this.d = z63Var;
        this.j = handler;
        this.k = jl0Var;
        this.l = pwaVar;
        this.m = new ArrayList(4);
        this.p = evb.q(context);
        this.o = evb.p(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.n = cVar;
        cVar.a();
    }

    private void a(zb0 zb0Var) {
        if (zb0Var.u()) {
            return;
        }
        Bitmap bitmap = zb0Var.m;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.m.add(zb0Var);
        if (!this.i.hasMessages(7)) {
            this.i.sendEmptyMessageDelayed(7, 200L);
        }
    }

    private void i() {
        if (!this.f.isEmpty()) {
            Iterator<s4> it = this.f.values().iterator();
            while (it.hasNext()) {
                s4 next = it.next();
                it.remove();
                if (next.g().m) {
                    evb.t("Dispatcher", "replaying", next.i().d());
                }
                w(next, false);
            }
        }
    }

    private void j(List<zb0> list) {
        if (list != null && !list.isEmpty() && list.get(0).q().m) {
            StringBuilder sb = new StringBuilder();
            for (zb0 zb0Var : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(evb.k(zb0Var));
            }
            evb.t("Dispatcher", "delivered", sb.toString());
        }
    }

    private void k(s4 s4Var) {
        Object k = s4Var.k();
        if (k != null) {
            s4Var.k = true;
            this.f.put(k, s4Var);
        }
    }

    private void l(zb0 zb0Var) {
        s4 h = zb0Var.h();
        if (h != null) {
            k(h);
        }
        List<s4> i = zb0Var.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                k(i.get(i2));
            }
        }
    }

    void b(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(s4 s4Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, s4Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(zb0 zb0Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, zb0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(zb0 zb0Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, zb0Var));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(zb0 zb0Var) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, zb0Var), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(s4 s4Var) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, s4Var));
    }

    void m(boolean z) {
        this.p = z;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(s4 s4Var) {
        String d = s4Var.d();
        zb0 zb0Var = this.e.get(d);
        if (zb0Var != null) {
            zb0Var.f(s4Var);
            if (zb0Var.c()) {
                this.e.remove(d);
                if (s4Var.g().m) {
                    evb.t("Dispatcher", "canceled", s4Var.i().d());
                }
            }
        }
        if (this.h.contains(s4Var.j())) {
            this.g.remove(s4Var.k());
            if (s4Var.g().m) {
                evb.u("Dispatcher", "canceled", s4Var.i().d(), "because paused request got canceled");
            }
        }
        s4 remove = this.f.remove(s4Var.k());
        if (remove != null && remove.g().m) {
            evb.u("Dispatcher", "canceled", remove.i().d(), "from replaying");
        }
    }

    void p(zb0 zb0Var) {
        if (zc6.i(zb0Var.p())) {
            this.k.b(zb0Var.n(), zb0Var.s());
        }
        this.e.remove(zb0Var.n());
        a(zb0Var);
        if (zb0Var.q().m) {
            evb.u("Dispatcher", "batched", evb.k(zb0Var), "for completion");
        }
    }

    void q(zb0 zb0Var, boolean z) {
        String str;
        if (zb0Var.q().m) {
            String k = evb.k(zb0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            evb.u("Dispatcher", "batched", k, sb.toString());
        }
        this.e.remove(zb0Var.n());
        a(zb0Var);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof u58) {
            ((u58) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    void s(Object obj) {
        boolean z;
        if (!this.h.add(obj)) {
            return;
        }
        Iterator<zb0> it = this.e.values().iterator();
        while (it.hasNext()) {
            zb0 next = it.next();
            boolean z2 = next.q().m;
            s4 h = next.h();
            List<s4> i = next.i();
            if (i != null && !i.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (h != null || z) {
                if (h != null && h.j().equals(obj)) {
                    next.f(h);
                    this.g.put(h.k(), h);
                    if (z2) {
                        evb.u("Dispatcher", "paused", h.b.d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z) {
                    for (int size = i.size() - 1; size >= 0; size--) {
                        s4 s4Var = i.get(size);
                        if (s4Var.j().equals(obj)) {
                            next.f(s4Var);
                            this.g.put(s4Var.k(), s4Var);
                            if (z2) {
                                evb.u("Dispatcher", "paused", s4Var.b.d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (next.c()) {
                    it.remove();
                    if (z2) {
                        evb.u("Dispatcher", "canceled", evb.k(next), "all actions paused");
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (!this.h.remove(obj)) {
            return;
        }
        Iterator<s4> it = this.g.values().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            s4 next = it.next();
            if (next.j().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
                it.remove();
            }
        }
        if (arrayList != null) {
            Handler handler = this.j;
            handler.sendMessage(handler.obtainMessage(13, arrayList));
        }
    }

    @SuppressLint({"MissingPermission"})
    void u(zb0 zb0Var) {
        NetworkInfo networkInfo;
        if (zb0Var.u()) {
            return;
        }
        boolean z = false;
        if (this.c.isShutdown()) {
            q(zb0Var, false);
            return;
        }
        if (this.o) {
            networkInfo = ((ConnectivityManager) evb.o(this.b, "connectivity")).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (zb0Var.w(this.p, networkInfo)) {
            if (zb0Var.q().m) {
                evb.t("Dispatcher", "retrying", evb.k(zb0Var));
            }
            if (zb0Var.k() instanceof ew6.a) {
                zb0Var.i |= dw6.NO_CACHE.a;
            }
            zb0Var.n = this.c.submit(zb0Var);
            return;
        }
        if (this.o && zb0Var.x()) {
            z = true;
        }
        q(zb0Var, z);
        if (z) {
            l(zb0Var);
        }
    }

    void v(s4 s4Var) {
        w(s4Var, true);
    }

    void w(s4 s4Var, boolean z) {
        if (this.h.contains(s4Var.j())) {
            this.g.put(s4Var.k(), s4Var);
            if (s4Var.g().m) {
                String d = s4Var.b.d();
                evb.u("Dispatcher", "paused", d, "because tag '" + s4Var.j() + "' is paused");
                return;
            }
            return;
        }
        zb0 zb0Var = this.e.get(s4Var.d());
        if (zb0Var != null) {
            zb0Var.b(s4Var);
        } else if (this.c.isShutdown()) {
            if (s4Var.g().m) {
                evb.u("Dispatcher", "ignored", s4Var.b.d(), "because shut down");
            }
        } else {
            zb0 g = zb0.g(s4Var.g(), this, this.k, this.l, s4Var);
            g.n = this.c.submit(g);
            this.e.put(s4Var.d(), g);
            if (z) {
                this.f.remove(s4Var.k());
            }
            if (s4Var.g().m) {
                evb.t("Dispatcher", "enqueued", s4Var.b.d());
            }
        }
    }
}
