package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: -HeadersCommon.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t*\u00020\u0000H\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000\u001a\u0016\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a'\u0010\u0016\u001a\u0004\u0018\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u001c\u001a\u00020\f*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\f*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0003*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\f\u0010 \u001a\u00020\u0000*\u00020\fH\u0000\u001a\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0018\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\f\u0010%\u001a\u00020\u0003*\u00020$H\u0002\u001a#\u0010'\u001a\u00020\u00002\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0014\"\u00020\u0003H\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lgn4;", "", "index", "", "l", "q", Action.NAME_ATTRIBUTE, "", "r", "", "Lkotlin/Pair;", "k", "Lgn4$a;", Image.TYPE_MEDIUM, "", "other", "", "f", Image.TYPE_HIGH, "p", "", "namesAndValues", "i", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "b", "headers", c.a, DateTokenConverter.CONVERTER_KEY, "n", "o", "g", e.a, "", Image.TYPE_SMALL, "t", "", "a", "inputNamesAndValues", "j", "([Ljava/lang/String;)Lgn4;", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: qdc  reason: default package */
/* loaded from: classes3.dex */
public final class qdc {
    private static final String a(char c) {
        int a;
        a = nw0.a(16);
        String num = Integer.toString(c, a);
        z65.g(num, "toString(...)");
        if (num.length() < 2) {
            return '0' + num;
        }
        return num;
    }

    public static final gn4.a b(gn4.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        s(str);
        t(str2, str);
        d(aVar, str, str2);
        return aVar;
    }

    public static final gn4.a c(gn4.a aVar, gn4 gn4Var) {
        z65.h(aVar, "<this>");
        z65.h(gn4Var, "headers");
        int size = gn4Var.size();
        for (int i = 0; i < size; i++) {
            d(aVar, gn4Var.h(i), gn4Var.u(i));
        }
        return aVar;
    }

    public static final gn4.a d(gn4.a aVar, String str, String str2) {
        CharSequence R0;
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        aVar.h().add(str);
        List<String> h = aVar.h();
        R0 = m0b.R0(str2);
        h.add(R0.toString());
        return aVar;
    }

    public static final gn4 e(gn4.a aVar) {
        z65.h(aVar, "<this>");
        return new gn4((String[]) aVar.h().toArray(new String[0]));
    }

    public static final boolean f(gn4 gn4Var, Object obj) {
        z65.h(gn4Var, "<this>");
        if ((obj instanceof gn4) && Arrays.equals(gn4Var.g(), ((gn4) obj).g())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x002b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String g(defpackage.gn4.a r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "name"
            defpackage.z65.h(r5, r0)
            java.util.List r0 = r4.h()
            int r0 = r0.size()
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = defpackage.fp8.c(r0, r1, r2)
            if (r1 > r0) goto L3e
        L1c:
            java.util.List r2 = r4.h()
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            boolean r2 = defpackage.c0b.v(r5, r2, r3)
            if (r2 == 0) goto L39
            java.util.List r4 = r4.h()
            int r0 = r0 + r3
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L39:
            if (r0 == r1) goto L3e
            int r0 = r0 + (-2)
            goto L1c
        L3e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdc.g(gn4$a, java.lang.String):java.lang.String");
    }

    public static final int h(gn4 gn4Var) {
        z65.h(gn4Var, "<this>");
        return Arrays.hashCode(gn4Var.g());
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String i(java.lang.String[] r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "namesAndValues"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "name"
            defpackage.z65.h(r5, r0)
            int r0 = r4.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = defpackage.fp8.c(r0, r1, r2)
            if (r1 > r0) goto L27
        L15:
            r2 = r4[r0]
            r3 = 1
            boolean r2 = defpackage.c0b.v(r5, r2, r3)
            if (r2 == 0) goto L22
            int r0 = r0 + r3
            r4 = r4[r0]
            return r4
        L22:
            if (r0 == r1) goto L27
            int r0 = r0 + (-2)
            goto L15
        L27:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdc.i(java.lang.String[], java.lang.String):java.lang.String");
    }

    public static final gn4 j(String... strArr) {
        CharSequence R0;
        z65.h(strArr, "inputNamesAndValues");
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr2[i2] != null) {
                    R0 = m0b.R0(strArr[i2]);
                    strArr2[i2] = R0.toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int c = fp8.c(0, strArr2.length - 1, 2);
            if (c >= 0) {
                while (true) {
                    String str = strArr2[i];
                    String str2 = strArr2[i + 1];
                    s(str);
                    t(str2, str);
                    if (i == c) {
                        break;
                    }
                    i += 2;
                }
            }
            return new gn4(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static final Iterator<Pair<String, String>> k(gn4 gn4Var) {
        z65.h(gn4Var, "<this>");
        int size = gn4Var.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = lnb.a(gn4Var.h(i), gn4Var.u(i));
        }
        return jr.a(pairArr);
    }

    public static final String l(gn4 gn4Var, int i) {
        Object G;
        z65.h(gn4Var, "<this>");
        G = yr.G(gn4Var.g(), i * 2);
        String str = (String) G;
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final gn4.a m(gn4 gn4Var) {
        z65.h(gn4Var, "<this>");
        gn4.a aVar = new gn4.a();
        pc1.D(aVar.h(), gn4Var.g());
        return aVar;
    }

    public static final gn4.a n(gn4.a aVar, String str) {
        boolean v;
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        int i = 0;
        while (i < aVar.h().size()) {
            v = l0b.v(str, aVar.h().get(i), true);
            if (v) {
                aVar.h().remove(i);
                aVar.h().remove(i);
                i -= 2;
            }
            i += 2;
        }
        return aVar;
    }

    public static final gn4.a o(gn4.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        s(str);
        t(str2, str);
        aVar.i(str);
        d(aVar, str, str2);
        return aVar;
    }

    public static final String p(gn4 gn4Var) {
        z65.h(gn4Var, "<this>");
        StringBuilder sb = new StringBuilder();
        int size = gn4Var.size();
        for (int i = 0; i < size; i++) {
            String h = gn4Var.h(i);
            String u = gn4Var.u(i);
            sb.append(h);
            sb.append(": ");
            if (zdc.B(h)) {
                u = "██";
            }
            sb.append(u);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String q(gn4 gn4Var, int i) {
        Object G;
        z65.h(gn4Var, "<this>");
        G = yr.G(gn4Var.g(), (i * 2) + 1);
        String str = (String) G;
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static final List<String> r(gn4 gn4Var, String str) {
        List<String> l;
        boolean v;
        z65.h(gn4Var, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        int size = gn4Var.size();
        List<String> list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            v = l0b.v(str, gn4Var.h(i), true);
            if (v) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(gn4Var.u(i));
            }
        }
        if (arrayList != null) {
            list = sc1.F0(arrayList);
        }
        if (list == null) {
            l = kc1.l();
            return l;
        }
        return list;
    }

    public static final void s(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(("Unexpected char 0x" + a(charAt) + " at " + i + " in header name: " + str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static final void t(String str, String str2) {
        String str3;
        z65.h(str, "value");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected char 0x");
                sb.append(a(charAt));
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (zdc.B(str2)) {
                    str3 = "";
                } else {
                    str3 = ": " + str;
                }
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
