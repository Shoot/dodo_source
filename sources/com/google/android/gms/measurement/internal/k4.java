package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class k4 extends s6 {
    private char c;
    private long d;
    private String e;
    private final m4 f;
    private final m4 g;
    private final m4 h;
    private final m4 i;
    private final m4 j;
    private final m4 k;
    private final m4 l;
    private final m4 m;
    private final m4 n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(u5 u5Var) {
        super(u5Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new m4(this, 6, false, false);
        this.g = new m4(this, 6, true, false);
        this.h = new m4(this, 6, false, true);
        this.i = new m4(this, 5, false, false);
        this.j = new m4(this, 5, true, false);
        this.k = new m4(this, 5, false, true);
        this.l = new m4(this, 4, false, false);
        this.m = new m4(this, 3, false, false);
        this.n = new m4(this, 2, false, false);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            if (u6d.a() && b0.D0.a(null).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String O() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.e == null) {
                    if (this.a.N() != null) {
                        str2 = this.a.N();
                    } else {
                        str2 = "FA";
                    }
                    this.e = str2;
                }
                gh8.j(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object u(String str) {
        if (str == null) {
            return null;
        }
        return new p4(str);
    }

    private static String v(boolean z, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb = new StringBuilder(th);
                String D = D(u5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof p4) {
                str = ((p4) obj).a;
                return str;
            } else if (z) {
                return "-";
            } else {
                return String.valueOf(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String v = v(z, obj);
        String v2 = v(z, obj2);
        String v3 = v(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v)) {
            sb.append(str2);
            sb.append(v);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(v2)) {
            sb.append(str2);
            sb.append(v2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(v3)) {
            sb.append(str3);
            sb.append(v3);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B(int i) {
        return Log.isLoggable(O(), i);
    }

    public final m4 E() {
        return this.m;
    }

    public final m4 F() {
        return this.f;
    }

    public final m4 G() {
        return this.h;
    }

    public final m4 H() {
        return this.g;
    }

    public final m4 I() {
        return this.l;
    }

    public final m4 J() {
        return this.n;
    }

    public final m4 K() {
        return this.i;
    }

    public final m4 L() {
        return this.k;
    }

    public final m4 M() {
        return this.j;
    }

    public final String N() {
        Pair<String, Long> a;
        if (g().f == null || (a = g().f.a()) == null || a == w4.B) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        return valueOf + ":" + ((String) a.first);
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

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final boolean s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i, String str) {
        Log.println(i, O(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i2;
        if (!z && B(i)) {
            x(i, w(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            gh8.j(str);
            o5 F = this.a.F();
            if (F == null) {
                x(6, "Scheduler not set. Not logging error/warn");
            } else if (!F.r()) {
                x(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i2 = 8;
                } else {
                    i2 = i;
                }
                F.C(new n4(this, i2, str, obj, obj2, obj3));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
