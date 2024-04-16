package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: HardwareConfigState.java */
/* renamed from: xm4  reason: default package */
/* loaded from: classes.dex */
public final class xm4 {
    public static final boolean e;
    public static final boolean f;
    private static final File g;
    private static volatile xm4 h;
    private int b;
    private boolean c = true;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final int a = Level.INFO_INT;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
        if (i < 28) {
            z2 = false;
        }
        f = z2;
        g = new File("/proc/self/fd");
    }

    xm4() {
    }

    private boolean a() {
        if (e && !this.d.get()) {
            return true;
        }
        return false;
    }

    public static xm4 b() {
        if (h == null) {
            synchronized (xm4.class) {
                try {
                    if (h == null) {
                        h = new xm4();
                    }
                } finally {
                }
            }
        }
        return h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.a;
    }

    private synchronized boolean d() {
        try {
            boolean z = true;
            int i = this.b + 1;
            this.b = i;
            if (i >= 50) {
                this.b = 0;
                int length = g.list().length;
                long c = c();
                if (length >= c) {
                    z = false;
                }
                this.c = z;
                if (!z && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        for (String str : Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i >= 0 && i2 >= 0) {
            if (!d()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
            return true;
        } else {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean g(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        Bitmap.Config config;
        boolean f2 = f(i, i2, z, z2);
        if (f2) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return f2;
    }

    public void h() {
        vub.b();
        this.d.set(true);
    }
}
