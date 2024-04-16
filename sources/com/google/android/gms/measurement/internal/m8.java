package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class m8 implements Runnable {
    private final URL a;
    private final byte[] b;
    private final j8 c;
    private final String d;
    private final Map<String, String> e;
    private final /* synthetic */ k8 f;

    public m8(k8 k8Var, String str, URL url, byte[] bArr, Map<String, String> map, j8 j8Var) {
        this.f = k8Var;
        gh8.f(str);
        gh8.j(url);
        gh8.j(j8Var);
        this.a = url;
        this.b = null;
        this.c = j8Var;
        this.d = str;
        this.e = null;
    }

    private final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f.k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                m8.this.a(i, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.c.a(this.d, i, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] u;
        this.f.i();
        int i = 0;
        try {
            URLConnection a = qtc.b().a(this.a, "client-measurement");
            if (a instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) a;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                    try {
                        k8 k8Var = this.f;
                        u = k8.u(httpURLConnection);
                        httpURLConnection.disconnect();
                        b(i, null, u, map);
                    } catch (IOException e) {
                        e = e;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i, e, null, map);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i, null, null, map);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    map = null;
                } catch (Throwable th2) {
                    th = th2;
                    map = null;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
