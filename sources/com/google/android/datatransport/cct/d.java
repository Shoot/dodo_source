package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import com.inappstory.sdk.network.NetworkHandler;
import defpackage.l91;
import defpackage.qw5;
import defpackage.tmb;
import defpackage.tw5;
import defpackage.zv6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CctTransportBackend.java */
/* loaded from: classes2.dex */
public final class d implements vlb {
    private final tk2 a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final x91 e;
    private final x91 f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class a {
        final URL a;
        final v90 b;
        final String c;

        a(URL url, v90 v90Var, String str) {
            this.a = url;
            this.b = v90Var;
            this.c = str;
        }

        a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    d(Context context, x91 x91Var, x91 x91Var2, int i) {
        this.a = v90.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(com.google.android.datatransport.cct.a.c);
        this.e = x91Var2;
        this.f = x91Var;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        wx5.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(NetworkHandler.POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                wx5.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                wx5.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                wx5.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        b bVar = new b(responseCode, null, zw5.b(new BufferedReader(new InputStreamReader(m))).c());
                        if (m != null) {
                            m.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return bVar;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            wx5.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            wx5.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            wx5.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            wx5.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return zv6.b.UNKNOWN_MOBILE_SUBTYPE.i();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return zv6.b.COMBINED.i();
        }
        if (zv6.b.a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return zv6.c.NONE.i();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            wx5.d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    private v90 i(b60 b60Var) {
        qw5.a j;
        HashMap hashMap = new HashMap();
        for (wk3 wk3Var : b60Var.b()) {
            String j2 = wk3Var.j();
            if (!hashMap.containsKey(j2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(wk3Var);
                hashMap.put(j2, arrayList);
            } else {
                ((List) hashMap.get(j2)).add(wk3Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            wk3 wk3Var2 = (wk3) ((List) entry.getValue()).get(0);
            tw5.a b2 = tw5.a().f(ru8.DEFAULT).g(this.f.a()).h(this.e.a()).b(l91.a().c(l91.b.ANDROID_FIREBASE).b(wf.a().m(Integer.valueOf(wk3Var2.g("sdk-version"))).j(wk3Var2.b("model")).f(wk3Var2.b("hardware")).d(wk3Var2.b("device")).l(wk3Var2.b("product")).k(wk3Var2.b("os-uild")).h(wk3Var2.b("manufacturer")).e(wk3Var2.b("fingerprint")).c(wk3Var2.b(tmb.c.COUNTRY_JSON_NAME)).g(wk3Var2.b("locale")).i(wk3Var2.b("mcc_mnc")).b(wk3Var2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (wk3 wk3Var3 : (List) entry.getValue()) {
                zg3 e = wk3Var3.e();
                eh3 b3 = e.b();
                if (b3.equals(eh3.b("proto"))) {
                    j = qw5.j(e.a());
                } else if (b3.equals(eh3.b("json"))) {
                    j = qw5.i(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    wx5.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j.c(wk3Var3.f()).d(wk3Var3.k()).h(wk3Var3.h("tz-offset")).e(zv6.a().c(zv6.c.a(wk3Var3.g("net-type"))).b(zv6.b.a(wk3Var3.g("mobile-subtype"))).a());
                if (wk3Var3.d() != null) {
                    j.b(wk3Var3.d());
                }
                arrayList3.add(j.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return v90.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            wx5.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // defpackage.vlb
    public wk3 a(wk3 wk3Var) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return wk3Var.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(tmb.c.COUNTRY_JSON_NAME, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    @Override // defpackage.vlb
    public c60 b(b60 b60Var) {
        v90 i = i(b60Var);
        URL url = this.d;
        String str = null;
        if (b60Var.c() != null) {
            try {
                com.google.android.datatransport.cct.a c = com.google.android.datatransport.cct.a.c(b60Var.c());
                if (c.d() != null) {
                    str = c.d();
                }
                if (c.e() != null) {
                    url = n(c.e());
                }
            } catch (IllegalArgumentException unused) {
                return c60.a();
            }
        }
        try {
            b bVar = (b) bl9.a(5, new a(url, i, str), new t84() { // from class: com.google.android.datatransport.cct.b
                @Override // defpackage.t84
                public final Object apply(Object obj) {
                    d.b e;
                    e = d.this.e((d.a) obj);
                    return e;
                }
            }, new am9() { // from class: com.google.android.datatransport.cct.c
                @Override // defpackage.am9
                public final Object a(Object obj, Object obj2) {
                    d.a l;
                    l = d.l((d.a) obj, (d.b) obj2);
                    return l;
                }
            });
            int i2 = bVar.a;
            if (i2 == 200) {
                return c60.e(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                if (i2 == 400) {
                    return c60.d();
                }
                return c60.a();
            }
            return c60.f();
        } catch (IOException e) {
            wx5.d("CctTransportBackend", "Could not make request to the backend", e);
            return c60.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, x91 x91Var, x91 x91Var2) {
        this(context, x91Var, x91Var2, 130000);
    }
}
