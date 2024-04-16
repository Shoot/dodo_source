package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
/* compiled from: Duration.java */
/* renamed from: j93  reason: default package */
/* loaded from: classes3.dex */
public final class j93 implements t8b, Comparable<j93>, Serializable {
    public static final j93 c = new j93(0, 0);
    private static final BigInteger d = BigInteger.valueOf(1000000000);
    private static final Pattern e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    private final long a;
    private final int b;

    private j93(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static j93 k(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        return new j93(j, i);
    }

    public static j93 q(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return k(j2, i);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j93 s(long j) {
        return k(j, 0);
    }

    public static j93 u(long j, long j2) {
        return k(g95.k(j, g95.e(j2, 1000000000L)), g95.g(j2, 1000000000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j93 w(DataInput dataInput) throws IOException {
        return u(dataInput.readLong(), dataInput.readInt());
    }

    private Object writeReplace() {
        return new jca((byte) 1, this);
    }

    @Override // defpackage.t8b
    public p8b a(p8b p8bVar) {
        long j = this.a;
        if (j != 0) {
            p8bVar = p8bVar.L(j, m71.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return p8bVar.L(i, m71.NANOS);
        }
        return p8bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j93)) {
            return false;
        }
        j93 j93Var = (j93) obj;
        if (this.a == j93Var.a && this.b == j93Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) + (this.b * 51);
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(j93 j93Var) {
        int b = g95.b(this.a, j93Var.a);
        if (b != 0) {
            return b;
        }
        return this.b - j93Var.b;
    }

    public long o() {
        return this.a;
    }

    public String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 < 0 && this.b > 0) {
            if (i2 == -1) {
                sb.append("-0");
            } else {
                sb.append(i2 + 1);
            }
        } else {
            sb.append(i2);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.b);
            } else {
                sb.append(this.b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, CoreConstants.DOT);
        }
        sb.append('S');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }
}
