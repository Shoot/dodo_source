package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: i72  reason: default package */
/* loaded from: classes3.dex */
public class i72 {
    private static final BigInteger d = BigInteger.valueOf(2);
    private int a;
    private int b;
    private SecureRandom c;

    public h72 a() {
        BigInteger[] a = j72.a(this.a, this.b, this.c);
        BigInteger bigInteger = a[0];
        BigInteger bigInteger2 = a[1];
        return new h72(bigInteger, j72.b(bigInteger, bigInteger2, this.c), bigInteger2, d, null);
    }

    public void b(int i, int i2, SecureRandom secureRandom) {
        this.a = i;
        this.b = i2;
        this.c = secureRandom;
    }
}
