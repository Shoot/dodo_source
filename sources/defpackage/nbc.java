package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: nbc  reason: default package */
/* loaded from: classes3.dex */
public final class nbc {
    private static final Map<Integer, nbc> i;
    private final mbc a;
    private final int b;
    private final int c;
    private final k d;
    private final int e;
    private final String f;
    private final int g;
    private final q2c h;

    static {
        HashMap hashMap = new HashMap();
        Integer d = g65.d(1);
        k kVar = ms6.c;
        hashMap.put(d, new nbc(10, kVar));
        hashMap.put(g65.d(2), new nbc(16, kVar));
        hashMap.put(g65.d(3), new nbc(20, kVar));
        Integer d2 = g65.d(4);
        k kVar2 = ms6.e;
        hashMap.put(d2, new nbc(10, kVar2));
        hashMap.put(g65.d(5), new nbc(16, kVar2));
        hashMap.put(g65.d(6), new nbc(20, kVar2));
        Integer d3 = g65.d(7);
        k kVar3 = ms6.m;
        hashMap.put(d3, new nbc(10, kVar3));
        hashMap.put(g65.d(8), new nbc(16, kVar3));
        hashMap.put(g65.d(9), new nbc(20, kVar3));
        Integer d4 = g65.d(10);
        k kVar4 = ms6.n;
        hashMap.put(d4, new nbc(10, kVar4));
        hashMap.put(g65.d(11), new nbc(16, kVar4));
        hashMap.put(g65.d(12), new nbc(20, kVar4));
        i = Collections.unmodifiableMap(hashMap);
    }

    public nbc(int i2, e23 e23Var) {
        this(i2, j23.c(e23Var.getAlgorithmName()));
    }

    private int a() {
        int i2 = 2;
        while (true) {
            int i3 = this.b;
            if (i2 <= i3) {
                if ((i3 - i2) % 2 == 0) {
                    return i2;
                }
                i2++;
            } else {
                throw new IllegalStateException("should never happen...");
            }
        }
    }

    public static nbc k(int i2) {
        return i.get(g65.d(i2));
    }

    public int b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mbc e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f;
    }

    public k g() {
        return this.d;
    }

    public int h() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2c i() {
        return new o2c(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.e;
    }

    public nbc(int i2, k kVar) {
        if (i2 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (kVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = i2;
        this.c = a();
        String b = j23.b(kVar);
        this.f = b;
        this.d = kVar;
        q2c q2cVar = new q2c(kVar);
        this.h = q2cVar;
        int c = q2cVar.c();
        this.g = c;
        int d = q2cVar.d();
        this.e = d;
        this.a = es2.c(b, c, d, q2cVar.a(), i2);
    }
}
