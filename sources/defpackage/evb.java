package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.java */
/* renamed from: evb  reason: default package */
/* loaded from: classes3.dex */
public final class evb {
    static final StringBuilder a = new StringBuilder();
    private static final lk0 b = lk0.o("RIFF");
    private static final lk0 c = lk0.o("WEBP");

    /* compiled from: Utils.java */
    /* renamed from: evb$a */
    /* loaded from: classes3.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: evb$b */
    /* loaded from: classes3.dex */
    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: evb$c */
    /* loaded from: classes3.dex */
    static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(18)
    public static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, (long) LruDiskCache.MB_50), (long) LruDiskCache.MB_5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Context context) {
        int memoryClass;
        ActivityManager activityManager = (ActivityManager) o(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        return (int) ((memoryClass * 1048576) / 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        if (r()) {
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        if (!r()) {
            return;
        }
        throw new IllegalStateException("Method call should not happen from the main thread.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(gi9 gi9Var) {
        StringBuilder sb = a;
        String h = h(gi9Var, sb);
        sb.setLength(0);
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(gi9 gi9Var, StringBuilder sb) {
        String str = gi9Var.f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(gi9Var.f);
        } else {
            Uri uri = gi9Var.d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(gi9Var.e);
            }
        }
        sb.append('\n');
        if (gi9Var.n != 0.0f) {
            sb.append("rotation:");
            sb.append(gi9Var.n);
            if (gi9Var.q) {
                sb.append('@');
                sb.append(gi9Var.o);
                sb.append('x');
                sb.append(gi9Var.p);
            }
            sb.append('\n');
        }
        if (gi9Var.c()) {
            sb.append("resize:");
            sb.append(gi9Var.h);
            sb.append('x');
            sb.append(gi9Var.i);
            sb.append('\n');
        }
        if (gi9Var.j) {
            sb.append("centerCrop:");
            sb.append(gi9Var.k);
            sb.append('\n');
        } else if (gi9Var.l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<skb> list = gi9Var.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(gi9Var.g.get(i).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(zb0 zb0Var) {
        return l(zb0Var, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(zb0 zb0Var, String str) {
        StringBuilder sb = new StringBuilder(str);
        s4 h = zb0Var.h();
        if (h != null) {
            sb.append(h.b.d());
        }
        List<s4> i = zb0Var.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(", ");
                }
                sb.append(i.get(i2).b.d());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Resources resources, gi9 gi9Var) throws FileNotFoundException {
        Uri uri;
        int i = gi9Var.e;
        if (i == 0 && (uri = gi9Var.d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                List<String> pathSegments = gi9Var.d.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            return Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + gi9Var.d);
                        }
                    } else if (pathSegments.size() == 2) {
                        return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + gi9Var.d);
                    }
                }
                throw new FileNotFoundException("No path segments: " + gi9Var.d);
            }
            throw new FileNotFoundException("No package provided: " + gi9Var.d);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources n(Context context, gi9 gi9Var) throws FileNotFoundException {
        Uri uri;
        if (gi9Var.e == 0 && (uri = gi9Var.d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + gi9Var.d);
                }
            }
            throw new FileNotFoundException("No package provided: " + gi9Var.d);
        }
        return context.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T o(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean r() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(fh0 fh0Var) throws IOException {
        if (fh0Var.L1(0L, b) && fh0Var.L1(8L, c)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
