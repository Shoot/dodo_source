package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: InstrHttpsURLConnection.java */
/* loaded from: classes2.dex */
public final class b extends HttpsURLConnection {
    private final c a;
    private final HttpsURLConnection b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(HttpsURLConnection httpsURLConnection, Timer timer, gw6 gw6Var) {
        super(httpsURLConnection.getURL());
        this.b = httpsURLConnection;
        this.a = new c(httpsURLConnection, timer, gw6Var);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.a.c();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.a.r(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.a.t(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.a.u(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.a.v(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.a.w(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.a.L();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.a.M(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.a.N(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.a.O(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.a.P(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.a.Q(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.a.R(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.a.S(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.a.U(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.a.V(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.a.W(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.a.Z(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.a.T(j);
    }
}
