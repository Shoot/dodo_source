package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.huawei.hms.framework.common.ExceptionCode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class DynamiteModule {
    private static Boolean h = null;
    private static String i = null;
    private static boolean j = false;
    private static int k = -1;
    private static Boolean l;
    private static m q;
    private static n r;
    private final Context a;
    private static final ThreadLocal m = new ThreadLocal();
    private static final ThreadLocal n = new b();
    private static final a.InterfaceC0221a o = new c();
    @NonNull
    public static final a b = new d();
    @NonNull
    public static final a c = new e();
    @NonNull
    public static final a d = new f();
    @NonNull
    public static final a e = new g();
    @NonNull
    public static final a f = new h();
    @NonNull
    public static final a g = new i();
    @NonNull
    public static final a p = new j();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, s7d s7dVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, s7d s7dVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0221a {
            int a(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            int b(@NonNull Context context, @NonNull String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        /* loaded from: classes2.dex */
        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        @NonNull
        b a(@NonNull Context context, @NonNull String str, @NonNull InterfaceC0221a interfaceC0221a) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        gh8.j(context);
        this.a = context;
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!m57.a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int c(@NonNull Context context, @NonNull String str) {
        return f(context, str, false);
    }

    @NonNull
    public static DynamiteModule e(@NonNull Context context, @NonNull a aVar, @NonNull String str) throws LoadingException {
        long j2;
        Boolean bool;
        ns4 W1;
        DynamiteModule dynamiteModule;
        n nVar;
        boolean z;
        Boolean valueOf;
        ns4 T1;
        ThreadLocal threadLocal = m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a2 = aVar.a(context, str, o);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a2.a + " and remote module " + str + ":" + a2.b);
            int i2 = a2.c;
            if (i2 != 0) {
                if (i2 == -1) {
                    try {
                        if (a2.a != 0) {
                            i2 = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        j2 = 0;
                        if (longValue == j2) {
                            n.remove();
                        } else {
                            n.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        m.set(kVar);
                        throw th;
                    }
                }
                if (i2 != 1 || a2.b != 0) {
                    if (i2 == -1) {
                        DynamiteModule h2 = h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor2 = kVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(kVar);
                        return h2;
                    } else if (i2 == 1) {
                        try {
                            int i3 = a2.b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (k(context)) {
                                        bool = h;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        synchronized (DynamiteModule.class) {
                                            nVar = r;
                                        }
                                        if (nVar != null) {
                                            k kVar3 = (k) threadLocal.get();
                                            if (kVar3 != null && kVar3.a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor3 = kVar3.a;
                                                k57.U1(null);
                                                synchronized (DynamiteModule.class) {
                                                    if (k >= 2) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    valueOf = Boolean.valueOf(z);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    T1 = nVar.U1(k57.U1(applicationContext), str, i3, k57.U1(cursor3));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    T1 = nVar.T1(k57.U1(applicationContext), str, i3, k57.U1(cursor3));
                                                }
                                                Context context2 = (Context) k57.T1(T1);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        m l2 = l(context);
                                        if (l2 != null) {
                                            int T12 = l2.T1();
                                            if (T12 >= 3) {
                                                k kVar4 = (k) threadLocal.get();
                                                if (kVar4 != null) {
                                                    W1 = l2.X1(k57.U1(context), str, i3, k57.U1(kVar4.a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (T12 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                W1 = l2.Y1(k57.U1(context), str, i3);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                W1 = l2.W1(k57.U1(context), str, i3);
                                            }
                                            Object T13 = k57.T1(W1);
                                            if (T13 != null) {
                                                dynamiteModule = new DynamiteModule((Context) T13);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor4 = kVar2.a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    threadLocal.set(kVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e2) {
                                throw new LoadingException("Failed to load remote module.", e2, null);
                            } catch (LoadingException e3) {
                                throw e3;
                            } catch (Throwable th2) {
                                q02.a(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e4) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                            int i4 = a2.a;
                            if (i4 != 0 && aVar.a(context, str, new l(i4, 0)).c == -1) {
                                DynamiteModule h3 = h(context, str);
                                if (longValue == 0) {
                                    n.remove();
                                } else {
                                    n.set(Long.valueOf(longValue));
                                }
                                Cursor cursor5 = kVar2.a;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                m.set(kVar);
                                return h3;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e4, null);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".", null);
        } catch (Throwable th3) {
            th = th3;
            j2 = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bf -> B:130:0x01c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c1 -> B:130:0x01c4). Please submit an issue!!! */
    public static int f(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = h;
                Cursor cursor2 = null;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String obj = e3.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!k(context)) {
                            return 0;
                        } else {
                            if (!j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g2 = g(context, str, z, true);
                                        String str2 = i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = tqc.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    z93.a();
                                                    String str3 = i;
                                                    gh8.j(str3);
                                                    a2 = y93.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = i;
                                                    gh8.j(str4);
                                                    a2 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a2);
                                            declaredField.set(null, a2);
                                            h = bool2;
                                            return g2;
                                        }
                                        return g2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z, false);
                    } catch (LoadingException e4) {
                        String message = e4.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                m l2 = l(context);
                try {
                    if (l2 != null) {
                        try {
                            int T1 = l2.T1();
                            if (T1 >= 3) {
                                k kVar = (k) m.get();
                                if (kVar != null && (cursor = kVar.a) != null) {
                                    i2 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) k57.T1(l2.Z1(k57.U1(context), str, z, ((Long) n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i3 = cursor3.getInt(0);
                                                if (i3 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            cursor2 = cursor3;
                                            String message2 = e2.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (T1 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = l2.V1(k57.U1(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = l2.U1(k57.U1(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    }
                    return i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            q02.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void i(ClassLoader classLoader) throws LoadingException {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof n) {
                    nVar = (n) queryLocalInterface;
                } else {
                    nVar = new n(iBinder);
                }
            }
            r = nVar;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) m.get();
        if (kVar != null && kVar.a == null) {
            kVar.a = cursor;
            return true;
        }
        return false;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.b.f().h(context, ExceptionCode.CRASH_EXCEPTION) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof m) {
                        mVar = (m) queryLocalInterface;
                    } else {
                        mVar = new m(iBinder);
                    }
                }
                if (mVar != null) {
                    q = mVar;
                    return mVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    @NonNull
    public Context b() {
        return this.a;
    }

    @NonNull
    public IBinder d(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
