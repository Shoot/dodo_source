package defpackage;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.k;
/* renamed from: gb3  reason: default package */
/* loaded from: classes3.dex */
public class gb3 {
    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static iac b(String str) {
        iac h = fac.h(str);
        if (h == null) {
            h = xp9.j(str);
        }
        if (h == null) {
            h = ls6.b(str);
        }
        if (h == null) {
            h = i8b.h(str);
        }
        if (h == null) {
            h = a0.h(str);
        }
        if (h == null) {
            h = pa3.d(str);
        }
        if (h == null) {
            return pa4.h(str);
        }
        return h;
    }

    public static iac c(k kVar) {
        iac i = fac.i(kVar);
        if (i == null) {
            i = xp9.k(kVar);
        }
        if (i == null) {
            i = i8b.i(kVar);
        }
        if (i == null) {
            i = a0.i(kVar);
        }
        if (i == null) {
            i = pa3.e(kVar);
        }
        if (i == null) {
            return pa4.i(kVar);
        }
        return i;
    }

    public static String d(k kVar) {
        String j = fac.j(kVar);
        if (j == null) {
            j = xp9.l(kVar);
        }
        if (j == null) {
            j = ls6.d(kVar);
        }
        if (j == null) {
            j = i8b.j(kVar);
        }
        if (j == null) {
            j = a0.j(kVar);
        }
        if (j == null) {
            j = pa3.f(kVar);
        }
        if (j == null) {
            j = pa4.j(kVar);
        }
        if (j == null) {
            return y32.k(kVar);
        }
        return j;
    }

    public static Enumeration e() {
        Vector vector = new Vector();
        a(vector, fac.k());
        a(vector, xp9.m());
        a(vector, ls6.e());
        a(vector, i8b.k());
        a(vector, a0.k());
        a(vector, pa3.g());
        a(vector, pa4.k());
        return vector.elements();
    }

    public static k f(String str) {
        k l = fac.l(str);
        if (l == null) {
            l = xp9.n(str);
        }
        if (l == null) {
            l = ls6.f(str);
        }
        if (l == null) {
            l = i8b.l(str);
        }
        if (l == null) {
            l = a0.l(str);
        }
        if (l == null) {
            l = pa3.h(str);
        }
        if (l == null) {
            l = pa4.l(str);
        }
        if (l == null && str.equals("curve25519")) {
            return w22.c;
        }
        return l;
    }
}
