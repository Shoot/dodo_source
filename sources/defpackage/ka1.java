package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import defpackage.ja1;
import defpackage.p86;
import defpackage.rg4;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ClusterManager.java */
/* renamed from: ka1  reason: default package */
/* loaded from: classes.dex */
public class ka1<T extends ja1> implements rg4.c, rg4.g, rg4.e {
    private final p86 a;
    private final p86.a b;
    private final p86.a c;
    private ax9<T> d;
    private la1<T> e;
    private rg4 f;
    private CameraPosition g;
    private ka1<T>.b h;
    private final ReadWriteLock i;
    private e<T> j;
    private c<T> k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClusterManager.java */
    /* renamed from: ka1$b */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<Float, Void, Set<? extends ia1<T>>> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Set<? extends ia1<T>> doInBackground(Float... fArr) {
            ka1.this.d.lock();
            try {
                return (Set<? extends ia1<T>>) ka1.this.d.e(fArr[0].floatValue());
            } finally {
                ka1.this.d.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Set<? extends ia1<T>> set) {
            ka1.this.e.g(set);
        }
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ka1$c */
    /* loaded from: classes.dex */
    public interface c<T extends ja1> {
        boolean a(ia1<T> ia1Var);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ka1$d */
    /* loaded from: classes.dex */
    public interface d<T extends ja1> {
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ka1$e */
    /* loaded from: classes.dex */
    public interface e<T extends ja1> {
        boolean a(T t);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ka1$f */
    /* loaded from: classes.dex */
    public interface f<T extends ja1> {
    }

    public ka1(Context context, rg4 rg4Var) {
        this(context, rg4Var, new p86(rg4Var));
    }

    @Override // defpackage.rg4.g
    public boolean a(m86 m86Var) {
        return l().a(m86Var);
    }

    @Override // defpackage.rg4.c
    public void b() {
        la1<T> la1Var = this.e;
        if (la1Var instanceof rg4.c) {
            ((rg4.c) la1Var).b();
        }
        this.d.a(this.f.e());
        if (this.d.d()) {
            h();
            return;
        }
        CameraPosition cameraPosition = this.g;
        if (cameraPosition == null || cameraPosition.b != this.f.e().b) {
            this.g = this.f.e();
            h();
        }
    }

    public boolean e(Collection<T> collection) {
        this.d.lock();
        try {
            return this.d.b(collection);
        } finally {
            this.d.unlock();
        }
    }

    public void f() {
        this.d.lock();
        try {
            this.d.c();
        } finally {
            this.d.unlock();
        }
    }

    @Override // defpackage.rg4.e
    public void g(m86 m86Var) {
        l().g(m86Var);
    }

    public void h() {
        this.i.writeLock().lock();
        try {
            this.h.cancel(true);
            ka1<T>.b bVar = new b();
            this.h = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f.e().b));
        } finally {
            this.i.writeLock().unlock();
        }
    }

    public db<T> i() {
        return this.d;
    }

    public p86.a j() {
        return this.c;
    }

    public p86.a k() {
        return this.b;
    }

    public p86 l() {
        return this.a;
    }

    public void m(c<T> cVar) {
        this.k = cVar;
        this.e.b(cVar);
    }

    public void n(e<T> eVar) {
        this.j = eVar;
        this.e.f(eVar);
    }

    public void o(la1<T> la1Var) {
        this.e.b(null);
        this.e.f(null);
        this.c.b();
        this.b.b();
        this.e.e();
        this.e = la1Var;
        la1Var.a();
        this.e.b(this.k);
        this.e.c(null);
        this.e.f(this.j);
        this.e.d(null);
        h();
    }

    public ka1(Context context, rg4 rg4Var, p86 p86Var) {
        this.i = new ReentrantReadWriteLock();
        this.f = rg4Var;
        this.a = p86Var;
        this.c = p86Var.k();
        this.b = p86Var.k();
        this.e = new kp2(context, rg4Var, this);
        this.d = new bx9(new gg8(new b07()));
        this.h = new b();
        this.e.a();
    }
}
