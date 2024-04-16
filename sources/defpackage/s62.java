package defpackage;

import java.math.BigInteger;
/* renamed from: s62  reason: default package */
/* loaded from: classes3.dex */
public class s62 implements x80 {
    private static final BigInteger c = BigInteger.valueOf(1);
    private k72 a;
    private h72 b;

    @Override // defpackage.x80
    public int a() {
        return (this.a.b().f().bitLength() + 7) / 8;
    }

    @Override // defpackage.x80
    public BigInteger b(v71 v71Var) {
        l72 l72Var = (l72) v71Var;
        if (l72Var.b().equals(this.b)) {
            BigInteger f = this.b.f();
            BigInteger c2 = l72Var.c();
            if (c2 != null) {
                BigInteger bigInteger = c;
                if (c2.compareTo(bigInteger) > 0 && c2.compareTo(f.subtract(bigInteger)) < 0) {
                    BigInteger modPow = c2.modPow(this.a.c(), f);
                    if (!modPow.equals(bigInteger)) {
                        return modPow;
                    }
                    throw new IllegalStateException("Shared key can't be 1");
                }
            }
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    @Override // defpackage.x80
    public void init(v71 v71Var) {
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        ux uxVar = (ux) v71Var;
        if (uxVar instanceof k72) {
            k72 k72Var = (k72) uxVar;
            this.a = k72Var;
            this.b = k72Var.b();
            return;
        }
        throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
    }
}
