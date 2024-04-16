package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.uk2;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* renamed from: uq4  reason: default package */
/* loaded from: classes.dex */
public class uq4 implements uk2<InputStream> {
    static final b g = new a();
    private final gg4 a;
    private final int b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: uq4$a */
    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // defpackage.uq4.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* renamed from: uq4$b */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public uq4(gg4 gg4Var, int i) {
        this(gg4Var, i, g);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a2 = this.c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a2.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a2.setConnectTimeout(this.b);
            a2.setReadTimeout(this.b);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setInstanceFollowRedirects(false);
            return a2;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.e = wt1.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.e = httpURLConnection.getInputStream();
            }
            return this.e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e);
        }
    }

    private static boolean h(int i) {
        if (i / 100 == 2) {
            return true;
        }
        return false;
    }

    private static boolean i(int i) {
        if (i / 100 == 3) {
            return true;
        }
        return false;
    }

    private InputStream j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = c(url, map);
            this.d = c;
            try {
                c.connect();
                this.e = this.d.getInputStream();
                if (this.f) {
                    return null;
                }
                int f = f(this.d);
                if (h(f)) {
                    return g(this.d);
                }
                if (i(f)) {
                    String headerField = this.d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, f, e);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", f);
                } else if (f == -1) {
                    throw new HttpException(f);
                } else {
                    try {
                        throw new HttpException(this.d.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", f(this.d), e3);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override // defpackage.uk2
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.uk2
    public void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // defpackage.uk2
    public void cancel() {
        this.f = true;
    }

    @Override // defpackage.uk2
    public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b2 = hx5.b();
        try {
            try {
                aVar.f(j(this.a.h(), 0, null, this.a.e()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                aVar.c(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(hx5.a(b2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + hx5.a(b2));
            }
            throw th;
        }
    }

    @Override // defpackage.uk2
    @NonNull
    public dl2 e() {
        return dl2.REMOTE;
    }

    uq4(gg4 gg4Var, int i, b bVar) {
        this.a = gg4Var;
        this.b = i;
        this.c = bVar;
    }
}
