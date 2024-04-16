package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
/* compiled from: L.java */
/* renamed from: oi5  reason: default package */
/* loaded from: classes.dex */
public class oi5 {
    public static boolean a = false;
    private static boolean b = false;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;
    private static vz5 g;
    private static uz5 h;
    private static volatile aw6 i;
    private static volatile xv6 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: L.java */
    /* renamed from: oi5$a */
    /* loaded from: classes.dex */
    public class a implements uz5 {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // defpackage.uz5
        @NonNull
        public File a() {
            return new File(this.a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (!b) {
            return;
        }
        int i2 = e;
        if (i2 == 20) {
            f++;
            return;
        }
        c[i2] = str;
        d[i2] = System.nanoTime();
        ujb.a(str);
        e++;
    }

    public static float b(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        } else if (!b) {
            return 0.0f;
        } else {
            int i3 = e - 1;
            e = i3;
            if (i3 != -1) {
                if (str.equals(c[i3])) {
                    ujb.b();
                    return ((float) (System.nanoTime() - d[e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
    }

    @NonNull
    public static xv6 c(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        xv6 xv6Var = j;
        if (xv6Var == null) {
            synchronized (xv6.class) {
                try {
                    xv6Var = j;
                    if (xv6Var == null) {
                        uz5 uz5Var = h;
                        if (uz5Var == null) {
                            uz5Var = new a(applicationContext);
                        }
                        xv6Var = new xv6(uz5Var);
                        j = xv6Var;
                    }
                } finally {
                }
            }
        }
        return xv6Var;
    }

    @NonNull
    public static aw6 d(@NonNull Context context) {
        aw6 aw6Var = i;
        if (aw6Var == null) {
            synchronized (aw6.class) {
                try {
                    aw6Var = i;
                    if (aw6Var == null) {
                        xv6 c2 = c(context);
                        vz5 vz5Var = g;
                        if (vz5Var == null) {
                            vz5Var = new sq2();
                        }
                        aw6Var = new aw6(c2, vz5Var);
                        i = aw6Var;
                    }
                } finally {
                }
            }
        }
        return aw6Var;
    }
}
