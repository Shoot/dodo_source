package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.k;
/* renamed from: hb4  reason: default package */
/* loaded from: classes3.dex */
public class hb4 implements AlgorithmParameterSpec {
    private final k a;
    private final k b;
    private final k c;

    public hb4(String str) {
        this(d(str), a(str), null);
    }

    private static k a(String str) {
        if (str.indexOf("12-512") > 0) {
            return do9.d;
        }
        if (str.indexOf("12-256") > 0) {
            return do9.c;
        }
        return y22.p;
    }

    private static k d(String str) {
        return pa3.h(str);
    }

    public k b() {
        return this.b;
    }

    public k c() {
        return this.c;
    }

    public k e() {
        return this.a;
    }

    public hb4(k kVar, k kVar2, k kVar3) {
        this.a = kVar;
        this.b = kVar2;
        this.c = kVar3;
    }
}
