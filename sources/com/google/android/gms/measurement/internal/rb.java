package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class rb {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean b(double d, com.google.android.gms.internal.measurement.e eVar) {
        try {
            return h(new BigDecimal(d), eVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean c(long j, com.google.android.gms.internal.measurement.e eVar) {
        try {
            return h(new BigDecimal(j), eVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean d(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean e(String str, com.google.android.gms.internal.measurement.e eVar) {
        if (!db.h0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), eVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, g.a aVar, boolean z, String str2, List<String> list, String str3, k4 k4Var) {
        int i;
        if (str == null) {
            return null;
        }
        if (aVar == g.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != g.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (nb.a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (z) {
                    i = 0;
                } else {
                    i = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (k4Var != null) {
                        k4Var.K().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(String str, com.google.android.gms.internal.measurement.g gVar, k4 k4Var) {
        String K;
        List<String> list;
        String str2;
        gh8.j(gVar);
        if (str == null || !gVar.P() || gVar.H() == g.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        g.a H = gVar.H();
        g.a aVar = g.a.IN_LIST;
        if (H == aVar) {
            if (gVar.m() == 0) {
                return null;
            }
        } else if (!gVar.O()) {
            return null;
        }
        g.a H2 = gVar.H();
        boolean M = gVar.M();
        if (!M && H2 != g.a.REGEXP && H2 != aVar) {
            K = gVar.K().toUpperCase(Locale.ENGLISH);
        } else {
            K = gVar.K();
        }
        String str3 = K;
        if (gVar.m() == 0) {
            list = null;
        } else {
            List<String> L = gVar.L();
            if (!M) {
                ArrayList arrayList = new ArrayList(L.size());
                for (String str4 : L) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                L = Collections.unmodifiableList(arrayList);
            }
            list = L;
        }
        if (H2 == g.a.REGEXP) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return f(str, H2, M, str3, list, str2, k4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r3 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.e r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.rb.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.e, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();
}
