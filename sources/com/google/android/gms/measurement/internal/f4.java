package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.measurement.internal.w6;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class f4 extends x2 {
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private long h;
    private long i;
    private List<String> j;
    private String k;
    private int l;
    private String m;
    private String n;
    private String o;
    private long p;
    private String q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(u5 u5Var, long j) {
        super(u5Var);
        this.p = 0L;
        this.q = null;
        this.i = j;
    }

    private final String I() {
        if (o9d.a() && a().s(b0.l0)) {
            n().J().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    n().L().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                n().M().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzo A(java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f4.A(java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int B() {
        u();
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int C() {
        u();
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D() {
        u();
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E() {
        u();
        gh8.j(this.c);
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String F() {
        l();
        u();
        gh8.j(this.m);
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> G() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H() {
        String format;
        String str;
        l();
        if (!g().K().l(w6.a.ANALYTICS_STORAGE)) {
            n().E().a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            h().T0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        m4 E = n().E();
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        E.a(String.format("Resetting session stitching token to %s", objArr));
        this.o = format;
        this.p = b().currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str) {
        boolean z;
        String str2 = this.q;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        } else {
            z = false;
        }
        this.q = str;
        return z;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ f4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ i4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ z6 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ o8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x8 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ ea t() {
        return super.t();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(21:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|(1:14)|15|(1:17)|18|19|(1:21)(1:51)|22|(1:24)|(3:26|(1:28)(1:31)|29)|32|(3:34|(1:36)(3:43|(3:46|(1:48)|44)|49)|(2:38|39)(2:41|42))|50|(0)(0)))|4|5|(1:7)|64|10|11|(0)|15|(0)|18|19|(0)(0)|22|(0)|(0)|32|(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
        n().F().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.k4.u(r0), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    @Override // com.google.android.gms.measurement.internal.x2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void x() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f4.x():void");
    }

    @Override // com.google.android.gms.measurement.internal.x2
    protected final boolean z() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
