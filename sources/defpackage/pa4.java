package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.k;
/* renamed from: pa4  reason: default package */
/* loaded from: classes3.dex */
public class pa4 {
    static jac a = new a();
    static jac b = new b();
    static final Hashtable c = new Hashtable();
    static final Hashtable d = new Hashtable();
    static final Hashtable e = new Hashtable();

    /* renamed from: pa4$a */
    /* loaded from: classes3.dex */
    static class a extends jac {
        a() {
        }

        @Override // defpackage.jac
        protected iac a() {
            BigInteger g = pa4.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger g2 = pa4.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger g3 = pa4.g("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger g4 = pa4.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            ea3 e = pa4.e(new ea3.f(g, g2, g3, g4, valueOf));
            return new iac(e, pa4.d(e, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), g4, valueOf, null);
        }
    }

    /* renamed from: pa4$b */
    /* loaded from: classes3.dex */
    static class b extends jac {
        b() {
        }

        @Override // defpackage.jac
        protected iac a() {
            BigInteger g = pa4.g("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger g2 = pa4.g("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger g3 = pa4.g("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger g4 = pa4.g("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            ea3 e = pa4.e(new ea3.f(g, g2, g3, g4, valueOf));
            return new iac(e, pa4.d(e, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), g4, valueOf, null);
        }
    }

    static {
        f("wapip192v1", qa4.J, b);
        f("sm2p256v1", qa4.F, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kac d(ea3 ea3Var, String str) {
        kac kacVar = new kac(ea3Var, org.bouncycastle.util.encoders.b.b(str));
        n2c.c(kacVar.t());
        return kacVar;
    }

    static void f(String str, k kVar, jac jacVar) {
        c.put(a0b.f(str), kVar);
        e.put(kVar, str);
        d.put(kVar, jacVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger g(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.b.b(str));
    }

    public static iac h(String str) {
        k l = l(str);
        if (l == null) {
            return null;
        }
        return i(l);
    }

    public static iac i(k kVar) {
        jac jacVar = (jac) d.get(kVar);
        if (jacVar == null) {
            return null;
        }
        return jacVar.b();
    }

    public static String j(k kVar) {
        return (String) e.get(kVar);
    }

    public static Enumeration k() {
        return e.elements();
    }

    public static k l(String str) {
        return (k) c.get(a0b.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ea3 e(ea3 ea3Var) {
        return ea3Var;
    }
}
