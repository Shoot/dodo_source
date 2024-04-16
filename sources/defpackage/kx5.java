package defpackage;

import android.util.Log;
/* compiled from: LogWrapper.java */
/* renamed from: kx5  reason: default package */
/* loaded from: classes2.dex */
class kx5 {
    private static kx5 a;

    private kx5() {
    }

    public static synchronized kx5 c() {
        kx5 kx5Var;
        synchronized (kx5.class) {
            try {
                if (a == null) {
                    a = new kx5();
                }
                kx5Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kx5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
