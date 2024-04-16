package defpackage;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.a;
import com.android.volley.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
/* compiled from: NetworkUtility.java */
/* renamed from: ox6  reason: default package */
/* loaded from: classes.dex */
final class ox6 {

    /* compiled from: NetworkUtility.java */
    /* renamed from: ox6$b */
    /* loaded from: classes.dex */
    static class b {
        private final String a;
        private final VolleyError b;

        private b(String str, VolleyError volleyError) {
            this.a = str;
            this.b = volleyError;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Request<?> request, b bVar) throws VolleyError {
        yl9 retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.b(bVar.b);
            request.addMarker(String.format("%s-retry [timeout=%s]", bVar.a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.a, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iw6 b(Request<?> request, long j, List<en4> list) {
        a.C0093a cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new iw6(304, (byte[]) null, true, j, list);
        }
        return new iw6(304, cacheEntry.a, true, j, kq4.a(list, cacheEntry));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, int i, oj0 oj0Var) throws IOException {
        byte[] bArr;
        ff8 ff8Var = new ff8(oj0Var, i);
        try {
            bArr = oj0Var.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    ff8Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            f.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    oj0Var.b(bArr);
                    ff8Var.close();
                    throw th;
                }
            }
            byte[] byteArray = ff8Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                f.e("Error occurred when closing InputStream", new Object[0]);
            }
            oj0Var.b(bArr);
            ff8Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(long j, Request<?> request, byte[] bArr, int i) {
        Object obj;
        if (f.b || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().a());
            f.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(Request<?> request, IOException iOException, long j, qq4 qq4Var, byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new TimeoutError());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (qq4Var != null) {
                int d = qq4Var.d();
                f.c("Unexpected response code %d for %s", Integer.valueOf(d), request.getUrl());
                if (bArr != null) {
                    iw6 iw6Var = new iw6(d, bArr, false, SystemClock.elapsedRealtime() - j, qq4Var.c());
                    if (d != 401 && d != 403) {
                        if (d >= 400 && d <= 499) {
                            throw new ClientError(iw6Var);
                        }
                        if (d >= 500 && d <= 599 && request.shouldRetryServerErrors()) {
                            return new b("server", new ServerError(iw6Var));
                        }
                        throw new ServerError(iw6Var);
                    }
                    return new b("auth", new AuthFailureError(iw6Var));
                }
                return new b("network", new NetworkError());
            } else if (request.shouldRetryConnectionErrors()) {
                return new b("connection", new NoConnectionError());
            } else {
                throw new NoConnectionError(iOException);
            }
        }
        throw new RuntimeException("Bad URL " + request.getUrl(), iOException);
    }
}
