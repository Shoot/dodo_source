package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: ks9  reason: default package */
/* loaded from: classes3.dex */
public class ks9 {
    private static final Map<String, k> b = Collections.unmodifiableMap(new a());
    private static final Map<String, String> c = Collections.unmodifiableMap(new b());
    private static HashMap<ea3, String> d = new c();
    private static final Map<k, String> a = Collections.unmodifiableMap(new d());

    /* renamed from: ks9$a */
    /* loaded from: classes3.dex */
    static class a extends HashMap<String, k> {
        a() {
            put("nistp256", yp9.H);
            put("nistp384", yp9.A);
            put("nistp521", yp9.B);
            put("nistk163", yp9.b);
            put("nistp192", yp9.G);
            put("nistp224", yp9.z);
            put("nistk233", yp9.s);
            put("nistb233", yp9.t);
            put("nistk283", yp9.m);
            put("nistk409", yp9.C);
            put("nistb409", yp9.D);
            put("nistt571", yp9.E);
        }
    }

    /* renamed from: ks9$b */
    /* loaded from: classes3.dex */
    static class b extends HashMap<String, String> {
        b() {
            String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
            for (int i = 0; i != 12; i++) {
                String[] strArr2 = strArr[i];
                put(strArr2[0], strArr2[1]);
            }
        }
    }

    /* renamed from: ks9$c */
    /* loaded from: classes3.dex */
    static class c extends HashMap<ea3, String> {
        c() {
            Enumeration l = y32.l();
            while (l.hasMoreElements()) {
                String str = (String) l.nextElement();
                put(y32.i(str).t(), str);
            }
        }
    }

    /* renamed from: ks9$d */
    /* loaded from: classes3.dex */
    static class d extends HashMap<k, String> {
        d() {
            for (String str : ks9.b.keySet()) {
                put(ks9.b.get(str), str);
            }
        }
    }

    public static k b(String str) {
        return b.get(str);
    }

    public static String c(k kVar) {
        return a.get(kVar);
    }

    public static String d(ea3 ea3Var) {
        return c.get(d.get(ea3Var));
    }

    public static String e(la3 la3Var) {
        if (la3Var instanceof hb3) {
            return c(((hb3) la3Var).j());
        }
        return d(la3Var.a());
    }

    public static iac f(k kVar) {
        return ls6.c(kVar);
    }
}
