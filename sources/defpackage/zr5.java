package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import defpackage.wr5;
import defpackage.yr5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* renamed from: zr5  reason: default package */
/* loaded from: classes.dex */
public class zr5 extends yr5 {
    static boolean c = false;
    @NonNull
    private final op5 a;
    @NonNull
    private final c b;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: zr5$a */
    /* loaded from: classes.dex */
    public static class a<D> extends qq6<D> implements wr5.a<D> {
        private final int l;
        private final Bundle m;
        @NonNull
        private final wr5<D> n;
        private op5 o;
        private b<D> p;
        private wr5<D> q;

        a(int i, Bundle bundle, @NonNull wr5<D> wr5Var, wr5<D> wr5Var2) {
            this.l = i;
            this.m = bundle;
            this.n = wr5Var;
            this.q = wr5Var2;
            wr5Var.q(i, this);
        }

        @Override // defpackage.wr5.a
        public void a(@NonNull wr5<D> wr5Var, D d) {
            if (zr5.c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d);
                return;
            }
            if (zr5.c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (zr5.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.n.t();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (zr5.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.n.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(@NonNull i67<? super D> i67Var) {
            super.m(i67Var);
            this.o = null;
            this.p = null;
        }

        @Override // defpackage.qq6, androidx.lifecycle.LiveData
        public void n(D d) {
            super.n(d);
            wr5<D> wr5Var = this.q;
            if (wr5Var != null) {
                wr5Var.r();
                this.q = null;
            }
        }

        wr5<D> o(boolean z) {
            if (zr5.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.n.b();
            this.n.a();
            b<D> bVar = this.p;
            if (bVar != null) {
                m(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.n.v(this);
            if ((bVar != null && !bVar.c()) || z) {
                this.n.r();
                return this.q;
            }
            return this.n;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            wr5<D> wr5Var = this.n;
            wr5Var.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                b<D> bVar = this.p;
                bVar.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        @NonNull
        wr5<D> q() {
            return this.n;
        }

        void r() {
            op5 op5Var = this.o;
            b<D> bVar = this.p;
            if (op5Var != null && bVar != null) {
                super.m(bVar);
                h(op5Var, bVar);
            }
        }

        @NonNull
        wr5<D> s(@NonNull op5 op5Var, @NonNull yr5.a<D> aVar) {
            b<D> bVar = new b<>(this.n, aVar);
            h(op5Var, bVar);
            b<D> bVar2 = this.p;
            if (bVar2 != null) {
                m(bVar2);
            }
            this.o = op5Var;
            this.p = bVar;
            return this.n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            ko2.a(this.n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: zr5$b */
    /* loaded from: classes.dex */
    public static class b<D> implements i67<D> {
        @NonNull
        private final wr5<D> a;
        @NonNull
        private final yr5.a<D> b;
        private boolean c = false;

        b(@NonNull wr5<D> wr5Var, @NonNull yr5.a<D> aVar) {
            this.a = wr5Var;
            this.b = aVar;
        }

        @Override // defpackage.i67
        public void a(D d) {
            if (zr5.c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.d(d));
            }
            this.b.b(this.a, d);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean c() {
            return this.c;
        }

        void d() {
            if (this.c) {
                if (zr5.c) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: zr5$c */
    /* loaded from: classes.dex */
    public static class c extends r {
        private static final s.b f = new a();
        private cra<a> d = new cra<>();
        private boolean e = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: zr5$c$a */
        /* loaded from: classes.dex */
        static class a implements s.b {
            a() {
            }

            @Override // androidx.lifecycle.s.b
            @NonNull
            public <T extends r> T a(@NonNull Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.s.b
            public /* synthetic */ r b(Class cls, n22 n22Var) {
                return tzb.b(this, cls, n22Var);
            }
        }

        c() {
        }

        @NonNull
        static c h(t tVar) {
            return (c) new s(tVar, f).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.r
        public void d() {
            super.d();
            int n = this.d.n();
            for (int i = 0; i < n; i++) {
                this.d.o(i).o(true);
            }
            this.d.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.d.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.d.n(); i++) {
                    a o = this.d.o(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.d.l(i));
                    printWriter.print(": ");
                    printWriter.println(o.toString());
                    o.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.e = false;
        }

        <D> a<D> i(int i) {
            return this.d.g(i);
        }

        boolean j() {
            return this.e;
        }

        void k() {
            int n = this.d.n();
            for (int i = 0; i < n; i++) {
                this.d.o(i).r();
            }
        }

        void l(int i, @NonNull a aVar) {
            this.d.m(i, aVar);
        }

        void m() {
            this.e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zr5(@NonNull op5 op5Var, @NonNull t tVar) {
        this.a = op5Var;
        this.b = c.h(tVar);
    }

    @NonNull
    private <D> wr5<D> e(int i, Bundle bundle, @NonNull yr5.a<D> aVar, wr5<D> wr5Var) {
        try {
            this.b.m();
            wr5<D> c2 = aVar.c(i, bundle);
            if (c2 != null) {
                if (c2.getClass().isMemberClass() && !Modifier.isStatic(c2.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c2);
                }
                a aVar2 = new a(i, bundle, c2, wr5Var);
                if (c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.b.l(i, aVar2);
                this.b.g();
                return aVar2.s(this.a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.b.g();
            throw th;
        }
    }

    @Override // defpackage.yr5
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.yr5
    @NonNull
    public <D> wr5<D> c(int i, Bundle bundle, @NonNull yr5.a<D> aVar) {
        if (!this.b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> i2 = this.b.i(i);
                if (c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (i2 == null) {
                    return e(i, bundle, aVar, null);
                }
                if (c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + i2);
                }
                return i2.s(this.a, aVar);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // defpackage.yr5
    public void d() {
        this.b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ko2.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
