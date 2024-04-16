package defpackage;

import org.bouncycastle.asn1.k;
/* renamed from: q2c  reason: default package */
/* loaded from: classes3.dex */
final class q2c {
    private final mbc a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final k g;

    /* JADX INFO: Access modifiers changed from: protected */
    public q2c(k kVar) {
        if (kVar != null) {
            this.g = kVar;
            e23 a = j23.a(kVar);
            int h = sbc.h(a);
            this.b = h;
            this.c = 16;
            int ceil = (int) Math.ceil((h * 8) / sbc.o(16));
            this.e = ceil;
            int floor = ((int) Math.floor(sbc.o((16 - 1) * ceil) / sbc.o(16))) + 1;
            this.f = floor;
            int i = ceil + floor;
            this.d = i;
            p2c c = p2c.c(a.getAlgorithmName(), h, 16, i);
            this.a = c;
            if (c != null) {
                return;
            }
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a.getAlgorithmName());
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return this.d;
    }

    public k b() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.c;
    }
}
