package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmCache.java */
/* loaded from: classes3.dex */
public final class i0 {
    private static final List<WeakReference<i0>> f = new ArrayList();
    private static final Collection<i0> g = new ConcurrentLinkedQueue();
    private final String b;
    private j0 c;
    private final Map<vp7<d, OsSharedRealm.a>, e> a = new HashMap();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Set<String> e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ File a;
        final /* synthetic */ j0 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;

        a(File file, j0 j0Var, boolean z, String str) {
            this.a = file;
            this.b = j0Var;
            this.c = z;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a != null) {
                i0.c(this.b.c(), this.a);
            }
            if (this.c) {
                i0.c(io.realm.internal.d.c(this.b.u()).f(this.b), new File(this.d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public interface b {
        void onResult(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public static class c extends e {
        private io.realm.a c;

        private c() {
            super(null);
        }

        @Override // io.realm.i0.e
        public void a() {
            String path = this.c.getPath();
            this.a.set(null);
            this.c = null;
            if (this.b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " not be negative.");
        }

        @Override // io.realm.i0.e
        io.realm.a c() {
            return this.c;
        }

        @Override // io.realm.i0.e
        int d() {
            return this.b.get();
        }

        @Override // io.realm.i0.e
        boolean e() {
            if (this.c != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.i0.e
        void g(io.realm.a aVar) {
            this.c = aVar;
            this.a.set(0);
            this.b.incrementAndGet();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public enum d {
        TYPED_REALM,
        DYNAMIC_REALM;

        static d a(Class<? extends io.realm.a> cls) {
            if (cls == d0.class) {
                return TYPED_REALM;
            }
            if (cls == m.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    private i0(String str) {
        this.b = str;
    }

    private static void b(j0 j0Var) {
        File file;
        if (j0Var.q()) {
            file = new File(j0Var.l(), j0Var.m());
        } else {
            file = null;
        }
        String g2 = io.realm.internal.d.c(j0Var.u()).g(j0Var);
        boolean z = !Util.f(g2);
        if (file != null || z) {
            OsObjectStore.a(j0Var, new a(file, j0Var, z, g2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.a.h     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.InputStream r1 = r1.open(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            if (r1 == 0) goto L4d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1d:
            int r3 = r1.read(r7)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r4 = -1
            if (r3 <= r4) goto L2f
            r4 = 0
            r2.write(r7, r4, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1d
        L29:
            r6 = move-exception
        L2a:
            r0 = r1
            goto L85
        L2c:
            r7 = move-exception
        L2d:
            r0 = r1
            goto L6b
        L2f:
            r1.close()     // Catch: java.io.IOException -> L33
            goto L34
        L33:
            r0 = move-exception
        L34:
            r2.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r6 = move-exception
            if (r0 != 0) goto L3c
            r0 = r6
        L3c:
            if (r0 != 0) goto L3f
            return
        L3f:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>(r7, r0)
            throw r6
        L47:
            r6 = move-exception
            r2 = r0
            goto L2a
        L4a:
            r7 = move-exception
            r2 = r0
            goto L2d
        L4d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r3.append(r6)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            throw r7     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
        L66:
            r6 = move-exception
            r2 = r0
            goto L85
        L69:
            r7 = move-exception
            r2 = r0
        L6b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L84
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            r4.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
        L85:
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L8b
            goto L8c
        L8b:
        L8c:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L91
        L91:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.i0.c(java.lang.String, java.io.File):void");
    }

    private <E extends io.realm.a> void d(Class<E> cls, e eVar, OsSharedRealm.a aVar) {
        io.realm.a L;
        if (cls == d0.class) {
            L = d0.o0(this, aVar);
            L.u().c();
        } else if (cls == m.class) {
            L = m.L(this, aVar);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        eVar.g(L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends io.realm.a> E e(j0 j0Var, Class<E> cls) {
        return (E) i(j0Var.k(), true).g(j0Var, cls, OsSharedRealm.a.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends io.realm.a> E f(j0 j0Var, Class<E> cls, OsSharedRealm.a aVar) {
        return (E) i(j0Var.k(), true).g(j0Var, cls, aVar);
    }

    private synchronized <E extends io.realm.a> E g(j0 j0Var, Class<E> cls, OsSharedRealm.a aVar) {
        E e2;
        try {
            e k = k(cls, aVar);
            boolean z = false;
            if (l() == 0) {
                z = true;
            }
            if (z) {
                b(j0Var);
                boolean z2 = !j0Var.v();
                if (j0Var.u()) {
                    if (!z2) {
                        if (this.e.contains(j0Var.k())) {
                        }
                    }
                    io.realm.internal.d.e().j(new OsRealmConfig.b(j0Var).b());
                    io.realm.internal.d.e().b(j0Var);
                    this.e.remove(j0Var.k());
                }
                this.c = j0Var;
            } else {
                q(j0Var);
            }
            if (!k.e()) {
                d(cls, k, aVar);
            }
            k.f(1);
            e2 = (E) k.c();
            if (z) {
                io.realm.internal.d.e().a(d0.p0(e2.e), j0Var);
                if (!j0Var.s()) {
                    e2.K();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return e2;
    }

    private synchronized void h(b bVar) {
        bVar.onResult(l());
    }

    private static i0 i(String str, boolean z) {
        i0 i0Var;
        List<WeakReference<i0>> list = f;
        synchronized (list) {
            try {
                Iterator<WeakReference<i0>> it = list.iterator();
                i0Var = null;
                while (it.hasNext()) {
                    i0 i0Var2 = it.next().get();
                    if (i0Var2 == null) {
                        it.remove();
                    } else if (i0Var2.b.equals(str)) {
                        i0Var = i0Var2;
                    }
                }
                if (i0Var == null && z) {
                    i0Var = new i0(str);
                    f.add(new WeakReference<>(i0Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i0Var;
    }

    private <E extends io.realm.a> e k(Class<E> cls, OsSharedRealm.a aVar) {
        vp7<d, OsSharedRealm.a> vp7Var = new vp7<>(d.a(cls), aVar);
        e eVar = this.a.get(vp7Var);
        if (eVar == null) {
            if (aVar.equals(OsSharedRealm.a.c)) {
                eVar = new f(null);
            } else {
                eVar = new c(null);
            }
            this.a.put(vp7Var, eVar);
        }
        return eVar;
    }

    private int l() {
        int i = 0;
        for (e eVar : this.a.values()) {
            i += eVar.b();
        }
        return i;
    }

    private int m() {
        int i = 0;
        for (e eVar : this.a.values()) {
            if (eVar instanceof f) {
                i += eVar.b();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(j0 j0Var, b bVar) {
        synchronized (f) {
            try {
                i0 i = i(j0Var.k(), false);
                if (i == null) {
                    bVar.onResult(0);
                } else {
                    i.h(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q(j0 j0Var) {
        if (this.c.equals(j0Var)) {
            return;
        }
        if (Arrays.equals(this.c.f(), j0Var.f())) {
            j0Var.i();
            this.c.i();
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.c + "\n\nNew configuration: \n" + j0Var);
        }
        throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
    }

    public j0 j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (!this.d.getAndSet(true)) {
            g.add(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(io.realm.a aVar) {
        OsSharedRealm.a aVar2;
        io.realm.a c2;
        try {
            String path = aVar.getPath();
            Class<?> cls = aVar.getClass();
            if (aVar.E()) {
                aVar2 = aVar.e.getVersionID();
            } else {
                aVar2 = OsSharedRealm.a.c;
            }
            e k = k(cls, aVar2);
            int d2 = k.d();
            if (d2 <= 0) {
                RealmLog.g("%s has been closed already. refCount is %s", path, Integer.valueOf(d2));
                return;
            }
            int i = d2 - 1;
            if (i == 0) {
                k.a();
                aVar.m();
                if (m() == 0) {
                    this.c = null;
                    for (e eVar : this.a.values()) {
                        if ((eVar instanceof c) && (c2 = eVar.c()) != null) {
                            while (!c2.isClosed()) {
                                c2.close();
                            }
                        }
                    }
                    io.realm.internal.d.c(aVar.s().u()).i(aVar.s());
                }
            } else {
                k.h(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public static class f extends e {
        private final ThreadLocal<io.realm.a> c;

        private f() {
            super(null);
            this.c = new ThreadLocal<>();
        }

        @Override // io.realm.i0.e
        public void a() {
            String path = this.c.get().getPath();
            this.a.set(null);
            this.c.set(null);
            if (this.b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " can not be negative.");
        }

        @Override // io.realm.i0.e
        public io.realm.a c() {
            return this.c.get();
        }

        @Override // io.realm.i0.e
        public int d() {
            Integer num = this.a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.i0.e
        public boolean e() {
            if (this.c.get() != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.i0.e
        public void g(io.realm.a aVar) {
            this.c.set(aVar);
            this.a.set(0);
            this.b.incrementAndGet();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes3.dex */
    public static abstract class e {
        protected final ThreadLocal<Integer> a;
        protected AtomicInteger b;

        private e() {
            this.a = new ThreadLocal<>();
            this.b = new AtomicInteger(0);
        }

        abstract void a();

        public int b() {
            return this.b.get();
        }

        abstract io.realm.a c();

        abstract int d();

        abstract boolean e();

        public void f(int i) {
            Integer num = this.a.get();
            ThreadLocal<Integer> threadLocal = this.a;
            if (num != null) {
                i += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i));
        }

        abstract void g(io.realm.a aVar);

        public void h(int i) {
            this.a.set(Integer.valueOf(i));
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
