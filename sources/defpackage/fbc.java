package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* renamed from: fbc  reason: default package */
/* loaded from: classes3.dex */
public final class fbc {
    private static final Map<Integer, fbc> e;
    private final mbc a;
    private final nbc b;
    private final int c;
    private final int d;

    static {
        HashMap hashMap = new HashMap();
        Integer d = g65.d(1);
        k kVar = ms6.c;
        hashMap.put(d, new fbc(20, 2, kVar));
        hashMap.put(g65.d(2), new fbc(20, 4, kVar));
        hashMap.put(g65.d(3), new fbc(40, 2, kVar));
        hashMap.put(g65.d(4), new fbc(40, 4, kVar));
        hashMap.put(g65.d(5), new fbc(40, 8, kVar));
        hashMap.put(g65.d(6), new fbc(60, 3, kVar));
        hashMap.put(g65.d(7), new fbc(60, 6, kVar));
        hashMap.put(g65.d(8), new fbc(60, 12, kVar));
        Integer d2 = g65.d(9);
        k kVar2 = ms6.e;
        hashMap.put(d2, new fbc(20, 2, kVar2));
        hashMap.put(g65.d(10), new fbc(20, 4, kVar2));
        hashMap.put(g65.d(11), new fbc(40, 2, kVar2));
        hashMap.put(g65.d(12), new fbc(40, 4, kVar2));
        hashMap.put(g65.d(13), new fbc(40, 8, kVar2));
        hashMap.put(g65.d(14), new fbc(60, 3, kVar2));
        hashMap.put(g65.d(15), new fbc(60, 6, kVar2));
        hashMap.put(g65.d(16), new fbc(60, 12, kVar2));
        Integer d3 = g65.d(17);
        k kVar3 = ms6.m;
        hashMap.put(d3, new fbc(20, 2, kVar3));
        hashMap.put(g65.d(18), new fbc(20, 4, kVar3));
        hashMap.put(g65.d(19), new fbc(40, 2, kVar3));
        hashMap.put(g65.d(20), new fbc(40, 4, kVar3));
        hashMap.put(g65.d(21), new fbc(40, 8, kVar3));
        hashMap.put(g65.d(22), new fbc(60, 3, kVar3));
        hashMap.put(g65.d(23), new fbc(60, 6, kVar3));
        hashMap.put(g65.d(24), new fbc(60, 12, kVar3));
        Integer d4 = g65.d(25);
        k kVar4 = ms6.n;
        hashMap.put(d4, new fbc(20, 2, kVar4));
        hashMap.put(g65.d(26), new fbc(20, 4, kVar4));
        hashMap.put(g65.d(27), new fbc(40, 2, kVar4));
        hashMap.put(g65.d(28), new fbc(40, 4, kVar4));
        hashMap.put(g65.d(29), new fbc(40, 8, kVar4));
        hashMap.put(g65.d(30), new fbc(60, 3, kVar4));
        hashMap.put(g65.d(31), new fbc(60, 6, kVar4));
        hashMap.put(g65.d(32), new fbc(60, 12, kVar4));
        e = Collections.unmodifiableMap(hashMap);
    }

    public fbc(int i, int i2, e23 e23Var) {
        this(i, i2, j23.c(e23Var.getAlgorithmName()));
    }

    public static fbc i(int i) {
        return e.get(g65.d(i));
    }

    private static int j(int i, int i2) throws IllegalArgumentException {
        if (i >= 2) {
            if (i % i2 == 0) {
                int i3 = i / i2;
                if (i3 != 1) {
                    return i3;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    protected int c() {
        return this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mbc d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return this.b.f();
    }

    public int f() {
        return this.b.h();
    }

    int g() {
        return this.b.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nbc h() {
        return this.b;
    }

    public fbc(int i, int i2, k kVar) {
        this.c = i;
        this.d = i2;
        this.b = new nbc(j(i, i2), kVar);
        this.a = ds2.c(e(), f(), g(), c(), a(), i2);
    }
}
