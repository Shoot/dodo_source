package defpackage;

import java.math.BigInteger;
/* renamed from: yka  reason: default package */
/* loaded from: classes3.dex */
class yka {
    private final BigInteger a;
    private final int b;

    public yka(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.a = bigInteger;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    private void c(yka ykaVar) {
        if (this.b == ykaVar.b) {
            return;
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public yka a(yka ykaVar) {
        c(ykaVar);
        return new yka(this.a.add(ykaVar.a), this.b);
    }

    public yka b(int i) {
        if (i >= 0) {
            int i2 = this.b;
            if (i == i2) {
                return this;
            }
            return new yka(this.a.shiftLeft(i - i2), i);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public int d(BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }

    public BigInteger e() {
        return this.a.shiftRight(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yka)) {
            return false;
        }
        yka ykaVar = (yka) obj;
        if (this.a.equals(ykaVar.a) && this.b == ykaVar.b) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.b;
    }

    public yka g() {
        return new yka(this.a.negate(), this.b);
    }

    public BigInteger h() {
        return a(new yka(da3.b, 1).b(this.b)).e();
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b;
    }

    public yka i(yka ykaVar) {
        return a(ykaVar.g());
    }

    public yka j(BigInteger bigInteger) {
        return new yka(this.a.subtract(bigInteger.shiftLeft(this.b)), this.b);
    }

    public String toString() {
        if (this.b == 0) {
            return this.a.toString();
        }
        BigInteger e = e();
        BigInteger subtract = this.a.subtract(e.shiftLeft(this.b));
        if (this.a.signum() == -1) {
            subtract = da3.b.shiftLeft(this.b).subtract(subtract);
        }
        if (e.signum() == -1 && !subtract.equals(da3.a)) {
            e = e.add(da3.b);
        }
        String bigInteger = e.toString();
        char[] cArr = new char[this.b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i = this.b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = bigInteger2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
