package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.g;
import com.inappstory.sdk.network.NetworkHandler;
import defpackage.tmb;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes2.dex */
public class g {
    static final int[] q = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Set<aq1> a;
    private int c;
    private final ScheduledExecutorService g;
    private final d h;
    private final qv3 i;
    private final ew3 j;
    com.google.firebase.remoteconfig.internal.b k;
    private final Context l;
    private final String m;
    private final e p;
    private final int f = 8;
    private boolean b = false;
    private final Random n = new Random();
    private final t91 o = jp2.c();
    private boolean d = false;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.e();
        }
    }

    public g(qv3 qv3Var, ew3 ew3Var, d dVar, com.google.firebase.remoteconfig.internal.b bVar, Context context, String str, Set<aq1> set, e eVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.g = scheduledExecutorService;
        this.c = Math.max(8 - eVar.h().b(), 1);
        this.i = qv3Var;
        this.h = dVar;
        this.j = ew3Var;
        this.k = bVar;
        this.l = context;
        this.m = str;
        this.p = eVar;
    }

    private void D(Date date) {
        int b2 = this.p.h().b() + 1;
        this.p.o(b2, new Date(date.getTime() + m(b2)));
    }

    private synchronized boolean f() {
        boolean z;
        if (!this.a.isEmpty() && !this.b && !this.d) {
            if (!this.e) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.i.n().c()));
        hashMap.put("namespace", this.m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.h.r()));
        hashMap.put("appId", this.i.n().c());
        hashMap.put("sdkVersion", "21.6.3");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.d = true;
    }

    private static String k(String str) {
        Matcher matcher = r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.l;
            byte[] a2 = fj.a(context, context.getPackageName());
            if (a2 == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.l.getPackageName());
                return null;
            }
            return io4.b(a2, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.l.getPackageName());
            return null;
        }
    }

    private long m(int i) {
        int[] iArr = q;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + this.n.nextInt((int) millis);
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.i.n().c()), str);
    }

    private URL o() {
        try {
            return new URL(n(this.m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i) {
        if (i != 408 && i != 429 && i != 502 && i != 503 && i != 504) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ defpackage.y6b q(defpackage.y6b r12, defpackage.y6b r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.g.q(y6b, y6b):y6b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b r(y6b y6bVar, y6b y6bVar2, y6b y6bVar3) throws Exception {
        if (!y6bVar.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", y6bVar.l()));
        }
        if (!y6bVar2.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", y6bVar2.l()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) y6bVar2.m(), ((com.google.firebase.installations.f) y6bVar.m()).b());
            return o7b.e(httpURLConnection);
        } catch (IOException e) {
            return o7b.d(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    private synchronized void s(long j) {
        try {
            if (!f()) {
                return;
            }
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
                this.g.schedule(new a(), j, TimeUnit.MILLISECONDS);
            } else if (!this.e) {
                u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String t(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (aq1 aq1Var : this.a) {
            aq1Var.a(firebaseRemoteConfigException);
        }
    }

    private synchronized void v() {
        this.c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", tmb.h.TRUE_JSON_NAME);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z) {
        this.b = z;
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(NetworkHandler.POST);
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.a B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.h, this.k, this.a, new b(), this.g);
    }

    public void C() {
        s(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (!f()) {
            return;
        }
        if (new Date(this.o.currentTimeMillis()).before(this.p.h().a())) {
            w();
            return;
        }
        final y6b<HttpURLConnection> h = h();
        o7b.i(h).j(this.g, new dv1() { // from class: wp1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b q2;
                q2 = g.this.q(h, y6bVar);
                return q2;
            }
        });
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public y6b<HttpURLConnection> h() {
        final y6b<com.google.firebase.installations.f> a2 = this.j.a(false);
        final y6b<String> id = this.j.getId();
        return o7b.i(a2, id).k(this.g, new dv1() { // from class: xp1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b r2;
                r2 = g.this.r(a2, id, y6bVar);
                return r2;
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0L, this.p.h().a().getTime() - new Date(this.o.currentTimeMillis()).getTime()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes2.dex */
    public class b implements aq1 {
        b() {
        }

        @Override // defpackage.aq1
        public void a(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
            g.this.j();
            g.this.u(firebaseRemoteConfigException);
        }

        @Override // defpackage.aq1
        public void b(@NonNull yp1 yp1Var) {
        }
    }
}
