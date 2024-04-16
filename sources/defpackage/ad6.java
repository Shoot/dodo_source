package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* compiled from: MemorySizeCalculator.java */
/* renamed from: ad6  reason: default package */
/* loaded from: classes.dex */
public final class ad6 {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: ad6$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final int i;
        final Context a;
        ActivityManager b;
        c c;
        float e;
        float d = 2.0f;
        float f = 0.4f;
        float g = 0.33f;
        int h = 4194304;

        static {
            int i2;
            if (Build.VERSION.SDK_INT < 26) {
                i2 = 4;
            } else {
                i2 = 1;
            }
            i = i2;
        }

        public a(Context context) {
            this.e = i;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && ad6.e(this.b)) {
                this.e = 0.0f;
            }
        }

        public ad6 a() {
            return new ad6(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: ad6$b */
    /* loaded from: classes.dex */
    private static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // defpackage.ad6.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // defpackage.ad6.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: ad6$c */
    /* loaded from: classes.dex */
    interface c {
        int a();

        int b();
    }

    ad6(a aVar) {
        int i;
        boolean z;
        this.c = aVar.a;
        if (e(aVar.b)) {
            i = aVar.h / 2;
        } else {
            i = aVar.h;
        }
        this.d = i;
        int c2 = c(aVar.b, aVar.f, aVar.g);
        float b2 = aVar.c.b() * aVar.c.a() * 4;
        int round = Math.round(aVar.e * b2);
        int round2 = Math.round(b2 * aVar.d);
        int i2 = c2 - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.b = round2;
            this.a = round;
        } else {
            float f = i2;
            float f2 = aVar.e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            this.b = Math.round(f3 * f4);
            this.a = Math.round(f4 * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(i));
            sb.append(", memory class limited? ");
            if (i3 > c2) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(f(c2));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f, float f2) {
        boolean e = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i) {
        return Formatter.formatFileSize(this.c, i);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}
