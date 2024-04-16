package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: l23  reason: default package */
/* loaded from: classes3.dex */
class l23 {
    private static Map<String, k> a = new HashMap();
    private static Map<k, String> b = new HashMap();

    static {
        Map<String, k> map = a;
        k kVar = ms6.c;
        map.put("SHA-256", kVar);
        Map<String, k> map2 = a;
        k kVar2 = ms6.e;
        map2.put("SHA-512", kVar2);
        Map<String, k> map3 = a;
        k kVar3 = ms6.m;
        map3.put("SHAKE128", kVar3);
        Map<String, k> map4 = a;
        k kVar4 = ms6.n;
        map4.put("SHAKE256", kVar4);
        b.put(kVar, "SHA-256");
        b.put(kVar2, "SHA-512");
        b.put(kVar3, "SHAKE128");
        b.put(kVar4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e23 a(k kVar) {
        if (kVar.x(ms6.c)) {
            return new dq9();
        }
        if (kVar.x(ms6.e)) {
            return new gq9();
        }
        if (kVar.x(ms6.m)) {
            return new jq9(128);
        }
        if (kVar.x(ms6.n)) {
            return new jq9(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + kVar);
    }
}
