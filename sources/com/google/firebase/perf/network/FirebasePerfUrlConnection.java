package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(tpb tpbVar, jmb jmbVar, Timer timer) throws IOException {
        timer.g();
        long e = timer.e();
        gw6 c = gw6.c(jmbVar);
        try {
            URLConnection a = tpbVar.a();
            if (a instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a, timer, c).getContent();
            }
            if (a instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a, timer, c).getContent();
            }
            return a.getContent();
        } catch (IOException e2) {
            c.n(e);
            c.r(timer.c());
            c.t(tpbVar.toString());
            hw6.d(c);
            throw e2;
        }
    }

    static Object b(tpb tpbVar, Class[] clsArr, jmb jmbVar, Timer timer) throws IOException {
        timer.g();
        long e = timer.e();
        gw6 c = gw6.c(jmbVar);
        try {
            URLConnection a = tpbVar.a();
            if (a instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a, timer, c).getContent(clsArr);
            }
            if (a instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a, timer, c).getContent(clsArr);
            }
            return a.getContent(clsArr);
        } catch (IOException e2) {
            c.n(e);
            c.r(timer.c());
            c.t(tpbVar.toString());
            hw6.d(c);
            throw e2;
        }
    }

    static InputStream c(tpb tpbVar, jmb jmbVar, Timer timer) throws IOException {
        timer.g();
        long e = timer.e();
        gw6 c = gw6.c(jmbVar);
        try {
            URLConnection a = tpbVar.a();
            if (a instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a, timer, c).getInputStream();
            }
            if (a instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a, timer, c).getInputStream();
            }
            return a.getInputStream();
        } catch (IOException e2) {
            c.n(e);
            c.r(timer.c());
            c.t(tpbVar.toString());
            hw6.d(c);
            throw e2;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return a(new tpb(url), jmb.k(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new Timer(), gw6.c(jmb.k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new a((HttpURLConnection) obj, new Timer(), gw6.c(jmb.k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return c(new tpb(url), jmb.k(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return b(new tpb(url), clsArr, jmb.k(), new Timer());
    }
}
