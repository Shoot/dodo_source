package io.realm;

import defpackage.o89;
import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.internal.e;
import io.realm.internal.f;
import java.util.List;
/* compiled from: ProxyState.java */
/* loaded from: classes3.dex */
public final class c0<E extends o89> implements f.a {
    private static b i = new b();
    private E a;
    private fp9 c;
    private OsObject d;
    private io.realm.a e;
    private boolean f;
    private List<String> g;
    private boolean b = true;
    private io.realm.internal.e<OsObject.b> h = new io.realm.internal.e<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyState.java */
    /* loaded from: classes3.dex */
    public static class b implements e.a<OsObject.b> {
        private b() {
        }

        @Override // io.realm.internal.e.a
        /* renamed from: b */
        public void a(OsObject.b bVar, Object obj) {
            bVar.a((o89) obj, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProxyState.java */
    /* loaded from: classes3.dex */
    public static class c<T extends o89> implements q89<T> {
        private final d89<T> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(d89<T> d89Var) {
            if (d89Var != null) {
                this.a = d89Var;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        @Override // defpackage.q89
        public void a(T t, p47 p47Var) {
            this.a.a(t);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public c0(E e) {
        this.a = e;
    }

    private void k() {
        this.h.c(i);
    }

    private void l() {
        OsSharedRealm osSharedRealm = this.e.e;
        if (osSharedRealm != null && !osSharedRealm.isClosed() && this.c.a() && this.d == null) {
            OsObject osObject = new OsObject(this.e.e, (UncheckedRow) this.c);
            this.d = osObject;
            osObject.setObserverPairs(this.h);
            this.h = null;
        }
    }

    @Override // io.realm.internal.f.a
    public void a(fp9 fp9Var) {
        this.c = fp9Var;
        k();
        if (fp9Var.a()) {
            l();
        }
    }

    public void b(q89<E> q89Var) {
        fp9 fp9Var = this.c;
        if (fp9Var instanceof io.realm.internal.f) {
            this.h.a(new OsObject.b(this.a, q89Var));
        } else if (fp9Var instanceof UncheckedRow) {
            l();
            OsObject osObject = this.d;
            if (osObject != null) {
                osObject.addListener(this.a, q89Var);
            }
        }
    }

    public void c(o89 o89Var) {
        if (n0.isValid(o89Var) && n0.isManaged(o89Var)) {
            if (((r89) o89Var).a().f() == f()) {
                return;
            }
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        throw new IllegalArgumentException("'value' is not a valid managed object.");
    }

    public boolean d() {
        return this.f;
    }

    public List<String> e() {
        return this.g;
    }

    public io.realm.a f() {
        return this.e;
    }

    public fp9 g() {
        return this.c;
    }

    public boolean h() {
        return this.c.isLoaded();
    }

    public boolean i() {
        return this.b;
    }

    public void j() {
        fp9 fp9Var = this.c;
        if (fp9Var instanceof io.realm.internal.f) {
            ((io.realm.internal.f) fp9Var).c();
        }
    }

    public void m() {
        OsObject osObject = this.d;
        if (osObject != null) {
            osObject.removeListener(this.a);
        } else {
            this.h.b();
        }
    }

    public void n(q89<E> q89Var) {
        OsObject osObject = this.d;
        if (osObject != null) {
            osObject.removeListener(this.a, q89Var);
        } else {
            this.h.e(this.a, q89Var);
        }
    }

    public void o(boolean z) {
        this.f = z;
    }

    public void p() {
        this.b = false;
        this.g = null;
    }

    public void q(List<String> list) {
        this.g = list;
    }

    public void r(io.realm.a aVar) {
        this.e = aVar;
    }

    public void s(fp9 fp9Var) {
        this.c = fp9Var;
    }
}
