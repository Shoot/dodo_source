package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes2.dex */
public class a {
    public static final byte[] n = new byte[0];
    private final Context a;
    private final qv3 b;
    private final lv3 c;
    private final Executor d;
    private final com.google.firebase.remoteconfig.internal.b e;
    private final com.google.firebase.remoteconfig.internal.b f;
    private final com.google.firebase.remoteconfig.internal.b g;
    private final d h;
    private final tp1 i;
    private final e j;
    private final ew3 k;
    private final f l;
    private final rn9 m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, qv3 qv3Var, ew3 ew3Var, lv3 lv3Var, Executor executor, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2, com.google.firebase.remoteconfig.internal.b bVar3, d dVar, tp1 tp1Var, e eVar, f fVar, rn9 rn9Var) {
        this.a = context;
        this.b = qv3Var;
        this.k = ew3Var;
        this.c = lv3Var;
        this.d = executor;
        this.e = bVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = dVar;
        this.i = tp1Var;
        this.j = eVar;
        this.l = fVar;
        this.m = rn9Var;
    }

    private y6b<Void> D(Map<String, String> map) {
        try {
            return this.g.k(com.google.firebase.remoteconfig.internal.c.l().b(map).a()).s(yv3.a(), new r1b() { // from class: ix3
                @Override // defpackage.r1b
                public final y6b a(Object obj) {
                    y6b y;
                    y = a.y((c) obj);
                    return y;
                }
            });
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return o7b.e(null);
        }
    }

    static List<Map<String, String>> F(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @NonNull
    public static a o() {
        return p(qv3.l());
    }

    @NonNull
    public static a p(@NonNull qv3 qv3Var) {
        return ((c) qv3Var.j(c.class)).g();
    }

    private static boolean s(com.google.firebase.remoteconfig.internal.c cVar, com.google.firebase.remoteconfig.internal.c cVar2) {
        if (cVar2 != null && cVar.h().equals(cVar2.h())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b t(y6b y6bVar, y6b y6bVar2, y6b y6bVar3) throws Exception {
        if (y6bVar.q() && y6bVar.m() != null) {
            com.google.firebase.remoteconfig.internal.c cVar = (com.google.firebase.remoteconfig.internal.c) y6bVar.m();
            if (y6bVar2.q() && !s(cVar, (com.google.firebase.remoteconfig.internal.c) y6bVar2.m())) {
                return o7b.e(Boolean.FALSE);
            }
            return this.f.k(cVar).j(this.d, new dv1() { // from class: nx3
                @Override // defpackage.dv1
                public final Object a(y6b y6bVar4) {
                    boolean z;
                    z = a.this.z(y6bVar4);
                    return Boolean.valueOf(z);
                }
            });
        }
        return o7b.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6b u(d.a aVar) throws Exception {
        return o7b.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6b v(d.a aVar) throws Exception {
        return o7b.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b w(Void r1) throws Exception {
        return h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void x(rx3 rx3Var) throws Exception {
        this.j.l(rx3Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6b y(com.google.firebase.remoteconfig.internal.c cVar) throws Exception {
        return o7b.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(y6b<com.google.firebase.remoteconfig.internal.c> y6bVar) {
        if (y6bVar.q()) {
            this.e.d();
            com.google.firebase.remoteconfig.internal.c m = y6bVar.m();
            if (m != null) {
                G(m.e());
                this.m.g(m);
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    @NonNull
    public y6b<Void> A(@NonNull final rx3 rx3Var) {
        return o7b.c(this.d, new Callable() { // from class: lx3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void x;
                x = a.this.x(rx3Var);
                return x;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(boolean z) {
        this.l.b(z);
    }

    @NonNull
    public y6b<Void> C(int i) {
        return D(fs2.a(this.a, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    void G(@NonNull JSONArray jSONArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.m(F(jSONArray));
        } catch (AbtException e) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
        }
    }

    @NonNull
    public y6b<Boolean> h() {
        final y6b<com.google.firebase.remoteconfig.internal.c> e = this.e.e();
        final y6b<com.google.firebase.remoteconfig.internal.c> e2 = this.f.e();
        return o7b.i(e, e2).k(this.d, new dv1() { // from class: mx3
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b t;
                t = a.this.t(e, e2, y6bVar);
                return t;
            }
        });
    }

    @NonNull
    public y6b<Void> i() {
        return this.h.i().s(yv3.a(), new r1b() { // from class: kx3
            @Override // defpackage.r1b
            public final y6b a(Object obj) {
                y6b u;
                u = a.u((d.a) obj);
                return u;
            }
        });
    }

    @NonNull
    public y6b<Void> j(long j) {
        return this.h.j(j).s(yv3.a(), new r1b() { // from class: jx3
            @Override // defpackage.r1b
            public final y6b a(Object obj) {
                y6b v;
                v = a.v((d.a) obj);
                return v;
            }
        });
    }

    @NonNull
    public y6b<Boolean> k() {
        return i().s(this.d, new r1b() { // from class: hx3
            @Override // defpackage.r1b
            public final y6b a(Object obj) {
                y6b w;
                w = a.this.w((Void) obj);
                return w;
            }
        });
    }

    @NonNull
    public Map<String, sx3> l() {
        return this.i.d();
    }

    public boolean m(@NonNull String str) {
        return this.i.e(str);
    }

    @NonNull
    public px3 n() {
        return this.j.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rn9 q() {
        return this.m;
    }

    @NonNull
    public String r(@NonNull String str) {
        return this.i.h(str);
    }
}
