package defpackage;

import java.math.BigInteger;
/* renamed from: dv9  reason: default package */
/* loaded from: classes3.dex */
public class dv9 {
    protected final BigInteger a;
    protected final BigInteger b;
    protected final BigInteger c;
    protected final BigInteger d;
    protected final BigInteger e;
    protected final BigInteger f;
    protected final int g;

    public dv9(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.a = bigIntegerArr[0];
        this.b = bigIntegerArr[1];
        this.c = bigIntegerArr2[0];
        this.d = bigIntegerArr2[1];
        this.e = bigInteger;
        this.f = bigInteger2;
        this.g = i;
    }

    private static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr != null && bigIntegerArr.length == 2 && bigIntegerArr[0] != null && bigIntegerArr[1] != null) {
            return;
        }
        throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
    }

    public int b() {
        return this.g;
    }

    public BigInteger c() {
        return this.e;
    }

    public BigInteger d() {
        return this.f;
    }

    public BigInteger e() {
        return this.a;
    }

    public BigInteger f() {
        return this.b;
    }

    public BigInteger g() {
        return this.c;
    }

    public BigInteger h() {
        return this.d;
    }
}
