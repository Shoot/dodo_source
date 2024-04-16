package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.k;
/* renamed from: ls6  reason: default package */
/* loaded from: classes3.dex */
public class ls6 {
    static final Hashtable a = new Hashtable();
    static final Hashtable b = new Hashtable();

    static {
        a("B-571", yp9.F);
        a("B-409", yp9.D);
        a("B-283", yp9.n);
        a("B-233", yp9.t);
        a("B-163", yp9.l);
        a("K-571", yp9.E);
        a("K-409", yp9.C);
        a("K-283", yp9.m);
        a("K-233", yp9.s);
        a("K-163", yp9.b);
        a("P-521", yp9.B);
        a("P-384", yp9.A);
        a("P-256", yp9.H);
        a("P-224", yp9.z);
        a("P-192", yp9.G);
    }

    static void a(String str, k kVar) {
        a.put(str, kVar);
        b.put(kVar, str);
    }

    public static iac b(String str) {
        k kVar = (k) a.get(a0b.j(str));
        if (kVar != null) {
            return c(kVar);
        }
        return null;
    }

    public static iac c(k kVar) {
        return xp9.k(kVar);
    }

    public static String d(k kVar) {
        return (String) b.get(kVar);
    }

    public static Enumeration e() {
        return a.keys();
    }

    public static k f(String str) {
        return (k) a.get(a0b.j(str));
    }
}
