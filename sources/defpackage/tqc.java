package defpackage;

import android.os.Looper;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: tqc  reason: default package */
/* loaded from: classes2.dex */
public final class tqc {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (tqc.class) {
            try {
                if (a == null) {
                    a = b();
                }
                classLoader = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (tqc.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = c();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        SecurityException e;
        dmc dmcVar;
        dmc dmcVar2;
        ThreadGroup threadGroup;
        synchronized (tqc.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < activeGroupCount) {
                            threadGroup = threadGroupArr[i2];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i2++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i < activeCount) {
                            dmcVar2 = threadArr[i];
                            if ("GmsDynamite".equals(dmcVar2.getName())) {
                                break;
                            }
                            i++;
                        } else {
                            dmcVar2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    dmcVar = null;
                }
                if (dmcVar2 == null) {
                    try {
                        dmcVar = new dmc(threadGroup, "GmsDynamite");
                        try {
                            dmcVar.setContextClassLoader(null);
                            dmcVar.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            dmcVar2 = dmcVar;
                            return dmcVar2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        dmcVar = dmcVar2;
                    }
                    dmcVar2 = dmcVar;
                }
            }
            return dmcVar2;
        }
    }
}
