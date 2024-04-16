package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.b1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.util.encoders.b;
/* renamed from: sr4  reason: default package */
/* loaded from: classes3.dex */
public class sr4 {
    public static void a(StringBuffer stringBuffer, x29 x29Var, Hashtable hashtable) {
        if (x29Var.w()) {
            fz[] v = x29Var.v();
            boolean z = true;
            for (int i = 0; i != v.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                b(stringBuffer, v[i], hashtable);
            }
        } else if (x29Var.t() != null) {
            b(stringBuffer, x29Var.t(), hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, fz fzVar, Hashtable hashtable) {
        String str = (String) hashtable.get(fzVar.u());
        if (str == null) {
            str = fzVar.u().H();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(i(fzVar.v()));
    }

    private static boolean c(fz fzVar, fz fzVar2) {
        if (fzVar == fzVar2) {
            return true;
        }
        if (fzVar != null && fzVar2 != null && fzVar.u().x(fzVar2.u()) && d(fzVar.v()).equals(d(fzVar2.v()))) {
            return true;
        }
        return false;
    }

    public static String d(h0 h0Var) {
        return e(i(h0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r5 >= r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            org.bouncycastle.asn1.n r0 = f(r7)
            boolean r2 = r0 instanceof defpackage.m0
            if (r2 == 0) goto L1d
            m0 r0 = (defpackage.m0) r0
            java.lang.String r7 = r0.g()
        L1d:
            java.lang.String r7 = defpackage.a0b.f(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr4.e(java.lang.String):java.lang.String");
    }

    private static n f(String str) {
        try {
            return n.z(b.c(str, 1, str.length() - 1));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public static boolean g(x29 x29Var, x29 x29Var2) {
        if (x29Var.size() != x29Var2.size()) {
            return false;
        }
        fz[] v = x29Var.v();
        fz[] v2 = x29Var2.v();
        if (v.length != v2.length) {
            return false;
        }
        for (int i = 0; i != v.length; i++) {
            if (!c(v[i], v2[i])) {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String i(h0 h0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        if ((h0Var instanceof m0) && !(h0Var instanceof b1)) {
            String g = ((m0) h0Var).g();
            if (g.length() > 0 && g.charAt(0) == '#') {
                stringBuffer.append(CoreConstants.ESCAPE_CHAR);
            }
            stringBuffer.append(g);
        } else {
            try {
                stringBuffer.append('#');
                stringBuffer.append(b.f(h0Var.f().p("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int length = stringBuffer.length();
        int i = 2;
        i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 0 : 0;
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        return stringBuffer.toString();
    }
}
