package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import defpackage.po3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, po3.f {
    private dl2 A;
    private uk2<?> B;
    private volatile com.bumptech.glide.load.engine.f I;
    private volatile boolean X;
    private volatile boolean Y;
    private boolean Z;
    private final e d;
    private final jf8<h<?>> e;
    private com.bumptech.glide.d h;
    private se5 i;
    private yj8 j;
    private m k;
    private int l;
    private int m;
    private d33 n;
    private ac7 o;
    private b<R> p;
    private int q;
    private EnumC0103h r;
    private g s;
    private long t;
    private boolean u;
    private Object v;
    private Thread w;
    private se5 x;
    private se5 y;
    private Object z;
    private final com.bumptech.glide.load.engine.g<R> a = new com.bumptech.glide.load.engine.g<>();
    private final List<Throwable> b = new ArrayList();
    private final eva c = eva.a();
    private final d<?> f = new d<>();
    private final f g = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[xg3.values().length];
            c = iArr;
            try {
                iArr[xg3.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[xg3.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0103h.values().length];
            b = iArr2;
            try {
                iArr2[EnumC0103h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[EnumC0103h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[EnumC0103h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[EnumC0103h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[EnumC0103h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface b<R> {
        void a(h<?> hVar);

        void b(nj9<R> nj9Var, dl2 dl2Var, boolean z);

        void c(GlideException glideException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {
        private final dl2 a;

        c(dl2 dl2Var) {
            this.a = dl2Var;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @NonNull
        public nj9<Z> a(@NonNull nj9<Z> nj9Var) {
            return h.this.G(this.a, nj9Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class d<Z> {
        private se5 a;
        private uj9<Z> b;
        private r<Z> c;

        d() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void b(e eVar, ac7 ac7Var) {
            fg4.a("DecodeJob.encode");
            try {
                eVar.a().b(this.a, new com.bumptech.glide.load.engine.e(this.b, this.c, ac7Var));
            } finally {
                this.c.h();
                fg4.e();
            }
        }

        boolean c() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(se5 se5Var, uj9<X> uj9Var, r<X> rVar) {
            this.a = se5Var;
            this.b = uj9Var;
            this.c = rVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface e {
        b33 a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
        }

        private boolean a(boolean z) {
            if ((this.c || z || this.b) && this.a) {
                return true;
            }
            return false;
        }

        synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0103h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, jf8<h<?>> jf8Var) {
        this.d = eVar;
        this.e = jf8Var;
    }

    private void A(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(hx5.a(j));
        sb.append(", load key: ");
        sb.append(this.k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void B(nj9<R> nj9Var, dl2 dl2Var, boolean z) {
        N();
        this.p.b(nj9Var, dl2Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(nj9<R> nj9Var, dl2 dl2Var, boolean z) {
        r rVar;
        fg4.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (nj9Var instanceof t25) {
                ((t25) nj9Var).initialize();
            }
            if (this.f.c()) {
                nj9Var = r.e(nj9Var);
                rVar = nj9Var;
            } else {
                rVar = 0;
            }
            B(nj9Var, dl2Var, z);
            this.r = EnumC0103h.ENCODE;
            if (this.f.c()) {
                this.f.b(this.d, this.o);
            }
            if (rVar != 0) {
                rVar.h();
            }
            E();
            fg4.e();
        } catch (Throwable th) {
            fg4.e();
            throw th;
        }
    }

    private void D() {
        N();
        this.p.c(new GlideException("Failed to load resource", new ArrayList(this.b)));
        F();
    }

    private void E() {
        if (this.g.b()) {
            I();
        }
    }

    private void F() {
        if (this.g.c()) {
            I();
        }
    }

    private void I() {
        this.g.e();
        this.f.a();
        this.a.a();
        this.X = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.I = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.Y = false;
        this.v = null;
        this.b.clear();
        this.e.a(this);
    }

    private void J(g gVar) {
        this.s = gVar;
        this.p.a(this);
    }

    private void K() {
        this.w = Thread.currentThread();
        this.t = hx5.b();
        boolean z = false;
        while (!this.Y && this.I != null && !(z = this.I.b())) {
            this.r = u(this.r);
            this.I = t();
            if (this.r == EnumC0103h.SOURCE) {
                J(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.r == EnumC0103h.FINISHED || this.Y) && !z) {
            D();
        }
    }

    private <Data, ResourceType> nj9<R> L(Data data, dl2 dl2Var, q<Data, ResourceType, R> qVar) throws GlideException {
        ac7 v = v(dl2Var);
        com.bumptech.glide.load.data.a<Data> l = this.h.i().l(data);
        try {
            return qVar.a(l, v, this.l, this.m, new c(dl2Var));
        } finally {
            l.b();
        }
    }

    private void M() {
        int i = a.a[this.s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    s();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: " + this.s);
            }
            K();
            return;
        }
        this.r = u(EnumC0103h.INITIALIZE);
        this.I = t();
        K();
    }

    private void N() {
        Throwable th;
        this.c.c();
        if (this.X) {
            if (this.b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.b;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.X = true;
    }

    private <Data> nj9<R> p(uk2<?> uk2Var, Data data, dl2 dl2Var) throws GlideException {
        if (data == null) {
            uk2Var.b();
            return null;
        }
        try {
            long b2 = hx5.b();
            nj9<R> q = q(data, dl2Var);
            if (Log.isLoggable("DecodeJob", 2)) {
                z("Decoded result " + q, b2);
            }
            return q;
        } finally {
            uk2Var.b();
        }
    }

    private <Data> nj9<R> q(Data data, dl2 dl2Var) throws GlideException {
        return L(data, dl2Var, (q<Data, ?, R>) this.a.h(data.getClass()));
    }

    private void s() {
        nj9<R> nj9Var;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.t;
            A("Retrieved data", j, "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B);
        }
        try {
            nj9Var = p(this.B, this.z, this.A);
        } catch (GlideException e2) {
            e2.k(this.y, this.A);
            this.b.add(e2);
            nj9Var = null;
        }
        if (nj9Var != null) {
            C(nj9Var, this.A, this.Z);
        } else {
            K();
        }
    }

    private com.bumptech.glide.load.engine.f t() {
        int i = a.b[this.r.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.r);
                }
                return new v(this.a, this);
            }
            return new com.bumptech.glide.load.engine.c(this.a, this);
        }
        return new s(this.a, this);
    }

    private EnumC0103h u(EnumC0103h enumC0103h) {
        int i = a.b[enumC0103h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (this.n.b()) {
                            return EnumC0103h.RESOURCE_CACHE;
                        }
                        return u(EnumC0103h.RESOURCE_CACHE);
                    }
                    throw new IllegalArgumentException("Unrecognized stage: " + enumC0103h);
                }
                return EnumC0103h.FINISHED;
            } else if (this.u) {
                return EnumC0103h.FINISHED;
            } else {
                return EnumC0103h.SOURCE;
            }
        } else if (this.n.a()) {
            return EnumC0103h.DATA_CACHE;
        } else {
            return u(EnumC0103h.DATA_CACHE);
        }
    }

    @NonNull
    private ac7 v(dl2 dl2Var) {
        boolean z;
        ac7 ac7Var = this.o;
        if (Build.VERSION.SDK_INT < 26) {
            return ac7Var;
        }
        if (dl2Var != dl2.RESOURCE_DISK_CACHE && !this.a.x()) {
            z = false;
        } else {
            z = true;
        }
        mb7<Boolean> mb7Var = g73.j;
        Boolean bool = (Boolean) ac7Var.c(mb7Var);
        if (bool != null && (!bool.booleanValue() || z)) {
            return ac7Var;
        }
        ac7 ac7Var2 = new ac7();
        ac7Var2.d(this.o);
        ac7Var2.f(mb7Var, Boolean.valueOf(z));
        return ac7Var2;
    }

    private int w() {
        return this.j.ordinal();
    }

    private void z(String str, long j) {
        A(str, j, null);
    }

    @NonNull
    <Z> nj9<Z> G(dl2 dl2Var, @NonNull nj9<Z> nj9Var) {
        nj9<Z> nj9Var2;
        tkb<Z> tkbVar;
        xg3 xg3Var;
        se5 dVar;
        Class<?> cls = nj9Var.get().getClass();
        uj9<Z> uj9Var = null;
        if (dl2Var != dl2.RESOURCE_DISK_CACHE) {
            tkb<Z> s = this.a.s(cls);
            tkbVar = s;
            nj9Var2 = s.a(this.h, nj9Var, this.l, this.m);
        } else {
            nj9Var2 = nj9Var;
            tkbVar = null;
        }
        if (!nj9Var.equals(nj9Var2)) {
            nj9Var.b();
        }
        if (this.a.w(nj9Var2)) {
            uj9Var = this.a.n(nj9Var2);
            xg3Var = uj9Var.b(this.o);
        } else {
            xg3Var = xg3.NONE;
        }
        uj9 uj9Var2 = uj9Var;
        if (this.n.d(!this.a.y(this.x), dl2Var, xg3Var)) {
            if (uj9Var2 != null) {
                int i = a.c[xg3Var.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        dVar = new t(this.a.b(), this.x, this.i, this.l, this.m, tkbVar, cls, this.o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + xg3Var);
                    }
                } else {
                    dVar = new com.bumptech.glide.load.engine.d(this.x, this.i);
                }
                r e2 = r.e(nj9Var2);
                this.f.d(dVar, uj9Var2, e2);
                return e2;
            }
            throw new Registry.NoResultEncoderAvailableException(nj9Var2.get().getClass());
        }
        return nj9Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(boolean z) {
        if (this.g.d(z)) {
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O() {
        EnumC0103h u = u(EnumC0103h.INITIALIZE);
        if (u != EnumC0103h.RESOURCE_CACHE && u != EnumC0103h.DATA_CACHE) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(se5 se5Var, Exception exc, uk2<?> uk2Var, dl2 dl2Var) {
        uk2Var.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.l(se5Var, dl2Var, uk2Var.a());
        this.b.add(glideException);
        if (Thread.currentThread() != this.w) {
            J(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            K();
        }
    }

    @Override // defpackage.po3.f
    @NonNull
    public eva g() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void h(se5 se5Var, Object obj, uk2<?> uk2Var, dl2 dl2Var, se5 se5Var2) {
        this.x = se5Var;
        this.z = obj;
        this.B = uk2Var;
        this.A = dl2Var;
        this.y = se5Var2;
        boolean z = false;
        if (se5Var != this.a.c().get(0)) {
            z = true;
        }
        this.Z = z;
        if (Thread.currentThread() != this.w) {
            J(g.DECODE_DATA);
            return;
        }
        fg4.a("DecodeJob.decodeFromRetrievedData");
        try {
            s();
        } finally {
            fg4.e();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void i() {
        J(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void k() {
        this.Y = true;
        com.bumptech.glide.load.engine.f fVar = this.I;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(@NonNull h<?> hVar) {
        int w = w() - hVar.w();
        if (w == 0) {
            return this.q - hVar.q;
        }
        return w;
    }

    @Override // java.lang.Runnable
    public void run() {
        fg4.c("DecodeJob#run(reason=%s, model=%s)", this.s, this.v);
        uk2<?> uk2Var = this.B;
        try {
            try {
                if (this.Y) {
                    D();
                    if (uk2Var != null) {
                        uk2Var.b();
                    }
                    fg4.e();
                    return;
                }
                M();
                if (uk2Var != null) {
                    uk2Var.b();
                }
                fg4.e();
            } catch (Throwable th) {
                if (uk2Var != null) {
                    uk2Var.b();
                }
                fg4.e();
                throw th;
            }
        } catch (com.bumptech.glide.load.engine.b e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.Y + ", stage: " + this.r, th2);
            }
            if (this.r != EnumC0103h.ENCODE) {
                this.b.add(th2);
                D();
            }
            if (!this.Y) {
                throw th2;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<R> x(com.bumptech.glide.d dVar, Object obj, m mVar, se5 se5Var, int i, int i2, Class<?> cls, Class<R> cls2, yj8 yj8Var, d33 d33Var, Map<Class<?>, tkb<?>> map, boolean z, boolean z2, boolean z3, ac7 ac7Var, b<R> bVar, int i3) {
        this.a.v(dVar, obj, se5Var, i, i2, d33Var, cls, cls2, yj8Var, ac7Var, map, z, z2, this.d);
        this.h = dVar;
        this.i = se5Var;
        this.j = yj8Var;
        this.k = mVar;
        this.l = i;
        this.m = i2;
        this.n = d33Var;
        this.u = z3;
        this.o = ac7Var;
        this.p = bVar;
        this.q = i3;
        this.s = g.INITIALIZE;
        this.v = obj;
        return this;
    }
}
