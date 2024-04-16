package io.realm;

import io.realm.i0;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
/* compiled from: DynamicRealm.java */
/* loaded from: classes3.dex */
public class m extends io.realm.a {
    private final q0 l;

    /* compiled from: DynamicRealm.java */
    /* loaded from: classes3.dex */
    class a implements i0.b {
        final /* synthetic */ i0 a;

        a(i0 i0Var) {
            this.a = i0Var;
        }

        @Override // io.realm.i0.b
        public void onResult(int i) {
            if (i > 0 || this.a.j().s() || OsObjectStore.c(m.this.e) != -1) {
                return;
            }
            m.this.e.beginTransaction();
            if (OsObjectStore.c(m.this.e) == -1) {
                OsObjectStore.d(m.this.e, -1L);
            }
            m.this.e.commitTransaction();
        }
    }

    private m(i0 i0Var, OsSharedRealm.a aVar) {
        super(i0Var, (OsSchemaInfo) null, aVar);
        i0.n(i0Var.j(), new a(i0Var));
        this.l = new w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m L(i0 i0Var, OsSharedRealm.a aVar) {
        return new m(i0Var, aVar);
    }

    public static m N(j0 j0Var) {
        if (j0Var != null) {
            return (m) i0.e(j0Var, m.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean E() {
        return super.E();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void K() {
        super.K();
    }

    @Override // io.realm.a
    /* renamed from: M */
    public m n() {
        OsSharedRealm.a versionID;
        try {
            versionID = this.e.getVersionID();
        } catch (IllegalStateException unused) {
            y();
            versionID = this.e.getVersionID();
        }
        return (m) i0.f(this.c, m.class, versionID);
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ j0 s() {
        return super.s();
    }

    @Override // io.realm.a
    public q0 u() {
        return this.l;
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ long y() {
        return super.y();
    }
}
