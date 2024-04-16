package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.k;
import org.bouncycastle.util.encoders.b;
/* renamed from: a0  reason: default package */
/* loaded from: classes3.dex */
public class a0 {
    static jac a = new a();
    static final Hashtable b = new Hashtable();
    static final Hashtable c = new Hashtable();
    static final Hashtable d = new Hashtable();

    /* renamed from: a0$a */
    /* loaded from: classes3.dex */
    static class a extends jac {
        a() {
        }

        @Override // defpackage.jac
        protected iac a() {
            BigInteger g = a0.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger g2 = a0.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger g3 = a0.g("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger g4 = a0.g("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            ea3 e = a0.e(new ea3.f(g, g2, g3, g4, valueOf));
            return new iac(e, a0.d(e, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), g4, valueOf, null);
        }
    }

    static {
        f("FRP256v1", b0.a, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kac d(ea3 ea3Var, String str) {
        kac kacVar = new kac(ea3Var, b.b(str));
        n2c.c(kacVar.t());
        return kacVar;
    }

    static void f(String str, k kVar, jac jacVar) {
        b.put(a0b.f(str), kVar);
        d.put(kVar, str);
        c.put(kVar, jacVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger g(String str) {
        return new BigInteger(1, b.b(str));
    }

    public static iac h(String str) {
        k l = l(str);
        if (l == null) {
            return null;
        }
        return i(l);
    }

    public static iac i(k kVar) {
        jac jacVar = (jac) c.get(kVar);
        if (jacVar == null) {
            return null;
        }
        return jacVar.b();
    }

    public static String j(k kVar) {
        return (String) d.get(kVar);
    }

    public static Enumeration k() {
        return d.elements();
    }

    public static k l(String str) {
        return (k) b.get(a0b.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ea3 e(ea3 ea3Var) {
        return ea3Var;
    }
}
