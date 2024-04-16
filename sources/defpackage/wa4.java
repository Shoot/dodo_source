package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: wa4  reason: default package */
/* loaded from: classes3.dex */
public class wa4 implements AlgorithmParameterSpec {
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

    public wa4(String str) {
        this.a = null;
        this.b = null;
        this.b = ua4.h(str);
    }

    private static String b(k kVar) {
        String str = (String) c.get(kVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unknown OID: " + kVar);
    }

    public byte[] a() {
        return tr.h(this.a);
    }

    public byte[] c() {
        return tr.h(this.b);
    }

    public byte[] d() {
        return tr.h(this.b);
    }

    public wa4(k kVar, byte[] bArr) {
        this(b(kVar));
        this.a = tr.h(bArr);
    }

    public wa4(byte[] bArr) {
        this.a = null;
        this.b = null;
        byte[] bArr2 = new byte[bArr.length];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public wa4(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.a = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }
}
