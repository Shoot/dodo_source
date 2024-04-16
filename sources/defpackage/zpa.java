package defpackage;

import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: SoLoader.java */
/* renamed from: zpa  reason: default package */
/* loaded from: classes2.dex */
public class zpa {
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static volatile aqa[] c = null;
    private static final AtomicInteger d = new AtomicInteger(0);
    private static final HashSet<String> e = new HashSet<>();
    private static final Map<String, Object> f = new HashMap();
    private static final Set<String> g = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final String[] h = {System.mapLibraryName("breakpad")};
    private static int i = 0;
    static final boolean a = true;

    /* compiled from: SoLoader.java */
    /* renamed from: zpa$a */
    /* loaded from: classes2.dex */
    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(c4b.a()) + " error: " + str);
            initCause(th);
        }
    }

    private static void a() {
        if (c()) {
            return;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    private static void b(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws UnsatisfiedLinkError {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (c != null) {
                reentrantReadWriteLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = a;
                if (z2) {
                    xl.a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock.readLock().lock();
                    if (c.length <= 0) {
                        reentrantReadWriteLock.readLock().unlock();
                        if (z2) {
                            xl.b();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("couldn't find DSO to load: ");
                        sb.append(str);
                        reentrantReadWriteLock.readLock().lock();
                        if (c.length <= 0) {
                            reentrantReadWriteLock.readLock().unlock();
                            sb.append(" result: ");
                            sb.append(0);
                            String sb2 = sb.toString();
                            Log.e("SoLoader", sb2);
                            throw new UnsatisfiedLinkError(sb2);
                        }
                        sb.append("\n\tSoSource ");
                        sb.append(0);
                        sb.append(": ");
                        aqa aqaVar = c[0];
                        throw null;
                    }
                    aqa aqaVar2 = c[0];
                    throw null;
                } catch (Throwable th) {
                    if (a) {
                        xl.b();
                    }
                    if (z) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("couldn't find DSO to load: ");
                    sb3.append(str);
                    String message = th.getMessage();
                    if (message == null) {
                        message = th.toString();
                    }
                    sb3.append(" caused by: ");
                    sb3.append(message);
                    th.printStackTrace();
                    sb3.append(" result: ");
                    sb3.append(0);
                    String sb4 = sb3.toString();
                    Log.e("SoLoader", sb4);
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb4);
                    unsatisfiedLinkError.initCause(th);
                    throw unsatisfiedLinkError;
                }
            }
            Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } catch (Throwable th2) {
            b.readLock().unlock();
            throw th2;
        }
    }

    public static boolean c() {
        boolean z = true;
        if (c != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (c == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            b.readLock().unlock();
            throw th;
        }
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i2) throws UnsatisfiedLinkError {
        String str2;
        Boolean h2 = h(str);
        if (h2 != null) {
            return h2.booleanValue();
        }
        if (i != 2) {
        }
        String b2 = uh6.b(str);
        if (b2 != null) {
            str2 = b2;
        } else {
            str2 = str;
        }
        return f(System.mapLibraryName(str2), str, b2, i2, null);
    }

    private static boolean f(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        try {
            return g(str, str2, str3, i2, threadPolicy);
        } catch (UnsatisfiedLinkError e2) {
            int i3 = d.get();
            b.writeLock().lock();
            b.writeLock().unlock();
            if (d.get() != i3) {
                return false;
            }
            throw e2;
        }
    }

    private static boolean g(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2) && g.contains(str2)) {
            return false;
        }
        synchronized (zpa.class) {
            try {
                HashSet<String> hashSet = e;
                if (hashSet.contains(str)) {
                    if (str3 == null) {
                        return false;
                    }
                    z = true;
                } else {
                    z = false;
                }
                Map<String, Object> map = f;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = b;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z) {
                            synchronized (zpa.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z = true;
                                }
                                if (!z) {
                                    try {
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "About to load: " + str);
                                        }
                                        b(str, i2, threadPolicy);
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "Loaded: " + str);
                                        }
                                        synchronized (zpa.class) {
                                            hashSet.add(str);
                                        }
                                    } catch (UnsatisfiedLinkError e2) {
                                        String message = e2.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            throw new a(e2, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                        }
                                        throw e2;
                                    }
                                }
                            }
                        }
                        if ((i2 & 16) == 0) {
                            if (!TextUtils.isEmpty(str2) && g.contains(str2)) {
                                z2 = true;
                            }
                            if (str3 != null && !z2) {
                                boolean z3 = a;
                                if (z3) {
                                    xl.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                }
                                try {
                                    try {
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                        }
                                        uh6.a(str2);
                                        g.add(str2);
                                        if (z3) {
                                            xl.b();
                                        }
                                    } catch (UnsatisfiedLinkError e3) {
                                        throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e3);
                                    }
                                } catch (Throwable th) {
                                    if (a) {
                                        xl.b();
                                    }
                                    throw th;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z;
                    }
                } catch (Throwable th2) {
                    b.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }

    private static Boolean h(String str) {
        Boolean valueOf;
        if (c == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = b;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (c == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        a();
                    } else {
                        synchronized (zpa.class) {
                            boolean z = !e.contains(str);
                            if (z) {
                                System.loadLibrary(str);
                            }
                            valueOf = Boolean.valueOf(z);
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return valueOf;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                return null;
            } catch (Throwable th) {
                b.readLock().unlock();
                throw th;
            }
        }
        return null;
    }
}
