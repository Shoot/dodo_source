package org.bson.types;

import ch.qos.logback.core.CoreConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {
    private static final BigInteger c = new BigInteger("10");
    private static final BigInteger d = new BigInteger("1");
    private static final BigInteger e = new BigInteger("0");
    private static final Set<String> f = new HashSet(Collections.singletonList("nan"));
    private static final Set<String> g = new HashSet(Collections.singletonList("-nan"));
    private static final Set<String> h = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
    private static final Set<String> i = new HashSet(Arrays.asList("-inf", "-infinity"));
    public static final Decimal128 j = fromIEEE754BIDEncoding(8646911284551352320L, 0);
    public static final Decimal128 k = fromIEEE754BIDEncoding(-576460752303423488L, 0);
    public static final Decimal128 l = fromIEEE754BIDEncoding(-288230376151711744L, 0);
    public static final Decimal128 m = fromIEEE754BIDEncoding(8935141660703064064L, 0);
    public static final Decimal128 n = fromIEEE754BIDEncoding(3476778912330022912L, 0);
    public static final Decimal128 o = fromIEEE754BIDEncoding(-5746593124524752896L, 0);
    private final long a;
    private final long b;

    private Decimal128(long j2, long j3) {
        this.a = j2;
        this.b = j3;
    }

    private boolean G(BigDecimal bigDecimal) {
        if (!x() && !w() && bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return true;
        }
        return false;
    }

    private String H() {
        StringBuilder sb = new StringBuilder();
        BigDecimal a = a();
        String bigInteger = a.unscaledValue().abs().toString();
        if (E()) {
            sb.append(CoreConstants.DASH_CHAR);
        }
        int i2 = -a.scale();
        int length = (bigInteger.length() - 1) + i2;
        if (i2 <= 0 && length >= -6) {
            if (i2 == 0) {
                sb.append(bigInteger);
            } else {
                int length2 = (-i2) - bigInteger.length();
                if (length2 >= 0) {
                    sb.append('0');
                    sb.append(CoreConstants.DOT);
                    for (int i3 = 0; i3 < length2; i3++) {
                        sb.append('0');
                    }
                    sb.append((CharSequence) bigInteger, 0, bigInteger.length());
                } else {
                    int i4 = -length2;
                    sb.append((CharSequence) bigInteger, 0, i4);
                    sb.append(CoreConstants.DOT);
                    sb.append((CharSequence) bigInteger, i4, i4 - i2);
                }
            }
        } else {
            sb.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb.append(CoreConstants.DOT);
                sb.append((CharSequence) bigInteger, 1, bigInteger.length());
            }
            sb.append('E');
            if (length > 0) {
                sb.append('+');
            }
            sb.append(length);
        }
        return sb.toString();
    }

    private boolean K() {
        if ((this.a & 6917529027641081856L) == 6917529027641081856L) {
            return true;
        }
        return false;
    }

    private BigDecimal a() {
        int i2;
        int i3 = -o();
        if (K()) {
            return BigDecimal.valueOf(0L, i3);
        }
        if (E()) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return new BigDecimal(new BigInteger(i2, k()), i3);
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j2, long j3) {
        return new Decimal128(j2, j3);
    }

    private byte[] k() {
        byte[] bArr = new byte[15];
        long j2 = 255;
        long j3 = 255;
        for (int i2 = 14; i2 >= 7; i2--) {
            bArr[i2] = (byte) ((this.b & j3) >>> ((14 - i2) << 3));
            j3 <<= 8;
        }
        for (int i3 = 6; i3 >= 1; i3--) {
            bArr[i3] = (byte) ((this.a & j2) >>> ((6 - i3) << 3));
            j2 <<= 8;
        }
        bArr[0] = (byte) ((this.a & 281474976710656L) >>> 48);
        return bArr;
    }

    private int o() {
        long j2;
        char c2;
        if (K()) {
            j2 = this.a & 2305807824841605120L;
            c2 = '/';
        } else {
            j2 = this.a & 9223231299366420480L;
            c2 = '1';
        }
        return ((int) (j2 >>> c2)) - 6176;
    }

    private boolean u(BigDecimal bigDecimal) {
        if (E() && bigDecimal.signum() == 0) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if ((this.a & Long.MIN_VALUE) == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (x()) {
            return Double.NaN;
        }
        if (w()) {
            if (E()) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.POSITIVE_INFINITY;
        }
        BigDecimal a = a();
        if (u(a)) {
            return -0.0d;
        }
        return a.doubleValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        if (this.a == decimal128.a && this.b == decimal128.b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(Decimal128 decimal128) {
        if (x()) {
            return !decimal128.x();
        }
        if (w()) {
            if (E()) {
                if (decimal128.w() && decimal128.E()) {
                    return 0;
                }
                return -1;
            } else if (decimal128.x()) {
                return -1;
            } else {
                if (!decimal128.w() || decimal128.E()) {
                    return 1;
                }
                return 0;
            }
        }
        BigDecimal a = a();
        BigDecimal a2 = decimal128.a();
        if (G(a) && decimal128.G(a2)) {
            if (u(a)) {
                if (decimal128.u(a2)) {
                    return 0;
                }
                return -1;
            } else if (decimal128.u(a2)) {
                return 1;
            }
        }
        if (decimal128.x()) {
            return -1;
        }
        if (decimal128.w()) {
            if (decimal128.E()) {
                return 1;
            }
            return -1;
        }
        return a.compareTo(a2);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public long q() {
        return this.a;
    }

    public long s() {
        return this.b;
    }

    public String toString() {
        if (x()) {
            return "NaN";
        }
        if (w()) {
            if (E()) {
                return "-Infinity";
            }
            return "Infinity";
        }
        return H();
    }

    public boolean w() {
        if ((this.a & 8646911284551352320L) == 8646911284551352320L) {
            return true;
        }
        return false;
    }

    public boolean x() {
        if ((this.a & 8935141660703064064L) == 8935141660703064064L) {
            return true;
        }
        return false;
    }
}
