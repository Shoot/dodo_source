package com.google.firebase.perf.network;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstrURLConnectionBase.java */
/* loaded from: classes2.dex */
public class c {
    private static final sh f = sh.e();
    private final HttpURLConnection a;
    private final gw6 b;
    private long c = -1;
    private long d = -1;
    private final Timer e;

    public c(HttpURLConnection httpURLConnection, Timer timer, gw6 gw6Var) {
        this.a = httpURLConnection;
        this.b = gw6Var;
        this.e = timer;
        gw6Var.t(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.c == -1) {
            this.e.g();
            long e = this.e.e();
            this.c = e;
            this.b.n(e);
        }
        String F = F();
        if (F != null) {
            this.b.j(F);
        } else if (o()) {
            this.b.j(NetworkHandler.POST);
        } else {
            this.b.j(NetworkHandler.GET);
        }
    }

    public boolean A() {
        return this.a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.a.getOutputStream();
            if (outputStream != null) {
                return new m55(outputStream, this.b, this.e);
            }
            return outputStream;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.a.getPermission();
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public int E() {
        return this.a.getReadTimeout();
    }

    public String F() {
        return this.a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.a.getRequestProperties();
    }

    public String H(String str) {
        return this.a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.d == -1) {
            long c = this.e.c();
            this.d = c;
            this.b.s(c);
        }
        try {
            int responseCode = this.a.getResponseCode();
            this.b.k(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.d == -1) {
            long c = this.e.c();
            this.d = c;
            this.b.s(c);
        }
        try {
            String responseMessage = this.a.getResponseMessage();
            this.b.k(this.a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public URL K() {
        return this.a.getURL();
    }

    public boolean L() {
        return this.a.getUseCaches();
    }

    public void M(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    public void N(int i) {
        this.a.setChunkedStreamingMode(i);
    }

    public void O(int i) {
        this.a.setConnectTimeout(i);
    }

    public void P(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    public void Q(boolean z) {
        this.a.setDoInput(z);
    }

    public void R(boolean z) {
        this.a.setDoOutput(z);
    }

    public void S(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    public void T(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }

    public void U(long j) {
        this.a.setIfModifiedSince(j);
    }

    public void V(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    public void W(int i) {
        this.a.setReadTimeout(i);
    }

    public void X(String str) throws ProtocolException {
        this.a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.b.u(str2);
        }
        this.a.setRequestProperty(str, str2);
    }

    public void Z(boolean z) {
        this.a.setUseCaches(z);
    }

    public void a(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    public void b() throws IOException {
        if (this.c == -1) {
            this.e.g();
            long e = this.e.e();
            this.c = e;
            this.b.n(e);
        }
        try {
            this.a.connect();
        } catch (IOException e2) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e2;
        }
    }

    public boolean b0() {
        return this.a.usingProxy();
    }

    public void c() {
        this.b.r(this.e.c());
        this.b.b();
        this.a.disconnect();
    }

    public boolean d() {
        return this.a.getAllowUserInteraction();
    }

    public int e() {
        return this.a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.b.k(this.a.getResponseCode());
        try {
            Object content = this.a.getContent();
            if (content instanceof InputStream) {
                this.b.o(this.a.getContentType());
                return new l55((InputStream) content, this.b, this.e);
            }
            this.b.o(this.a.getContentType());
            this.b.p(this.a.getContentLength());
            this.b.r(this.e.c());
            this.b.b();
            return content;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.b.k(this.a.getResponseCode());
        try {
            Object content = this.a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.b.o(this.a.getContentType());
                return new l55((InputStream) content, this.b, this.e);
            }
            this.b.o(this.a.getContentType());
            this.b.p(this.a.getContentLength());
            this.b.r(this.e.c());
            this.b.b();
            return content;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }

    public String h() {
        a0();
        return this.a.getContentEncoding();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int i() {
        a0();
        return this.a.getContentLength();
    }

    public long j() {
        long contentLengthLong;
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = this.a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    public String k() {
        a0();
        return this.a.getContentType();
    }

    public long l() {
        a0();
        return this.a.getDate();
    }

    public boolean m() {
        return this.a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.a.getDoInput();
    }

    public boolean o() {
        return this.a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.b.k(this.a.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.a.getErrorStream();
        if (errorStream != null) {
            return new l55(errorStream, this.b, this.e);
        }
        return errorStream;
    }

    public long q() {
        a0();
        return this.a.getExpiration();
    }

    public String r(int i) {
        a0();
        return this.a.getHeaderField(i);
    }

    public String s(String str) {
        a0();
        return this.a.getHeaderField(str);
    }

    public long t(String str, long j) {
        a0();
        return this.a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.a.toString();
    }

    public int u(String str, int i) {
        a0();
        return this.a.getHeaderFieldInt(str, i);
    }

    public String v(int i) {
        a0();
        return this.a.getHeaderFieldKey(i);
    }

    public long w(String str, long j) {
        long headerFieldLong;
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = this.a.getHeaderFieldLong(str, j);
            return headerFieldLong;
        }
        return 0L;
    }

    public Map<String, List<String>> x() {
        a0();
        return this.a.getHeaderFields();
    }

    public long y() {
        return this.a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.b.k(this.a.getResponseCode());
        this.b.o(this.a.getContentType());
        try {
            InputStream inputStream = this.a.getInputStream();
            if (inputStream != null) {
                return new l55(inputStream, this.b, this.e);
            }
            return inputStream;
        } catch (IOException e) {
            this.b.r(this.e.c());
            hw6.d(this.b);
            throw e;
        }
    }
}
