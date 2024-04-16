package io.realm;

import io.realm.c0;
import io.realm.log.RealmLog;
import java.util.Collections;
/* compiled from: RealmObject.java */
/* loaded from: classes3.dex */
public abstract class n0 implements o89 {
    static final String MSG_DELETED_OBJECT = "the object is already deleted.";
    static final String MSG_DYNAMIC_OBJECT = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";
    static final String MSG_NULL_OBJECT = "'model' is null.";

    public final <E extends o89> void addChangeListener(q89<E> q89Var) {
        addChangeListener(this, (q89<n0>) q89Var);
    }

    public final <E extends n0> r57<o47<E>> asChangesetObservable() {
        return asChangesetObservable(this);
    }

    public final <E extends n0> l04<E> asFlowable() {
        return asFlowable(this);
    }

    public final void deleteFromRealm() {
        deleteFromRealm(this);
    }

    public final <E extends o89> E freeze() {
        return (E) freeze(this);
    }

    public d0 getRealm() {
        return getRealm(this);
    }

    public final boolean isFrozen() {
        return isFrozen(this);
    }

    public final boolean isLoaded() {
        return isLoaded(this);
    }

    public boolean isManaged() {
        return isManaged(this);
    }

    public final boolean isValid() {
        return isValid(this);
    }

    public final boolean load() {
        return load(this);
    }

    public final void removeAllChangeListeners() {
        removeAllChangeListeners(this);
    }

    public final void removeChangeListener(q89 q89Var) {
        removeChangeListener(this, q89Var);
    }

    public static <E extends o89> r57<o47<E>> asChangesetObservable(E e) {
        if (e instanceof r89) {
            a f = ((r89) e).a().f();
            if (f instanceof d0) {
                return f.c.n().a((d0) f, e);
            }
            if (f instanceof m) {
                return f.c.n().d((m) f, (DynamicRealmObject) e);
            }
            throw new UnsupportedOperationException(f.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends o89> l04<E> asFlowable(E e) {
        if (e instanceof r89) {
            a f = ((r89) e).a().f();
            if (f instanceof d0) {
                return f.c.n().b((d0) f, e);
            }
            if (f instanceof m) {
                return f.c.n().c((m) f, (DynamicRealmObject) e);
            }
            throw new UnsupportedOperationException(f.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends o89> void deleteFromRealm(E e) {
        if (e instanceof r89) {
            r89 r89Var = (r89) e;
            if (r89Var.a().g() != null) {
                if (r89Var.a().f() != null) {
                    r89Var.a().f().c();
                    fp9 g = r89Var.a().g();
                    g.o().x(g.E0());
                    r89Var.a().s(g75.INSTANCE);
                    return;
                }
                throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            }
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
    }

    public static <E extends o89> E freeze(E e) {
        if (e instanceof r89) {
            r89 r89Var = (r89) e;
            a f = r89Var.a().f();
            a n = f.E() ? f : f.n();
            fp9 z0 = r89Var.a().g().z0(n.e);
            if (n instanceof m) {
                return new DynamicRealmObject(n, z0);
            }
            if (n instanceof d0) {
                Class<? super Object> superclass = e.getClass().getSuperclass();
                return (E) n.s().o().s(superclass, n, z0, f.u().e(superclass), false, Collections.emptyList());
            }
            throw new UnsupportedOperationException("Unknown Realm type: " + n.getClass().getName());
        }
        throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
    }

    public static d0 getRealm(o89 o89Var) {
        if (o89Var != null) {
            if (!(o89Var instanceof DynamicRealmObject)) {
                if (o89Var instanceof r89) {
                    a f = ((r89) o89Var).a().f();
                    f.c();
                    if (isValid(o89Var)) {
                        return (d0) f;
                    }
                    throw new IllegalStateException(MSG_DELETED_OBJECT);
                }
                return null;
            }
            throw new IllegalStateException(MSG_DYNAMIC_OBJECT);
        }
        throw new IllegalArgumentException(MSG_NULL_OBJECT);
    }

    public static <E extends o89> boolean isFrozen(E e) {
        if (e instanceof r89) {
            return ((r89) e).a().f().E();
        }
        return false;
    }

    public static <E extends o89> boolean isLoaded(E e) {
        if (e instanceof r89) {
            r89 r89Var = (r89) e;
            r89Var.a().f().c();
            return r89Var.a().h();
        }
        return true;
    }

    public static <E extends o89> boolean isManaged(E e) {
        return e instanceof r89;
    }

    public static <E extends o89> boolean isValid(E e) {
        if (!(e instanceof r89)) {
            return e != null;
        }
        fp9 g = ((r89) e).a().g();
        return g != null && g.a();
    }

    public static <E extends o89> boolean load(E e) {
        if (isLoaded(e)) {
            return true;
        }
        if (e instanceof r89) {
            ((r89) e).a().j();
            return true;
        }
        return false;
    }

    public static <E extends o89> void removeAllChangeListeners(E e) {
        if (e instanceof r89) {
            r89 r89Var = (r89) e;
            a f = r89Var.a().f();
            if (f.isClosed()) {
                RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f.c.k());
            }
            r89Var.a().m();
            return;
        }
        throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
    }

    public final <E extends o89> void addChangeListener(d89<E> d89Var) {
        addChangeListener(this, (d89<n0>) d89Var);
    }

    public final void removeChangeListener(d89 d89Var) {
        removeChangeListener(this, d89Var);
    }

    public static <E extends o89> void addChangeListener(E e, q89<E> q89Var) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (q89Var != null) {
            if (e instanceof r89) {
                r89 r89Var = (r89) e;
                a f = r89Var.a().f();
                f.c();
                f.e.capabilities.b("Listeners cannot be used on current thread.");
                r89Var.a().b(q89Var);
                return;
            }
            throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static <E extends o89> void removeChangeListener(E e, q89 q89Var) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (q89Var != null) {
            if (e instanceof r89) {
                r89 r89Var = (r89) e;
                a f = r89Var.a().f();
                if (f.isClosed()) {
                    RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f.c.k());
                }
                r89Var.a().n(q89Var);
                return;
            }
            throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static <E extends o89> void addChangeListener(E e, d89<E> d89Var) {
        addChangeListener(e, new c0.c(d89Var));
    }

    public static <E extends o89> void removeChangeListener(E e, d89<E> d89Var) {
        removeChangeListener(e, new c0.c(d89Var));
    }
}
