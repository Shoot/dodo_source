package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes2.dex */
public class a {
    private final Set<aq1> a;
    private final HttpURLConnection b;
    private final d c;
    private final b d;
    private final aq1 e;
    private final ScheduledExecutorService f;
    private final Random g = new Random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigAutoFetch.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0244a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ long b;

        RunnableC0244a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d(this.a, this.b);
        }
    }

    public a(HttpURLConnection httpURLConnection, d dVar, b bVar, Set<aq1> set, aq1 aq1Var, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = dVar;
        this.d = bVar;
        this.a = set;
        this.e = aq1Var;
        this.f = scheduledExecutorService;
    }

    private void b(int i, long j) {
        if (i == 0) {
            k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f.schedule(new RunnableC0244a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
    }

    private synchronized void c(yp1 yp1Var) {
        for (aq1 aq1Var : this.a) {
            aq1Var.b(yp1Var);
        }
    }

    private static Boolean e(d.a aVar, long j) {
        boolean z = false;
        if (aVar.d() != null) {
            if (aVar.d().k() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (aVar.f() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        r9.e.a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (g() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r6 = r9.c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r4 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            aq1 r4 = r9.e     // Catch: org.json.JSONException -> L5b
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.a(r5)     // Catch: org.json.JSONException -> L5b
            goto L96
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L96
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.d r4 = r9.c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L96:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.a.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b h(y6b y6bVar, y6b y6bVar2, long j, int i, y6b y6bVar3) throws Exception {
        if (!y6bVar.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", y6bVar.l()));
        }
        if (!y6bVar2.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", y6bVar2.l()));
        }
        d.a aVar = (d.a) y6bVar.m();
        c cVar = (c) y6bVar2.m();
        if (!e(aVar, j).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i, j);
            return o7b.e(null);
        } else if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return o7b.e(null);
        } else {
            if (cVar == null) {
                cVar = c.l().a();
            }
            Set<String> f = cVar.f(aVar.d());
            if (f.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return o7b.e(null);
            }
            c(yp1.a(f));
            return o7b.e(null);
        }
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (aq1 aq1Var : this.a) {
            aq1Var.a(firebaseRemoteConfigException);
        }
    }

    public synchronized y6b<Void> d(int i, final long j) {
        final int i2;
        final y6b<d.a> n;
        final y6b<c> e;
        i2 = i - 1;
        n = this.c.n(d.b.REALTIME, 3 - i2);
        e = this.d.e();
        return o7b.i(n, e).k(this.f, new dv1() { // from class: ip1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b h;
                h = a.this.h(n, e, j, i2, y6bVar);
                return h;
            }
        });
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
            }
        } finally {
            this.b.disconnect();
        }
    }
}
