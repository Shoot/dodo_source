package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
/* renamed from: za4  reason: default package */
/* loaded from: classes3.dex */
public class za4 implements AlgorithmParameterSpec {
    private static Map c;
    private byte[] a;
    private byte[] b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(y22.h, "E-A");
        c.put(y22.i, "E-B");
        c.put(y22.j, "E-C");
        c.put(y22.k, "E-D");
        c.put(do9.t, "Param-Z");
    }

    public byte[] a() {
        return tr.h(this.b);
    }

    public byte[] b() {
        return tr.h(this.a);
    }
}
