package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzfs;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@SuppressLint({"StaticFieldLeak"})
/* renamed from: bad  reason: default package */
/* loaded from: classes2.dex */
public final class bad {
    private static volatile bad g;
    private final Context a;
    private final List<jad> b;
    private final jyc c;
    private final f5d d;
    private volatile zzav e;
    private Thread.UncaughtExceptionHandler f;

    bad(Context context) {
        Context applicationContext = context.getApplicationContext();
        gh8.j(applicationContext);
        this.a = applicationContext;
        this.d = new f5d(this);
        this.b = new CopyOnWriteArrayList();
        this.c = new jyc();
    }

    public static bad b(Context context) {
        gh8.j(context);
        if (g == null) {
            synchronized (bad.class) {
                try {
                    if (g == null) {
                        g = new bad(context);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public static void h() {
        if (Thread.currentThread() instanceof h9d) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    public final Context a() {
        return this.a;
    }

    public final zzav c() {
        String packageName;
        String str;
        if (this.e == null) {
            synchronized (this) {
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    String valueOf = String.valueOf(packageName);
                    if (valueOf.length() != 0) {
                        str = "Error retrieving package info: appName set to ".concat(valueOf);
                    } else {
                        str = new String("Error retrieving package info: appName set to ");
                    }
                    Log.e("GAv4", str);
                } finally {
                }
                if (this.e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.a.getPackageManager();
                    packageName = this.a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str2 = null;
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            packageName = applicationLabel.toString();
                        }
                        str2 = packageInfo.versionName;
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str2);
                    this.e = zzavVar;
                }
            }
        }
        return this.e;
    }

    public final zzba d() {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        zzba zzbaVar = new zzba();
        zzbaVar.zze(zzfs.zzd(Locale.getDefault()));
        zzbaVar.zza = displayMetrics.widthPixels;
        zzbaVar.zzb = displayMetrics.heightPixels;
        return zzbaVar;
    }

    public final <V> Future<V> g(Callable<V> callable) {
        gh8.j(callable);
        if (Thread.currentThread() instanceof h9d) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.d.submit(callable);
    }

    public final void i(Runnable runnable) {
        gh8.j(runnable);
        this.d.submit(runnable);
    }

    public final void j(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f = uncaughtExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(a0d a0dVar) {
        if (!a0dVar.l()) {
            if (!a0dVar.m()) {
                a0d a0dVar2 = new a0d(a0dVar);
                a0dVar2.i();
                this.d.execute(new t3d(this, a0dVar2));
                return;
            }
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        throw new IllegalStateException("Measurement prototype can't be submitted");
    }
}
