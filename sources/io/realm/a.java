package io.realm;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseRealm.java */
/* loaded from: classes3.dex */
public abstract class a implements Closeable {
    static volatile Context h;
    static final v89 i = v89.c();
    public static final v89 j = v89.d();
    public static final d k = new d();
    final boolean a;
    final long b;
    protected final j0 c;
    private i0 d;
    public OsSharedRealm e;
    private boolean f;
    private OsSharedRealm.SchemaChangedCallback g;

    /* compiled from: BaseRealm.java */
    /* renamed from: io.realm.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0365a implements OsSharedRealm.SchemaChangedCallback {
        C0365a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            q0 u = a.this.u();
            if (u != null) {
                u.n();
            }
            if (a.this instanceof d0) {
                u.c();
            }
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        final /* synthetic */ j0 a;
        final /* synthetic */ AtomicBoolean b;

        b(j0 j0Var, AtomicBoolean atomicBoolean) {
            this.a = j0Var;
            this.b = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.set(Util.b(this.a.k(), this.a.l(), this.a.m()));
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes3.dex */
    public static final class c {
        private a a;
        private fp9 b;
        private sf1 c;
        private boolean d;
        private List<String> e;

        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = null;
        }

        public boolean b() {
            return this.d;
        }

        public sf1 c() {
            return this.c;
        }

        public List<String> d() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a e() {
            return this.a;
        }

        public fp9 f() {
            return this.b;
        }

        public void g(a aVar, fp9 fp9Var, sf1 sf1Var, boolean z, List<String> list) {
            this.a = aVar;
            this.b = fp9Var;
            this.c = sf1Var;
            this.d = z;
            this.e = list;
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes3.dex */
    static final class d extends ThreadLocal<c> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public c initialValue() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(i0 i0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this(i0Var.j(), osSchemaInfo, aVar);
        this.d = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(j0 j0Var) {
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(j0Var, OsSharedRealm.a.c);
        Boolean valueOf = Boolean.valueOf(osSharedRealm.compact());
        osSharedRealm.close();
        return valueOf.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(j0 j0Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.a(j0Var, new b(j0Var, atomicBoolean))) {
            return atomicBoolean.get();
        }
        throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: " + j0Var.k());
    }

    public boolean E() {
        OsSharedRealm osSharedRealm = this.e;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.a;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public boolean H() {
        c();
        return this.e.isInTransaction();
    }

    public void K() {
        c();
        b();
        if (!H()) {
            this.e.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    public void a() {
        c();
        this.e.cancelTransaction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (x().capabilities.a() && !s().r()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public void beginTransaction() {
        c();
        this.e.beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        OsSharedRealm osSharedRealm = this.e;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            if (!this.a && this.b != Thread.currentThread().getId()) {
                throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
            }
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.a && this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.p(this);
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (H()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }

    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.f && (osSharedRealm = this.e) != null && !osSharedRealm.isClosed()) {
            RealmLog.g("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.c.k());
            i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.o();
            }
        }
        super.finalize();
    }

    public String getPath() {
        return this.c.k();
    }

    public void i() {
        c();
        this.e.commitTransaction();
    }

    public boolean isClosed() {
        if (!this.a && this.b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.e;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return false;
        }
        return true;
    }

    public void k() {
        c();
        for (o0 o0Var : u().d()) {
            u().k(o0Var.a()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.d = null;
        OsSharedRealm osSharedRealm = this.e;
        if (osSharedRealm != null && this.f) {
            osSharedRealm.close();
            this.e = null;
        }
    }

    public abstract a n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends o89> E o(Class<E> cls, long j2, boolean z, List<String> list) {
        return (E) this.c.o().s(cls, this, u().j(cls).r(j2), u().e(cls), z, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends o89> E q(Class<E> cls, String str, long j2) {
        boolean z;
        Table j3;
        fp9 fp9Var;
        fp9 fp9Var2;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j3 = u().k(str);
        } else {
            j3 = u().j(cls);
        }
        if (z) {
            if (j2 != -1) {
                fp9Var2 = j3.f(j2);
            } else {
                fp9Var2 = g75.INSTANCE;
            }
            return new DynamicRealmObject(this, fp9Var2);
        }
        t89 o = this.c.o();
        if (j2 != -1) {
            fp9Var = j3.r(j2);
        } else {
            fp9Var = g75.INSTANCE;
        }
        return (E) o.s(cls, this, fp9Var, u().e(cls), false, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends o89> E r(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new DynamicRealmObject(this, CheckedRow.g(uncheckedRow));
        }
        return (E) this.c.o().s(cls, this, uncheckedRow, u().e(cls), false, Collections.emptyList());
    }

    public j0 s() {
        return this.c;
    }

    public abstract q0 u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSharedRealm x() {
        return this.e;
    }

    public long y() {
        return OsObjectStore.c(this.e);
    }

    a(j0 j0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this.g = new C0365a();
        this.b = Thread.currentThread().getId();
        this.c = j0Var;
        this.d = null;
        if (osSchemaInfo != null) {
            j0Var.i();
        }
        j0Var.g();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.b(j0Var).c(new File(h.getFilesDir(), ".realm.temp")).a(true).e(null).f(osSchemaInfo).d(null), aVar);
        this.e = osSharedRealm;
        this.a = osSharedRealm.isFrozen();
        this.f = true;
        this.e.registerSchemaChangedCallback(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(OsSharedRealm osSharedRealm) {
        this.g = new C0365a();
        this.b = Thread.currentThread().getId();
        this.c = osSharedRealm.getConfiguration();
        this.d = null;
        this.e = osSharedRealm;
        this.a = osSharedRealm.isFrozen();
        this.f = false;
    }
}
