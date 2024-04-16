package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsController.java */
/* renamed from: bga  reason: default package */
/* loaded from: classes2.dex */
public class bga implements gga {
    private final Context a;
    private final hga b;
    private final dga c;
    private final k32 d;
    private final zl0 e;
    private final iga f;
    private final ok2 g;
    private final AtomicReference<vfa> h;
    private final AtomicReference<a7b<vfa>> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsController.java */
    /* renamed from: bga$a */
    /* loaded from: classes2.dex */
    public class a implements r1b<Void, Void> {
        a() {
        }

        @Override // defpackage.r1b
        @NonNull
        /* renamed from: b */
        public y6b<Void> a(Void r5) throws Exception {
            JSONObject a = bga.this.f.a(bga.this.b, true);
            if (a != null) {
                vfa b = bga.this.c.b(a);
                bga.this.e.c(b.c, a);
                bga.this.q(a, "Loaded settings: ");
                bga bgaVar = bga.this;
                bgaVar.r(bgaVar.b.f);
                bga.this.h.set(b);
                ((a7b) bga.this.i.get()).e(b);
            }
            return o7b.e(null);
        }
    }

    bga(Context context, hga hgaVar, k32 k32Var, dga dgaVar, zl0 zl0Var, iga igaVar, ok2 ok2Var) {
        AtomicReference<vfa> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new a7b());
        this.a = context;
        this.b = hgaVar;
        this.d = k32Var;
        this.c = dgaVar;
        this.e = zl0Var;
        this.f = igaVar;
        this.g = ok2Var;
        atomicReference.set(tr2.b(k32Var));
    }

    public static bga l(Context context, String str, gt4 gt4Var, oq4 oq4Var, String str2, String str3, hu3 hu3Var, ok2 ok2Var) {
        String g = gt4Var.g();
        f4b f4bVar = new f4b();
        return new bga(context, new hga(str, gt4Var.h(), gt4Var.i(), gt4Var.j(), gt4Var, ek1.h(ek1.m(context), str, str3, str2), str3, str2, pz2.a(g).i()), f4bVar, new dga(f4bVar), new zl0(hu3Var), new ur2(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), oq4Var), ok2Var);
    }

    private vfa m(zfa zfaVar) {
        vfa vfaVar = null;
        try {
            if (!zfa.SKIP_CACHE_LOOKUP.equals(zfaVar)) {
                JSONObject b = this.e.b();
                if (b != null) {
                    vfa b2 = this.c.b(b);
                    if (b2 != null) {
                        q(b, "Loaded cached settings: ");
                        long a2 = this.d.a();
                        if (!zfa.IGNORE_CACHE_EXPIRATION.equals(zfaVar) && b2.a(a2)) {
                            rx5.f().i("Cached settings have expired.");
                        }
                        try {
                            rx5.f().i("Returning cached settings.");
                            vfaVar = b2;
                        } catch (Exception e) {
                            e = e;
                            vfaVar = b2;
                            rx5.f().e("Failed to get cached settings", e);
                            return vfaVar;
                        }
                    } else {
                        rx5.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    rx5.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return vfaVar;
    }

    private String n() {
        return ek1.q(this.a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        rx5 f = rx5.f();
        f.b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = ek1.q(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // defpackage.gga
    public y6b<vfa> a() {
        return this.i.get().a();
    }

    @Override // defpackage.gga
    public vfa b() {
        return this.h.get();
    }

    boolean k() {
        return !n().equals(this.b.f);
    }

    public y6b<Void> o(zfa zfaVar, Executor executor) {
        vfa m;
        if (!k() && (m = m(zfaVar)) != null) {
            this.h.set(m);
            this.i.get().e(m);
            return o7b.e(null);
        }
        vfa m2 = m(zfa.IGNORE_CACHE_EXPIRATION);
        if (m2 != null) {
            this.h.set(m2);
            this.i.get().e(m2);
        }
        return this.g.i(executor).s(executor, new a());
    }

    public y6b<Void> p(Executor executor) {
        return o(zfa.USE_CACHE, executor);
    }
}
