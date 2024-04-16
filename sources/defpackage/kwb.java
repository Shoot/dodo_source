package defpackage;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
/* compiled from: ValueRange.java */
/* renamed from: kwb  reason: default package */
/* loaded from: classes3.dex */
public final class kwb implements Serializable {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private kwb(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static kwb k(long j, long j2) {
        if (j <= j2) {
            return new kwb(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static kwb l(long j, long j2, long j3) {
        return m(j, j, j2, j3);
    }

    public static kwb m(long j, long j2, long j3, long j4) {
        if (j <= j2) {
            if (j3 <= j4) {
                if (j2 <= j4) {
                    return new kwb(j, j2, j3, j4);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public int a(long j, u8b u8bVar) {
        if (i(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid int value for " + u8bVar + ": " + j);
    }

    public long b(long j, u8b u8bVar) {
        if (!j(j)) {
            if (u8bVar != null) {
                throw new DateTimeException("Invalid value for " + u8bVar + " (valid values " + this + "): " + j);
            }
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j);
        }
        return j;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.a;
    }

    public boolean e() {
        if (this.a == this.b && this.c == this.d) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kwb)) {
            return false;
        }
        kwb kwbVar = (kwb) obj;
        if (this.a == kwbVar.a && this.b == kwbVar.b && this.c == kwbVar.c && this.d == kwbVar.d) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (d() >= -2147483648L && c() <= 2147483647L) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = ((((((j + j2) << ((int) (j2 + 16))) >> ((int) (j3 + 48))) << ((int) (j3 + 32))) >> ((int) (32 + j4))) << ((int) (j4 + 48))) >> 16;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public boolean i(long j) {
        if (f() && j(j)) {
            return true;
        }
        return false;
    }

    public boolean j(long j) {
        if (j >= d() && j <= c()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
