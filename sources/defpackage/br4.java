package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: HurlStack.java */
/* renamed from: br4  reason: default package */
/* loaded from: classes.dex */
public class br4 extends n70 {
    private final SSLSocketFactory a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HurlStack.java */
    /* renamed from: br4$a */
    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        a(HttpURLConnection httpURLConnection) {
            super(br4.j(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.a.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    /* renamed from: br4$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    public br4() {
        this(null);
    }

    private void c(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(h(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void d(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            c(httpURLConnection, request, body);
        }
    }

    static List<en4> e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new en4(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static boolean i(int i, int i2) {
        if (i != 4 && ((100 > i2 || i2 >= 200) && i2 != 204 && i2 != 304)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection k(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection f = f(url);
        int timeoutMs = request.getTimeoutMs();
        f.setConnectTimeout(timeoutMs);
        f.setReadTimeout(timeoutMs);
        f.setUseCaches(false);
        f.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.a) != null) {
            ((HttpsURLConnection) f).setSSLSocketFactory(sSLSocketFactory);
        }
        return f;
    }

    @Override // defpackage.n70
    public qq4 a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        HttpURLConnection k = k(new URL(url), request);
        try {
            for (String str : hashMap.keySet()) {
                k.setRequestProperty(str, (String) hashMap.get(str));
            }
            l(k, request);
            int responseCode = k.getResponseCode();
            if (responseCode != -1) {
                if (!i(request.getMethod(), responseCode)) {
                    qq4 qq4Var = new qq4(responseCode, e(k.getHeaderFields()));
                    k.disconnect();
                    return qq4Var;
                }
                return new qq4(responseCode, e(k.getHeaderFields()), k.getContentLength(), g(request, k));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                k.disconnect();
            }
            throw th;
        }
    }

    protected HttpURLConnection f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream g(Request<?> request, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream h(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void l(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod(NetworkHandler.POST);
                    c(httpURLConnection, request, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod(NetworkHandler.GET);
                return;
            case 1:
                httpURLConnection.setRequestMethod(NetworkHandler.POST);
                d(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod(NetworkHandler.PUT);
                d(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod(NetworkHandler.DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod(NetworkHandler.HEAD);
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                d(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public br4(b bVar) {
        this(bVar, null);
    }

    public br4(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }
}
