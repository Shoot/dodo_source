package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes2.dex */
public class d {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};
    private final ew3 a;
    private final bs8<jc> b;
    private final Executor c;
    private final t91 d;
    private final Random e;
    private final com.google.firebase.remoteconfig.internal.b f;
    private final ConfigFetchHttpClient g;
    private final e h;
    private final Map<String, String> i;

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes2.dex */
    public static class a {
        private final Date a;
        private final int b;
        private final c c;
        private final String d;

        private a(Date date, int i, c cVar, String str) {
            this.a = date;
            this.b = i;
            this.c = cVar;
            this.d = str;
        }

        public static a a(Date date, c cVar) {
            return new a(date, 1, cVar, null);
        }

        public static a b(c cVar, String str) {
            return new a(cVar.h(), 0, cVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public c d() {
            return this.c;
        }

        String e() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int f() {
            return this.b;
        }
    }

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes2.dex */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");
        
        private final String a;

        b(String str) {
            this.a = str;
        }

        String getValue() {
            return this.a;
        }
    }

    public d(ew3 ew3Var, bs8<jc> bs8Var, Executor executor, t91 t91Var, Random random, com.google.firebase.remoteconfig.internal.b bVar, ConfigFetchHttpClient configFetchHttpClient, e eVar, Map<String, String> map) {
        this.a = ew3Var;
        this.b = bs8Var;
        this.c = executor;
        this.d = t91Var;
        this.e = random;
        this.f = bVar;
        this.g = configFetchHttpClient;
        this.h = eVar;
        this.i = map;
    }

    private e.a A(int i, Date date) {
        if (t(i)) {
            B(date);
        }
        return this.h.a();
    }

    private void B(Date date) {
        int b2 = this.h.a().b() + 1;
        this.h.k(b2, new Date(date.getTime() + q(b2)));
    }

    private void C(y6b<a> y6bVar, Date date) {
        if (y6bVar.q()) {
            this.h.q(date);
            return;
        }
        Exception l = y6bVar.l();
        if (l == null) {
            return;
        }
        if (l instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.h.r();
        } else {
            this.h.p();
        }
    }

    private boolean f(long j2, Date date) {
        Date e = this.h.e();
        if (e.equals(e.e)) {
            return false;
        }
        return date.before(new Date(e.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a2 = firebaseRemoteConfigServerException.a();
        if (a2 != 401) {
            if (a2 != 403) {
                if (a2 != 429) {
                    if (a2 != 500) {
                        switch (a2) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int a3 = firebaseRemoteConfigServerException.a();
        return new FirebaseRemoteConfigServerException(a3, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.g.fetch(this.g.d(), str, str2, s(), this.h.d(), map, p(), date);
            if (fetch.d() != null) {
                this.h.n(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.h.m(fetch.e());
            }
            this.h.i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            e.a A = A(e.a(), date);
            if (z(A, e.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(A.a().getTime());
            }
            throw g(e);
        }
    }

    private y6b<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a k2 = k(str, str2, date, map);
            if (k2.f() != 0) {
                return o7b.e(k2);
            }
            return this.f.k(k2.d()).s(this.c, new r1b() { // from class: rp1
                @Override // defpackage.r1b
                public final y6b a(Object obj) {
                    y6b e;
                    c cVar = (c) obj;
                    e = o7b.e(d.a.this);
                    return e;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return o7b.d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public y6b<a> u(y6b<c> y6bVar, long j2, final Map<String, String> map) {
        y6b k2;
        final Date date = new Date(this.d.currentTimeMillis());
        if (y6bVar.q() && f(j2, date)) {
            return o7b.e(a.c(date));
        }
        Date o = o(date);
        if (o != null) {
            k2 = o7b.d(new FirebaseRemoteConfigFetchThrottledException(h(o.getTime() - date.getTime()), o.getTime()));
        } else {
            final y6b<String> id = this.a.getId();
            final y6b<com.google.firebase.installations.f> a2 = this.a.a(false);
            k2 = o7b.i(id, a2).k(this.c, new dv1() { // from class: op1
                @Override // defpackage.dv1
                public final Object a(y6b y6bVar2) {
                    y6b w;
                    w = d.this.w(id, a2, date, map, y6bVar2);
                    return w;
                }
            });
        }
        return k2.k(this.c, new dv1() { // from class: pp1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar2) {
                y6b x;
                x = d.this.x(date, y6bVar2);
                return x;
            }
        });
    }

    private Date o(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private Long p() {
        jc jcVar = this.b.get();
        if (jcVar == null) {
            return null;
        }
        return (Long) jcVar.d(true).get("_fot");
    }

    private long q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.e.nextInt((int) millis);
    }

    private Map<String, String> s() {
        HashMap hashMap = new HashMap();
        jc jcVar = this.b.get();
        if (jcVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jcVar.d(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i) {
        if (i != 429 && i != 502 && i != 503 && i != 504) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b w(y6b y6bVar, y6b y6bVar2, Date date, Map map, y6b y6bVar3) throws Exception {
        if (!y6bVar.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", y6bVar.l()));
        }
        if (!y6bVar2.q()) {
            return o7b.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", y6bVar2.l()));
        }
        return l((String) y6bVar.m(), ((com.google.firebase.installations.f) y6bVar2.m()).b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b x(Date date, y6b y6bVar) throws Exception {
        C(y6bVar, date);
        return y6bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b y(Map map, y6b y6bVar) throws Exception {
        return u(y6bVar, 0L, map);
    }

    private boolean z(e.a aVar, int i) {
        if (aVar.b() > 1 || i == 429) {
            return true;
        }
        return false;
    }

    public y6b<a> i() {
        return j(this.h.g());
    }

    public y6b<a> j(final long j2) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.getValue() + "/1");
        return this.f.e().k(this.c, new dv1() { // from class: np1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b u;
                u = d.this.u(j2, hashMap, y6bVar);
                return u;
            }
        });
    }

    public y6b<a> n(b bVar, int i) {
        final HashMap hashMap = new HashMap(this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.getValue() + "/" + i);
        return this.f.e().k(this.c, new dv1() { // from class: qp1
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b y;
                y = d.this.y(hashMap, y6bVar);
                return y;
            }
        });
    }

    public long r() {
        return this.h.f();
    }
}
