package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.wq1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public class h implements ComponentCallbacks2, mp5 {
    private static final xi9 m = xi9.u0(Bitmap.class).R();
    private static final xi9 n = xi9.u0(kf4.class).R();
    private static final xi9 o = xi9.v0(d33.c).b0(yj8.LOW).j0(true);
    protected final com.bumptech.glide.b a;
    protected final Context b;
    final fp5 c;
    private final cj9 d;
    private final wi9 e;
    private final r6b f;
    private final Runnable g;
    private final wq1 h;
    private final CopyOnWriteArrayList<vi9<Object>> i;
    private xi9 j;
    private boolean k;
    private boolean l;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.c.a(hVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    private class c implements wq1.a {
        private final cj9 a;

        c(@NonNull cj9 cj9Var) {
            this.a = cj9Var;
        }

        @Override // defpackage.wq1.a
        public void a(boolean z) {
            if (z) {
                synchronized (h.this) {
                    this.a.e();
                }
            }
        }
    }

    public h(@NonNull com.bumptech.glide.b bVar, @NonNull fp5 fp5Var, @NonNull wi9 wi9Var, @NonNull Context context) {
        this(bVar, fp5Var, wi9Var, new cj9(), bVar.g(), context);
    }

    private void B(@NonNull n6b<?> n6bVar) {
        boolean A = A(n6bVar);
        ii9 h = n6bVar.h();
        if (!A && !this.a.p(n6bVar) && h != null) {
            n6bVar.j(null);
            h.clear();
        }
    }

    private synchronized void o() {
        try {
            for (n6b<?> n6bVar : this.f.f()) {
                m(n6bVar);
            }
            this.f.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean A(@NonNull n6b<?> n6bVar) {
        ii9 h = n6bVar.h();
        if (h == null) {
            return true;
        }
        if (this.d.a(h)) {
            this.f.m(n6bVar);
            n6bVar.j(null);
            return true;
        }
        return false;
    }

    @NonNull
    public <ResourceType> g<ResourceType> e(@NonNull Class<ResourceType> cls) {
        return new g<>(this.a, this, cls, this.b);
    }

    @NonNull
    public g<Bitmap> f() {
        return e(Bitmap.class).b(m);
    }

    @Override // defpackage.mp5
    public synchronized void g() {
        try {
            this.f.g();
            if (this.l) {
                o();
            } else {
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    public g<Drawable> k() {
        return e(Drawable.class);
    }

    public void m(n6b<?> n6bVar) {
        if (n6bVar == null) {
            return;
        }
        B(n6bVar);
    }

    public void n(@NonNull View view) {
        m(new b(view));
    }

    @Override // defpackage.mp5
    public synchronized void onDestroy() {
        this.f.onDestroy();
        o();
        this.d.b();
        this.c.b(this);
        this.c.b(this.h);
        vub.x(this.g);
        this.a.s(this);
    }

    @Override // defpackage.mp5
    public synchronized void onStart() {
        x();
        this.f.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.k) {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<vi9<Object>> p() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized xi9 q() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public <T> i<?, T> r(Class<T> cls) {
        return this.a.i().e(cls);
    }

    @NonNull
    public g<Drawable> s(Integer num) {
        return k().K0(num);
    }

    @NonNull
    public g<Drawable> t(String str) {
        return k().M0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    public synchronized void u() {
        this.d.c();
    }

    public synchronized void v() {
        u();
        for (h hVar : this.e.a()) {
            hVar.u();
        }
    }

    public synchronized void w() {
        this.d.d();
    }

    public synchronized void x() {
        this.d.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void y(@NonNull xi9 xi9Var) {
        this.j = xi9Var.clone().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void z(@NonNull n6b<?> n6bVar, @NonNull ii9 ii9Var) {
        this.f.k(n6bVar);
        this.d.g(ii9Var);
    }

    h(com.bumptech.glide.b bVar, fp5 fp5Var, wi9 wi9Var, cj9 cj9Var, xq1 xq1Var, Context context) {
        this.f = new r6b();
        a aVar = new a();
        this.g = aVar;
        this.a = bVar;
        this.c = fp5Var;
        this.e = wi9Var;
        this.d = cj9Var;
        this.b = context;
        wq1 a2 = xq1Var.a(context.getApplicationContext(), new c(cj9Var));
        this.h = a2;
        bVar.o(this);
        if (vub.s()) {
            vub.w(aVar);
        } else {
            fp5Var.a(this);
        }
        fp5Var.a(a2);
        this.i = new CopyOnWriteArrayList<>(bVar.i().c());
        y(bVar.i().d());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    private static class b extends l42<View, Object> {
        b(@NonNull View view) {
            super(view);
        }

        @Override // defpackage.n6b
        public void b(Drawable drawable) {
        }

        @Override // defpackage.l42
        protected void m(Drawable drawable) {
        }

        @Override // defpackage.n6b
        public void d(@NonNull Object obj, dlb<? super Object> dlbVar) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
