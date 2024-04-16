package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: Logger.java */
/* renamed from: nx5  reason: default package */
/* loaded from: classes.dex */
public abstract class nx5 {
    private static nx5 a = null;
    private static final int b = 20;

    /* compiled from: Logger.java */
    /* renamed from: nx5$a */
    /* loaded from: classes.dex */
    public static class a extends nx5 {
        private int c;

        public a(int i) {
            super(i);
            this.c = i;
        }

        @Override // defpackage.nx5
        public void a(String str, String str2, Throwable... thArr) {
            if (this.c <= 3) {
                if (thArr != null && thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // defpackage.nx5
        public void b(String str, String str2, Throwable... thArr) {
            if (this.c <= 6) {
                if (thArr != null && thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // defpackage.nx5
        public void d(String str, String str2, Throwable... thArr) {
            if (this.c <= 4) {
                if (thArr != null && thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // defpackage.nx5
        public void g(String str, String str2, Throwable... thArr) {
            if (this.c <= 2) {
                if (thArr != null && thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // defpackage.nx5
        public void h(String str, String str2, Throwable... thArr) {
            if (this.c <= 5) {
                if (thArr != null && thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public nx5(int i) {
    }

    public static synchronized nx5 c() {
        nx5 nx5Var;
        synchronized (nx5.class) {
            try {
                if (a == null) {
                    a = new a(3);
                }
                nx5Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nx5Var;
    }

    public static synchronized void e(nx5 nx5Var) {
        synchronized (nx5.class) {
            a = nx5Var;
        }
    }

    public static String f(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
