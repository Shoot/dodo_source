package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: k0c  reason: default package */
/* loaded from: classes.dex */
public class k0c {
    private Interpolator c;
    l0c d;
    private boolean e;
    private long b = -1;
    private final m0c f = new a();
    final ArrayList<j0c> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* renamed from: k0c$a */
    /* loaded from: classes.dex */
    class a extends m0c {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // defpackage.l0c
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == k0c.this.a.size()) {
                l0c l0cVar = k0c.this.d;
                if (l0cVar != null) {
                    l0cVar.b(null);
                }
                d();
            }
        }

        @Override // defpackage.m0c, defpackage.l0c
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            l0c l0cVar = k0c.this.d;
            if (l0cVar != null) {
                l0cVar.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            k0c.this.b();
        }
    }

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator<j0c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public k0c c(j0c j0cVar) {
        if (!this.e) {
            this.a.add(j0cVar);
        }
        return this;
    }

    public k0c d(j0c j0cVar, j0c j0cVar2) {
        this.a.add(j0cVar);
        j0cVar2.j(j0cVar.d());
        this.a.add(j0cVar2);
        return this;
    }

    public k0c e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public k0c f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public k0c g(l0c l0cVar) {
        if (!this.e) {
            this.d = l0cVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<j0c> it = this.a.iterator();
        while (it.hasNext()) {
            j0c next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.d != null) {
                next.h(this.f);
            }
            next.l();
        }
        this.e = true;
    }
}
