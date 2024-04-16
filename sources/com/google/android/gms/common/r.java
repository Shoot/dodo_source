package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class r {
    private static volatile snc e;
    private static Context g;
    static final p a = new j(n.T1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final p b = new k(n.T1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final p c = new l(n.T1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final p d = new m(n.T1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w a(String str, n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w b(String str, boolean z, boolean z2, boolean z3) {
        return g(str, z, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String c(boolean z, String str, n nVar) throws Exception {
        String str2;
        if (!z && f(str, nVar, true, false).a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest b2 = fj.b("SHA-256");
        gh8.j(b2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, io4.a(b2.digest(nVar.U1())), Boolean.valueOf(z), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(Context context) {
        synchronized (r.class) {
            if (g == null) {
                if (context != null) {
                    g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return e.i();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    private static w f(final String str, final n nVar, final boolean z, boolean z2) {
        try {
            h();
            gh8.j(g);
            try {
                if (e.X0(new zzs(str, nVar, z, z2), k57.U1(g.getPackageManager()))) {
                    return w.b();
                }
                return new v(new Callable() { // from class: com.google.android.gms.common.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return r.c(z, str, nVar);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return w.d("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return w.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [ns4, android.os.IBinder] */
    private static w g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        w d2;
        zzq s1;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            gh8.j(g);
            try {
                h();
                zzo zzoVar = new zzo(str, z, false, k57.U1(g), false);
                try {
                    if (z4) {
                        s1 = e.o1(zzoVar);
                    } else {
                        s1 = e.s1(zzoVar);
                    }
                    if (s1.k()) {
                        d2 = w.f(s1.p());
                    } else {
                        String h = s1.h();
                        if (s1.t() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (h == null) {
                            h = "error checking package certificate";
                        }
                        d2 = w.g(s1.p(), s1.t(), h, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    d2 = w.d("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                d2 = w.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void h() throws DynamiteModule.LoadingException {
        if (e != null) {
            return;
        }
        gh8.j(g);
        synchronized (f) {
            try {
                if (e == null) {
                    e = onc.C(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
