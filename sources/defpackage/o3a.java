package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* renamed from: o3a  reason: default package */
/* loaded from: classes3.dex */
public class o3a {
    private static final String a = "SecureX509SingleInstance";
    private static volatile p3a b;

    private o3a() {
    }

    @SuppressLint({"NewApi"})
    public static p3a a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            nec.b(context);
            if (b == null) {
                synchronized (o3a.class) {
                    try {
                        if (b == null) {
                            InputStream n = lc0.n(context);
                            if (n == null) {
                                xhc.e(a, "get assets bks");
                                n = context.getAssets().open("hmsrootcas.bks");
                            } else {
                                xhc.e(a, "get files bks");
                            }
                            b = new p3a(n, "");
                            new rhc().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                        }
                    } finally {
                    }
                }
            }
            String str = a;
            xhc.b(str, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return b;
        }
        throw new NullPointerException("context is null");
    }
}
