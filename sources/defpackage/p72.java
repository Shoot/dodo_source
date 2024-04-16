package defpackage;

import java.math.BigInteger;
/* renamed from: p72  reason: default package */
/* loaded from: classes3.dex */
public class p72 {
    private n72 a;

    public byte[] a(v71 v71Var) {
        o72 o72Var = (o72) v71Var;
        s62 s62Var = new s62();
        s62 s62Var2 = new s62();
        s62Var.init(this.a.b());
        BigInteger b = s62Var.b(o72Var.b());
        s62Var2.init(this.a.a());
        BigInteger b2 = s62Var2.b(o72Var.a());
        int b3 = b();
        byte[] bArr = new byte[b3 * 2];
        db0.a(b2, bArr, 0, b3);
        db0.a(b, bArr, b3, b3);
        return bArr;
    }

    public int b() {
        return (this.a.b().b().f().bitLength() + 7) / 8;
    }

    public void c(v71 v71Var) {
        this.a = (n72) v71Var;
    }
}
