package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
/* compiled from: AndroidSchedulers.java */
/* renamed from: ti  reason: default package */
/* loaded from: classes3.dex */
public final class ti {
    private static final xv9 a = sp9.d(new a());

    /* compiled from: AndroidSchedulers.java */
    /* renamed from: ti$a */
    /* loaded from: classes3.dex */
    static class a implements Callable<xv9> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public xv9 call() throws Exception {
            return b.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidSchedulers.java */
    /* renamed from: ti$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final xv9 a = new jm4(new Handler(Looper.getMainLooper()), false);
    }

    public static xv9 a(Looper looper) {
        return b(looper, false);
    }

    @SuppressLint({"NewApi"})
    public static xv9 b(Looper looper, boolean z) {
        if (looper != null) {
            int i = Build.VERSION.SDK_INT;
            if (z && i < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z = false;
                }
                obtain.recycle();
            }
            return new jm4(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }

    public static xv9 c() {
        return sp9.e(a);
    }
}
