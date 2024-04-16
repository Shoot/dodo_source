package io.realm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import defpackage.r89;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.i0;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.d;
import io.realm.j0;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Realm.java */
/* loaded from: classes3.dex */
public class d0 extends io.realm.a {
    private static final Object m = new Object();
    private static j0 n;
    private final q0 l;

    /* compiled from: Realm.java */
    /* loaded from: classes3.dex */
    class a implements i0.b {
        final /* synthetic */ AtomicInteger a;

        a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        @Override // io.realm.i0.b
        public void onResult(int i) {
            this.a.set(i);
        }
    }

    /* compiled from: Realm.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    private d0(i0 i0Var, OsSharedRealm.a aVar) {
        super(i0Var, n0(i0Var.j().o()), aVar);
        this.l = new r(this, new rf1(this.c.o(), this.e.getSchemaInfo()));
        if (this.c.s()) {
            t89 o = this.c.o();
            for (Class<? extends o89> cls : o.k()) {
                String q = Table.q(o.m(cls));
                if (!this.e.hasTable(q)) {
                    this.e.close();
                    throw new RealmMigrationNeededException(this.c.k(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.h(q)));
                }
            }
        }
    }

    public static int E0(j0 j0Var) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        i0.n(j0Var, new a(atomicInteger));
        return atomicInteger.get();
    }

    public static d0 F0(j0 j0Var) {
        if (j0Var != null) {
            return (d0) i0.e(j0Var, d0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    private static void L(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            }
            try {
                filesDir.mkdirs();
            } catch (SecurityException unused) {
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j = 0;
            int i = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i++;
                long j2 = jArr[Math.min(i, 4)];
                SystemClock.sleep(j2);
                j += j2;
            } while (j <= 200);
        }
        if (context.getFilesDir() != null && context.getFilesDir().exists()) {
            return;
        }
        throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
    }

    private void M(Class<? extends o89> cls) {
        if (K0(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    public static synchronized void M0(Context context) {
        synchronized (d0.class) {
            N0(context, "");
        }
    }

    private void N(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i);
    }

    private static void N0(Context context, String str) {
        if (io.realm.a.h == null) {
            if (context != null) {
                L(context);
                if (!Q0(context)) {
                    e89.a(context);
                    S0(new j0.a(context).b());
                    io.realm.internal.d.e().h(context, str, new d.a() { // from class: a89
                    }, new d.b() { // from class: b89
                    });
                    if (context.getApplicationContext() != null) {
                        io.realm.a.h = context.getApplicationContext();
                    } else {
                        io.realm.a.h = context;
                    }
                    OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
                    return;
                }
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            throw new IllegalArgumentException("Non-null context required.");
        }
    }

    private <E extends o89> void P(E e) {
        if (e != null) {
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
    }

    private <E extends o89> void Q(E e) {
        if (e != null) {
            if (n0.isManaged(e) && n0.isValid(e)) {
                if (!(e instanceof DynamicRealmObject)) {
                    return;
                }
                throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
            }
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
    }

    private static boolean Q0(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            com.google.android.gms.common.api.a<a.d.c> aVar = g55.c;
            return ((Boolean) ro7.class.getMethod("isInstantApp", new Class[0]).invoke(g55.class.getMethod("getPackageManagerCompat", Context.class).invoke(null, context), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void S0(j0 j0Var) {
        if (j0Var != null) {
            synchronized (m) {
                n = j0Var;
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    private <E extends o89> E e0(E e, boolean z, Map<o89, r89> map, Set<ex4> set) {
        c();
        if (H()) {
            if (!this.c.o().r(Util.c(e.getClass()))) {
                try {
                    return (E) this.c.o().c(this, e, z, map, set);
                } catch (RuntimeException e2) {
                    if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                        throw new RealmPrimaryKeyConstraintException(e2.getMessage());
                    }
                    throw e2;
                }
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }

    public static boolean j(j0 j0Var) {
        return io.realm.a.j(j0Var);
    }

    public static boolean l(j0 j0Var) {
        return io.realm.a.l(j0Var);
    }

    private <E extends o89> E m0(E e, int i, Map<o89, r89.a<o89>> map) {
        c();
        return (E) this.c.o().e(e, i, map);
    }

    private static OsSchemaInfo n0(t89 t89Var) {
        return new OsSchemaInfo(t89Var.h().values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 o0(i0 i0Var, OsSharedRealm.a aVar) {
        return new d0(i0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 p0(OsSharedRealm osSharedRealm) {
        return new d0(osSharedRealm);
    }

    public static j0 r0() {
        j0 j0Var;
        synchronized (m) {
            j0Var = n;
        }
        return j0Var;
    }

    public static d0 x0() {
        j0 r0 = r0();
        if (r0 == null) {
            if (io.realm.a.h == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
            }
            throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (d0) i0.e(r0, d0.class);
    }

    public static Object z0() {
        try {
            Constructor<?> constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e2);
        } catch (InvocationTargetException e3) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e3);
        }
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean E() {
        return super.E();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table I0(Class<? extends o89> cls) {
        return this.l.j(cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void K() {
        super.K();
    }

    boolean K0(Class<? extends o89> cls) {
        return this.c.o().o(cls);
    }

    public void O0(o89 o89Var) {
        e();
        if (o89Var != null) {
            this.c.o().q(this, o89Var, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public <E extends o89> E S(E e) {
        return (E) T(e, Integer.MAX_VALUE);
    }

    public <E extends o89> E T(E e, int i) {
        N(i);
        Q(e);
        return (E) m0(e, i, new HashMap());
    }

    public <E extends o89> List<E> W(Iterable<E> iterable) {
        return b0(iterable, Integer.MAX_VALUE);
    }

    public <E extends o89> RealmQuery<E> Y0(Class<E> cls) {
        c();
        return RealmQuery.b(this, cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public <E extends o89> List<E> b0(Iterable<E> iterable, int i) {
        ArrayList arrayList;
        N(i);
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (E e : iterable) {
            Q(e);
            arrayList.add(m0(e, i, hashMap));
        }
        return arrayList;
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void beginTransaction() {
        super.beginTransaction();
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public <E extends o89> E f0(E e, ex4... ex4VarArr) {
        P(e);
        return (E) e0(e, false, new HashMap(), Util.h(ex4VarArr));
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends o89> E j0(E e, ex4... ex4VarArr) {
        P(e);
        M(e.getClass());
        return (E) e0(e, true, new HashMap(), Util.h(ex4VarArr));
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public <E extends o89> List<E> l0(Iterable<E> iterable, ex4... ex4VarArr) {
        ArrayList arrayList;
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        Set<ex4> h = Util.h(ex4VarArr);
        for (E e : iterable) {
            P(e);
            arrayList.add(e0(e, true, hashMap, h));
        }
        return arrayList;
    }

    @Override // io.realm.a
    /* renamed from: q0 */
    public d0 n() {
        return (d0) i0.f(this.c, d0.class, this.e.getVersionID());
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ j0 s() {
        return super.s();
    }

    @Override // io.realm.a
    public q0 u() {
        return this.l;
    }

    private d0(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.l = new r(this, new rf1(this.c.o(), osSharedRealm.getSchemaInfo()));
    }
}
