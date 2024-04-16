package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ComponentDiscovery.java */
/* renamed from: qm1  reason: default package */
/* loaded from: classes2.dex */
public final class qm1<T> {
    private final T a;
    private final c<T> b;

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: qm1$b */
    /* loaded from: classes2.dex */
    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // defpackage.qm1.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: qm1$c */
    /* loaded from: classes2.dex */
    interface c<T> {
        List<String> a(T t);
    }

    qm1(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static qm1<Context> c(Context context, Class<? extends Service> cls) {
        return new qm1<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List<bs8<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new bs8() { // from class: pm1
                @Override // defpackage.bs8
                public final Object get() {
                    ComponentRegistrar d;
                    d = qm1.d(str);
                    return d;
                }
            });
        }
        return arrayList;
    }
}
