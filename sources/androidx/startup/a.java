package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {
    private static volatile a d;
    private static final Object e = new Object();
    @NonNull
    final Context c;
    @NonNull
    final Set<Class<? extends y25<?>>> b = new HashSet();
    @NonNull
    final Map<Class<?>, Object> a = new HashMap();

    a(@NonNull Context context) {
        this.c = context.getApplicationContext();
    }

    @NonNull
    private <T> T d(@NonNull Class<? extends y25<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        if (pjb.d()) {
            try {
                pjb.a(cls.getSimpleName());
            } catch (Throwable th) {
                pjb.b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.a.containsKey(cls)) {
                set.add(cls);
                y25<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends y25<?>>> a = newInstance.a();
                if (!a.isEmpty()) {
                    for (Class<? extends y25<?>> cls2 : a) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.b(this.c);
                set.remove(cls);
                this.a.put(cls, t);
            } else {
                t = (T) this.a.get(cls);
            }
            pjb.b();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                pjb.a("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            pjb.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.c.getString(b19.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (y25.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                for (Class<? extends y25<?>> cls2 : this.b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    @NonNull
    <T> T c(@NonNull Class<? extends y25<?>> cls) {
        T t;
        synchronized (e) {
            try {
                t = (T) this.a.get(cls);
                if (t == null) {
                    t = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends y25<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends y25<?>> cls) {
        return this.b.contains(cls);
    }
}
