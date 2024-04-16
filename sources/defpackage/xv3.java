package defpackage;

import android.os.Build;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: FirebaseDefaultInterceptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lxv3;", "Lrc;", "", "", "", "b", "Llc;", "consumer", "Lqc;", "event", "a", "Ljv5;", "Ljv5;", "localityService", "<init>", "(Ljv5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xv3  reason: default package */
/* loaded from: classes3.dex */
public final class xv3 implements rc {
    private final jv5 a;

    public xv3(jv5 jv5Var) {
        z65.h(jv5Var, "localityService");
        this.a = jv5Var;
    }

    private final Map<String, Object> b() {
        String str;
        Map<String, Object> k;
        dt5 i = this.a.i();
        if (i != null) {
            str = i.getName();
        } else {
            str = null;
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        k = g86.k(lnb.a("location", (String) mh5.c(str, "undefined")), lnb.a("deviceType", str2 + " " + str3), lnb.a("platform", "android"));
        return k;
    }

    @Override // defpackage.rc
    public qc a(lc lcVar, qc qcVar) {
        Map o;
        z65.h(lcVar, "consumer");
        z65.h(qcVar, "event");
        if (lcVar instanceof mv3) {
            o = g86.o(qcVar.d(), b());
            return qc.b(qcVar, null, null, o, 3, null);
        }
        return qcVar;
    }
}
