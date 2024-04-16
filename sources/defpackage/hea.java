package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.dfa;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SessionEvents.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J>\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u0019\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lhea;", "", "Ldfa;", "subscriber", "Lrk2;", DateTokenConverter.CONVERTER_KEY, "Lqv3;", "firebaseApp", "Lfea;", "sessionDetails", "Lgfa;", "sessionsSettings", "", "Ldfa$a;", "subscribers", "", "firebaseInstallationId", "Lgea;", "a", "Lop;", "b", "Ltk2;", "Ltk2;", c.a, "()Ltk2;", "SESSION_EVENT_ENCODER", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: hea  reason: default package */
/* loaded from: classes2.dex */
public final class hea {
    public static final hea a = new hea();
    private static final tk2 b;

    static {
        tk2 i = new ja5().j(c10.a).k(true).i();
        z65.g(i, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        b = i;
    }

    private hea() {
    }

    private final rk2 d(dfa dfaVar) {
        if (dfaVar == null) {
            return rk2.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (dfaVar.a()) {
            return rk2.COLLECTION_ENABLED;
        }
        return rk2.COLLECTION_DISABLED;
    }

    public final gea a(qv3 qv3Var, fea feaVar, gfa gfaVar, Map<dfa.a, ? extends dfa> map, String str) {
        z65.h(qv3Var, "firebaseApp");
        z65.h(feaVar, "sessionDetails");
        z65.h(gfaVar, "sessionsSettings");
        z65.h(map, "subscribers");
        z65.h(str, "firebaseInstallationId");
        return new gea(ll3.SESSION_START, new lea(feaVar.b(), feaVar.a(), feaVar.c(), feaVar.d(), new sk2(d(map.get(dfa.a.PERFORMANCE)), d(map.get(dfa.a.CRASHLYTICS)), gfaVar.b()), str), b(qv3Var));
    }

    public final op b(qv3 qv3Var) {
        String valueOf;
        String str;
        long longVersionCode;
        z65.h(qv3Var, "firebaseApp");
        Context k = qv3Var.k();
        z65.g(k, "firebaseApp.applicationContext");
        String packageName = k.getPackageName();
        PackageInfo packageInfo = k.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        String c = qv3Var.n().c();
        z65.g(c, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        z65.g(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        z65.g(str4, "RELEASE");
        pw5 pw5Var = pw5.LOG_ENVIRONMENT_PROD;
        z65.g(packageName, "packageName");
        String str5 = packageInfo.versionName;
        if (str5 == null) {
            str = str2;
        } else {
            str = str5;
        }
        String str6 = Build.MANUFACTURER;
        z65.g(str6, "MANUFACTURER");
        ok8 ok8Var = ok8.a;
        Context k2 = qv3Var.k();
        z65.g(k2, "firebaseApp.applicationContext");
        mk8 d = ok8Var.d(k2);
        Context k3 = qv3Var.k();
        z65.g(k3, "firebaseApp.applicationContext");
        return new op(c, str3, "1.2.2", str4, pw5Var, new fe(packageName, str, str2, str6, d, ok8Var.c(k3)));
    }

    public final tk2 c() {
        return b;
    }
}
