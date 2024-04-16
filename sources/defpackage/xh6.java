package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: xh6  reason: default package */
/* loaded from: classes3.dex */
public class xh6 {
    private static Map<k, String> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(co7.A0, "MD2");
        a.put(co7.B0, "MD4");
        a.put(co7.C0, "MD5");
        a.put(g47.i, "SHA-1");
        a.put(ms6.f, "SHA-224");
        a.put(ms6.c, "SHA-256");
        a.put(ms6.d, "SHA-384");
        a.put(ms6.e, "SHA-512");
        a.put(ms6.g, "SHA-512(224)");
        a.put(ms6.h, "SHA-512(256)");
        a.put(j8b.c, "RIPEMD-128");
        a.put(j8b.b, "RIPEMD-160");
        a.put(j8b.d, "RIPEMD-128");
        a.put(zs4.d, "RIPEMD-128");
        a.put(zs4.c, "RIPEMD-160");
        a.put(y22.b, "GOST3411");
        a.put(sa4.g, "Tiger");
        a.put(zs4.e, "Whirlpool");
        a.put(ms6.i, "SHA3-224");
        a.put(ms6.j, "SHA3-256");
        a.put(ms6.k, "SHA3-384");
        a.put(ms6.l, "SHA3-512");
        a.put(ms6.m, "SHAKE128");
        a.put(ms6.n, "SHAKE256");
        a.put(qa4.b0, "SM3");
    }

    public static String a(k kVar) {
        String str = a.get(kVar);
        if (str != null) {
            return str;
        }
        return kVar.H();
    }
}
