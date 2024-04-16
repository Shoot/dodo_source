package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: je3  reason: default package */
/* loaded from: classes3.dex */
public class je3 {
    private int a;
    private int b;
    private SecureRandom c;

    public ie3 a() {
        BigInteger[] a = j72.a(this.a, this.b, this.c);
        BigInteger bigInteger = a[0];
        return new ie3(bigInteger, j72.b(bigInteger, a[1], this.c));
    }

    public void b(int i, int i2, SecureRandom secureRandom) {
        this.a = i;
        this.b = i2;
        this.c = secureRandom;
    }
}
