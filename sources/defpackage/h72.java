package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import java.math.BigInteger;
/* renamed from: h72  reason: default package */
/* loaded from: classes3.dex */
public class h72 implements v71 {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private int e;
    private int f;
    private q72 g;

    public h72(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int a(int i) {
        if (i == 0) {
            return SyslogConstants.LOG_LOCAL4;
        }
        if (i >= 160) {
            return SyslogConstants.LOG_LOCAL4;
        }
        return i;
    }

    public BigInteger b() {
        return this.a;
    }

    public BigInteger c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h72)) {
            return false;
        }
        h72 h72Var = (h72) obj;
        if (g() != null) {
            if (!g().equals(h72Var.g())) {
                return false;
            }
        } else if (h72Var.g() != null) {
            return false;
        }
        if (!h72Var.f().equals(this.b) || !h72Var.b().equals(this.a)) {
            return false;
        }
        return true;
    }

    public BigInteger f() {
        return this.b;
    }

    public BigInteger g() {
        return this.c;
    }

    public q72 h() {
        return this.g;
    }

    public int hashCode() {
        int i;
        int hashCode = f().hashCode() ^ b().hashCode();
        if (g() != null) {
            i = g().hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public h72(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, a(i), i, null, null);
    }

    public h72(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, q72 q72Var) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength() && !pq8.c("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
        this.e = i;
        this.f = i2;
        this.d = bigInteger4;
        this.g = q72Var;
    }

    public h72(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, q72 q72Var) {
        this(bigInteger, bigInteger2, bigInteger3, SyslogConstants.LOG_LOCAL4, 0, bigInteger4, q72Var);
    }
}
