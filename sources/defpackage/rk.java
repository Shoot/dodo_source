package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* renamed from: rk  reason: default package */
/* loaded from: classes.dex */
public class rk {
    public static final ThreadLocal<rk> g = new ThreadLocal<>();
    private c d;
    private final wka<b, Long> a = new wka<>();
    final ArrayList<b> b = new ArrayList<>();
    private final a c = new a();
    long e = 0;
    private boolean f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: rk$a */
    /* loaded from: classes.dex */
    public class a {
        a() {
        }

        void a() {
            rk.this.e = SystemClock.uptimeMillis();
            rk rkVar = rk.this;
            rkVar.c(rkVar.e);
            if (rk.this.b.size() > 0) {
                rk.this.e().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: rk$b */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: rk$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        final a a;

        c(a aVar) {
            this.a = aVar;
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: rk$d */
    /* loaded from: classes.dex */
    public static class d extends c {
        private final Choreographer b;
        private final Choreographer.FrameCallback c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: rk$d$a */
        /* loaded from: classes.dex */
        class a implements Choreographer.FrameCallback {
            a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                d.this.a.a();
            }
        }

        d(a aVar) {
            super(aVar);
            this.b = Choreographer.getInstance();
            this.c = new a();
        }

        @Override // defpackage.rk.c
        void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    rk() {
    }

    private void b() {
        if (this.f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public static rk d() {
        ThreadLocal<rk> threadLocal = g;
        if (threadLocal.get() == null) {
            threadLocal.set(new rk());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j) {
        Long l = this.a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.a.remove(bVar);
            return true;
        }
        return false;
    }

    public void a(b bVar, long j) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    void c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j);
            }
        }
        b();
    }

    c e() {
        if (this.d == null) {
            this.d = new d(this.c);
        }
        return this.d;
    }

    public void g(b bVar) {
        this.a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.f = true;
        }
    }
}
