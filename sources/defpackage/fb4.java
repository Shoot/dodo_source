package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.w0;
/* renamed from: fb4  reason: default package */
/* loaded from: classes3.dex */
public class fb4 extends i0 {
    int a;
    i b;
    i c;
    i d;

    public fb4(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = i;
        this.b = new i(bigInteger);
        this.c = new i(bigInteger2);
        this.d = new i(bigInteger3);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(4);
        dVar.a(new i(this.a));
        dVar.a(this.b);
        dVar.a(this.c);
        dVar.a(this.d);
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.d.F();
    }

    public BigInteger u() {
        return this.b.F();
    }

    public BigInteger v() {
        return this.c.F();
    }
}
