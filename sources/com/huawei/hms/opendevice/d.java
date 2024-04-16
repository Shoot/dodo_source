package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.support.log.HMSLog;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
/* compiled from: HttpClient.java */
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: HttpClient.java */
    /* loaded from: classes3.dex */
    private enum a {
        GET(NetworkHandler.GET),
        POST(NetworkHandler.POST);
        
        public String d;

        a(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.OutputStream, java.io.FilterOutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v31 */
    public static String a(Context context, String str, String str2, Map<String, String> map) {
        ?? r8;
        InputStream inputStream;
        ?? r10;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2;
        InputStream inputStream3;
        InputStream inputStream4;
        InputStream inputStream5;
        ?? r82;
        InputStream inputStream6;
        InputStream inputStream7;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2 = null;
        if (str2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int i = -1;
        try {
            try {
                httpURLConnection = a(context, str, map, a.POST.a());
                if (httpURLConnection == null) {
                    ls4.c(null);
                    ls4.b(null);
                    ls4.b(null);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                }
                try {
                    r82 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                } catch (IOException unused) {
                    inputStream4 = null;
                    inputStream5 = inputStream4;
                    r82 = inputStream4;
                    inputStream6 = inputStream5;
                    StringBuilder sb = new StringBuilder();
                    sb.append("http execute encounter IOException - http code:");
                    sb.append(i);
                    HMSLog.w("PushHttpClient", sb.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (RuntimeException unused2) {
                    inputStream3 = null;
                    inputStream5 = inputStream3;
                    r82 = inputStream3;
                    inputStream6 = inputStream5;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http execute encounter RuntimeException - http code:");
                    sb2.append(i);
                    HMSLog.w("PushHttpClient", sb2.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Exception unused3) {
                    inputStream2 = null;
                    inputStream5 = inputStream2;
                    r82 = inputStream2;
                    inputStream6 = inputStream5;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("http execute encounter unknown exception - http code:");
                    sb3.append(i);
                    HMSLog.w("PushHttpClient", sb3.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Throwable th) {
                    inputStream = null;
                    r10 = 0;
                    httpURLConnection2 = httpURLConnection;
                    th = th;
                    r8 = 0;
                }
                try {
                    r82.write(str2.getBytes("UTF-8"));
                    r82.flush();
                    i = httpURLConnection.getResponseCode();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("http post response code: ");
                    sb4.append(i);
                    HMSLog.d("PushHttpClient", sb4.toString());
                    if (i >= 400) {
                        inputStream5 = httpURLConnection.getErrorStream();
                    } else {
                        inputStream5 = httpURLConnection.getInputStream();
                    }
                    try {
                        inputStream6 = new BufferedInputStream(inputStream5);
                        try {
                            String a2 = s.a(inputStream6);
                            ls4.c(r82);
                            ls4.b(inputStream5);
                            ls4.b(inputStream6);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return a2;
                        } catch (IOException unused4) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("http execute encounter IOException - http code:");
                            sb5.append(i);
                            HMSLog.w("PushHttpClient", sb5.toString());
                            outputStream = r82;
                            inputStream7 = inputStream5;
                            ls4.c(outputStream);
                            ls4.b(inputStream7);
                            ls4.b(inputStream6);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        } catch (RuntimeException unused5) {
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("http execute encounter RuntimeException - http code:");
                            sb22.append(i);
                            HMSLog.w("PushHttpClient", sb22.toString());
                            outputStream = r82;
                            inputStream7 = inputStream5;
                            ls4.c(outputStream);
                            ls4.b(inputStream7);
                            ls4.b(inputStream6);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        } catch (Exception unused6) {
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("http execute encounter unknown exception - http code:");
                            sb32.append(i);
                            HMSLog.w("PushHttpClient", sb32.toString());
                            outputStream = r82;
                            inputStream7 = inputStream5;
                            ls4.c(outputStream);
                            ls4.b(inputStream7);
                            ls4.b(inputStream6);
                            s.a(httpURLConnection);
                            HMSLog.i("PushHttpClient", "close connection");
                            return null;
                        }
                    } catch (IOException unused7) {
                        inputStream6 = null;
                    } catch (RuntimeException unused8) {
                        inputStream6 = null;
                    } catch (Exception unused9) {
                        inputStream6 = null;
                    } catch (Throwable th2) {
                        httpURLConnection2 = httpURLConnection;
                        th = th2;
                        r10 = 0;
                        r8 = r82;
                        inputStream = inputStream5;
                        ls4.c(r8);
                        ls4.b(inputStream);
                        ls4.b(r10);
                        s.a(httpURLConnection2);
                        HMSLog.i("PushHttpClient", "close connection");
                        throw th;
                    }
                } catch (IOException unused10) {
                    inputStream5 = null;
                    r82 = r82;
                    inputStream6 = inputStream5;
                    StringBuilder sb52 = new StringBuilder();
                    sb52.append("http execute encounter IOException - http code:");
                    sb52.append(i);
                    HMSLog.w("PushHttpClient", sb52.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (RuntimeException unused11) {
                    inputStream5 = null;
                    r82 = r82;
                    inputStream6 = inputStream5;
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append("http execute encounter RuntimeException - http code:");
                    sb222.append(i);
                    HMSLog.w("PushHttpClient", sb222.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Exception unused12) {
                    inputStream5 = null;
                    r82 = r82;
                    inputStream6 = inputStream5;
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append("http execute encounter unknown exception - http code:");
                    sb322.append(i);
                    HMSLog.w("PushHttpClient", sb322.toString());
                    outputStream = r82;
                    inputStream7 = inputStream5;
                    ls4.c(outputStream);
                    ls4.b(inputStream7);
                    ls4.b(inputStream6);
                    s.a(httpURLConnection);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Throwable th3) {
                    r10 = 0;
                    httpURLConnection2 = httpURLConnection;
                    th = th3;
                    inputStream = null;
                    r8 = r82;
                }
            } catch (Throwable th4) {
                httpURLConnection2 = context;
                th = th4;
                r8 = str;
                inputStream = str2;
                r10 = map;
            }
        } catch (IOException unused13) {
            httpURLConnection = null;
            inputStream4 = null;
        } catch (RuntimeException unused14) {
            httpURLConnection = null;
            inputStream3 = null;
        } catch (Exception unused15) {
            httpURLConnection = null;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            r8 = 0;
            inputStream = null;
            r10 = 0;
        }
    }

    public static HttpURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        a(context, httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r2, java.net.HttpURLConnection r3) throws java.lang.Exception {
        /*
            java.lang.String r0 = "PushHttpClient"
            boolean r1 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L44
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            m3a r2 = defpackage.m3a.b(r2)     // Catch: java.lang.IllegalArgumentException -> Ld java.lang.IllegalAccessException -> L13 java.io.IOException -> L19 java.security.GeneralSecurityException -> L1f java.security.KeyStoreException -> L25 java.security.NoSuchAlgorithmException -> L2b
            goto L31
        Ld:
            java.lang.String r2 = "Get SocketFactory Illegal Argument Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L13:
            java.lang.String r2 = "Get SocketFactory Illegal Access Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L19:
            java.lang.String r2 = "Get SocketFactory IO Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L1f:
            java.lang.String r2 = "Get SocketFactory General Security Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L25:
            java.lang.String r2 = "Get SocketFactory Key Store exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
            goto L30
        L2b:
            java.lang.String r2 = "Get SocketFactory Algorithm Exception."
            com.huawei.hms.support.log.HMSLog.w(r0, r2)
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L3c
            r3.setSSLSocketFactory(r2)
            org.apache.http.conn.ssl.X509HostnameVerifier r2 = defpackage.m3a.j
            r3.setHostnameVerifier(r2)
            goto L44
        L3c:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "No ssl socket factory set."
            r2.<init>(r3)
            throw r2
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.opendevice.d.a(android.content.Context, java.net.HttpURLConnection):void");
    }
}
