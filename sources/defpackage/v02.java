package defpackage;

import androidx.annotation.NonNull;
import defpackage.dfa;
/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* renamed from: v02  reason: default package */
/* loaded from: classes2.dex */
public class v02 implements dfa {
    private final ok2 a;
    private final u02 b;

    public v02(ok2 ok2Var, hu3 hu3Var) {
        this.a = ok2Var;
        this.b = new u02(hu3Var);
    }

    @Override // defpackage.dfa
    public boolean a() {
        return this.a.d();
    }

    @Override // defpackage.dfa
    public void b(@NonNull dfa.b bVar) {
        rx5 f = rx5.f();
        f.b("App Quality Sessions session changed: " + bVar);
        this.b.h(bVar.a());
    }

    @Override // defpackage.dfa
    @NonNull
    public dfa.a c() {
        return dfa.a.CRASHLYTICS;
    }

    public String d(@NonNull String str) {
        return this.b.c(str);
    }

    public void e(String str) {
        this.b.i(str);
    }
}
