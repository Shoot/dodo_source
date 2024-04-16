package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: Util.java */
/* renamed from: vub  reason: default package */
/* loaded from: classes.dex */
public final class vub {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];
    private static volatile Handler c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Util.java */
    /* renamed from: vub$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private vub() {
    }

    public static void a() {
        if (s()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    public static void b() {
        if (t()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean c(g80<?> g80Var, g80<?> g80Var2) {
        if (g80Var == null) {
            if (g80Var2 == null) {
                return true;
            }
            return false;
        }
        return g80Var.H(g80Var2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof km6) {
            return ((km6) obj).a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @NonNull
    private static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i) {
        return new ArrayDeque(i);
    }

    public static int h(int i, int i2, Bitmap.Config config) {
        return i * i2 * j(config);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    @NonNull
    public static <T> List<T> k(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (c == null) {
            synchronized (vub.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static int m(float f) {
        return n(f, 17);
    }

    public static int n(float f, int i) {
        return p(Float.floatToIntBits(f), i);
    }

    public static int o(int i) {
        return p(i, 17);
    }

    public static int p(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int q(Object obj, int i) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return p(hashCode, i);
    }

    public static int r(boolean z, int i) {
        return p(z ? 1 : 0, i);
    }

    public static boolean s() {
        return !t();
    }

    public static boolean t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean u(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static boolean v(int i, int i2) {
        if (u(i) && u(i2)) {
            return true;
        }
        return false;
    }

    public static void w(Runnable runnable) {
        l().post(runnable);
    }

    public static void x(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @NonNull
    public static String y(@NonNull byte[] bArr) {
        String f;
        char[] cArr = b;
        synchronized (cArr) {
            f = f(bArr, cArr);
        }
        return f;
    }
}
