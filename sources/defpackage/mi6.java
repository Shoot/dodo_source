package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MetadataBackendRegistry.java */
/* renamed from: mi6  reason: default package */
/* loaded from: classes2.dex */
class mi6 implements a60 {
    private final a a;
    private final l22 b;
    private final Map<String, vlb> c;

    /* compiled from: MetadataBackendRegistry.java */
    /* renamed from: mi6$a */
    /* loaded from: classes2.dex */
    static class a {
        private final Context a;
        private Map<String, String> b = null;

        a(Context context) {
            this.a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d = d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        z50 b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (z50) Class.forName(str2).asSubclass(z50.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mi6(Context context, l22 l22Var) {
        this(new a(context), l22Var);
    }

    @Override // defpackage.a60
    public synchronized vlb get(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        z50 b = this.a.b(str);
        if (b == null) {
            return null;
        }
        vlb create = b.create(this.b.a(str));
        this.c.put(str, create);
        return create;
    }

    mi6(a aVar, l22 l22Var) {
        this.c = new HashMap();
        this.a = aVar;
        this.b = l22Var;
    }
}
