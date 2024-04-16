package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.c60;
import defpackage.rw5;
import defpackage.t3b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: Uploader.java */
/* renamed from: isb  reason: default package */
/* loaded from: classes2.dex */
public class isb {
    private final Context a;
    private final a60 b;
    private final el3 c;
    private final t7c d;
    private final Executor e;
    private final t3b f;
    private final x91 g;
    private final x91 h;
    private final k91 i;

    public isb(Context context, a60 a60Var, el3 el3Var, t7c t7cVar, Executor executor, t3b t3bVar, x91 x91Var, x91 x91Var2, k91 k91Var) {
        this.a = context;
        this.b = a60Var;
        this.c = el3Var;
        this.d = t7cVar;
        this.e = executor;
        this.f = t3bVar;
        this.g = x91Var;
        this.h = x91Var2;
        this.i = k91Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(wlb wlbVar) {
        return Boolean.valueOf(this.c.t0(wlbVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(wlb wlbVar) {
        return this.c.B(wlbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, wlb wlbVar, long j) {
        this.c.A0(iterable);
        this.c.N1(wlbVar, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.c.v(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.e(((Integer) entry.getValue()).intValue(), rw5.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(wlb wlbVar, long j) {
        this.c.N1(wlbVar, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(wlb wlbVar, int i) {
        this.d.a(wlbVar, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final wlb wlbVar, final int i, Runnable runnable) {
        try {
            try {
                t3b t3bVar = this.f;
                final el3 el3Var = this.c;
                Objects.requireNonNull(el3Var);
                t3bVar.b(new t3b.a() { // from class: zrb
                    @Override // defpackage.t3b.a
                    public final Object execute() {
                        return Integer.valueOf(el3.this.p());
                    }
                });
                if (!k()) {
                    this.f.b(new t3b.a() { // from class: asb
                        @Override // defpackage.t3b.a
                        public final Object execute() {
                            Object s;
                            s = isb.this.s(wlbVar, i);
                            return s;
                        }
                    });
                } else {
                    u(wlbVar, i);
                }
            } catch (SynchronizationException unused) {
                this.d.a(wlbVar, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public wk3 j(vlb vlbVar) {
        t3b t3bVar = this.f;
        final k91 k91Var = this.i;
        Objects.requireNonNull(k91Var);
        return vlbVar.a(wk3.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new zg3(eh3.b("proto"), ((m91) t3bVar.b(new t3b.a() { // from class: yrb
            @Override // defpackage.t3b.a
            public final Object execute() {
                return k91.this.c();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public c60 u(final wlb wlbVar, int i) {
        c60 b;
        vlb vlbVar = this.b.get(wlbVar.b());
        long j = 0;
        c60 e = c60.e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f.b(new t3b.a() { // from class: bsb
                @Override // defpackage.t3b.a
                public final Object execute() {
                    Boolean l;
                    l = isb.this.l(wlbVar);
                    return l;
                }
            })).booleanValue()) {
                final Iterable<xy7> iterable = (Iterable) this.f.b(new t3b.a() { // from class: csb
                    @Override // defpackage.t3b.a
                    public final Object execute() {
                        Iterable m;
                        m = isb.this.m(wlbVar);
                        return m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (vlbVar == null) {
                    wx5.b("Uploader", "Unknown backend for %s, deleting event batch for it...", wlbVar);
                    b = c60.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (xy7 xy7Var : iterable) {
                        arrayList.add(xy7Var.b());
                    }
                    if (wlbVar.e()) {
                        arrayList.add(j(vlbVar));
                    }
                    b = vlbVar.b(b60.a().b(arrayList).c(wlbVar.c()).a());
                }
                e = b;
                if (e.c() == c60.a.TRANSIENT_ERROR) {
                    this.f.b(new t3b.a() { // from class: dsb
                        @Override // defpackage.t3b.a
                        public final Object execute() {
                            Object n;
                            n = isb.this.n(iterable, wlbVar, j2);
                            return n;
                        }
                    });
                    this.d.b(wlbVar, i + 1, true);
                    return e;
                }
                this.f.b(new t3b.a() { // from class: esb
                    @Override // defpackage.t3b.a
                    public final Object execute() {
                        Object o;
                        o = isb.this.o(iterable);
                        return o;
                    }
                });
                if (e.c() == c60.a.OK) {
                    j = Math.max(j2, e.b());
                    if (wlbVar.e()) {
                        this.f.b(new t3b.a() { // from class: fsb
                            @Override // defpackage.t3b.a
                            public final Object execute() {
                                Object p;
                                p = isb.this.p();
                                return p;
                            }
                        });
                    }
                } else if (e.c() == c60.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (xy7 xy7Var2 : iterable) {
                        String j3 = xy7Var2.b().j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f.b(new t3b.a() { // from class: gsb
                        @Override // defpackage.t3b.a
                        public final Object execute() {
                            Object q;
                            q = isb.this.q(hashMap);
                            return q;
                        }
                    });
                }
            }
            this.f.b(new t3b.a() { // from class: hsb
                @Override // defpackage.t3b.a
                public final Object execute() {
                    Object r;
                    r = isb.this.r(wlbVar, j2);
                    return r;
                }
            });
            return e;
        }
    }

    public void v(final wlb wlbVar, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: xrb
            @Override // java.lang.Runnable
            public final void run() {
                isb.this.t(wlbVar, i, runnable);
            }
        });
    }
}
