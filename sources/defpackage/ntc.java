package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.c;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.c86;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: ntc  reason: default package */
/* loaded from: classes2.dex */
public final class ntc {
    private static final String a = "ntc";
    @SuppressLint({"StaticFieldLeak"})
    private static Context b;
    private static hxc c;

    public static hxc a(Context context, c86.a aVar) throws GooglePlayServicesNotAvailableException {
        hxc dwcVar;
        gh8.j(context);
        String str = a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        hxc hxcVar = c;
        if (hxcVar == null) {
            int f = c.f(context, 13400000);
            if (f == 0) {
                Log.i(str, "Making Creator dynamically");
                try {
                    IBinder iBinder = (IBinder) d(((ClassLoader) gh8.j(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        dwcVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (queryLocalInterface instanceof hxc) {
                            dwcVar = (hxc) queryLocalInterface;
                        } else {
                            dwcVar = new dwc(iBinder);
                        }
                    }
                    c = dwcVar;
                    try {
                        Context c2 = c(context, aVar);
                        c2.getClass();
                        dwcVar.a1(k57.U1(c2.getResources()), c.f);
                        return c;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new GooglePlayServicesNotAvailableException(f);
        }
        return hxcVar;
    }

    private static Context b(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return c.c(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        android.util.Log.d(defpackage.ntc.a, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.e(r2, com.google.android.gms.dynamite.DynamiteModule.b, "com.google.android.gms.maps_dynamite").b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2 = b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = b(r1, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Context c(android.content.Context r2, defpackage.c86.a r3) {
        /*
            android.content.Context r0 = defpackage.ntc.b
            if (r0 != 0) goto L4d
            r2.getApplicationContext()
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            if (r3 == 0) goto L1b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L18
            r1 = 1
            if (r3 == r1) goto L15
            goto L1b
        L15:
            java.lang.String r3 = "com.google.android.gms.maps_core_dynamite"
            goto L1c
        L18:
            java.lang.String r3 = "com.google.android.gms.maps_legacy_dynamite"
            goto L1c
        L1b:
            r3 = r0
        L1c:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = com.google.android.gms.dynamite.DynamiteModule.b     // Catch: java.lang.Exception -> L27
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.e(r2, r1, r3)     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = r1.b()     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r1 = move-exception
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            java.lang.String r3 = defpackage.ntc.a     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r3, r1)     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule$a r3 = com.google.android.gms.dynamite.DynamiteModule.b     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.e(r2, r3, r0)     // Catch: java.lang.Exception -> L40
            android.content.Context r2 = r3.b()     // Catch: java.lang.Exception -> L40
            goto L4a
        L40:
            r3 = move-exception
            android.content.Context r2 = b(r3, r2)
            goto L4a
        L46:
            android.content.Context r2 = b(r1, r2)
        L4a:
            defpackage.ntc.b = r2
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntc.c(android.content.Context, c86$a):android.content.Context");
    }

    private static Object d(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException unused) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        } catch (InstantiationException unused2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        }
    }
}
