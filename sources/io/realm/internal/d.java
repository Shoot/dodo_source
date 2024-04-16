package io.realm.internal;

import android.content.Context;
import io.realm.d0;
import io.realm.exceptions.RealmException;
import io.realm.j0;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ObjectServerFacade.java */
/* loaded from: classes3.dex */
public class d {
    private static final d a = new d();
    private static d b;

    /* compiled from: ObjectServerFacade.java */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: ObjectServerFacade.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    static {
        b = null;
        try {
            b = (d) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public static d c(boolean z) {
        if (z) {
            return b;
        }
        return a;
    }

    public static d e() {
        d dVar = b;
        if (dVar != null) {
            return dVar;
        }
        return a;
    }

    public Object[] d(j0 j0Var) {
        return new Object[19];
    }

    public String f(j0 j0Var) {
        return null;
    }

    public String g(j0 j0Var) {
        return null;
    }

    public void b(j0 j0Var) {
    }

    public void i(j0 j0Var) {
    }

    public void j(OsRealmConfig osRealmConfig) {
    }

    public void a(d0 d0Var, j0 j0Var) {
    }

    public void h(Context context, String str, a aVar, b bVar) {
    }
}
