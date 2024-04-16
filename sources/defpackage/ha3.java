package defpackage;

import java.math.BigInteger;
/* renamed from: ha3  reason: default package */
/* loaded from: classes3.dex */
public class ha3 {
    private ia3 a;

    public byte[] a(v71 v71Var) {
        ja3 ja3Var = (ja3) v71Var;
        ga3 ga3Var = new ga3();
        ga3 ga3Var2 = new ga3();
        ga3Var.init(this.a.b());
        BigInteger b = ga3Var.b(ja3Var.b());
        ga3Var2.init(this.a.a());
        BigInteger b2 = ga3Var2.b(ja3Var.a());
        int b3 = b();
        byte[] bArr = new byte[b3 * 2];
        db0.a(b2, bArr, 0, b3);
        db0.a(b, bArr, b3, b3);
        return bArr;
    }

    public int b() {
        return (this.a.b().b().a().t() + 7) / 8;
    }

    public void c(v71 v71Var) {
        this.a = (ia3) v71Var;
    }
}
